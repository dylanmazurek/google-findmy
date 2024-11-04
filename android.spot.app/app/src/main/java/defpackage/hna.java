package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hna {
    public final int a;
    public final int b;
    public final boolean c;

    public hna() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hna) {
            hna hnaVar = (hna) obj;
            if (this.a == hnaVar.a && this.b == hnaVar.b && this.c == hnaVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ ((((this.a ^ (-721379959)) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=null, primesMetricExecutorPriority=" + this.a + ", primesMetricExecutorPoolSize=" + this.b + ", enableDeferredTasks=" + this.c + "}";
    }

    public hna(byte[] bArr) {
        this.a = 11;
        this.b = 2;
        this.c = true;
    }
}
