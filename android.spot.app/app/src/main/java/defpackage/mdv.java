package defpackage;

import java.io.Closeable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface mdv extends Closeable {
    ScheduledExecutorService a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();
}
