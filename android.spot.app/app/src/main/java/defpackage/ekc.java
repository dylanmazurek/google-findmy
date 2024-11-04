package defpackage;

import com.google.android.apps.adm.view.DeviceDetailsFieldView;
import j$.util.Map;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekc extends ehp implements ekz {
    public static final jnk b = jnk.l("com/google/android/apps/adm/integrations/spot/SpotDeviceControllerImpl");
    public final lqz c;
    public volatile boolean d;
    public final elc e;
    public final ebf f;
    public eoj g;
    public ech h;
    private final ele i;
    private final exp j;
    private final Executor k;
    private final hnu l;
    private final dhx m;

    public ekc(lqd lqdVar, ebf ebfVar, evy evyVar, ewc ewcVar, ewf ewfVar, hnu hnuVar, ele eleVar, eld eldVar, lqz lqzVar, dxf dxfVar, dhx dhxVar, elk elkVar, Executor executor) {
        super(lqdVar, evyVar, ewcVar, ewfVar);
        this.d = false;
        this.e = eldVar.a(lqdVar, this, ebfVar);
        this.l = hnuVar;
        this.i = eleVar;
        this.f = ebfVar;
        this.c = lqzVar;
        this.m = dhxVar;
        this.k = executor;
        this.j = new ejz(this, lqzVar, dxfVar, lqdVar, elkVar);
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void b() {
        super.b();
        this.e.b();
    }

    @Override // defpackage.dxu, defpackage.dxv
    public final void c() {
        this.e.c();
        super.c();
    }

    public final void d(jer jerVar, Runnable runnable, int i) {
        if (!jerVar.g()) {
            runnable.run();
            l();
            this.m.m(i);
            return;
        }
        lqc i2 = i();
        lpz a = this.i.a(i2);
        ele eleVar = this.i;
        ljh ljhVar = (ljh) i2.z(5);
        ljhVar.w(i2);
        ljh ljhVar2 = (ljh) a.z(5);
        ljhVar2.w(a);
        kyf kyfVar = (kyf) jerVar.c();
        if (!ljhVar2.b.y()) {
            ljhVar2.t();
        }
        lpz lpzVar = (lpz) ljhVar2.b;
        lpz lpzVar2 = lpz.e;
        lpzVar.b = kyfVar;
        lpzVar.a |= 1;
        this.s.w(i2, (lqc) eleVar.c(ljhVar, ljhVar2).q());
        runnable.run();
        l();
    }

    public final void e(Function function, Runnable runnable, int i) {
        Object apply;
        l();
        kyf kyfVar = this.i.a(i()).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        ljh ljhVar = (ljh) kylVar.z(5);
        ljhVar.w(kylVar);
        apply = function.apply(ljhVar);
        kyl kylVar2 = (kyl) ((ljh) apply).q();
        hnu hnuVar = this.l;
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        ksr ksrVar = new ksr(kxvVar);
        ksrVar.e(kylVar2);
        iuu.q(hnuVar.m(ksrVar.G()), new ekb(this, runnable, i), this.k);
    }

    @Override // defpackage.ehq
    public final void f() {
        this.e.f();
    }

    @Override // defpackage.ekz
    public final void g() {
        l();
    }

    @Override // defpackage.ehq
    public final void h(ech echVar) {
        boolean z;
        if (this.h == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI already attached");
        this.h = echVar;
        echVar.af = this.j;
    }

    @Override // defpackage.ehp, defpackage.ehq
    public final void k(Map map) {
        char c;
        String str = (String) Map.EL.getOrDefault(map, "action", "");
        int hashCode = str.hashCode();
        if (hashCode != -793050291) {
            if (hashCode == 120924614 && str.equals("sharingDetails")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("approve")) {
                c = 0;
            }
            c = 65535;
        }
        elc elcVar = this.e;
        if (c != 0) {
            if (c != 1) {
                ((jni) ((jni) elc.b.g()).j("com/google/android/apps/adm/integrations/spot/SpotHelperControllerImpl", "handleDeepLink", 201, "SpotHelperControllerImpl.java")).u("Unhandled deep link URL action: %s", str);
                return;
            } else {
                elcVar.f.i(elcVar.c);
                return;
            }
        }
        String str2 = (String) map.get("email");
        if (str2 == null) {
            ((jni) ((jni) elc.b.g()).j("com/google/android/apps/adm/integrations/spot/SpotHelperControllerImpl", "handleDeepLink", 190, "SpotHelperControllerImpl.java")).r("Cannot handle an approve pending owner deep link without pending owner email");
        } else {
            elcVar.f.j(etx.d(elcVar.c, str2));
        }
    }

    public final void l() {
        eoj eojVar = this.g;
        if (eojVar == null) {
            return;
        }
        lpz a = this.i.a(i());
        if (a != null) {
            kyf kyfVar = a.b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            eof eofVar = new eof(a, eku.m(kyfVar), this.d);
            kyf kyfVar2 = eofVar.a.b;
            if (kyfVar2 == null) {
                kyfVar2 = kyf.r;
            }
            kyl kylVar = kyfVar2.c;
            if (kylVar == null) {
                kylVar = kyl.j;
            }
            kyj b2 = kyj.b(kylVar.e);
            if (b2 == null) {
                b2 = kyj.UNRECOGNIZED;
            }
            boolean z = eofVar.b;
            eoe e = bsh.e(b2);
            if (!z && e == null) {
                eojVar.an.setVisibility(8);
                return;
            }
            eojVar.an.setVisibility(0);
            if (e != null) {
                eojVar.an.g(e.b);
                DeviceDetailsFieldView deviceDetailsFieldView = eojVar.an;
                deviceDetailsFieldView.j.setImageDrawable(e.a(eojVar.y()));
            }
            eojVar.an.setClickable(eofVar.b);
            eojVar.an.e(eofVar.b);
            eojVar.an.f(eofVar.c);
            return;
        }
        throw new NullPointerException("Null spotInfo");
    }
}
