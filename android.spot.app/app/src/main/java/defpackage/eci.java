package defpackage;

import android.R;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eci extends ebu {
    public ehr af;
    public hpd ag;
    public elo ah;
    public njz ai;
    private String aj;
    private String ak;

    private final void aH(String str) {
        TextView textView;
        Dialog dialog = this.d;
        if (dialog != null && str != null && (textView = (TextView) dialog.findViewById(R.id.message)) != null) {
            fma.bQ(x(), textView, str);
        }
    }

    @Override // defpackage.ag
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle != null) {
            String string = bundle.getString("dialog_title");
            if (!TextUtils.isEmpty(string)) {
                this.aj = string;
            }
            String string2 = bundle.getString("dialog_message");
            if (!TextUtils.isEmpty(string2)) {
                this.ak = string2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [mys, java.lang.Object] */
    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        cp cpVar = new cp(F());
        cpVar.k(this.aj);
        cpVar.e(this.ak);
        cpVar.i(com.google.android.apps.adm.R.string.security_checkup, new ece((v) this, 4));
        cpVar.f(com.google.android.apps.adm.R.string.dismiss, new ece((v) this, 3));
        cq b = cpVar.b();
        Window window = b.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.y = ((ewi) this.ag.d.c()).b + fma.bM(z().getDisplayMetrics(), 68);
        }
        return b;
    }

    public final void aG() {
        elo eloVar = this.ah;
        if (eloVar == null) {
            return;
        }
        try {
            as(new Intent("android.intent.action.VIEW", Uri.parse(fyo.b((ContentResolver) eloVar.a, "adm:security_checkup_url", "https://myaccount.google.com/security-checkup"))));
        } catch (ActivityNotFoundException e) {
            aH(e.getMessage());
        }
    }

    @Override // defpackage.ag
    public final void ad() {
        boolean z;
        jer g = this.af.g();
        if (g.g() && (g.c() instanceof efa)) {
            efa efaVar = (efa) g.c();
            hwx.V(efaVar.g.g(), "UI not attached");
            if (efaVar.g.c() == this) {
                z = true;
            } else {
                z = false;
            }
            hwx.K(z, "detaching wrong UI");
            this.ai = null;
            efaVar.g = jdl.a;
        }
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        jer g = this.af.g();
        if (g.g() && (g.c() instanceof efa)) {
            efa efaVar = (efa) g.c();
            hwx.V(!efaVar.g.g(), "Rename device UI already attached");
            efaVar.g = jer.i(this);
            ((eci) efaVar.g.c()).ai = efaVar.p;
        }
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.aj = A().getString("dialog_title", "");
        this.ak = A().getString("dialog_message", "");
    }

    @Override // defpackage.v, defpackage.ag
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putString("dialog_title", this.aj);
        bundle.putString("dialog_message", this.ak);
    }

    @Override // defpackage.v, defpackage.ag
    public final void k() {
        super.k();
        aH(this.ak);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [lqz, java.lang.Object] */
    @Override // defpackage.v, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        njz njzVar = this.ai;
        if (njzVar != null) {
            ((bym) njzVar.a.a()).k(dxp.DEVICES);
        }
    }
}
