package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoo {
    public final float a;

    public aoo(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aoo) && Float.compare(this.a, ((aoo) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Horizontal(bias=" + this.a + ')';
    }
}
