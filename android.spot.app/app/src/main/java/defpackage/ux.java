package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ux extends va {
    public float a;
    public float b;

    public ux(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.va
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return 0.0f;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.va
    public final int b() {
        return 2;
    }

    @Override // defpackage.va
    public final /* synthetic */ va c() {
        return new ux(0.0f, 0.0f);
    }

    @Override // defpackage.va
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    @Override // defpackage.va
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ux) {
            ux uxVar = (ux) obj;
            if (uxVar.a == this.a && uxVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
