package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvq implements mvj {
    public Object a = mvw.p;
    public mse b;
    final /* synthetic */ mvu c;

    public mvq(mvu mvuVar) {
        this.c = mvuVar;
    }

    @Override // defpackage.mvj
    public final void D(nai naiVar, int i) {
        mse mseVar = this.b;
        if (mseVar != null) {
            mseVar.D(naiVar, i);
        }
    }

    public final Object a(mmx mmxVar) {
        mwd mwdVar;
        boolean z;
        mwd mwdVar2;
        mvu mvuVar = this.c;
        mwd mwdVar3 = (mwd) mvuVar.d.a;
        while (!mvuVar.w()) {
            long b = mvuVar.b.b();
            long j = b / mvw.b;
            int i = (int) (b % mvw.b);
            if (mwdVar3.b != j) {
                mwd o = mvuVar.o(j, mwdVar3);
                if (o != null) {
                    mwdVar = o;
                } else {
                    continue;
                }
            } else {
                mwdVar = mwdVar3;
            }
            Object k = mvuVar.k(mwdVar, i, b, null);
            if (k != mvw.m) {
                if (k == mvw.o) {
                    if (b < mvuVar.c()) {
                        mwdVar.p();
                    }
                    mwdVar3 = mwdVar;
                } else {
                    if (k == mvw.n) {
                        mvu mvuVar2 = this.c;
                        mse u = msz.u(mjo.w(mmxVar));
                        try {
                            this.b = u;
                            Object k2 = mvuVar2.k(mwdVar, i, b, this);
                            if (k2 == mvw.m) {
                                mvu.C(this, mwdVar, i);
                            } else {
                                if (k2 == mvw.o) {
                                    if (b < mvuVar2.c()) {
                                        mwdVar.p();
                                    }
                                    mwd mwdVar4 = (mwd) mvuVar2.d.a;
                                    while (true) {
                                        if (mvuVar2.w()) {
                                            mse mseVar = this.b;
                                            mseVar.getClass();
                                            this.b = null;
                                            this.a = mvw.l;
                                            Throwable l = this.c.l();
                                            if (l == null) {
                                                mseVar.p(false);
                                            } else {
                                                if (msy.b) {
                                                    l = nbi.a(l, mseVar);
                                                }
                                                mseVar.p(mjo.n(l));
                                            }
                                        } else {
                                            long b2 = mvuVar2.b.b();
                                            long j2 = mvw.b;
                                            long j3 = b2 / j2;
                                            int i2 = (int) (b2 % j2);
                                            if (mwdVar4.b != j3) {
                                                mwd o2 = mvuVar2.o(j3, mwdVar4);
                                                if (o2 != null) {
                                                    mwdVar2 = o2;
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                mwdVar2 = mwdVar4;
                                            }
                                            Object k3 = mvuVar2.k(mwdVar2, i2, b2, this);
                                            if (k3 == mvw.m) {
                                                mvu.C(this, mwdVar2, i2);
                                                break;
                                            }
                                            if (k3 == mvw.o) {
                                                if (b2 < mvuVar2.c()) {
                                                    mwdVar2.p();
                                                }
                                                mwdVar4 = mwdVar2;
                                            } else if (k3 != mvw.n) {
                                                mwdVar2.p();
                                                this.a = k3;
                                                this.b = null;
                                                z = true;
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        }
                                    }
                                } else {
                                    mwdVar.p();
                                    this.a = k2;
                                    this.b = null;
                                    z = true;
                                }
                                u.e(z, null);
                            }
                            return u.j();
                        } catch (Throwable th) {
                            u.B();
                            throw th;
                        }
                    }
                    mwdVar.p();
                    this.a = k;
                    return true;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
        this.a = mvw.l;
        Throwable l2 = this.c.l();
        if (l2 == null) {
            return false;
        }
        throw nbi.b(l2);
    }

    public final Object b() {
        Object obj = this.a;
        if (obj != mvw.p) {
            this.a = mvw.p;
            if (obj != mvw.l) {
                return obj;
            }
            throw nbi.b(this.c.m());
        }
        throw new IllegalStateException("`hasNext()` has not been invoked");
    }
}
