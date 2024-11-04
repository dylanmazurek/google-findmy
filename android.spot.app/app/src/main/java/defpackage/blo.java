package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blo implements blr {
    private final float a;

    public blo(float f) {
        this.a = f;
    }

    @Override // defpackage.blr
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.blr
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof blo) && Float.compare(this.a, ((blo) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.a + ')';
    }
}
