package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enq {
    public final kyz a;
    public final long b;

    public enq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof enq) {
            enq enqVar = (enq) obj;
            if (this.a.equals(enqVar.a) && this.b == enqVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        kyz kyzVar = this.a;
        if (kyzVar.y()) {
            i = kyzVar.i();
        } else {
            int i2 = kyzVar.y;
            if (i2 == 0) {
                i2 = kyzVar.i();
                kyzVar.y = i2;
            }
            i = i2;
        }
        long j = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "KeyAndFetchTime{keys=" + this.a.toString() + ", fetchTimeMillis=" + this.b + "}";
    }

    public enq(kyz kyzVar, long j) {
        if (kyzVar == null) {
            throw new NullPointerException("Null keys");
        }
        this.a = kyzVar;
        this.b = j;
    }
}
