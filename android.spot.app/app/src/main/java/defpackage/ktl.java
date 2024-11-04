package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktl {
    public final Context a;
    public final Executor b;
    public final Executor c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final ktv f;
    public final jfe g;
    public final jfe h;
    public final jfe i;
    public final jfe j;
    public final int k;
    public final long l;
    public final long m;
    public final njz n;
    public final fma o;

    public ktl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        ScheduledExecutorService scheduledExecutorService;
        ktv ktvVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ktl) {
            ktl ktlVar = (ktl) obj;
            if (this.a.equals(ktlVar.a) && this.o.equals(ktlVar.o) && this.n.equals(ktlVar.n) && this.b.equals(ktlVar.b) && this.c.equals(ktlVar.c) && this.d.equals(ktlVar.d) && ((scheduledExecutorService = this.e) != null ? scheduledExecutorService.equals(ktlVar.e) : ktlVar.e == null) && ((ktvVar = this.f) != null ? ktvVar.equals(ktlVar.f) : ktlVar.f == null) && this.g.equals(ktlVar.g) && this.h.equals(ktlVar.h) && this.i.equals(ktlVar.i) && this.j.equals(ktlVar.j) && this.k == ktlVar.k && this.l == ktlVar.l && this.m == ktlVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        ScheduledExecutorService scheduledExecutorService = this.e;
        int i = 0;
        if (scheduledExecutorService == null) {
            hashCode = 0;
        } else {
            hashCode = scheduledExecutorService.hashCode();
        }
        int i2 = ((hashCode2 * 1000003) ^ hashCode) * 1000003;
        ktv ktvVar = this.f;
        if (ktvVar != null) {
            i = ktvVar.hashCode();
        }
        int hashCode3 = (((((((((((i2 ^ i) * 583896283) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1525764945) ^ this.k) * 1000003;
        long j = this.l;
        int i3 = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.m;
        return (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
    }

    public final String toString() {
        jfe jfeVar = this.j;
        jfe jfeVar2 = this.i;
        jfe jfeVar3 = this.h;
        jfe jfeVar4 = this.g;
        ktv ktvVar = this.f;
        ScheduledExecutorService scheduledExecutorService = this.e;
        Executor executor = this.d;
        Executor executor2 = this.c;
        Executor executor3 = this.b;
        njz njzVar = this.n;
        fma fmaVar = this.o;
        return "ChannelConfig{context=" + String.valueOf(this.a) + ", clock=" + String.valueOf(fmaVar) + ", transport=" + String.valueOf(njzVar) + ", transportExecutor=" + String.valueOf(executor3) + ", ioExecutor=" + String.valueOf(executor2) + ", networkExecutor=" + String.valueOf(executor) + ", transportScheduledExecutor=" + String.valueOf(scheduledExecutorService) + ", authContextManager=" + String.valueOf(ktvVar) + ", rpcCacheProvider=null, userAgentOverride=null, recordNetworkMetricsToPrimes=" + String.valueOf(jfeVar4) + ", recordCachingMetricsToPrimes=" + String.valueOf(jfeVar3) + ", recordBandwidthMetrics=" + String.valueOf(jfeVar2) + ", grpcIdleTimeoutMillis=" + String.valueOf(jfeVar) + ", streamzConfig=null, grpcServiceConfig=null, consistencyTokenConfig=null, maxMessageSize=" + this.k + ", grpcKeepAliveTimeMillis=" + this.l + ", grpcKeepAliveTimeoutMillis=" + this.m + ", channelCredentials=null}";
    }

    public ktl(Context context, fma fmaVar, njz njzVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, ktv ktvVar, jfe jfeVar, jfe jfeVar2, jfe jfeVar3, jfe jfeVar4, long j) {
        this.a = context;
        this.o = fmaVar;
        this.n = njzVar;
        this.b = executor;
        this.c = executor2;
        this.d = executor3;
        this.e = scheduledExecutorService;
        this.f = ktvVar;
        this.g = jfeVar;
        this.h = jfeVar2;
        this.i = jfeVar3;
        this.j = jfeVar4;
        this.k = 4194304;
        this.l = Long.MAX_VALUE;
        this.m = j;
    }
}
