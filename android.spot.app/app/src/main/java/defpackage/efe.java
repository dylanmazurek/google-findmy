package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class efe implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ efe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String T;
        lpt lptVar;
        lpt lptVar2;
        jer bx;
        int an;
        edv edvVar = null;
        int i = 1;
        switch (this.b) {
            case 0:
                efh efhVar = (efh) this.a;
                efhVar.az.a(dyj.DEVICE_INFO, efhVar.as);
                return;
            case 1:
                edv edvVar2 = ((edl) this.a).ar;
                if (edvVar2 == null) {
                    mpd.b("viewModel");
                } else {
                    edvVar = edvVar2;
                }
                edvVar.a.a(edvVar.c, edvVar.e);
                return;
            case 2:
                efh efhVar2 = (efh) this.a;
                efhVar2.az.a(dyj.LOCATE, efhVar2.as);
                return;
            case 3:
                egr.a((egr) this.a);
                return;
            case 4:
                ((ag) this.a).as(egs.a);
                return;
            case 5:
                egw egwVar = (egw) this.a;
                lqd lqdVar = egwVar.b;
                if (lqdVar == null) {
                    ((jni) ((jni) egw.a.g()).j("com/google/android/apps/adm/integrations/android/factoryreset/AndroidDeviceDetailsFactoryResetButtonFragment", "onFactoryResetButtonClicked", 78, "AndroidDeviceDetailsFactoryResetButtonFragment.java")).r("No device identifier when trying to factory reset device.");
                    return;
                }
                ebf ebfVar = egwVar.d;
                egx egxVar = new egx();
                Bundle bundle = new Bundle();
                eyf.m(lqdVar, bundle);
                egxVar.ak(bundle);
                ebb a = ebc.a();
                a.b(true);
                ebfVar.k(egxVar, a.a());
                return;
            case 6:
                Object obj = this.a;
                egx egxVar2 = (egx) obj;
                if (egxVar2.e == null) {
                    ((jni) ((jni) egx.a.f().h(jop.a, "FactoryResetDeviceFrg")).j("com/google/android/apps/adm/integrations/android/factoryreset/FactoryResetDeviceFragment", "showFactoryResetConfirmationDialog", 167, "FactoryResetDeviceFragment.java")).r("Called showFactoryResetConfirmationDialog when currentDevice is null");
                    return;
                }
                iqd iqdVar = new iqd(egxVar2.y(), R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog);
                iqdVar.s(R.string.factory_reset_confirmation_dialog_title);
                String str = egxVar2.e.g;
                if (!TextUtils.isEmpty(str) && eyf.q(egxVar2.e)) {
                    T = egxVar2.U(R.string.factory_reset_all_data_erased_text_with_device_name, egxVar2.c.unicodeWrap(str));
                } else {
                    T = egxVar2.T(R.string.factory_reset_all_data_erased_text);
                }
                iqdVar.o(T);
                iqdVar.r(R.string.reset, new ece(obj, 14));
                iqdVar.p(android.R.string.cancel, new ece(obj, 15));
                iqdVar.b().show();
                egxVar2.H().ag();
                return;
            case 7:
                ehg ehgVar = (ehg) this.a;
                eqa a2 = eqa.a(ehgVar.af, (kxz) ehgVar.e.c.e(kxz.d), false, true);
                ebf ebfVar2 = ehgVar.an;
                ebb a3 = ebc.a();
                a3.b(true);
                ebfVar2.k(a2, a3.a());
                return;
            case 8:
                ehg ehgVar2 = (ehg) this.a;
                if (ehgVar2.ah) {
                    lqd lqdVar2 = ehgVar2.af;
                    boolean z = ehgVar2.ag;
                    String T2 = ehgVar2.T(R.string.set_password_and_secure_flow_title);
                    String T3 = ehgVar2.T(R.string.secure_device);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("HAS_CAR_KEYS", z);
                    eyf.m(lqdVar2, bundle2);
                    bundle2.putString("TITLE_RES_ID", T2);
                    bundle2.putString("BUTTON_TEXT_RES_ID", T3);
                    ehl ehlVar = new ehl();
                    ehlVar.ak(bundle2);
                    ebf ebfVar3 = ehgVar2.an;
                    ebb a4 = ebc.a();
                    a4.b(true);
                    ebfVar3.k(ehlVar, a4.a());
                    return;
                }
                ehgVar2.e.e(jdl.a, ehgVar2.e());
                return;
            case 9:
                ((CheckBox) this.a).toggle();
                return;
            case 10:
                ehk ehkVar = ((ehg) this.a).e;
                ehkVar.f.l(new ehj(jer.i(ehi.MARKING_AS_FOUND), false, false));
                ivc.N(ehkVar.g.e(ehkVar.b, 2, false), new dup(ehkVar, 5), ehkVar.e);
                return;
            case 11:
                Object obj2 = this.a;
                ehl ehlVar2 = (ehl) obj2;
                EditText editText = ehlVar2.d.c;
                editText.getClass();
                String obj3 = editText.getText().toString();
                EditText editText2 = ehlVar2.e.c;
                editText2.getClass();
                String obj4 = editText2.getText().toString();
                lqc d = ehlVar2.d();
                if (d.b == 3) {
                    lptVar = (lpt) d.c;
                } else {
                    lptVar = lpt.C;
                }
                if (lptVar.i >= 30 && (an = hzc.an(d.f)) != 0 && an == 6) {
                    bx = fma.by(ehlVar2.y(), obj3, obj4);
                } else {
                    if (d.b == 3) {
                        lptVar2 = (lpt) d.c;
                    } else {
                        lptVar2 = lpt.C;
                    }
                    lqs lqsVar = lptVar2.s;
                    if (lqsVar == null) {
                        lqsVar = lqs.k;
                    }
                    bx = fma.bx(ehlVar2.y(), obj3, obj4, lqsVar);
                }
                if (bx.g()) {
                    ezc ezcVar = (ezc) bx.c();
                    int i2 = ezcVar.b;
                    if (i2 != 0) {
                        int i3 = i2 - 1;
                        if (i3 != 0) {
                            if (i3 != 1) {
                                return;
                            }
                            ehlVar2.d.k(null);
                            ehlVar2.e.k(ezcVar.a);
                            return;
                        }
                        ehlVar2.d.k(ezcVar.a);
                        ehlVar2.e.k(null);
                        return;
                    }
                    throw null;
                }
                ehlVar2.d.k(null);
                ehlVar2.e.k(null);
                iqd iqdVar2 = new iqd(ehlVar2.y());
                iqdVar2.s(R.string.set_password_dialog_title);
                iqdVar2.n(R.string.set_password_confirmation_dialog_message);
                iqdVar2.r(android.R.string.ok, new kun(ehlVar2, obj3, i));
                iqdVar2.p(android.R.string.cancel, new ece(obj2, 16));
                iqdVar2.b().show();
                return;
            case 12:
                ehy ehyVar = (ehy) this.a;
                if (ehyVar.G().f("RENAME_DEVICE_DIALOG_TAG") != null) {
                    return;
                }
                ((bym) ehyVar.b.a()).l(dxq.RENAME);
                ehyVar.am.c(lnb.DEVICE_RENAME_REQUESTED, jdl.a, ehyVar.af);
                ehx ehxVar = (ehx) ehyVar.e.a().d();
                ehxVar.getClass();
                ech.aG(ehxVar.a.g).cs(ehyVar.G(), "RENAME_DEVICE_DIALOG_TAG");
                ((bym) ehyVar.b.a()).k(dxp.RENAME);
                return;
            case 13:
                ((ekh) this.a).aJ(ejy.b);
                return;
            case 14:
                ((ekh) this.a).aJ(ejy.a);
                return;
            case 15:
                eoj eojVar = (eoj) this.a;
                if (eojVar.ag.g()) {
                    Object obj5 = ((njz) eojVar.ag.c()).a;
                    ((dxu) obj5).a();
                    ekc ekcVar = (ekc) obj5;
                    ((bym) ekcVar.c.a()).l(dxq.SELECT_CATEGORY);
                    eob eobVar = new eob();
                    ebf ebfVar4 = ekcVar.f;
                    eobVar.q(ebfVar4.a(), null);
                    ebfVar4.a().ag();
                    return;
                }
                return;
            case 16:
                ((eoj) this.a).af.g();
                return;
            case 17:
                new esq().q(((eoj) this.a).G(), "RINGING_VOLUME_DIALOG_TAG");
                return;
            case 18:
                ((eoj) this.a).af.f();
                return;
            case 19:
                eoj eojVar2 = (eoj) this.a;
                if (eojVar2.ag.g()) {
                    elc elcVar = ((ekc) ((njz) eojVar2.ag.c()).a).e;
                    lqd lqdVar3 = elcVar.c;
                    ebf ebfVar5 = elcVar.f;
                    eud d2 = eud.d(lqdVar3);
                    ebb a5 = ebc.a();
                    a5.b(true);
                    ebfVar5.k(d2, a5.a());
                    return;
                }
                return;
            default:
                ((eoj) this.a).af.f();
                return;
        }
    }
}
