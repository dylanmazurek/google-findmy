package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibj {
    public final int a;
    public final int b;
    public final jer c;
    public final Boolean d;
    public final int e;
    public final long f;

    public ibj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ibj) {
            ibj ibjVar = (ibj) obj;
            if (this.a == ibjVar.a && this.b == ibjVar.b && this.c.equals(ibjVar.c) && this.d.equals(ibjVar.d) && this.e == ibjVar.e && this.f == ibjVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.f;
        return (((hashCode * 1000003) ^ this.e) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ConnectParams{connectTimeoutMillis=" + this.a + ", maxRetryCount=" + this.b + ", deviceIdAndComponentSet=" + String.valueOf(this.c) + ", skipBluetoothAdapterEnabledCheck=" + this.d + ", requestConnectionPriorityRetryCount=" + this.e + ", requestConnectionPriorityRetryScheduleDelayMillis=" + this.f + "}";
    }

    public ibj(int i, int i2, jer jerVar, Boolean bool, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.c = jerVar;
        this.d = bool;
        this.e = i3;
        this.f = j;
    }
}
