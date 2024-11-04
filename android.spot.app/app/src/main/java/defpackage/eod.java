package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eod extends cgk {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel");
    public final ewg b;
    public final ele c;
    public final cfk d;
    public final cfm e;
    public lqd f;
    public jer g;
    public final elo h;
    public final dhx i;
    private final Executor j;
    private final AtomicBoolean k;
    private final AtomicBoolean l;
    private jer m;
    private final Map n;
    private final dxf o;
    private ela p;
    private final hnu q;

    public eod(dxf dxfVar, ewg ewgVar, dhx dhxVar, ejo ejoVar, hnu hnuVar, elo eloVar, ele eleVar, Executor executor) {
        jdl jdlVar = jdl.a;
        this.g = jdlVar;
        this.m = jdlVar;
        this.n = new HashMap();
        this.o = dxfVar;
        this.b = ewgVar;
        this.i = dhxVar;
        this.q = hnuVar;
        this.h = eloVar;
        this.c = eleVar;
        this.j = executor;
        this.d = ejoVar.h;
        this.e = new cfm();
        this.k = new AtomicBoolean(false);
        this.l = new AtomicBoolean(false);
    }

    public static eod b(cgq cgqVar, lqd lqdVar) {
        boolean z;
        eod eodVar = (eod) new ddh(cgqVar).q(eod.class);
        if (eodVar.f == null) {
            if (eodVar.p == null) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "ViewModel is already initialized");
            eodVar.f = lqdVar;
            ela elaVar = new ela(eodVar, 6, null);
            eodVar.p = elaVar;
            eodVar.b.g(elaVar);
            eodVar.p.cx();
            eodVar.e.o(eodVar.d, new egv(eodVar, 14));
        }
        hwx.S(eodVar.f.equals(lqdVar), "The provided DeviceIdentifier %s is different than the one the ViewModel was first initialized with, %s", lqdVar, eodVar.f);
        return eodVar;
    }

    private static jis m(jis jisVar, String str, boolean z) {
        jin jinVar = new jin();
        for (int i = 0; i < ((jmi) jisVar).c; i++) {
            eon eonVar = (eon) jisVar.get(i);
            if (eonVar.a.b.equals(str)) {
                jinVar.h(new eon(eonVar.a, z));
            } else {
                jinVar.h(eonVar);
            }
        }
        return jinVar.g();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jyz] */
    private final void n() {
        if (this.m.g()) {
            this.m.c().cancel(false);
            this.m = jdl.a;
        }
    }

    public final cfk a() {
        d();
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        ela elaVar = this.p;
        if (elaVar != null) {
            this.b.n(elaVar);
            this.p = null;
        }
        n();
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((jyz) it.next()).cancel(false);
        }
        this.n.clear();
    }

    public final void d() {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "ViewModel is not initialized");
    }

    public final void e(lnb lnbVar) {
        this.o.c(lnbVar, jdl.a, this.f);
    }

    public final void f() {
        lqu lquVar;
        d();
        n();
        i(true);
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "refreshSharedOwners", 155, "SharingManagementViewModel.java")).r("Refreshing shared owners list...");
        e(lnb.REFRESH_SHARED_OWNERS_LIST_REQUESTED);
        lqd lqdVar = this.f;
        int i = 3;
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        this.m = jer.i(jbx.d(this.q.f(kxvVar)).e(new eoc(this, i), this.j).a(Throwable.class, new eoc(this, 4), this.j));
    }

    public final void g() {
        lqu lquVar;
        d();
        hwx.V(((kye) this.g.b(new eoc(this, 1)).e(kye.DEFAULT_NOT_SHARED)).equals(kye.SHARED_WITH_ME), "Cannot relinquish a non-shared owner");
        n();
        j(true);
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "relinquishOwnership", 252, "SharingManagementViewModel.java")).r("Relinquishing device ownership");
        e(lnb.RELINQUISH_SHARED_OWNERSHIP_REQUESTED);
        lqd lqdVar = this.f;
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        this.m = jer.i(jbx.d(ivc.F(this.q.g(kxvVar))).e(new eoc(this, 0), this.j).a(Throwable.class, new eoc(this, 2), this.j));
    }

    public final void h(String str) {
        lqu lquVar;
        d();
        ((jni) ((jni) a.e()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "revokeSharedOwner", 195, "SharingManagementViewModel.java")).r("Revoking a shared owner");
        e(lnb.REVOKE_SHARED_OWNER_REQUESTED);
        k(str, true);
        lqd lqdVar = this.f;
        int i = 3;
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        jyz jyzVar = (jyz) this.n.put(str, jbx.d(this.q.h(kxvVar, str)).e(new eoc(this, 5), this.j).a(Throwable.class, new emc(this, str, i, null), this.j));
        if (jyzVar != null) {
            jyzVar.cancel(false);
        }
    }

    public final void i(boolean z) {
        this.k.set(z);
        eoo eooVar = (eoo) this.e.d();
        if (eooVar != null) {
            cfm cfmVar = this.e;
            eom eomVar = new eom(eooVar);
            eomVar.c(z);
            cfmVar.l(eomVar.a());
        }
    }

    public final void j(boolean z) {
        this.l.set(z);
        eoo eooVar = (eoo) this.e.d();
        if (eooVar != null) {
            cfm cfmVar = this.e;
            eom eomVar = new eom(eooVar);
            eomVar.b(z);
            cfmVar.l(eomVar.a());
        }
    }

    public final void k(String str, boolean z) {
        eoo eooVar = (eoo) this.e.d();
        if (eooVar != null) {
            cfm cfmVar = this.e;
            eom eomVar = new eom(eooVar);
            jis m = m(eooVar.d, str, z);
            if (m != null) {
                if (eomVar.d == null) {
                    eomVar.e = m;
                    jis m2 = m(eooVar.e, str, z);
                    if (m2 != null) {
                        if (eomVar.f == null) {
                            eomVar.g = m2;
                            cfmVar.l(eomVar.a());
                            return;
                        }
                        throw new IllegalStateException("Cannot set pendingOwners after calling pendingOwnersBuilder()");
                    }
                    throw new NullPointerException("Null pendingOwners");
                }
                throw new IllegalStateException("Cannot set activeOwners after calling activeOwnersBuilder()");
            }
            throw new NullPointerException("Null activeOwners");
        }
    }

    public final void l(ejn ejnVar) {
        boolean z;
        boolean z2;
        if (!this.g.g()) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/devicedetails/SharingManagementViewModel", "updateSharingState", 318, "SharingManagementViewModel.java")).r("Cannot update the sharing state of an unknown device");
            return;
        }
        lpz a2 = this.c.a((lqc) this.g.c());
        if (ejnVar == ejn.IN_SYNC) {
            z = true;
        } else {
            z = false;
        }
        eom eomVar = new eom();
        String str = ((lqc) this.g.c()).g;
        if (str != null) {
            eomVar.a = str;
            kyf kyfVar = a2.b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            kye b = kye.b(kyfVar.k);
            if (b == null) {
                b = kye.UNRECOGNIZED;
            }
            if (b != null) {
                eomVar.b = b;
                eomVar.c = eku.i((lqc) this.g.c(), this.c, z);
                eomVar.h = (byte) (eomVar.h | 1);
                eomVar.c(this.k.get());
                eomVar.b(this.l.get());
                for (kzq kzqVar : a2.c) {
                    jyz jyzVar = (jyz) this.n.get(kzqVar.b);
                    if (jyzVar != null && !jyzVar.isDone()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    eon eonVar = new eon(kzqVar, z2);
                    if (kzqVar.c) {
                        if (eomVar.d == null) {
                            if (eomVar.e == null) {
                                eomVar.d = new jin();
                            } else {
                                eomVar.d = new jin();
                                eomVar.d.j(eomVar.e);
                                eomVar.e = null;
                            }
                        }
                        eomVar.d.h(eonVar);
                    } else {
                        if (eomVar.f == null) {
                            if (eomVar.g == null) {
                                eomVar.f = new jin();
                            } else {
                                eomVar.f = new jin();
                                eomVar.f.j(eomVar.g);
                                eomVar.g = null;
                            }
                        }
                        eomVar.f.h(eonVar);
                    }
                }
                this.e.i(eomVar.a());
                return;
            }
            throw new NullPointerException("Null sharingState");
        }
        throw new NullPointerException("Null deviceName");
    }
}
