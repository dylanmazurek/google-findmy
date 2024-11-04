package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.CrossProfileApps;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.UserHandle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.guestmode.GuestModeActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class he implements View.OnClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public he(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        Message message4;
        String str;
        switch (this.b) {
            case 0:
                ((fi) this.a).f();
                return;
            case 1:
                co coVar = (co) this.a;
                if (view == coVar.i && (message4 = coVar.k) != null) {
                    message = Message.obtain(message4);
                } else if (view == coVar.l && (message3 = coVar.n) != null) {
                    message = Message.obtain(message3);
                } else if (view == coVar.o && (message2 = coVar.q) != null) {
                    message = Message.obtain(message2);
                } else {
                    message = null;
                }
                if (message != null) {
                    message.sendToTarget();
                }
                co coVar2 = (co) this.a;
                coVar2.G.obtainMessage(1, coVar2.b).sendToTarget();
                return;
            case 2:
                ((Toolbar) this.a).j();
                return;
            case 3:
                duj dujVar = (duj) this.a;
                ((bym) dujVar.g.a()).l(dxq.GUEST_LOGIN_SELECTED);
                if (ltr.c()) {
                    duo.b(dujVar.b.y());
                    return;
                } else {
                    GuestModeActivity.q(dujVar.b.y());
                    return;
                }
            case 4:
                duj.h((Context) this.a);
                return;
            case 5:
                ((duj) this.a).h.k();
                return;
            case 6:
                duj dujVar2 = (duj) this.a;
                Account d = dujVar2.d.d();
                if (d != null) {
                    ((bym) dujVar2.g.a()).l(dxq.REQUIRE_SIGN_IN);
                    dujVar2.c.f(d, -1L);
                    ((bym) dujVar2.f.a()).i(d.name, false);
                    iwk.o(dujVar2.b.K(), R.string.youll_be_required_to_sign_in, 0).i();
                    if (dujVar2.a != null) {
                        dujVar2.g();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((dwr) ((jeu) ((duj) this.a).e).a).b();
                return;
            case 8:
                ((dzo) this.a).ah.f();
                return;
            case 9:
                eag eagVar = (eag) this.a;
                ComponentName componentName = eagVar.r.getComponentName();
                if (Build.VERSION.SDK_INT < 28) {
                    return;
                }
                CrossProfileApps m = he$$ExternalSyntheticApiModelOutline0.m(eagVar.s.b.getSystemService("crossprofileapps"));
                jer a = ezl.a(m);
                if (a.g() && m != null) {
                    m.startMainActivity(componentName, (UserHandle) a.c());
                    return;
                } else {
                    ((jni) ((jni) ezl.a.g()).j("com/google/android/apps/adm/util/UserUtilImpl", "openOnCrossProfile", 69, "UserUtilImpl.java")).r("Cannot launch on other profile as there is no other profile");
                    return;
                }
            case 10:
                ebk ebkVar = (ebk) this.a;
                ebkVar.as(new Intent("android.intent.action.VIEW", Uri.parse(fyo.b((ContentResolver) ebkVar.af.a, "adm:view_on_play_url", "market://details?id=com.google.android.apps.adm"))));
                ebkVar.d();
                return;
            case 11:
                ((ebm) this.a).d();
                return;
            case 12:
                ebm ebmVar = (ebm) this.a;
                if (ebmVar.H().f("wipe_device_dialog") == null) {
                    eco ecoVar = new eco();
                    Bundle bundle = new Bundle();
                    if (eyf.q(ebmVar.af)) {
                        lqc lqcVar = ebmVar.af;
                        if (lqcVar != null) {
                            str = lqcVar.g;
                        } else {
                            str = "";
                        }
                        bundle.putString("wipe_device_name", str);
                    }
                    bundle.putBoolean("is_managed_profile", eyf.s(ebmVar.af));
                    ecoVar.ak(bundle);
                    ecoVar.q(ebmVar.G(), "wipe_device_dialog");
                    ebmVar.H().ag();
                    return;
                }
                return;
            case 13:
                ((eca) this.a).d();
                return;
            case 14:
                ((eca) this.a).aH();
                return;
            case 15:
                ((ecc) this.a).aJ();
                return;
            case 16:
                kqp kqpVar = ((ecc) this.a).aj;
                if (kqpVar != null) {
                    dyh dyhVar = (dyh) kqpVar.a;
                    ((bym) dyhVar.e.a()).l(dxq.AUTH_HELP_ME);
                    ebf ebfVar = (ebf) dyhVar.d.a();
                    Account b = dyhVar.b.b();
                    b.getClass();
                    ebfVar.e("https://accounts.google.com/RecoverAccount?fpOnly=1&Email=".concat(ivc.n(b.name)));
                    return;
                }
                return;
            case 17:
                ((ecc) this.a).aH();
                return;
            case 18:
                ((ecl) this.a).d();
                return;
            case 19:
                BottomSheetBehavior aH = ((ect) this.a).aH();
                if (aH == null) {
                    return;
                }
                aH.H(3);
                return;
            default:
                ecw ecwVar = (ecw) this.a;
                if (ecwVar.a) {
                    ecwVar.c.e();
                    return;
                } else {
                    ecwVar.c.f();
                    ecwVar.H().ad();
                    return;
                }
        }
    }

    public /* synthetic */ he(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
