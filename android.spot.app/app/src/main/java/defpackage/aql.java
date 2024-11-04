package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aql {
    public static final aql a = new aql(0.0f, 0.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public aql(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final float a() {
        return this.e - this.c;
    }

    public final float b() {
        return this.d - this.b;
    }

    public final long c() {
        return a.k(this.b + (b() / 2.0f), this.c + (a() / 2.0f));
    }

    public final aql d(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new aql(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final aql e(long j) {
        return new aql(this.b + aqk.b(j), this.c + aqk.c(j), this.d + aqk.b(j), this.e + aqk.c(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aql)) {
            return false;
        }
        aql aqlVar = (aql) obj;
        if (Float.compare(this.b, aqlVar.b) == 0 && Float.compare(this.c, aqlVar.c) == 0 && Float.compare(this.d, aqlVar.d) == 0 && Float.compare(this.e, aqlVar.e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + ix.d(this.b) + ", " + ix.d(this.c) + ", " + ix.d(this.d) + ", " + ix.d(this.e) + ')';
    }
}
