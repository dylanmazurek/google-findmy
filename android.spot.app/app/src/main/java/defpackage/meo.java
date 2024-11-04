package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class meo implements mdq {
    private mca a;
    private men b;
    public volatile boolean c;
    public mds d;
    public mdq e;
    private long g;
    private long h;
    public List f = new ArrayList();
    private List i = new ArrayList();

    private final void b(Runnable runnable) {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called after start");
        synchronized (this) {
            if (!this.c) {
                this.f.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @Override // defpackage.mdq
    public final lyp a() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:            if (r0.hasNext() == false) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:            ((java.lang.Runnable) r0.next()).run();     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:            r0 = r1.iterator();     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r6)
            java.util.List r1 = r6.f     // Catch: java.lang.Throwable -> L6d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r1 == 0) goto L4f
            r0 = 0
            r6.f = r0     // Catch: java.lang.Throwable -> L6d
            r1 = 1
            r6.c = r1     // Catch: java.lang.Throwable -> L6d
            men r2 = r6.b     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L4e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            monitor-enter(r2)
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L2d
            r2.c = r0     // Catch: java.lang.Throwable -> L4b
            r2.b = r1     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            return
        L2d:
            java.util.List r4 = r2.c     // Catch: java.lang.Throwable -> L4b
            r2.c = r3     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r3 = r4.iterator()
        L36:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            java.lang.Runnable r5 = (java.lang.Runnable) r5
            r5.run()
            goto L36
        L46:
            r4.clear()
            r3 = r4
            goto L1e
        L4b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r0
        L4e:
            return
        L4f:
            java.util.List r1 = r6.f     // Catch: java.lang.Throwable -> L6d
            r6.f = r0     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            java.util.Iterator r0 = r1.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L68
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L58
        L68:
            r1.clear()
            r0 = r1
            goto L5
        L6d:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.meo.d():void");
    }

    public final void e(mds mdsVar) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.i = null;
        this.e.n(mdsVar);
    }

    public final void f(mdq mdqVar) {
        boolean z;
        mdq mdqVar2 = this.e;
        if (mdqVar2 == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.X(z, "realStream already set to %s", mdqVar2);
        this.e = mdqVar;
        this.h = System.nanoTime();
    }

    @Override // defpackage.mdq
    public void g(mfm mfmVar) {
        synchronized (this) {
            if (this.d == null) {
                return;
            }
            if (this.e != null) {
                mfmVar.b("buffered_nanos", Long.valueOf(this.h - this.g));
                this.e.g(mfmVar);
            } else {
                mfmVar.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.g));
                mfmVar.a("waiting_for_connection");
            }
        }
    }

    @Override // defpackage.mdq
    public void h(mca mcaVar) {
        boolean z;
        boolean z2 = true;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called after start");
        mcaVar.getClass();
        synchronized (this) {
            if (this.e == null) {
                f(mhn.a);
                this.a = mcaVar;
                z2 = false;
            }
        }
        if (z2) {
            b(new kvz(this, mcaVar, 11, null));
            return;
        }
        d();
        c();
        this.d.a(mcaVar, mdr.PROCESSED, new mbc());
    }

    @Override // defpackage.mdq
    public final void i() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called after start");
        b(new meg(this, 10));
    }

    @Override // defpackage.mdq
    public final void j(lzj lzjVar) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called before start");
        this.i.add(new kvz(this, lzjVar, 9, null));
    }

    @Override // defpackage.mdq
    public final void k(lzm lzmVar) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called before start");
        lzmVar.getClass();
        this.i.add(new kvz(this, lzmVar, 8, null));
    }

    @Override // defpackage.mdq
    public final void l(int i) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called before start");
        this.i.add(new bth(this, i, 11, null));
    }

    @Override // defpackage.mdq
    public final void m(int i) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called before start");
        this.i.add(new bth(this, i, 12, null));
    }

    @Override // defpackage.mdq
    public final void n(mds mdsVar) {
        boolean z;
        mca mcaVar;
        boolean z2;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "already started");
        synchronized (this) {
            mcaVar = this.a;
            z2 = this.c;
            if (!z2) {
                men menVar = new men(mdsVar);
                this.b = menVar;
                mdsVar = menVar;
            }
            this.d = mdsVar;
            this.g = System.nanoTime();
        }
        if (mcaVar != null) {
            mdsVar.a(mcaVar, mdr.PROCESSED, new mbc());
        } else if (z2) {
            e(mdsVar);
        }
    }

    @Override // defpackage.mju
    public final boolean o() {
        if (this.c) {
            return this.e.o();
        }
        return false;
    }

    @Override // defpackage.mju
    public final void r() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called after start");
        if (this.c) {
            this.e.r();
        } else {
            b(new meg(this, 9));
        }
    }

    @Override // defpackage.mju
    public final void s() {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called before start");
        this.i.add(new meg(this, 7));
    }

    @Override // defpackage.mju
    public final void t(int i) {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called after start");
        if (this.c) {
            this.e.t(i);
        } else {
            b(new bth(this, i, 10, null));
        }
    }

    @Override // defpackage.mju
    public final void u(lzb lzbVar) {
        boolean z;
        if (this.d == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called before start");
        this.i.add(new kvz(this, lzbVar, 7, null));
    }

    @Override // defpackage.mju
    public final void v(InputStream inputStream) {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "May only be called after start");
        if (this.c) {
            this.e.v(inputStream);
        } else {
            b(new kvz(this, inputStream, 10));
        }
    }

    protected void c() {
    }
}
