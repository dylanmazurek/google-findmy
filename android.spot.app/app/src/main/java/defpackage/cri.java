package defpackage;

import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cri implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public cri(dfq dfqVar, bso bsoVar, int i) {
        this.a = i;
        this.b = dfqVar;
        this.c = bsoVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v42, types: [mmx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, msd] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [mmx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [mmx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [mmx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (this.b.isCancelled()) {
                                    this.c.i(null);
                                    return;
                                }
                                try {
                                    this.c.p(amr.f(this.b));
                                    return;
                                } catch (ExecutionException e) {
                                    this.c.p(mjo.n(mpd.q(e)));
                                    return;
                                }
                            }
                            this.b.f((mst) this.c, mlh.a);
                            return;
                        }
                        if (((dfq) this.b).i()) {
                            ((dfq) this.b).l();
                            return;
                        }
                        bso bsoVar = (bso) this.c;
                        Object obj = bsoVar.c;
                        if (obj == null) {
                            ((dfq) this.b).f(bsoVar.a);
                        } else {
                            ((dfq) this.b).e((dfy) obj);
                        }
                        ((dfq) this.b).l();
                        return;
                    }
                    synchronized (((cxm) this.c).c) {
                        if (((cri) ((cxm) this.c).a.remove(this.b)) != null) {
                            cxl cxlVar = (cxl) ((cxm) this.c).b.remove(this.b);
                            if (cxlVar != null) {
                                cxlVar.b((cvk) this.b);
                            }
                        } else {
                            cqc.b();
                            String.format("Timer with %s is already marked as complete.", this.b);
                        }
                    }
                    return;
                }
                try {
                    this.c.run();
                    synchronized (((cxd) this.b).b) {
                        ((cxd) this.b).a();
                    }
                    return;
                } catch (Throwable th) {
                    synchronized (((cxd) this.b).b) {
                        ((cxd) this.b).a();
                        throw th;
                    }
                }
            }
            if (this.b.isCancelled()) {
                this.c.i(null);
                return;
            }
            try {
                this.c.p(amr.f(this.b));
                return;
            } catch (ExecutionException e2) {
                this.c.p(mjo.n(bei.c(e2)));
                return;
            }
        }
        if (this.b.isCancelled()) {
            this.c.i(null);
            return;
        }
        try {
            this.c.p(csm.b(this.b));
        } catch (ExecutionException e3) {
            this.c.p(mjo.n(csm.c(e3)));
        }
    }

    public cri(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public cri(Object obj, Object obj2, int i, byte[] bArr) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
