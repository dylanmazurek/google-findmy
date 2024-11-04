package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ncd extends nch {
    public final mrr a = new mrr(nce.a, mrs.a);

    public final boolean a() {
        if (Math.max(this.d.b, 0) != 0) {
            return false;
        }
        return true;
    }

    public final Object b(mmx mmxVar) {
        Object a;
        long j;
        if (c()) {
            return mlh.a;
        }
        mse u = msz.u(mjo.w(mmxVar));
        try {
            ncc nccVar = new ncc(this, u);
            while (true) {
                int andDecrement = mrp.a.getAndDecrement(this.d);
                if (andDecrement <= 1) {
                    if (andDecrement > 0) {
                        nccVar.e(mlh.a, this.e);
                        break;
                    }
                    ncj ncjVar = (ncj) this.b.a;
                    long b = this.c.b();
                    ncf ncfVar = ncf.a;
                    mrr mrrVar = this.b;
                    long j2 = b / nci.f;
                    while (true) {
                        a = nah.a(ncjVar, j2, ncfVar);
                        if (!nbh.a(a)) {
                            nai b2 = nbh.b(a);
                            while (true) {
                                nai naiVar = (nai) mrrVar.a;
                                j = j2;
                                if (naiVar.b >= b2.b) {
                                    break;
                                }
                                if (b2.v()) {
                                    if (mrrVar.d(naiVar, b2)) {
                                        if (naiVar.t()) {
                                            naiVar.q();
                                        }
                                    } else {
                                        if (b2.t()) {
                                            b2.q();
                                        }
                                        j2 = j;
                                    }
                                }
                            }
                        } else {
                            break;
                        }
                        j2 = j;
                    }
                    ncj ncjVar2 = (ncj) nbh.b(a);
                    int i = (int) (b % nci.f);
                    if (ncjVar2.c.u(i).d(null, nccVar)) {
                        nccVar.D(ncjVar2, i);
                        break;
                    }
                    if (ncjVar2.c.u(i).d(nci.b, nci.c)) {
                        nccVar.e(mlh.a, this.e);
                        break;
                    }
                    boolean z = msy.a;
                }
            }
            Object j3 = u.j();
            mne mneVar = mne.a;
            if (j3 != mneVar) {
                j3 = mlh.a;
            }
            if (j3 != mneVar) {
                return mlh.a;
            }
            return j3;
        } catch (Throwable th) {
            u.B();
            throw th;
        }
    }

    public final boolean c() {
        while (true) {
            int i = this.d.b;
            if (i > 1) {
                super.e();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (this.d.c(1, 0)) {
                    boolean z = msy.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    public final void d() {
        while (a()) {
            Object obj = this.a.a;
            nbj nbjVar = nce.a;
            if (obj != nbjVar && this.a.d(obj, nbjVar)) {
                f();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + msz.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
