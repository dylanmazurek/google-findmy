package defpackage;

import android.accounts.Account;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ece implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ece(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v54, types: [lqz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v85, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v10, types: [lqz, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        lql lqlVar;
        lqu lquVar;
        switch (this.b) {
            case 0:
                ((ech) this.a).aH();
                return;
            case 1:
                ((rg) this.a).ah.k(true);
                return;
            case 2:
                exp expVar = ((ech) this.a).af;
                if (expVar != null) {
                    expVar.a();
                    return;
                }
                return;
            case 3:
                njz njzVar = ((eci) this.a).ai;
                if (njzVar != null) {
                    ((bym) njzVar.a.a()).l(dxq.SECURITY_CHECKUP_CANCELLED);
                    return;
                }
                return;
            case 4:
                njz njzVar2 = ((eci) this.a).ai;
                if (njzVar2 != null) {
                    ((bym) njzVar2.a.a()).l(dxq.SECURITY_CHECKUP_ACCEPTED);
                }
                ((eci) this.a).aG();
                return;
            case 5:
                ecj ecjVar = (ecj) this.a;
                efw efwVar = ecjVar.ag;
                String str = ecjVar.af;
                ebf ebfVar = ecjVar.ah;
                efwVar.c.l(dxq.SET_PASSWORD_CONFIRMED);
                jer a = efwVar.a();
                if (!a.g()) {
                    ((jni) ((jni) efw.a.f()).j("com/google/android/apps/adm/integrations/android/AndroidSetPasswordViewModel", "usePasswordToSetLockScreenAndLock", 127, "AndroidSetPasswordViewModel.java")).r("No device present when verifying password.");
                    return;
                }
                lqc lqcVar = (lqc) a.c();
                if (!bsf.j(lqcVar)) {
                    ebfVar.d();
                    efwVar.d.m(R.string.lock_result_fail);
                    return;
                }
                if (!eyf.u(lqcVar) && !eyf.v(lqcVar)) {
                    elo eloVar = efwVar.e;
                    lqd lqdVar = lqcVar.d;
                    if (lqdVar == null) {
                        lqdVar = lqd.d;
                    }
                    eloVar.g(lqdVar, ebfVar, str, null, null);
                    return;
                }
                lqd lqdVar2 = lqcVar.d;
                if (lqdVar2 == null) {
                    lqdVar2 = lqd.d;
                }
                boolean u = eyf.u(lqcVar);
                boolean v = eyf.v(lqcVar);
                boolean e = bsf.e(lqcVar);
                if (ebfVar.a().f("set_password_fragment") != null) {
                    ebfVar.a().ad();
                }
                if (ebfVar.a().f("lock_device_fragment") == null) {
                    eca.aG(lqdVar2, str, u, v, e).q(ebfVar.a(), "lock_device_fragment");
                    ebfVar.a().ag();
                }
                efwVar.c.k(dxp.LOCK);
                return;
            case 6:
                ((ecj) this.a).ag.c.l(dxq.SET_PASSWORD_CANCELLED);
                return;
            case 7:
                ksf ksfVar = ((ecm) this.a).ag;
                if (ksfVar != null) {
                    ((bym) ksfVar.a.a()).l(dxq.SETUP_CONFIRMATION_ACCEPTED);
                    Object obj = ksfVar.c;
                    ((ees) ksfVar.b).a(((ehp) obj).q, lpk.ANDROID_REMIND);
                    return;
                }
                return;
            case 8:
                ksf ksfVar2 = ((ecm) this.a).ag;
                if (ksfVar2 != null) {
                    ((bym) ksfVar2.a.a()).l(dxq.SETUP_CONFIRMATION_CANCELLED);
                    return;
                }
                return;
            case 9:
                ecn ecnVar = (ecn) this.a;
                ksf ksfVar3 = ecnVar.ah;
                if (ksfVar3 != null) {
                    int i2 = ecnVar.af;
                    ((bym) ksfVar3.a.a()).l(dxq.WELCOME_SCREEN_ACCEPT);
                    exl exlVar = (exl) ksfVar3.c;
                    Account b = exlVar.b.b();
                    if (b != null) {
                        exlVar.c(i2, b);
                        exlVar.b(i2, b);
                    }
                    njz njzVar3 = ((dyt) ksfVar3.b).g;
                    if (njzVar3 != null) {
                        ((dyq) njzVar3.a).k.set(true);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ksf ksfVar4 = ((ecn) this.a).ah;
                if (ksfVar4 != null) {
                    ksfVar4.a();
                    return;
                }
                return;
            case 11:
                Bundle bundle = new Bundle();
                bundle.putBoolean("wipe_confirmation_result", true);
                ((ag) this.a).H().P("wipe_confirmation_result", bundle);
                return;
            case 12:
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("wipe_confirmation_result", false);
                ((ag) this.a).H().P("wipe_confirmation_result", bundle2);
                return;
            case 13:
                edl edlVar = (edl) this.a;
                eei eeiVar = edlVar.aq;
                edv edvVar = null;
                if (eeiVar == null) {
                    mpd.b("deleteHandler");
                    eeiVar = null;
                }
                edv edvVar2 = edlVar.ar;
                if (edvVar2 == null) {
                    mpd.b("viewModel");
                } else {
                    edvVar = edvVar2;
                }
                hnu hnuVar = eeiVar.d;
                lqd lqdVar3 = edvVar.c;
                if (lqdVar3.a == 5) {
                    lqlVar = (lql) lqdVar3.b;
                } else {
                    lqlVar = lql.c;
                }
                if (lqlVar.a == 2) {
                    lquVar = (lqu) lqlVar.b;
                } else {
                    lquVar = lqu.c;
                }
                kxv kxvVar = lquVar.b;
                if (kxvVar == null) {
                    kxvVar = kxv.b;
                }
                iuu.q(hnuVar.e(kxvVar), new elj(eeiVar, lqdVar3, 1), eeiVar.c);
                edlVar.aK().s();
                return;
            case 14:
                dialogInterface.dismiss();
                egx egxVar = (egx) this.a;
                egxVar.af.a().ae("DEVICE_UI_BACK_STACK_STATE", -1, 0);
                bso bsoVar = egxVar.ag;
                lqc lqcVar2 = egxVar.e;
                lqcVar2.getClass();
                lqd lqdVar4 = lqcVar2.d;
                if (lqdVar4 == null) {
                    lqdVar4 = lqd.d;
                }
                ((bym) bsoVar.b.a()).l(dxq.WIPE_CONFIRMATION_ACCEPTED);
                ((ees) bsoVar.c).a(lqdVar4, lpk.ANDROID_WIPE);
                ((dhx) bsoVar.a).m(R.string.factory_reset_request_sent_notification);
                return;
            case 15:
                dialogInterface.dismiss();
                ((bym) ((egx) this.a).ag.b.a()).l(dxq.WIPE_CONFIRMATION_CANCELLED);
                return;
            case 16:
                ehl ehlVar = (ehl) this.a;
                if (!ehlVar.au()) {
                    ((jni) ((jni) ehl.a.g()).j("com/google/android/apps/adm/integrations/android/securedevice/SetLockscreenPasswordFragment", "onDialogNegativeButtonClicked", 172, "SetLockscreenPasswordFragment.java")).r("Dialog button clicked after fragment got closed");
                    return;
                } else {
                    ehlVar.H().L();
                    return;
                }
            case 17:
                ((elc) this.a).g();
                return;
            case 18:
                ((eok) this.a).a.g();
                return;
            case 19:
                ((eoq) this.a).H().P("CONFIRMATION_DIALOG_REQUEST_KEY", new Bundle());
                return;
            default:
                ((eor) this.a).aF(true);
                return;
        }
    }

    public ece(v vVar, int i) {
        this.b = i;
        this.a = vVar;
    }
}
