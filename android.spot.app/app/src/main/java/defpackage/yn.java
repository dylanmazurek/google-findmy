package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yn {
    private final float a;

    public yn(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yn) && blh.b(this.a, ((yn) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
