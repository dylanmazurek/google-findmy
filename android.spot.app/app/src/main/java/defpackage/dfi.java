package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfi extends Thread {
    public final BlockingQueue a;
    private final BlockingQueue b;
    private volatile boolean c = false;
    private final eld d;

    static {
        String str = dga.a;
    }

    public dfi(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, ddh ddhVar) {
        this.b = blockingQueue;
        this.a = blockingQueue2;
        this.d = new eld(this, blockingQueue2, ddhVar);
    }

    private void b() {
        dfq dfqVar = (dfq) this.b.take();
        int i = dfz.a;
        dfqVar.m();
        try {
            if (dfqVar.i()) {
                dfqVar.l();
            } else {
                dfqVar.c();
                if (!this.d.d(dfqVar)) {
                    this.a.put(dfqVar);
                }
            }
        } finally {
            dfqVar.m();
        }
    }

    public final void a() {
        this.c = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.c) {
                    Thread.currentThread().interrupt();
                    return;
                }
                dga.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
