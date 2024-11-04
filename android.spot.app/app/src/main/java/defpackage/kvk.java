package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kvk {
    public final URI a;
    public final long b;
    public final Integer c;
    public final Integer d;
    private final long e;
    private final long f;

    public kvk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvk) {
            kvk kvkVar = (kvk) obj;
            if (this.a.equals(kvkVar.a) && this.b == kvkVar.b && this.e == kvkVar.e && this.f == kvkVar.f && ((num = this.c) != null ? num.equals(kvkVar.c) : kvkVar.c == null)) {
                Integer num2 = this.d;
                Integer num3 = kvkVar.d;
                if (num2 != null ? num2.equals(num3) : num3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        Integer num = this.c;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.b;
        long j2 = this.e;
        long j3 = this.f;
        int i2 = ((((((((hashCode2 * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ hashCode) * 1000003;
        Integer num2 = this.d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "ChannelRuntimeConfig{uri=" + this.a.toString() + ", grpcIdleTimeoutMillis=" + this.b + ", grpcKeepAliveTimeMillis=" + this.e + ", grpcKeepAliveTimeoutMillis=" + this.f + ", trafficStatsUid=" + this.c + ", trafficStatsTag=" + this.d + "}";
    }

    public kvk(URI uri, long j, long j2, long j3, Integer num, Integer num2) {
        this.a = uri;
        this.b = j;
        this.e = j2;
        this.f = j3;
        this.c = num;
        this.d = num2;
    }
}
