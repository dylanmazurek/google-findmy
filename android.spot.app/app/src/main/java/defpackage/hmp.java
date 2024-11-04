package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmp implements Executor, hnt {
    public final jzd a;
    private final hnu b;
    private final mko e;
    private final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    private volatile boolean d = false;
    private final AtomicBoolean f = new AtomicBoolean();

    public hmp(jzd jzdVar, hnu hnuVar, mko mkoVar) {
        this.a = jzdVar;
        this.b = hnuVar;
        this.e = mkoVar;
        Object obj = ((hot) hnuVar.a).a;
        int i = hnv.c;
        if (((hnv) obj).b.get() > 0) {
            k();
        } else {
            hnuVar.a(this);
        }
    }

    private final void j() {
        while (true) {
            Runnable runnable = (Runnable) this.c.poll();
            if (runnable != null) {
                this.a.execute(runnable);
            } else {
                return;
            }
        }
    }

    private final void k() {
        this.a.schedule(new csf(this, 13), 3000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.hnt
    public final void d(Activity activity) {
        this.b.b(this);
        k();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        MessageQueue queue;
        if (this.d) {
            this.a.execute(runnable);
            return;
        }
        this.c.add(runnable);
        if (this.d) {
            j();
            return;
        }
        if (!this.f.getAndSet(true)) {
            if (Build.VERSION.SDK_INT >= 23 && ((Boolean) ((jer) ((lsi) this.e).b).e(false)).booleanValue()) {
                queue = Looper.getMainLooper().getQueue();
                queue.addIdleHandler(new MessageQueue.IdleHandler() { // from class: hmo
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        hmp hmpVar = hmp.this;
                        hmpVar.a.schedule(new csf(hmpVar, 12), 7000L, TimeUnit.MILLISECONDS);
                        return false;
                    }
                });
            } else {
                this.a.schedule(new csf(this, 12), 7000L, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void i() {
        this.d = true;
        j();
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void h(int i) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
