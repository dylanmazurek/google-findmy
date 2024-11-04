package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icu {
    public final long a;
    public final jer b;
    public final boolean c;

    public icu() {
        throw null;
    }

    public static ict a() {
        ict ictVar = new ict(null);
        ictVar.b(0L);
        ictVar.c(false);
        return ictVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof icu) {
            icu icuVar = (icu) obj;
            if (this.a == icuVar.a && this.b.equals(icuVar.b) && this.c == icuVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        int i2 = (int) (j ^ (j >>> 32));
        int hashCode = this.b.hashCode() ^ ((i2 ^ 1000003) * 1000003);
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "Options{notificationTimeoutMillis=" + this.a + ", subscriber=" + String.valueOf(this.b) + ", shouldRequestMtu=" + this.c + "}";
    }

    public icu(long j, jer jerVar, boolean z) {
        this.a = j;
        this.b = jerVar;
        this.c = z;
    }
}
