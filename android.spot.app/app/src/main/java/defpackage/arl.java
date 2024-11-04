package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arl {
    public static final arl a = new arl(jw.f(4278190080L));
    public final long b;
    public final long c = 0;
    public final float d = 0.0f;

    public arl(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arl)) {
            return false;
        }
        arl arlVar = (arl) obj;
        if (!a.n(this.b, arlVar.b)) {
            return false;
        }
        long j = arlVar.c;
        if (!a.n(0L, 0L)) {
            return false;
        }
        float f = arlVar.d;
        return true;
    }

    public final int hashCode() {
        return (((a.l(this.b) * 31) + a.l(0L)) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "Shadow(color=" + ((Object) aqx.g(this.b)) + ", offset=" + ((Object) aqk.g(0L)) + ", blurRadius=0.0)";
    }
}
