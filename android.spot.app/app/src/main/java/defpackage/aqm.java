package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqm {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        iz.e(0.0f, 0.0f, 0.0f, 0.0f, aqi.a);
    }

    public aqm(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqm)) {
            return false;
        }
        aqm aqmVar = (aqm) obj;
        if (Float.compare(this.a, aqmVar.a) == 0 && Float.compare(this.b, aqmVar.b) == 0 && Float.compare(this.c, aqmVar.c) == 0 && Float.compare(this.d, aqmVar.d) == 0 && a.n(this.e, aqmVar.e) && a.n(this.f, aqmVar.f) && a.n(this.g, aqmVar.g) && a.n(this.h, aqmVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + a.l(this.e);
        long j = this.h;
        return (((((floatToIntBits * 31) + a.l(this.f)) * 31) + a.l(this.g)) * 31) + a.l(j);
    }

    public final String toString() {
        String str = ix.d(this.a) + ", " + ix.d(this.b) + ", " + ix.d(this.c) + ", " + ix.d(this.d);
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.e;
        if (a.n(j4, j) && a.n(j, j2) && a.n(j2, j3)) {
            if (aqi.a(j4) == aqi.b(j4)) {
                return "RoundRect(rect=" + str + ", radius=" + ix.d(aqi.a(j4)) + ')';
            }
            return "RoundRect(rect=" + str + ", x=" + ix.d(aqi.a(j4)) + ", y=" + ix.d(aqi.b(j4)) + ')';
        }
        return "RoundRect(rect=" + str + ", topLeft=" + ((Object) aqi.c(j4)) + ", topRight=" + ((Object) aqi.c(j)) + ", bottomRight=" + ((Object) aqi.c(j2)) + ", bottomLeft=" + ((Object) aqi.c(j3)) + ')';
    }
}
