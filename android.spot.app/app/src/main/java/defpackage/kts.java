package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kts {
    public static final long a = TimeUnit.SECONDS.toMillis(20);
    public final Context b;
    public final URI c;
    public final Executor d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final jfe g;
    public final Integer h;
    public final Integer i;
    public final long j;
    public final int k;
    private final long l;
    private final long m;

    public kts() {
        throw null;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        Integer num;
        Integer num2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof kts) {
            kts ktsVar = (kts) obj;
            if (this.b.equals(ktsVar.b) && this.c.equals(ktsVar.c) && this.d.equals(ktsVar.d) && this.e.equals(ktsVar.e) && ((scheduledExecutorService = this.f) != null ? scheduledExecutorService.equals(ktsVar.f) : ktsVar.f == null) && this.g.equals(ktsVar.g) && ((num = this.h) != null ? num.equals(ktsVar.h) : ktsVar.h == null) && ((num2 = this.i) != null ? num2.equals(ktsVar.i) : ktsVar.i == null) && this.j == ktsVar.j && this.k == ktsVar.k && this.l == ktsVar.l && this.m == ktsVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.f;
        int i = 0;
        if (scheduledExecutorService == null) {
            hashCode = 0;
        } else {
            hashCode = scheduledExecutorService.hashCode();
        }
        int hashCode4 = (((hashCode3 * 1000003) ^ hashCode) * (-721379959)) ^ this.g.hashCode();
        Integer num = this.h;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i2 = ((hashCode4 * (-721379959)) ^ hashCode2) * 1000003;
        Integer num2 = this.i;
        if (num2 != null) {
            i = num2.hashCode();
        }
        long j = this.j;
        int i3 = (((((i2 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.k) * 1000003;
        long j2 = this.l;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.m;
        return (i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
    }

    public final String toString() {
        jfe jfeVar = this.g;
        ScheduledExecutorService scheduledExecutorService = this.f;
        Executor executor = this.e;
        Executor executor2 = this.d;
        URI uri = this.c;
        return "TransportConfig{applicationContext=" + String.valueOf(this.b) + ", uri=" + String.valueOf(uri) + ", networkExecutor=" + String.valueOf(executor2) + ", transportExecutor=" + String.valueOf(executor) + ", transportScheduledExecutorService=" + String.valueOf(scheduledExecutorService) + ", userAgentOverride=null, recordNetworkMetricsToPrimes=" + String.valueOf(jfeVar) + ", grpcServiceConfig=null, trafficStatsUid=" + this.h + ", trafficStatsTag=" + this.i + ", grpcIdleTimeoutMillis=" + this.j + ", maxMessageSize=" + this.k + ", grpcKeepAliveTimeMillis=" + this.l + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null}";
    }

    public kts(Context context, URI uri, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, jfe jfeVar, Integer num, Integer num2, long j, int i, long j2, long j3) {
        this.b = context;
        this.c = uri;
        this.d = executor;
        this.e = executor2;
        this.f = scheduledExecutorService;
        this.g = jfeVar;
        this.h = num;
        this.i = num2;
        this.j = j;
        this.k = i;
        this.l = j2;
        this.m = j3;
    }
}
