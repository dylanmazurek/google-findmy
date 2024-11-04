package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhg implements Cloneable {
    public final ngh a;
    public final ngk b;
    public final nhk c;
    public final nfx d;
    public final nhf e;
    public final AtomicBoolean f;
    public Object g;
    public nhd h;
    public nhi i;
    public nhc j;
    public boolean k;
    public boolean l;
    public boolean m;
    public volatile boolean n;
    public volatile nhc o;
    public volatile nhi p;

    public nhg(ngh nghVar, ngk ngkVar) {
        this.a = nghVar;
        this.b = ngkVar;
        this.c = (nhk) nghVar.u.b;
        Object obj = nghVar.s.a;
        byte[] bArr = ngt.a;
        this.d = (nfx) obj;
        nhf nhfVar = new nhf(this);
        nhfVar.k(0L, TimeUnit.MILLISECONDS);
        this.e = nhfVar;
        this.f = new AtomicBoolean();
        this.m = true;
    }

    private final IOException f(IOException iOException) {
        IOException iOException2;
        Socket c;
        byte[] bArr = ngt.a;
        nhi nhiVar = this.i;
        if (nhiVar != null) {
            synchronized (nhiVar) {
                c = c();
            }
            if (this.i == null) {
                if (c != null) {
                    ngt.p(c);
                }
            } else if (c != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.e.f()) {
            iOException2 = iOException;
        } else {
            InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
            iOException2 = interruptedIOException;
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
                iOException2 = interruptedIOException;
            }
        }
        if (iOException != null) {
            iOException2.getClass();
        }
        return iOException2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:42:0x000e, B:11:0x001e, B:13:0x0022, B:14:0x0024, B:16:0x0028, B:20:0x0031, B:22:0x0035, B:7:0x0017), top: B:41:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:42:0x000e, B:11:0x001e, B:13:0x0022, B:14:0x0024, B:16:0x0028, B:20:0x0031, B:22:0x0035, B:7:0x0017), top: B:41:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.IOException a(defpackage.nhc r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            nhc r0 = r2.o
            boolean r3 = defpackage.amr.i(r3, r0)
            if (r3 != 0) goto L9
            goto L54
        L9:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L15
            boolean r1 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L1c
            goto L15
        L13:
            r3 = move-exception
            goto L3d
        L15:
            if (r5 == 0) goto L3f
            boolean r5 = r2.l     // Catch: java.lang.Throwable -> L13
            if (r5 == 0) goto L3f
            r5 = 1
        L1c:
            if (r4 == 0) goto L20
            r2.k = r0     // Catch: java.lang.Throwable -> L13
        L20:
            if (r5 == 0) goto L24
            r2.l = r0     // Catch: java.lang.Throwable -> L13
        L24:
            boolean r4 = r2.k     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L2e
            boolean r5 = r2.l     // Catch: java.lang.Throwable -> L13
            if (r5 != 0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r4 != 0) goto L3b
            boolean r4 = r2.l     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3b
            boolean r4 = r2.m     // Catch: java.lang.Throwable -> L13
            if (r4 != 0) goto L3b
            r0 = r5
            goto L40
        L3b:
            r0 = r5
            goto L3f
        L3d:
            monitor-exit(r2)
            throw r3
        L3f:
            r3 = 0
        L40:
            monitor-exit(r2)
            if (r0 == 0) goto L4d
            r4 = 0
            r2.o = r4
            nhi r4 = r2.i
            if (r4 == 0) goto L4d
            r4.c()
        L4d:
            if (r3 == 0) goto L54
            java.io.IOException r3 = r2.f(r6)
            return r3
        L54:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhg.a(nhc, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException b(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.m) {
                this.m = false;
                if (!this.k) {
                    if (!this.l) {
                        z = true;
                    }
                }
            }
        }
        if (z) {
            return f(iOException);
        }
        return iOException;
    }

    public final Socket c() {
        nhi nhiVar = this.i;
        nhiVar.getClass();
        byte[] bArr = ngt.a;
        List list = nhiVar.l;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (amr.i(((Reference) it.next()).get(), this)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            list.remove(i);
            this.i = null;
            if (list.isEmpty()) {
                nhiVar.m = System.nanoTime();
                nhk nhkVar = this.c;
                if (!nhiVar.i) {
                    ((ngx) nhkVar.b).e((ngv) nhkVar.c);
                } else {
                    nhiVar.k();
                    ((ConcurrentLinkedQueue) nhkVar.d).remove(nhiVar);
                    if (((ConcurrentLinkedQueue) nhkVar.d).isEmpty()) {
                        ((ngx) nhkVar.b).a();
                    }
                    return nhiVar.a();
                }
            }
            return null;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new nhg(this.a, this.b);
    }

    public final void d(nhi nhiVar) {
        byte[] bArr = ngt.a;
        if (this.i == null) {
            this.i = nhiVar;
            nhiVar.l.add(new nhe(this, this.g));
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [nhr, java.lang.Object] */
    public final void e(boolean z) {
        nhc nhcVar;
        synchronized (this) {
            if (!this.m) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (nhcVar = this.o) != null) {
            nhcVar.d.e();
            ((nhg) nhcVar.b).a(nhcVar, true, true, null);
        }
        this.j = null;
    }
}
