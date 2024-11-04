package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ars {
    public final String a;
    public final long b;
    public final int c;

    public ars(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
        if (str.length() != 0) {
        } else {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public float c(float f, float f2, float f3) {
        throw null;
    }

    public long d(float f, float f2, float f3) {
        throw null;
    }

    public long e(float f, float f2, float f3, float f4, ars arsVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ars arsVar = (ars) obj;
        if (this.c != arsVar.c || !amr.i(this.a, arsVar.a)) {
            return false;
        }
        return a.n(this.b, arsVar.b);
    }

    public boolean f() {
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + ((int) (this.b ^ 3))) * 31) + this.c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        long j = this.b;
        if (a.n(j, 12884901888L)) {
            str = "Rgb";
        } else if (a.n(j, 12884901889L)) {
            str = "Xyz";
        } else if (a.n(j, 12884901890L)) {
            str = "Lab";
        } else if (a.n(j, 17179869187L)) {
            str = "Cmyk";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
