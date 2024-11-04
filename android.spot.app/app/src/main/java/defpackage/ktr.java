package defpackage;

import android.content.Context;
import java.net.URI;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktr {
    public Context a;
    public URI b;
    public Executor c;
    public Executor d;
    public ScheduledExecutorService e;
    public jfe f;
    public Integer g;
    public Integer h;
    public long i;
    public int j;
    public long k;
    public long l;
    public byte m;

    public final void a(long j) {
        this.k = j;
        this.m = (byte) (this.m | 4);
    }

    public final void b(long j) {
        this.l = j;
        this.m = (byte) (this.m | 8);
    }

    public final void c(int i) {
        this.j = i;
        this.m = (byte) (this.m | 2);
    }

    public final void d(jfe jfeVar) {
        if (jfeVar != null) {
            this.f = jfeVar;
            return;
        }
        throw new NullPointerException("Null recordNetworkMetricsToPrimes");
    }
}
