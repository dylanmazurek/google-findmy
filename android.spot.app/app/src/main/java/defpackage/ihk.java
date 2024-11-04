package defpackage;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihk {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/client/SharingOperationsImpl");
    public final jfe b;
    public final Random c;
    public final ScheduledExecutorService d;
    public final fop e;
    public final hnu f;
    public final kuv g;
    public final kuv h;
    private final lja i;

    public ihk(jfe jfeVar, lja ljaVar, Random random, hnu hnuVar, fop fopVar, kuv kuvVar, kuv kuvVar2, ScheduledExecutorService scheduledExecutorService) {
        this.b = jfeVar;
        this.i = ljaVar;
        this.c = random;
        this.f = hnuVar;
        this.e = fopVar;
        this.g = kuvVar;
        this.h = kuvVar2;
        this.d = scheduledExecutorService;
    }

    public static kzq e(lae laeVar, String str) {
        jer a2 = jht.b(laeVar.a).a(new etw(str, 6));
        if (a2.g()) {
            if (!((kzq) a2.c()).c && (((kzq) a2.c()).a & 1) != 0) {
                return (kzq) a2.c();
            }
            throw new ihe("Found a non-pending owner");
        }
        throw new ihe("Cannot find applied user");
    }

    public static String g(lim limVar, lim limVar2) {
        return iji.h(ijm.i(limVar.r(limVar2)).w(r0.d() - 2));
    }

    public final ije a(lim limVar) {
        ije ijeVar = ije.e;
        liq k = limVar.k();
        ljn l = ijeVar.l();
        lja ljaVar = this.i;
        try {
            llg b = lkz.a.b(l);
            b.l(l, lir.p(k), ljaVar);
            b.g(l);
            k.z(0);
            ljn.A(l);
            return (ije) l;
        } catch (IOException e) {
            if (e.getCause() instanceof ljy) {
                throw ((ljy) e.getCause());
            }
            throw new ljy(e);
        } catch (llo e2) {
            throw e2.a();
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof ljy) {
                throw ((ljy) e3.getCause());
            }
            throw e3;
        } catch (ljy e4) {
            if (e4.a) {
                throw new ljy(e4);
            }
            throw e4;
        }
    }

    public final ijk b(kzq kzqVar, ijf ijfVar, boolean z) {
        lim limVar;
        kzr kzrVar = kzqVar.f;
        if (kzrVar == null) {
            kzrVar = kzr.c;
        }
        lim limVar2 = ijfVar.b;
        if (z) {
            limVar = kzrVar.a;
        } else {
            limVar = kzrVar.b;
        }
        lim e = ijm.e(limVar2, limVar);
        lja ljaVar = this.i;
        ijd ijdVar = ijd.d;
        liq k = e.k();
        ljn l = ijdVar.l();
        try {
            llg b = lkz.a.b(l);
            b.l(l, lir.p(k), ljaVar);
            b.g(l);
            k.z(0);
            ljn.A(l);
            return (ijk) new ijh().f().e((ijd) l);
        } catch (IOException e2) {
            if (e2.getCause() instanceof ljy) {
                throw ((ljy) e2.getCause());
            }
            throw new ljy(e2);
        } catch (llo e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof ljy) {
                throw ((ljy) e4.getCause());
            }
            throw e4;
        } catch (ljy e5) {
            if (e5.a) {
                throw new ljy(e5);
            }
            throw e5;
        }
    }

    public final jyz c(final kxv kxvVar) {
        ((jni) ((jni) a.e()).j("com/google/android/libraries/spot/client/SharingOperationsImpl", "finalizeSharingApplication", 305, "SharingOperationsImpl.java")).r("Finalizing sharing application");
        final jyz u = this.g.u();
        final jyz f = this.f.f(kxvVar);
        return iuu.F(u, f).h(new jxc() { // from class: ihg
            @Override // defpackage.jxc
            public final jyz a() {
                jer jerVar = (jer) ivc.M(u);
                hwx.V(jerVar.g(), "Cannot approve a sharing application without an owner key");
                lae laeVar = (lae) ivc.M(f);
                kyf kyfVar = laeVar.b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kye b = kye.b(kyfVar.k);
                if (b == null) {
                    b = kye.UNRECOGNIZED;
                }
                if (b == kye.SHARED_WITH_ME) {
                    return ivc.E(laeVar);
                }
                jer a2 = jht.b(laeVar.a).a(new eja(7));
                hwx.K(a2.g(), "Caller is not an owner");
                kyf kyfVar2 = laeVar.b;
                if (kyfVar2 == null) {
                    kyfVar2 = kyf.r;
                }
                kyq kyqVar = kyfVar2.f;
                if (kyqVar == null) {
                    kyqVar = kyq.g;
                }
                if (!((kzq) a2.c()).c && (((kzq) a2.c()).a & 1) != 0 && kyqVar.b == 10 && ((Boolean) kyqVar.c).booleanValue()) {
                    lim limVar = ((ijf) jerVar.c()).b;
                    kzr kzrVar = ((kzq) a2.c()).f;
                    if (kzrVar == null) {
                        kzrVar = kzr.c;
                    }
                    ihk ihkVar = ihk.this;
                    lim e = ijm.e(limVar, kzrVar.a);
                    ijk b2 = ihkVar.b((kzq) a2.c(), (ijf) jerVar.c(), false);
                    lim i = ijm.i(e.r(b2.b).r(ijm.g(b2.a, e)));
                    mep mepVar = new mep(null, null, null);
                    mepVar.a = ijm.e(i, kyqVar.d);
                    lln llnVar = kyqVar.f;
                    if (llnVar == null) {
                        llnVar = lln.c;
                    }
                    mepVar.f(llnVar);
                    if (!kyqVar.e.z()) {
                        mepVar.e(ijm.e(i, kyqVar.e));
                    }
                    hnu hnuVar = ihkVar.f;
                    iiy d = mepVar.d();
                    ijf ijfVar = (ijf) jerVar.c();
                    ljh k = kyq.g.k();
                    lim f2 = ijm.f(ijfVar.b, d.a);
                    if (!k.b.y()) {
                        k.t();
                    }
                    ljn ljnVar = k.b;
                    f2.getClass();
                    ((kyq) ljnVar).d = f2;
                    int i2 = ijfVar.c;
                    if (!ljnVar.y()) {
                        k.t();
                    }
                    kyq kyqVar2 = (kyq) k.b;
                    kyqVar2.b = 3;
                    kyqVar2.c = Integer.valueOf(i2);
                    lln llnVar2 = d.c;
                    if (!k.b.y()) {
                        k.t();
                    }
                    kyq kyqVar3 = (kyq) k.b;
                    llnVar2.getClass();
                    kyqVar3.f = llnVar2;
                    kyqVar3.a |= 1;
                    if (d.b.g()) {
                        lim f3 = ijm.f(ijfVar.b, (lim) d.b.c());
                        if (!k.b.y()) {
                            k.t();
                        }
                        kyq kyqVar4 = (kyq) k.b;
                        f3.getClass();
                        kyqVar4.e = f3;
                    }
                    return hnuVar.j(13, kxvVar, jdl.a, jer.i((kyq) k.q()));
                }
                throw new ihe("Caller is not an approved pending owner");
            }
        }, this.d).e(new iaf(20), jxv.a);
    }

    public final kxv d(ihd ihdVar) {
        try {
            return iji.b(a(ihdVar.a).b);
        } catch (ljy e) {
            throw new ihe(e, null);
        }
    }

    public final lmy f(ihd ihdVar) {
        try {
            ije a2 = a(ihdVar.a);
            ljh k = lmy.c.k();
            long j = a2.c;
            if (!k.b.y()) {
                k.t();
            }
            lmy lmyVar = (lmy) k.b;
            lmyVar.a |= 1;
            lmyVar.b = j;
            return (lmy) k.q();
        } catch (ljy unused) {
            return lmy.c;
        }
    }
}
