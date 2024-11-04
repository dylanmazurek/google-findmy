package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hob {
    public final boolean a;
    private final jis b;

    public hob() {
        throw null;
    }

    public final jis a() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("Failed to get RunningAppProcessInfos, check status first.");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hob) {
            hob hobVar = (hob) obj;
            if (this.a == hobVar.a && hzc.L(this.b, hobVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "RunningAppProcessInfoResponse{getStatus=" + this.a + ", runningAppProcessInfosInternal=" + this.b.toString() + "}";
    }

    public hob(boolean z, jis jisVar) {
        this.a = z;
        if (jisVar == null) {
            throw new NullPointerException("Null runningAppProcessInfosInternal");
        }
        this.b = jisVar;
    }
}
