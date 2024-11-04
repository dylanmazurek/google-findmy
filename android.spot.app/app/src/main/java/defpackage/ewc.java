package defpackage;

import android.accounts.Account;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewc implements ewg {
    public static final jnk a = jnk.l("com/google/android/apps/adm/state/ApplicationState");
    public final evy b;
    public jis c;
    public String d;
    public boolean f;
    public final lqz j;
    public final eap k;
    public final ewf n;
    public final dhx o = new dhx((short[]) null);
    private final dhx r = new dhx((short[]) null);
    public final dhx p = new dhx((short[]) null);
    private final dhx s = new dhx((short[]) null);
    private final dhx t = new dhx((short[]) null);
    public int m = 1;
    private int q = 0;
    public boolean e = false;
    public boolean h = false;
    public jer l = jdl.a;
    public final Map g = new HashMap();
    public final Map i = new HashMap();

    public ewc(evy evyVar, ewf ewfVar, lqz lqzVar, eap eapVar) {
        this.b = evyVar;
        this.n = ewfVar;
        this.j = lqzVar;
        this.k = eapVar;
    }

    private static final boolean A(lqd lqdVar, lqc lqcVar) {
        if (lqcVar != null) {
            lqd lqdVar2 = lqcVar.d;
            if (lqdVar2 == null) {
                lqdVar2 = lqd.d;
            }
            if (lqdVar2.equals(lqdVar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final Parcelable a(lqd lqdVar) {
        Account b = this.b.b();
        if (b == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/state/ApplicationState", "getDeviceState", 364, "ApplicationState.java")).r("Trying to retrieve device state when there is no current account");
            return null;
        }
        return (Parcelable) this.i.get(ewb.a(b, lqdVar));
    }

    @Override // defpackage.ewg
    public final jer b(lqd lqdVar) {
        return eyf.b(this.c, lqdVar);
    }

    @Override // defpackage.ewg
    public final jis c() {
        return this.c;
    }

    public final String d() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // defpackage.ewg
    public final void e(ewk ewkVar) {
        this.r.h(ewkVar);
    }

    @Override // defpackage.ewg
    public final void f(ewk ewkVar) {
        this.t.h(ewkVar);
    }

    @Override // defpackage.ewg
    public final void g(ewk ewkVar) {
        this.o.h(ewkVar);
    }

    @Override // defpackage.ewg
    public final void h(ewk ewkVar) {
        this.s.h(ewkVar);
    }

    @Override // defpackage.ewg
    public final void i() {
        s(null);
        this.n.h(null);
    }

    @Override // defpackage.ewg
    public final void j() {
        int i = this.q - 1;
        this.q = i;
        if (i == 0) {
            this.s.i();
        }
    }

    @Override // defpackage.ewg
    public final void k(lqd lqdVar) {
        Account b = this.b.b();
        if (b == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/state/ApplicationState", "removeDevice", 447, "ApplicationState.java")).r("Trying to remove device while not signed in.");
            return;
        }
        this.i.remove(ewb.a(b, lqdVar));
        jis jisVar = this.c;
        if (jisVar != null) {
            ArrayList arrayList = new ArrayList();
            if (A(lqdVar, this.n.a())) {
                this.n.e(null);
            }
            int size = jisVar.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                lqc lqcVar = (lqc) jisVar.get(i);
                if (A(lqdVar, lqcVar)) {
                    z = true;
                } else {
                    arrayList.add(lqcVar);
                }
            }
            if (z) {
                s(arrayList);
            }
        }
    }

    @Override // defpackage.ewg
    public final void l(ewk ewkVar) {
        this.r.j(ewkVar);
    }

    @Override // defpackage.ewg
    public final void m(ewk ewkVar) {
        this.t.j(ewkVar);
    }

    @Override // defpackage.ewg
    public final void n(ewk ewkVar) {
        this.o.j(ewkVar);
    }

    @Override // defpackage.ewg
    public final void o(ewk ewkVar) {
        this.s.j(ewkVar);
    }

    @Override // defpackage.ewg
    public final void p() {
        this.h = true;
        this.r.i();
    }

    public final void q(jer jerVar) {
        if (!jerVar.g()) {
            this.l = jdl.a;
            return;
        }
        jis jisVar = this.c;
        if (jisVar == null) {
            this.l = jerVar;
            return;
        }
        jer c = eyf.c(jisVar, (String) jerVar.c());
        if (c.g()) {
            this.n.h((lqc) c.c());
        }
    }

    public final void r(lqd lqdVar, Parcelable parcelable) {
        Account b = this.b.b();
        if (b == null) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/state/ApplicationState", "setDeviceState", 353, "ApplicationState.java")).r("Trying to save device state when there is no current account");
        } else {
            this.i.put(ewb.a(b, lqdVar), parcelable);
        }
    }

    @Override // defpackage.ewg
    public final void s(List list) {
        jis o;
        if (!amr.g(this.c, list)) {
            if (list == null) {
                o = null;
            } else {
                o = jis.o(list);
            }
            this.c = o;
            this.o.i();
            lqc a2 = this.n.a();
            if (a2 != null && eyf.f(list, a2) == null) {
                this.n.d(null);
            }
        }
    }

    @Override // defpackage.ewg
    public final void t(boolean z) {
        this.f = z;
        this.t.i();
    }

    @Override // defpackage.ewg
    public final void u(boolean z) {
        this.h = z;
    }

    @Override // defpackage.ewg
    public final void v() {
        int i = this.q;
        this.q = i + 1;
        if (i == 0) {
            this.s.i();
        }
    }

    @Override // defpackage.ewg
    public final void w(lqc lqcVar, lqc lqcVar2) {
        ArrayList arrayList = new ArrayList();
        jis jisVar = this.c;
        if (jisVar != null) {
            int size = jisVar.size();
            for (int i = 0; i < size; i++) {
                lqc lqcVar3 = (lqc) jisVar.get(i);
                if (eyf.p(lqcVar3, lqcVar)) {
                    arrayList.add(lqcVar2);
                } else {
                    arrayList.add(lqcVar3);
                }
            }
            s(arrayList);
        }
        lqc a2 = this.n.a();
        if (a2 != null && eyf.p(lqcVar, a2)) {
            this.n.h(lqcVar2);
        }
    }

    @Override // defpackage.ewg
    public final boolean x() {
        return this.f;
    }

    @Override // defpackage.ewg
    public final boolean y() {
        return this.h;
    }

    @Override // defpackage.ewg
    public final boolean z() {
        if (this.q > 0) {
            return true;
        }
        return false;
    }
}
