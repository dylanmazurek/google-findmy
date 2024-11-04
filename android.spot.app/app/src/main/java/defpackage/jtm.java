package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtm implements Closeable {
    private final Deque a = new ArrayDeque(4);
    private Throwable b;

    public final RuntimeException a(Throwable th) {
        this.b = th;
        jfi.a(th, IOException.class);
        jfi.b(th);
        throw new RuntimeException(th);
    }

    public final void b(Closeable closeable) {
        this.a.addFirst(closeable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Throwable th = this.b;
        while (!this.a.isEmpty()) {
            Closeable closeable = (Closeable) this.a.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (Throwable unused) {
                        jtl.a.logp(Level.WARNING, "com.google.common.io.Closer", "lambda$static$0", "Suppressing exception thrown when closing ".concat(String.valueOf(String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.b == null && th != null) {
            jfi.a(th, IOException.class);
            jfi.b(th);
            throw new AssertionError(th);
        }
    }
}
