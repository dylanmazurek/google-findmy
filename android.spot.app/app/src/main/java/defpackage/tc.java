package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tc {
    public static final Object a = new Object();

    public static final Object a(tb tbVar, int i) {
        Object obj;
        int a2 = td.a(tbVar.b, tbVar.d, i);
        if (a2 >= 0 && (obj = tbVar.c[a2]) != a) {
            return obj;
        }
        return null;
    }

    public static final void b(tb tbVar) {
        int i = tbVar.d;
        int[] iArr = tbVar.b;
        Object[] objArr = tbVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        tbVar.a = false;
        tbVar.d = i2;
    }
}
