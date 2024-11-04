package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vm implements vk {
    private final int a;
    private final int b;
    private final vg c;
    private final long d;
    private final long e;

    public vm(int i, int i2, vg vgVar) {
        this.a = i;
        this.b = i2;
        this.c = vgVar;
        this.d = i * 1000000;
        this.e = i2 * 1000000;
    }

    private final long g(long j) {
        return moz.ai(j - this.e, 0L, this.d);
    }

    @Override // defpackage.uu
    public final /* bridge */ /* synthetic */ wq a(atk atkVar) {
        wq f;
        f = f();
        return f;
    }

    @Override // defpackage.vk
    public final /* synthetic */ float b(float f, float f2, float f3) {
        return d(e(f, f2, f3), f, f2, f3);
    }

    @Override // defpackage.vk
    public final float c(long j, float f, float f2, float f3) {
        float f4;
        int i = this.a;
        long g = g(j);
        float f5 = 1.0f;
        if (i == 0) {
            f4 = 1.0f;
        } else {
            f4 = ((float) g) / ((float) this.d);
        }
        vg vgVar = this.c;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 <= 1.0f) {
            f5 = f4;
        }
        return wp.a(f, f2, vgVar.a(f5));
    }

    @Override // defpackage.vk
    public final float d(long j, float f, float f2, float f3) {
        long g = g(j);
        if (g < 0) {
            return 0.0f;
        }
        if (g == 0) {
            return f3;
        }
        return (c(g, f, f2, f3) - c(g - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.vk
    public final long e(float f, float f2, float f3) {
        return (this.b + this.a) * 1000000;
    }

    @Override // defpackage.vk
    public final /* synthetic */ wu f() {
        return new wu(this);
    }

    public vm() {
        this(300, 0, vi.a);
    }
}
