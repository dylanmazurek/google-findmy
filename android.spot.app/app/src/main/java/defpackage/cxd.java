package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxd implements Executor {
    public final ArrayDeque a = new ArrayDeque();
    public final Object b = new Object();
    private final Executor c;
    private Runnable d;
    private final /* synthetic */ int e;

    public cxd(Executor executor, int i, byte[] bArr) {
        this.e = i;
        this.c = executor;
    }

    public final void a() {
        if (this.e != 0) {
            synchronized (this.b) {
                Object poll = this.a.poll();
                Runnable runnable = (Runnable) poll;
                this.d = runnable;
                if (poll != null) {
                    this.c.execute(runnable);
                }
            }
            return;
        }
        Runnable runnable2 = (Runnable) this.a.poll();
        this.d = runnable2;
        if (runnable2 != null) {
            this.c.execute(runnable2);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.e != 0) {
            runnable.getClass();
            synchronized (this.b) {
                this.a.offer(new bx(runnable, this, 18));
                if (this.d == null) {
                    a();
                }
            }
            return;
        }
        synchronized (this.b) {
            this.a.add(new cri(this, runnable, 2));
            if (this.d == null) {
                a();
            }
        }
    }

    public cxd(Executor executor, int i) {
        this.e = i;
        this.c = executor;
    }
}
