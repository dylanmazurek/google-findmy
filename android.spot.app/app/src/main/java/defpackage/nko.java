package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nko extends nln {
    public static final ReentrantLock b;
    public static final Condition c;
    public static final long d;
    public static final long e;
    public static nko f;
    public int g;
    public nko h;
    public long i;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        b = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        newCondition.getClass();
        c = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        d = millis;
        e = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final long c(long j) {
        return this.i - j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public IOException d(IOException iOException) {
        throw null;
    }

    public final void e() {
        nko nkoVar;
        long j = this.k;
        boolean g = g();
        if (j == 0) {
            if (g) {
                j = 0;
            } else {
                return;
            }
        }
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            if (this.g == 0) {
                this.g = 1;
                if (f == null) {
                    f = new nko();
                    new nkl().start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0 && g) {
                    this.i = Math.min(j, h() - nanoTime) + nanoTime;
                } else if (j != 0) {
                    this.i = j + nanoTime;
                } else if (g) {
                    this.i = h();
                } else {
                    throw new AssertionError();
                }
                long c2 = c(nanoTime);
                nko nkoVar2 = f;
                nkoVar2.getClass();
                while (true) {
                    nkoVar = nkoVar2.h;
                    if (nkoVar == null || c2 < nkoVar.c(nanoTime)) {
                        break;
                    } else {
                        nkoVar2 = nkoVar;
                    }
                }
                this.h = nkoVar;
                nkoVar2.h = this;
                if (nkoVar2 == f) {
                    c.signal();
                }
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean f() {
        ReentrantLock reentrantLock = b;
        reentrantLock.lock();
        try {
            int i = this.g;
            boolean z = false;
            this.g = 0;
            if (i != 1) {
                if (i == 2) {
                    z = true;
                }
                return z;
            }
            nko nkoVar = f;
            while (nkoVar != null) {
                nko nkoVar2 = nkoVar.h;
                if (nkoVar2 == this) {
                    nkoVar.h = this.h;
                    this.h = null;
                    return false;
                }
                nkoVar = nkoVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a() {
    }
}
