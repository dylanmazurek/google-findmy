package defpackage;

import android.accounts.Account;
import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejo {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler");
    public jer b;
    public jer c;
    public final Object d;
    public final ele e;
    public final lqz f;
    public final ArrayList g;
    public final cfn h;
    public final hnu i;
    public final ddg j;
    public final kuv k;
    private final evy l;
    private final ewc m;
    private final esa n;
    private final ilv o;

    public ejo(ilv ilvVar, ddg ddgVar, evy evyVar, ewc ewcVar, hnu hnuVar, ele eleVar, kuv kuvVar, esa esaVar, lqz lqzVar) {
        jdl jdlVar = jdl.a;
        this.b = jdlVar;
        this.c = jdlVar;
        this.d = new Object();
        this.g = new ArrayList();
        this.o = ilvVar;
        this.j = ddgVar;
        this.l = evyVar;
        this.m = ewcVar;
        this.i = hnuVar;
        this.e = eleVar;
        this.k = kuvVar;
        this.n = esaVar;
        this.f = lqzVar;
        this.h = new cfn(a());
        ilvVar.h(new ah(this, 9));
    }

    public static final ejn f(kyf kyfVar, jer jerVar) {
        int i;
        if (jerVar.g()) {
            kyq kyqVar = kyfVar.f;
            if (kyqVar == null) {
                kyqVar = kyq.g;
            }
            if (kyqVar.b == 3) {
                i = ((Integer) kyqVar.c).intValue();
            } else {
                i = 0;
            }
            if (i == ((ijf) jerVar.c()).c) {
                return ejn.IN_SYNC;
            }
            return ejn.OUT_OF_SYNC;
        }
        return ejn.OUT_OF_SYNC;
    }

    private static final boolean g(kyf kyfVar) {
        kyq kyqVar = kyfVar.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        if (kzv.e(kyqVar.b) == 4) {
            return true;
        }
        return false;
    }

    public final ejn a() {
        jer jerVar;
        jer b = b();
        if (!b.g()) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler", "getDeviceSyncState", 188, "OwnerKeyHandler.java")).r("getDeviceSyncState() is called while no spot device is selected");
            return ejn.UNKNOWN;
        }
        kyf kyfVar = (kyf) b.c();
        if (!g(kyfVar)) {
            return ejn.IN_SYNC;
        }
        evy evyVar = this.l;
        esa esaVar = this.n;
        Account b2 = evyVar.b();
        if (esaVar.a(b2)) {
            esa esaVar2 = this.n;
            synchronized (esaVar2.c) {
                if (esaVar2.a(b2)) {
                    jerVar = esaVar2.e;
                } else {
                    jerVar = jdl.a;
                }
            }
            return f(kyfVar, jerVar);
        }
        return ejn.UNKNOWN;
    }

    public final jer b() {
        return this.o.e().b(new dyv(this, 8));
    }

    public final jyz c() {
        jyz b;
        gok C = this.j.C();
        jer b2 = b();
        if (!b2.g()) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler", "getDeviceSyncStateFuture", 170, "OwnerKeyHandler.java")).r("getDeviceSyncStateFuture() is called while no spot device is selected");
            return ivc.E(ejn.UNKNOWN);
        }
        if (!g((kyf) b2.c())) {
            return ivc.E(ejn.IN_SYNC);
        }
        esa esaVar = this.n;
        synchronized (esaVar.c) {
            if (esaVar.a((Account) C.a)) {
                b = ivc.E(esaVar.e);
            } else {
                b = esaVar.b(C);
            }
        }
        return jbx.d(b).e(new dyv(b2, 6), jxv.a);
    }

    public final void d(boolean z) {
        if (z) {
            this.m.p();
        } else {
            e();
        }
        synchronized (this.d) {
            this.c = jdl.a;
        }
    }

    public final void e() {
        int i;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ((njz) arrayList.get(i2)).a;
            elc elcVar = (elc) obj;
            kyf kyfVar = elcVar.e.a(elcVar.d()).b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            ebf ebfVar = elcVar.f;
            boolean c = hqk.c(kyfVar);
            cs csVar = ebfVar.a;
            iqd iqdVar = new iqd(csVar);
            iqdVar.s(R.string.spot_owner_key_import_failed_dialog_title);
            if (true != c) {
                i = R.string.spot_owner_key_import_failed_dialog_message_for_accessory;
            } else {
                i = R.string.spot_owner_key_import_failed_dialog_message_for_android_device;
            }
            iqdVar.o(csVar.getString(i, new Object[]{elcVar.d.unicodeWrap(elcVar.d().g)}));
            iqdVar.r(R.string.learn_more, new ece(obj, 17));
            iqdVar.p(android.R.string.cancel, new elb(0));
            iqdVar.b().show();
        }
    }
}
