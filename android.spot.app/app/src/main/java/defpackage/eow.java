package defpackage;

import com.google.android.apps.adm.R;
import j$.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eow implements eou {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl");
    public static final jiy b;
    public final ewc c;
    public final Executor d;
    public final ftf e;
    public final dhx f;
    public final kuv g;
    private final ele h;
    private final Executor i;
    private final Object j = new Object();
    private final Map k = new HashMap();
    private final Map l = new HashMap();
    private final dxf m;
    private final hnu n;
    private final hot o;
    private final ddg p;

    static {
        igq igqVar = igq.NOT_STARTED;
        eox eoxVar = eox.UNKNOWN_OPERATION;
        igq igqVar2 = igq.SCANNING;
        eox eoxVar2 = eox.SCANNING;
        igq igqVar3 = igq.UNPROVISIONING_IN_SERVER;
        eox eoxVar3 = eox.UNPROVISIONING;
        b = jiy.m(igqVar, eoxVar, igqVar2, eoxVar2, igqVar3, eoxVar3, igq.UNPROVISIONING_LOCALLY, eoxVar3, igq.DELETING_FROM_SERVER, eox.DELETING_DEVICE, igq.COMPLETED_SUCCESSFULLY, eox.SUCCEEDED);
    }

    public eow(ewc ewcVar, hot hotVar, ftf ftfVar, hnu hnuVar, ddg ddgVar, ele eleVar, kuv kuvVar, dhx dhxVar, dxf dxfVar, Executor executor, Executor executor2) {
        this.c = ewcVar;
        this.o = hotVar;
        this.e = ftfVar;
        this.n = hnuVar;
        this.p = ddgVar;
        this.h = eleVar;
        this.g = kuvVar;
        this.f = dhxVar;
        this.m = dxfVar;
        this.d = executor;
        this.i = executor2;
    }

    public static lqd h(kyf kyfVar) {
        ljh k = lqd.d.k();
        ljh k2 = lqu.c.k();
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        if (!k2.b.y()) {
            k2.t();
        }
        lqu lquVar = (lqu) k2.b;
        kxvVar.getClass();
        lquVar.b = kxvVar;
        lquVar.a |= 1;
        if (!k.b.y()) {
            k.t();
        }
        lqd lqdVar = (lqd) k.b;
        lqu lquVar2 = (lqu) k2.q();
        lquVar2.getClass();
        lqdVar.b = lquVar2;
        lqdVar.a = 3;
        lqf lqfVar = lqf.SPOT_DEVICE;
        if (!k.b.y()) {
            k.t();
        }
        ((lqd) k.b).c = lqfVar.a();
        return (lqd) k.q();
    }

    private final void k(lqd lqdVar) {
        List list = (List) this.k.get(lqdVar);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    @Override // defpackage.eou
    public final eox a(lqd lqdVar) {
        eox eoxVar;
        synchronized (this.j) {
            eoxVar = (eox) this.l.get(lqdVar);
            if (eoxVar == null) {
                eoxVar = eox.NO_RUNNING_OPERATION;
            }
        }
        return eoxVar;
    }

    @Override // defpackage.eou
    public final void b(lqd lqdVar, Runnable runnable) {
        synchronized (this.j) {
            ((List) Map.EL.computeIfAbsent(this.k, lqdVar, new eff(13))).add(runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [mko, java.lang.Object] */
    @Override // defpackage.eou
    public final void c(final lqd lqdVar, final boolean z) {
        boolean z2;
        jyz jyzVar;
        jer b2 = eyf.b(this.c.c, lqdVar);
        if (!b2.g()) {
            ((jni) ((jni) a.f().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "eraseDevice", 122, "EraseDeviceHandlerImpl.java")).r("Cannot find the device to erase.");
            return;
        }
        i(lnb.ERASE_DEVICE_REQUESTED, z, lqdVar);
        kyf kyfVar = this.h.a((lqc) b2.c()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        final gok C = this.p.C();
        if (z) {
            ((jni) ((jni) a.e().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "deleteFromServer", 226, "EraseDeviceHandlerImpl.java")).r("Force deleting a device");
            j(h(kyfVar), eox.DELETING_DEVICE);
            hnu hnuVar = this.n;
            kxv kxvVar = kyfVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            jyzVar = hnuVar.e(kxvVar);
        } else {
            ((jni) ((jni) a.e().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "unprovisionAndDeleteFromServer", 208, "EraseDeviceHandlerImpl.java")).r("Deleting a device");
            j(h(kyfVar), eox.UNKNOWN_OPERATION);
            hot hotVar = this.o;
            hjq hjqVar = new hjq(this, kyfVar, null);
            nca ncaVar = (nca) hotVar.a;
            Object a2 = ncaVar.c.a();
            hnu a3 = ((iag) ncaVar.d).a();
            kuv a4 = ((iiz) ncaVar.b).a();
            jzd jzdVar = (jzd) ncaVar.e.a();
            jzdVar.getClass();
            Object a5 = ncaVar.a.a();
            kyfVar.getClass();
            igx igxVar = new igx((kuv) a2, a3, a4, jzdVar, (ktn) a5, kyfVar, hjqVar);
            if (igxVar.c == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.U(z2);
            igxVar.b(igq.LOADING_DATA);
            kuv kuvVar = igxVar.e;
            kyq kyqVar = igxVar.b.f;
            if (kyqVar == null) {
                kyqVar = kyq.g;
            }
            igxVar.c = jbx.d(kuvVar.s(kyqVar)).b(iiv.class, new etl(19), igxVar.a).f(new ifl(igxVar, 3), igxVar.a).f(new ifl(igxVar, 4), igxVar.a).e(new huw(igxVar, 20), igxVar.a).b(Throwable.class, new ifl(igxVar, 5), igxVar.a);
            jyzVar = igxVar.c;
        }
        ijp.a(jbx.d(jyzVar).f(new ejc(this, kyfVar, 9), this.d).e(new ifn(this, C, lqdVar, z, 1), this.i).b(Throwable.class, new jxd() { // from class: eov
            @Override // defpackage.jxd
            public final jyz a(Object obj) {
                eox eoxVar;
                eow eowVar = eow.this;
                Throwable th = (Throwable) obj;
                lnb lnbVar = lnb.ERASE_DEVICE_FAILED;
                boolean z3 = z;
                lqd lqdVar2 = lqdVar;
                eowVar.i(lnbVar, z3, lqdVar2);
                if (!C.B()) {
                    if (th instanceof igm) {
                        eoxVar = eox.FAILED_SCANNING;
                    } else {
                        eoxVar = eox.FAILED_MISC;
                    }
                    eowVar.j(lqdVar2, eoxVar);
                    eowVar.f.m(R.string.spot_remove_device_failure);
                }
                return ivc.D(th);
            }
        }, this.i), "Failed to erase SPOT device", new Object[0]);
    }

    @Override // defpackage.eou
    public final void d(lqd lqdVar, Runnable runnable) {
        synchronized (this.j) {
            List list = (List) this.k.get(lqdVar);
            if (list == null) {
                return;
            }
            list.remove(runnable);
            if (list.isEmpty()) {
                this.k.remove(lqdVar);
            }
        }
    }

    @Override // defpackage.eou
    public final void e(lqd lqdVar) {
        synchronized (this.j) {
            if (a(lqdVar).i) {
                this.l.remove(lqdVar);
                k(lqdVar);
            }
        }
    }

    @Override // defpackage.eou
    public final boolean f(lqd lqdVar) {
        jer b2 = eyf.b(this.c.c, lqdVar);
        if (!b2.g()) {
            ((jni) ((jni) a.f().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "eraseDeviceEnabledFor", 110, "EraseDeviceHandlerImpl.java")).r("Cannot find the device to erase.");
            return false;
        }
        kyf kyfVar = this.h.a((lqc) b2.c()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        if (kyfVar.l || !eku.m(kyfVar)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.eou
    public final /* synthetic */ boolean g(lqd lqdVar) {
        eox a2 = a(lqdVar);
        if (a2 != eox.NO_RUNNING_OPERATION && !a2.i) {
            return true;
        }
        return false;
    }

    public final void i(lnb lnbVar, boolean z, lqd lqdVar) {
        ljh k = lmu.i.k();
        ljh k2 = lmt.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        lmt lmtVar = (lmt) k2.b;
        lmtVar.a |= 1;
        lmtVar.b = z;
        if (!k.b.y()) {
            k.t();
        }
        dxf dxfVar = this.m;
        lmu lmuVar = (lmu) k.b;
        lmt lmtVar2 = (lmt) k2.q();
        lmtVar2.getClass();
        lmuVar.g = lmtVar2;
        lmuVar.a |= 32;
        dxfVar.c(lnbVar, jer.i((lmu) k.q()), lqdVar);
    }

    public final void j(lqd lqdVar, eox eoxVar) {
        if (eoxVar == null) {
            return;
        }
        ((jni) ((jni) a.e().h(jop.a, "EraseDeviceHandler")).j("com/google/android/apps/adm/integrations/spot/erase/EraseDeviceHandlerImpl", "updateProgress", 281, "EraseDeviceHandlerImpl.java")).u("Progress update: %s", eoxVar.name());
        synchronized (this.j) {
            eox a2 = a(lqdVar);
            if (eoxVar.equals(a2)) {
                return;
            }
            if (eoxVar.i && a2.equals(eox.NO_RUNNING_OPERATION)) {
                return;
            }
            this.l.put(lqdVar, eoxVar);
            k(lqdVar);
        }
    }
}
