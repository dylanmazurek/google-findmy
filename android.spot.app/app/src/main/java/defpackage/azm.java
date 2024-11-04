package defpackage;

import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azm extends mpe implements mnw {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azm(apc apcVar, csb csbVar, String str, int i) {
        super(0);
        this.d = i;
        this.b = apcVar;
        this.c = csbVar;
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [aqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.mnw
    public final /* synthetic */ Object a() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            nkh nkhVar = ((nfn) this.c).b;
                            nkhVar.getClass();
                            return nkhVar.a(((nga) this.a).a(), ((nfi) this.b).h.c);
                        }
                        Object obj = this.a;
                        csb csbVar = (csb) this.c;
                        azm azmVar = new azm((apc) this.b, csbVar, (String) obj, 3);
                        cvv B = csbVar.c.B();
                        List d = B.d((String) this.a);
                        if (d.size() <= 1) {
                            cvt cvtVar = (cvt) mkm.X(d);
                            if (cvtVar == null) {
                                azmVar.a();
                            } else {
                                cvu a = B.a(cvtVar.a);
                                if (a != null) {
                                    if (a.d()) {
                                        if (cvtVar.b == 6) {
                                            B.e(cvtVar.a);
                                            azmVar.a();
                                        } else {
                                            final cvu e = cvu.e((cvu) ((apc) this.b).c, cvtVar.a, 0, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                                            csb csbVar2 = (csb) this.c;
                                            crd crdVar = csbVar2.e;
                                            crdVar.getClass();
                                            final WorkDatabase workDatabase = csbVar2.c;
                                            workDatabase.getClass();
                                            hph hphVar = csbVar2.h;
                                            hphVar.getClass();
                                            final List list = csbVar2.d;
                                            list.getClass();
                                            Object obj2 = this.b;
                                            final String str = e.b;
                                            final cvu a2 = workDatabase.B().a(str);
                                            if (a2 != null) {
                                                if (!bpe.h(a2.w)) {
                                                    if (!(a2.d() ^ e.d())) {
                                                        final boolean e2 = crdVar.e(str);
                                                        if (!e2) {
                                                            Iterator it = list.iterator();
                                                            while (it.hasNext()) {
                                                                ((crf) it.next()).b(str);
                                                            }
                                                        }
                                                        final ?? r6 = ((apc) obj2).b;
                                                        workDatabase.o(new Runnable() { // from class: cse
                                                            /* JADX WARN: Finally extract failed */
                                                            @Override // java.lang.Runnable
                                                            public final void run() {
                                                                cvu cvuVar = a2;
                                                                int i2 = cvuVar.r;
                                                                WorkDatabase workDatabase2 = WorkDatabase.this;
                                                                cvv B2 = workDatabase2.B();
                                                                cwo C = workDatabase2.C();
                                                                long j = cvuVar.s;
                                                                int i3 = cvuVar.t;
                                                                cvu cvuVar2 = e;
                                                                cvu e3 = cvu.e(cvuVar2, null, cvuVar.w, null, null, cvuVar.k, cvuVar.m, cvuVar.q, i2 + 1, j, i3, 12835837);
                                                                if (cvuVar2.t == 1) {
                                                                    e3.s = cvuVar2.s;
                                                                    e3.t++;
                                                                }
                                                                cvu j2 = bpn.j(list, e3);
                                                                cwn cwnVar = (cwn) B2;
                                                                cwnVar.a.l();
                                                                cwnVar.a.m();
                                                                try {
                                                                    chk chkVar = ((cwn) B2).c;
                                                                    cks d2 = chkVar.d();
                                                                    try {
                                                                        d2.g(1, j2.b);
                                                                        d2.e(2, bpl.u(j2.w));
                                                                        d2.g(3, j2.c);
                                                                        d2.g(4, j2.d);
                                                                        d2.c(5, box.h(j2.e));
                                                                        d2.c(6, box.h(j2.f));
                                                                        d2.e(7, j2.g);
                                                                        d2.e(8, j2.h);
                                                                        d2.e(9, j2.i);
                                                                        d2.e(10, j2.k);
                                                                        d2.e(11, bpl.r(j2.x));
                                                                        d2.e(12, j2.l);
                                                                        d2.e(13, j2.m);
                                                                        d2.e(14, j2.n);
                                                                        d2.e(15, j2.o);
                                                                        d2.e(16, j2.p ? 1L : 0L);
                                                                        d2.e(17, bpl.t(j2.y));
                                                                        d2.e(18, j2.q);
                                                                        d2.e(19, j2.r);
                                                                        d2.e(20, j2.s);
                                                                        d2.e(21, j2.t);
                                                                        d2.e(22, j2.u);
                                                                        String str2 = j2.v;
                                                                        if (str2 == null) {
                                                                            d2.f(23);
                                                                        } else {
                                                                            d2.g(23, str2);
                                                                        }
                                                                        cpl cplVar = j2.j;
                                                                        d2.e(24, bpl.s(cplVar.j));
                                                                        d2.c(25, bpl.p(cplVar.b));
                                                                        d2.e(26, cplVar.c ? 1L : 0L);
                                                                        d2.e(27, cplVar.d ? 1L : 0L);
                                                                        d2.e(28, cplVar.e ? 1L : 0L);
                                                                        d2.e(29, cplVar.f ? 1L : 0L);
                                                                        d2.e(30, cplVar.g);
                                                                        d2.e(31, cplVar.h);
                                                                        d2.c(32, bpl.q(cplVar.i));
                                                                        d2.g(33, j2.b);
                                                                        d2.a();
                                                                        chkVar.f(d2);
                                                                        ((cwn) B2).a.p();
                                                                        String str3 = str;
                                                                        cwnVar.a.n();
                                                                        cwr cwrVar = (cwr) C;
                                                                        cwrVar.a.l();
                                                                        cks d3 = cwrVar.c.d();
                                                                        d3.g(1, str3);
                                                                        try {
                                                                            ((cwr) C).a.m();
                                                                            try {
                                                                                d3.a();
                                                                                ((cwr) C).a.p();
                                                                                boolean z = e2;
                                                                                Set set = r6;
                                                                                cwrVar.c.f(d3);
                                                                                bpl.z(C, str3, set);
                                                                                if (!z) {
                                                                                    B2.l(str3, -1L);
                                                                                    workDatabase2.A().a(str3);
                                                                                }
                                                                            } finally {
                                                                                ((cwr) C).a.n();
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            cwrVar.c.f(d3);
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th2) {
                                                                        chkVar.f(d2);
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    cwnVar.a.n();
                                                                    throw th3;
                                                                }
                                                            }
                                                        });
                                                        if (!e2) {
                                                            crh.a(hphVar, workDatabase, list);
                                                        }
                                                    } else {
                                                        cka ckaVar = cka.d;
                                                        throw new UnsupportedOperationException("Can't update " + ((String) ckaVar.a(a2)) + " Worker to " + ((String) ckaVar.a(e)) + " Worker. Update operation must preserve worker's type.");
                                                    }
                                                }
                                            } else {
                                                throw new IllegalArgumentException(a.ag(str, "Worker with ", " doesn't exist"));
                                            }
                                        }
                                    } else {
                                        throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                                    }
                                } else {
                                    throw new IllegalStateException("WorkSpec with " + cvtVar.a + ", that matches a name \"" + ((String) this.a) + "\", wasn't found");
                                }
                            }
                            return mlh.a;
                        }
                        throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                    }
                    cwt.a(new crm((csb) this.c, (String) this.a, 2, mkm.N(this.b)));
                    return mlh.a;
                }
                ((bah) this.b).removeOnAttachStateChangeListener(this.a);
                ((ArrayList) brl.c((View) this.b).a).remove(this.c);
                return mlh.a;
            }
            ayz ayzVar = ((ayw) this.b).u;
            int i2 = 0;
            ayzVar.i = 0;
            aiu n = ayzVar.a.n();
            int i3 = n.b;
            if (i3 > 0) {
                Object[] objArr = n.a;
                int i4 = 0;
                do {
                    ayw aywVar = ((ayr) objArr[i4]).o.r;
                    aywVar.getClass();
                    aywVar.g = aywVar.h;
                    aywVar.h = Integer.MAX_VALUE;
                    if (aywVar.v == 2) {
                        aywVar.v = 3;
                    }
                    i4++;
                } while (i4 < i3);
            }
            ((ayw) this.b).e(awu.e);
            azd azdVar = ((ayh) ((ayw) this.b).d()).g;
            if (azdVar != null) {
                Object obj3 = this.c;
                boolean z = azdVar.j;
                List z2 = ((ayz) obj3).a.z();
                int size = z2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    azd w = ((ayr) z2.get(i5)).t().w();
                    if (w != null) {
                        w.j = z;
                    }
                }
            }
            ((azd) this.a).G().d();
            if (((ayh) ((ayw) this.b).d()).g != null) {
                List z3 = ((ayz) this.c).a.z();
                int size2 = z3.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    azd w2 = ((ayr) z3.get(i6)).t().w();
                    if (w2 != null) {
                        w2.j = false;
                    }
                }
            }
            aiu n2 = ((ayw) this.b).u.a.n();
            int i7 = n2.b;
            if (i7 > 0) {
                Object[] objArr2 = n2.a;
                do {
                    ayw aywVar2 = ((ayr) objArr2[i2]).o.r;
                    aywVar2.getClass();
                    int i8 = aywVar2.g;
                    int i9 = aywVar2.h;
                    if (i8 != i9 && i9 == Integer.MAX_VALUE) {
                        aywVar2.j();
                    }
                    i2++;
                } while (i2 < i7);
            }
            ((ayw) this.b).e(awu.f);
            return mlh.a;
        }
        ((azq) this.a).X(this.b, (asq) this.c);
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azm(azq azqVar, aqv aqvVar, asq asqVar, int i) {
        super(0);
        this.d = i;
        this.a = azqVar;
        this.b = aqvVar;
        this.c = asqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azm(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azm(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        super(0);
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }
}
