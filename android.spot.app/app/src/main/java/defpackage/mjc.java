package defpackage;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjc implements mdq {
    static final maz a = new max("grpc-previous-rpc-attempts", mbc.b);
    static final maz b = new max("grpc-retry-pushback-ms", mbc.b);
    public static final mca c = mca.c.d("Stream thrown away because RetriableStream committed");
    public static final Random d = new Random();
    final /* synthetic */ mbg A;
    final /* synthetic */ lys B;
    final /* synthetic */ lzi C;
    final /* synthetic */ mge D;
    public final ktf E;
    public bso F;
    private final mbc G;
    private mca H;
    public final mbg e;
    public final Executor f;
    public final Executor g;
    public final ScheduledExecutorService h;
    public final mjd i;
    public final mfi j;
    public final boolean k;
    public final Object l;
    public final long m;
    public final long n;
    public final mjb o;
    public final mfm p;
    public volatile mix q;
    public final AtomicBoolean r;
    public final AtomicInteger s;
    public final AtomicInteger t;
    public long u;
    public mds v;
    public miv w;
    public miv x;
    public long y;
    public boolean z;

    public mjc(mge mgeVar, mbg mbgVar, mbc mbcVar, lys lysVar, mjd mjdVar, mfi mfiVar, lzi lziVar) {
        boolean z;
        this.A = mbgVar;
        this.B = lysVar;
        this.C = lziVar;
        this.D = mgeVar;
        mgu mguVar = mgeVar.b;
        ktf ktfVar = mguVar.S;
        long j = mguVar.L;
        long j2 = mguVar.M;
        Executor d2 = mguVar.d(lysVar);
        ScheduledExecutorService a2 = mguVar.i.a();
        mjb mjbVar = mgeVar.a;
        this.g = new mcf(new mim());
        this.l = new Object();
        this.p = new mfm();
        this.q = new mix(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);
        this.r = new AtomicBoolean();
        this.s = new AtomicInteger();
        this.t = new AtomicInteger();
        this.e = mbgVar;
        this.E = ktfVar;
        this.m = j;
        this.n = j2;
        this.f = d2;
        this.h = a2;
        this.G = mbcVar;
        this.i = mjdVar;
        if (mjdVar != null) {
            this.y = mjdVar.b;
        }
        this.j = mfiVar;
        if (mjdVar != null && mfiVar != null) {
            z = false;
        } else {
            z = true;
        }
        hwx.K(z, "Should not provide both retryPolicy and hedgingPolicy");
        this.k = mfiVar != null;
        this.o = mjbVar;
    }

    @Override // defpackage.mdq
    public final lyp a() {
        throw null;
    }

    public final mja b(int i, boolean z) {
        int i2;
        do {
            i2 = this.t.get();
            if (i2 < 0) {
                return null;
            }
        } while (!this.t.compareAndSet(i2, i2 + 1));
        mja mjaVar = new mja(i);
        mis misVar = new mis(new miu(this, mjaVar));
        mbc mbcVar = this.G;
        mbc mbcVar2 = new mbc();
        mbcVar2.d(mbcVar);
        if (i > 0) {
            mbcVar2.e(a, String.valueOf(i));
        }
        lys g = this.B.g(misVar);
        lyy[] i3 = mfh.i(g);
        lzi a2 = this.C.a();
        try {
            mdq a3 = this.D.b.y.a(this.A, mbcVar2, g, i3);
            this.C.c(a2);
            mjaVar.a = a3;
            return mjaVar;
        } catch (Throwable th) {
            this.C.c(a2);
            throw th;
        }
    }

    public final Runnable c(mja mjaVar) {
        boolean z;
        List list;
        Collection emptyList;
        boolean z2;
        boolean z3;
        Future future;
        Future future2;
        synchronized (this.l) {
            if (this.q.f != null) {
                return null;
            }
            Collection collection = this.q.c;
            mix mixVar = this.q;
            if (mixVar.f == null) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "Already committed");
            List list2 = mixVar.b;
            if (mixVar.c.contains(mjaVar)) {
                list = null;
                emptyList = Collections.singleton(mjaVar);
                z2 = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z2 = false;
            }
            this.q = new mix(list, emptyList, mixVar.d, mjaVar, mixVar.g, z2, mixVar.h, mixVar.e);
            this.E.v(-this.u);
            miv mivVar = this.w;
            if (mivVar != null) {
                z3 = mivVar.b;
            } else {
                z3 = false;
            }
            if (mivVar != null) {
                Future a2 = mivVar.a();
                this.w = null;
                future = a2;
            } else {
                future = null;
            }
            miv mivVar2 = this.x;
            if (mivVar2 != null) {
                future2 = mivVar2.a();
                this.x = null;
            } else {
                future2 = null;
            }
            return new min(this, collection, mjaVar, future, z3, future2, 0);
        }
    }

    public final void d(mja mjaVar) {
        Runnable c2 = c(mjaVar);
        if (c2 != null) {
            this.f.execute(c2);
        }
    }

    public final void e(mit mitVar) {
        Collection collection;
        synchronized (this.l) {
            if (!this.q.a) {
                this.q.b.add(mitVar);
            }
            collection = this.q.c;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            mitVar.a((mja) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:            if (r1 == null) goto L87;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:            r9.g.execute(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:            if (r4 != false) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:            r10.a.n(new defpackage.miz(r9, r10));     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:            r0 = r10.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:            if (r9.q.f != r10) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:            r10 = r9.H;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:            r0.h(r10);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:            r10 = defpackage.mjc.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:            r2 = r3.size();        r5 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:            if (r5 >= r2) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:            r6 = (defpackage.mit) r3.get(r5);        r6.a(r10);        r4 = r4 | (r6 instanceof defpackage.miw);        r6 = r9.q;        r8 = r6.f;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:            if (r8 == null) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:            if (r8 != r10) goto L121;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a3, code lost:            r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a7, code lost:            if (r6.g == false) goto L123;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.mja r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r3 = r1
            r2 = 0
            r4 = 0
        L5:
            java.lang.Object r5 = r9.l
            monitor-enter(r5)
            mix r6 = r9.q     // Catch: java.lang.Throwable -> Lac
            mja r7 = r6.f     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L12
            if (r7 == r10) goto L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            goto L36
        L12:
            boolean r7 = r6.g     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L18
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            goto L36
        L18:
            java.util.List r7 = r6.b     // Catch: java.lang.Throwable -> Lac
            int r7 = r7.size()     // Catch: java.lang.Throwable -> Lac
            if (r2 != r7) goto L5b
            mix r0 = r6.c(r10)     // Catch: java.lang.Throwable -> Lac
            r9.q = r0     // Catch: java.lang.Throwable -> Lac
            boolean r0 = r9.o()     // Catch: java.lang.Throwable -> Lac
            if (r0 != 0) goto L2e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            return
        L2e:
            mgs r1 = new mgs     // Catch: java.lang.Throwable -> Lac
            r0 = 8
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> Lac
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r10 = r9.g
            r10.execute(r1)
            return
        L3e:
            if (r4 != 0) goto L4a
            mdq r0 = r10.a
            miz r1 = new miz
            r1.<init>(r9, r10)
            r0.n(r1)
        L4a:
            mdq r0 = r10.a
            mix r1 = r9.q
            mja r1 = r1.f
            if (r1 != r10) goto L55
            mca r10 = r9.H
            goto L57
        L55:
            mca r10 = defpackage.mjc.c
        L57:
            r0.h(r10)
            return
        L5b:
            boolean r7 = r10.b     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L61
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            return
        L61:
            int r7 = r2 + 128
            java.util.List r8 = r6.b     // Catch: java.lang.Throwable -> Lac
            int r8 = r8.size()     // Catch: java.lang.Throwable -> Lac
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> Lac
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lac
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Lac
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> Lac
            java.util.List r6 = r6.b     // Catch: java.lang.Throwable -> Lac
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> Lac
            r3.addAll(r2)     // Catch: java.lang.Throwable -> Lac
        L87:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            int r2 = r3.size()
            r5 = 0
        L8d:
            if (r5 >= r2) goto La9
            java.lang.Object r6 = r3.get(r5)
            mit r6 = (defpackage.mit) r6
            r6.a(r10)
            boolean r6 = r6 instanceof defpackage.miw
            r4 = r4 | r6
            mix r6 = r9.q
            mja r8 = r6.f
            if (r8 == 0) goto La3
            if (r8 != r10) goto La9
        La3:
            boolean r6 = r6.g
            int r5 = r5 + 1
            if (r6 == 0) goto L8d
        La9:
            r2 = r7
            goto L5
        Lac:
            r10 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lac
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjc.f(mja):void");
    }

    @Override // defpackage.mdq
    public final void g(mfm mfmVar) {
        mix mixVar;
        synchronized (this.l) {
            mfmVar.b("closed", this.p);
            mixVar = this.q;
        }
        if (mixVar.f != null) {
            mfm mfmVar2 = new mfm();
            mixVar.f.a.g(mfmVar2);
            mfmVar.b("committed", mfmVar2);
            return;
        }
        mfm mfmVar3 = new mfm();
        for (mja mjaVar : mixVar.c) {
            mfm mfmVar4 = new mfm();
            mjaVar.a.g(mfmVar4);
            mfmVar3.a(mfmVar4);
        }
        mfmVar.b("open", mfmVar3);
    }

    @Override // defpackage.mdq
    public final void h(mca mcaVar) {
        mja mjaVar;
        mja mjaVar2 = new mja(0);
        mjaVar2.a = new mhn();
        Runnable c2 = c(mjaVar2);
        if (c2 != null) {
            synchronized (this.l) {
                this.q = this.q.c(mjaVar2);
            }
            c2.run();
            q(mcaVar, mdr.PROCESSED, new mbc());
            return;
        }
        synchronized (this.l) {
            if (this.q.c.contains(this.q.f)) {
                mjaVar = this.q.f;
            } else {
                this.H = mcaVar;
                mjaVar = null;
            }
            mix mixVar = this.q;
            this.q = new mix(mixVar.b, mixVar.c, mixVar.d, mixVar.f, true, mixVar.a, mixVar.h, mixVar.e);
        }
        if (mjaVar != null) {
            mjaVar.a.h(mcaVar);
        }
    }

    @Override // defpackage.mdq
    public final void i() {
        e(new mip(0));
    }

    @Override // defpackage.mdq
    public final void j(lzj lzjVar) {
        e(new mio(lzjVar, 0));
    }

    @Override // defpackage.mdq
    public final void k(lzm lzmVar) {
        e(new mio(lzmVar, 2));
    }

    @Override // defpackage.mdq
    public final void l(int i) {
        e(new miq(i, 1));
    }

    @Override // defpackage.mdq
    public final void m(int i) {
        e(new miq(i, 0));
    }

    @Override // defpackage.mdq
    public final void n(mds mdsVar) {
        mca mcaVar;
        miv mivVar;
        mjb mjbVar;
        this.v = mdsVar;
        mgt mgtVar = this.D.b.z;
        synchronized (mgtVar.a) {
            mcaVar = mgtVar.c;
            mivVar = null;
            if (mcaVar == null) {
                mgtVar.b.add(this);
                mcaVar = null;
            }
        }
        if (mcaVar != null) {
            h(mcaVar);
            return;
        }
        synchronized (this.l) {
            this.q.b.add(new miw(this));
        }
        mja b2 = b(0, false);
        if (b2 == null) {
            return;
        }
        if (this.k) {
            synchronized (this.l) {
                this.q = this.q.a(b2);
                if (w(this.q) && ((mjbVar = this.o) == null || mjbVar.a())) {
                    mivVar = new miv(this.l);
                    this.x = mivVar;
                }
            }
            if (mivVar != null) {
                mivVar.b(this.h.schedule(new fiq(this, mivVar, 2), this.j.b, TimeUnit.NANOSECONDS));
            }
        }
        f(b2);
    }

    @Override // defpackage.mju
    public final boolean o() {
        Iterator it = this.q.c.iterator();
        while (it.hasNext()) {
            if (((mja) it.next()).a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void p() {
        Future future;
        synchronized (this.l) {
            miv mivVar = this.x;
            future = null;
            if (mivVar != null) {
                Future a2 = mivVar.a();
                this.x = null;
                future = a2;
            }
            this.q = this.q.b();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    public final void q(mca mcaVar, mdr mdrVar, mbc mbcVar) {
        this.F = new bso(mcaVar, mdrVar, mbcVar);
        if (this.t.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.g.execute(new bxi(this, mcaVar, mdrVar, mbcVar, 9));
        }
    }

    @Override // defpackage.mju
    public final void r() {
        mix mixVar = this.q;
        if (mixVar.a) {
            mixVar.f.a.r();
        } else {
            e(new mip(1));
        }
    }

    @Override // defpackage.mju
    public final void s() {
        e(new mip(2));
    }

    @Override // defpackage.mju
    public final void t(int i) {
        mix mixVar = this.q;
        if (mixVar.a) {
            mixVar.f.a.t(i);
        } else {
            e(new miq(i, 2));
        }
    }

    @Override // defpackage.mju
    public final void u(lzb lzbVar) {
        e(new mio(lzbVar, 1));
    }

    @Override // defpackage.mju
    public final void v(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    public final boolean w(mix mixVar) {
        if (mixVar.f == null && mixVar.e < this.j.a && !mixVar.h) {
            return true;
        }
        return false;
    }
}
