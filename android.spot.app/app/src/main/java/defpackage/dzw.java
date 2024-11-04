package defpackage;

import android.accounts.Account;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dzw implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dzw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [ewg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [ewg, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                dym dymVar = ((dzx) this.a).e;
                if (dymVar != null) {
                    dymVar.cx();
                    return;
                }
                return;
            case 1:
                dyq dyqVar = (dyq) this.a;
                dyq.h(dyqVar.e);
                dyq.h(dyqVar.f);
                return;
            case 2:
                ecc eccVar = (ecc) this.a;
                aj E = eccVar.E();
                if (E != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) E.getSystemService("input_method");
                    inputMethodManager.getClass();
                    EditText editText = eccVar.ah.c;
                    editText.getClass();
                    inputMethodManager.showSoftInput(editText, 1);
                    return;
                }
                return;
            case 3:
                ecc eccVar2 = (ecc) this.a;
                eccVar2.af.b(eccVar2.ag);
                return;
            case 4:
                efq efqVar = (efq) this.a;
                cfn cfnVar = efqVar.a;
                eul b = efqVar.b();
                if (!b.equals(cfnVar.d())) {
                    efqVar.a.l(b);
                    return;
                }
                return;
            case 5:
                ((ilv) ((elo) this.a).b).j();
                return;
            case 6:
                ((ekc) ((njz) this.a).a).d = false;
                return;
            case 7:
                elh elhVar = (elh) this.a;
                cfn cfnVar2 = elhVar.c;
                eul b2 = elhVar.b();
                if (!b2.equals(cfnVar2.d())) {
                    elhVar.c.i(b2);
                    return;
                }
                return;
            case 8:
                ((dhx) this.a).i();
                return;
            case 9:
                emz emzVar = (emz) this.a;
                emzVar.j.c.h(emzVar.i);
                return;
            case 10:
                emz emzVar2 = (emz) this.a;
                emzVar2.j.c.j(emzVar2.i);
                return;
            case 11:
                this.a.v();
                return;
            case 12:
                this.a.j();
                return;
            case 13:
                ens ensVar = (ens) this.a;
                Account b3 = ensVar.c.b();
                if (b3 != null && ensVar.b.name.equals(b3.name)) {
                    ((jni) ((jni) ens.a.e()).j("com/google/android/apps/adm/integrations/spot/clientactions/TriggerDeviceListRefreshClientActionHandler", "lambda$handle$0", 48, "TriggerDeviceListRefreshClientActionHandler.java")).r("Triggering device list per client action...");
                    ensVar.d.p();
                    return;
                } else {
                    ((jni) ((jni) ens.a.g()).j("com/google/android/apps/adm/integrations/spot/clientactions/TriggerDeviceListRefreshClientActionHandler", "lambda$handle$0", 51, "TriggerDeviceListRefreshClientActionHandler.java")).r("Skipping triggering device list per client action since a different account is selected");
                    return;
                }
            case 14:
                ((eoz) this.a).f();
                return;
            case 15:
                Object obj = this.a;
                synchronized (((epl) obj).b) {
                    if (((epl) obj).c == null) {
                        return;
                    }
                    ((epl) obj).b();
                    return;
                }
            case 16:
                ((cfn) this.a).l(jdl.a);
                return;
            case 17:
                ((eqo) this.a).c = jdl.a;
                return;
            case 18:
                ((epl) this.a).d();
                return;
            case 19:
                ((eqv) this.a).b();
                return;
            default:
                eqv eqvVar = (eqv) this.a;
                eqvVar.l.c.j(eqvVar.d);
                return;
        }
    }
}
