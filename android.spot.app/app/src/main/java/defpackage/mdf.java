package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdf implements mdv {
    public final mdv a;

    public mdf(mdv mdvVar, Executor executor) {
        this.a = mdvVar;
        executor.getClass();
    }

    @Override // defpackage.mdv
    public final ScheduledExecutorService a() {
        return ((mck) this.a).a;
    }

    @Override // defpackage.mdv, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
