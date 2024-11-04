package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkz {
    public static final bkz a = new bkz(null);
    public final float b;
    public final float c;

    public bkz(byte[] bArr) {
        this.b = 1.0f;
        this.c = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkz)) {
            return false;
        }
        bkz bkzVar = (bkz) obj;
        float f = bkzVar.b;
        float f2 = bkzVar.c;
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=1.0, skewX=0.0)";
    }

    public bkz() {
        this(null);
    }
}
