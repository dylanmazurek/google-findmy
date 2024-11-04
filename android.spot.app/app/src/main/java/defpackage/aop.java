package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aop {
    public final float a;

    public aop(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aop) && Float.compare(this.a, ((aop) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Vertical(bias=" + this.a + ')';
    }
}
