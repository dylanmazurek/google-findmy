package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkn {
    public final float a = 0.0f;

    public final boolean equals(Object obj) {
        if (obj instanceof bkn) {
            float f = ((bkn) obj).a;
            if (Float.compare(0.0f, 0.0f) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "BaselineShift(multiplier=0.0)";
    }
}
