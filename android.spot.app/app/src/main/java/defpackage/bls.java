package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bls {
    public static final /* synthetic */ int a = 0;
    private static volatile tb b = new tb(null);
    private static final Object[] c;
    private static float d;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        d = 1.05f;
        synchronized (objArr) {
            f(b, 1.15f, new blt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f(b, 1.3f, new blt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f(b, 1.5f, new blt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f(b, 1.8f, new blt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f(b, 2.0f, new blt(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        float d2 = d(b.b(0)) - 0.02f;
        d = d2;
        if (d2 > 1.0f) {
            return;
        }
        bbp.d("You should only apply non-linear scaling to font scales > 1");
    }

    public static final boolean a(float f) {
        if (f >= d) {
            return true;
        }
        return false;
    }

    public static final blr b(float f) {
        if (!a(f)) {
            return null;
        }
        blr blrVar = (blr) tc.a(b, c(f));
        if (blrVar != null) {
            return blrVar;
        }
        int a2 = b.a(c(f));
        if (a2 >= 0) {
            return (blr) b.e(a2);
        }
        int i = -(a2 + 1);
        int i2 = i - 1;
        if (i2 >= 0 && i < b.c()) {
            float d2 = beg.d(0.0f, 1.0f, d(b.b(i2)), d(b.b(i)), f);
            blr blrVar2 = (blr) b.e(i2);
            blr blrVar3 = (blr) b.e(i);
            float[] fArr = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
            float[] fArr2 = new float[9];
            for (int i3 = 0; i3 < 9; i3++) {
                float f2 = fArr[i3];
                float b2 = blrVar2.b(f2);
                fArr2[i3] = b2 + ((blrVar3.b(f2) - b2) * d2);
            }
            blt bltVar = new blt(fArr, fArr2);
            e(f, bltVar);
            return bltVar;
        }
        blt bltVar2 = new blt(new float[]{1.0f}, new float[]{f});
        e(f, bltVar2);
        return bltVar2;
    }

    private static final int c(float f) {
        return (int) (f * 100.0f);
    }

    private static final float d(int i) {
        return i / 100.0f;
    }

    private static final void e(float f, blr blrVar) {
        synchronized (c) {
            tb clone = b.clone();
            f(clone, f, blrVar);
            b = clone;
        }
    }

    private static final void f(tb tbVar, float f, blr blrVar) {
        tbVar.g(c(f), blrVar);
    }
}
