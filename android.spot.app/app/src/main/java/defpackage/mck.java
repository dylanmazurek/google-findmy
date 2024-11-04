package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mck implements mdv {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final int c;
    public final mcl d;
    public final mjz e;
    private final boolean f;

    public mck(mcl mclVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, mjz mjzVar) {
        boolean z;
        if (scheduledExecutorService == null) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.a = z ? (ScheduledExecutorService) mjr.a(mfh.m) : scheduledExecutorService;
        this.c = i;
        this.d = mclVar;
        executor.getClass();
        this.b = executor;
        this.e = mjzVar;
    }

    @Override // defpackage.mdv
    public final ScheduledExecutorService a() {
        throw null;
    }

    @Override // defpackage.mdv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            mjr.d(mfh.m, this.a);
        }
    }
}
