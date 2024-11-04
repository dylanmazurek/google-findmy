package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nch {
    private final mrr a;
    public final mrr b;
    public final mrp d;
    public final moh e;
    private final mrq f = new mrq(0, mrs.a);
    public final mrq c = new mrq(0, mrs.a);

    public nch() {
        ncj ncjVar = new ncj(0L, null, 2);
        this.a = new mrr(ncjVar, mrs.a);
        mrs mrsVar = mrs.a;
        this.b = new mrr(ncjVar, mrsVar);
        this.d = new mrp(1, mrsVar);
        this.e = new naq(this, 5);
    }

    public final void e() {
        int i;
        do {
            i = this.d.b;
            if (i <= 1) {
                return;
            }
        } while (!this.d.c(i, 1));
    }

    public final void f() {
        Object a;
        while (true) {
            int andIncrement = mrp.a.getAndIncrement(this.d);
            if (andIncrement <= 0) {
                if (andIncrement < 0) {
                    ncj ncjVar = (ncj) this.a.a;
                    long b = this.f.b();
                    long j = b / nci.f;
                    mrr mrrVar = this.a;
                    ncg ncgVar = ncg.a;
                    while (true) {
                        a = nah.a(ncjVar, j, ncgVar);
                        if (nbh.a(a)) {
                            break;
                        }
                        nai b2 = nbh.b(a);
                        while (true) {
                            nai naiVar = (nai) mrrVar.a;
                            if (naiVar.b >= b2.b) {
                                break;
                            }
                            if (b2.v()) {
                                if (mrrVar.d(naiVar, b2)) {
                                    if (naiVar.t()) {
                                        naiVar.q();
                                    }
                                } else if (b2.t()) {
                                    b2.q();
                                }
                            }
                        }
                    }
                    ncj ncjVar2 = (ncj) nbh.b(a);
                    ncjVar2.p();
                    if (ncjVar2.b <= j) {
                        int i = (int) (b % nci.f);
                        Object a2 = ncjVar2.c.u(i).a(nci.b);
                        if (a2 == null) {
                            int i2 = nci.a;
                            for (int i3 = 0; i3 < i2; i3++) {
                                if (ncjVar2.c.u(i).a == nci.c) {
                                    return;
                                }
                            }
                            if (!ncjVar2.c.u(i).d(nci.b, nci.d)) {
                                return;
                            }
                        } else if (a2 == nci.e) {
                            continue;
                        } else if (a2 instanceof msd) {
                            msd msdVar = (msd) a2;
                            Object h = msdVar.h(mlh.a, this.e);
                            if (h != null) {
                                msdVar.c(h);
                                return;
                            }
                        } else {
                            if (a2 instanceof ncb) {
                                throw null;
                            }
                            Objects.toString(a2);
                            throw new IllegalStateException("unexpected: ".concat(a2.toString()));
                        }
                    }
                } else {
                    return;
                }
            } else {
                e();
                throw new IllegalStateException("The number of released permits cannot be greater than 1");
            }
        }
    }
}
