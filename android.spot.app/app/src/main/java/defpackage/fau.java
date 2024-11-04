package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fau extends Thread {
    final CountDownLatch a;
    public boolean b;
    private final WeakReference c;
    private final long d;

    public fau(faw fawVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.c = new WeakReference(fawVar);
        this.d = j;
        this.a = new CountDownLatch(1);
        this.b = false;
        start();
    }

    private final void a() {
        faw fawVar = (faw) this.c.get();
        if (fawVar != null) {
            fawVar.a();
            this.b = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
