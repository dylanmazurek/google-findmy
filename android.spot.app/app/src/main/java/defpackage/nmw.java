package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmw implements Executor {
    private final Executor a;
    private final Runnable b = new nmv(this, 0);
    private final ArrayDeque c = new ArrayDeque();
    private boolean d;

    public nmw(Executor executor) {
        this.a = executor;
    }

    public final void a() {
        boolean z;
        boolean z2;
        synchronized (this.c) {
            if (this.d) {
                return;
            }
            Runnable runnable = (Runnable) this.c.pollFirst();
            if (runnable != null) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            while (runnable != null) {
                try {
                    runnable.run();
                    synchronized (this.c) {
                        runnable = (Runnable) this.c.pollFirst();
                        if (runnable != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.d = z2;
                    }
                } catch (Throwable th) {
                    synchronized (this.c) {
                        this.d = false;
                        try {
                            this.a.execute(this.b);
                        } catch (RejectedExecutionException unused) {
                        }
                        throw th;
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            this.c.addLast(runnable);
            try {
                this.a.execute(this.b);
            } catch (RejectedExecutionException unused) {
                this.c.removeLast();
            }
        }
    }
}
