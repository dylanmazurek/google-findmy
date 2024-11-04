package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uw extends va {
    public float a;

    public uw(float f) {
        this.a = f;
    }

    @Override // defpackage.va
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    @Override // defpackage.va
    public final int b() {
        return 1;
    }

    @Override // defpackage.va
    public final /* synthetic */ va c() {
        return new uw(0.0f);
    }

    @Override // defpackage.va
    public final void d() {
        this.a = 0.0f;
    }

    @Override // defpackage.va
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof uw) && ((uw) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
