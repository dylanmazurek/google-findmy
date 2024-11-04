package defpackage;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxk extends IdentityHashMap implements Closeable {
    public final jck a = new jck(this, (byte[]) null);
    private volatile boolean b;
    private volatile CountDownLatch c;

    public final void a(AutoCloseable autoCloseable, Executor executor) {
        executor.getClass();
        if (autoCloseable == null) {
            return;
        }
        synchronized (this) {
            if (!this.b) {
                put(autoCloseable, executor);
            } else {
                jxp.d(autoCloseable, executor);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jys b(jxj jxjVar, Object obj) {
        jxk jxkVar = new jxk();
        try {
            jxp a = jxjVar.a(jxkVar.a, obj);
            a.a(jxkVar);
            return a.d;
        } finally {
            a(jxkVar, jxv.a);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            for (Map.Entry entry : entrySet()) {
                jxp.d((AutoCloseable) entry.getKey(), (Executor) entry.getValue());
            }
            clear();
        }
    }
}
