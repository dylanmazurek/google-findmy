package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njh {
    public final int a;
    public final nja b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final njf g;
    public final nje h;
    public final njg i;
    public final njg j;
    public IOException k;
    private final ArrayDeque l;
    private boolean m;
    private int n;

    public njh(int i, nja njaVar, boolean z, boolean z2, ngb ngbVar) {
        this.a = i;
        this.b = njaVar;
        this.f = njaVar.r.c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.l = arrayDeque;
        this.g = new njf(this, njaVar.q.c(), z2);
        this.h = new nje(this, z);
        this.i = new njg(this);
        this.j = new njg(this);
        if (ngbVar != null) {
            if (!h()) {
                arrayDeque.add(ngbVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (h()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    private final boolean n(int i, IOException iOException) {
        byte[] bArr = ngt.a;
        synchronized (this) {
            if (this.n != 0) {
                return false;
            }
            this.n = i;
            this.k = iOException;
            notifyAll();
            if (this.g.b) {
                if (this.h.a) {
                    return false;
                }
            }
            this.b.b(this.a);
            return true;
        }
    }

    public final synchronized ngb a() {
        Object removeFirst;
        this.i.e();
        while (this.l.isEmpty() && this.n == 0) {
            try {
                g();
            } catch (Throwable th) {
                this.i.b();
                throw th;
            }
        }
        this.i.b();
        if (!this.l.isEmpty()) {
            removeFirst = this.l.removeFirst();
            removeFirst.getClass();
        } else {
            IOException iOException = this.k;
            if (iOException == null) {
                int i = this.n;
                if (i == 0) {
                    throw null;
                }
                throw new njn(i);
            }
            throw iOException;
        }
        return (ngb) removeFirst;
    }

    public final nlj b() {
        synchronized (this) {
            if (!this.m && !h()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.h;
    }

    public final void c(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void d() {
        boolean z;
        boolean i;
        byte[] bArr = ngt.a;
        synchronized (this) {
            njf njfVar = this.g;
            z = false;
            if (!njfVar.b && njfVar.e) {
                nje njeVar = this.h;
                if (njeVar.a || njeVar.b) {
                    z = true;
                }
            }
            i = i();
        }
        if (z) {
            k(9, null);
        } else if (!i) {
            this.b.b(this.a);
        }
    }

    public final void e() {
        nje njeVar = this.h;
        if (!njeVar.b) {
            if (!njeVar.a) {
                int i = this.n;
                if (i != 0) {
                    IOException iOException = this.k;
                    if (iOException != null) {
                        throw iOException;
                    }
                    throw new njn(i);
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0015, code lost:            if (r4 != false) goto L10;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.ngb r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            byte[] r0 = defpackage.ngt.a
            monitor-enter(r2)
            boolean r0 = r2.m     // Catch: java.lang.Throwable -> L2d
            r1 = 1
            if (r0 == 0) goto Le
            if (r4 != 0) goto L17
            r4 = 0
        Le:
            r2.m = r1     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayDeque r0 = r2.l     // Catch: java.lang.Throwable -> L2d
            r0.add(r3)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L1b
        L17:
            njf r3 = r2.g     // Catch: java.lang.Throwable -> L2d
            r3.b = r1     // Catch: java.lang.Throwable -> L2d
        L1b:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L2d
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)
            if (r3 != 0) goto L2c
            nja r3 = r2.b
            int r4 = r2.a
            r3.b(r4)
        L2c:
            return
        L2d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njh.f(ngb, boolean):void");
    }

    public final void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final boolean h() {
        if ((this.a & 1) == 1) {
            return true;
        }
        return false;
    }

    public final synchronized boolean i() {
        if (this.n != 0) {
            return false;
        }
        njf njfVar = this.g;
        if (njfVar.b || njfVar.e) {
            nje njeVar = this.h;
            if (njeVar.a || njeVar.b) {
                if (this.m) {
                    return false;
                }
            }
        }
        return true;
    }

    public final synchronized int j() {
        return this.n;
    }

    public final void k(int i, IOException iOException) {
        if (!n(i, iOException)) {
            return;
        }
        this.b.m(this.a, i);
    }

    public final void l(int i) {
        if (!n(i, null)) {
            return;
        }
        this.b.n(this.a, i);
    }

    public final synchronized void m(int i) {
        if (this.n == 0) {
            this.n = i;
            notifyAll();
        }
    }
}
