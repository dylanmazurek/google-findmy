package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.google.android.gms.maps.model.LatLng;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbe extends Handler implements MessageQueue.IdleHandler {
    public final Lock a;
    public final Queue b;
    final /* synthetic */ lbi c;
    private final Condition d;
    private final Queue e;
    private final Queue f;
    private final Queue g;
    private final Queue h;
    private boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbe(lbi lbiVar) {
        super(Looper.getMainLooper());
        this.c = lbiVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.d = reentrantLock.newCondition();
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.g = new LinkedList();
        this.h = new LinkedList();
        this.b = new LinkedList();
    }

    private final void f(fsa fsaVar) {
        this.c.k.j(fsaVar);
        this.c.l.j(fsaVar);
        this.c.d.c.d(fsaVar);
    }

    public final void a(lbf lbfVar, LatLng latLng, LatLng latLng2) {
        this.a.lock();
        this.b.add(new lbd(this.c, lbfVar, latLng, latLng2));
        this.a.unlock();
    }

    public final void b(boolean z, fsa fsaVar) {
        this.a.lock();
        sendEmptyMessage(0);
        if (z) {
            this.h.add(fsaVar);
        } else {
            this.g.add(fsaVar);
        }
        this.a.unlock();
    }

    public final void c() {
        while (d()) {
            sendEmptyMessage(0);
            this.a.lock();
            try {
                try {
                    if (d()) {
                        this.d.await();
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } finally {
                this.a.unlock();
            }
        }
    }

    public final boolean d() {
        try {
            this.a.lock();
            boolean z = true;
            if (this.e.isEmpty() && this.f.isEmpty() && this.h.isEmpty() && this.g.isEmpty()) {
                if (this.b.isEmpty()) {
                    z = false;
                }
            }
            return z;
        } finally {
            this.a.unlock();
        }
    }

    public final void e(boolean z, nmu nmuVar) {
        this.a.lock();
        sendEmptyMessage(0);
        if (z) {
            this.f.add(nmuVar);
        } else {
            this.e.add(nmuVar);
        }
        this.a.unlock();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.i) {
            Looper.myQueue().addIdleHandler(this);
            this.i = true;
        }
        removeMessages(0);
        this.a.lock();
        for (int i = 0; i < 10; i++) {
            try {
                if (!this.h.isEmpty()) {
                    f((fsa) this.h.poll());
                } else if (!this.b.isEmpty()) {
                    lbd lbdVar = (lbd) this.b.poll();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setInterpolator(lbi.b);
                    ofFloat.setDuration(lbdVar.b.f);
                    ofFloat.addUpdateListener(lbdVar);
                    ofFloat.addListener(lbdVar);
                    ofFloat.start();
                } else if (!this.f.isEmpty()) {
                    ((nmu) this.f.poll()).d(this);
                } else if (!this.e.isEmpty()) {
                    ((nmu) this.e.poll()).d(this);
                } else if (!this.g.isEmpty()) {
                    f((fsa) this.g.poll());
                }
            } finally {
                this.a.unlock();
            }
        }
        if (!d()) {
            this.i = false;
            Looper.myQueue().removeIdleHandler(this);
            this.d.signalAll();
        } else {
            sendEmptyMessageDelayed(0, 10L);
        }
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        sendEmptyMessage(0);
        return true;
    }
}
