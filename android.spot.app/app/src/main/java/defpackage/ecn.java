package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecn extends eby {
    public int af;
    public dyt ag;
    public ksf ah;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        String str;
        Context y = y();
        int i = this.af;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("Invalid Terms of Service version");
            }
            str = String.format(y.getString(R.string.welcome_body_v2), y.getString(R.string.full_app_name));
        } else {
            str = String.format(y.getString(R.string.welcome_body), y.getString(R.string.full_app_name));
        }
        String str2 = str;
        if (A().getBoolean("showSpecialDisclosureForSouthKorea", false)) {
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
            valueOf.append((CharSequence) "\n\n");
            Context y2 = y();
            int i2 = this.af;
            if (i2 != 0 && i2 != 1 && i2 != 2) {
                throw new IllegalStateException("Invalid Terms of Service version");
            }
            valueOf.append((CharSequence) btw.a(y2.getResources().getString(R.string.special_disclosure_for_south_korea), 0));
            str2 = valueOf;
        }
        iqd iqdVar = new iqd(y(), R.style.ThemeOverlay_Fmd_WelcomeDialog);
        iqdVar.o(str2);
        iqdVar.r(R.string.welcome_accept_button, new ece((Object) this, 9));
        iqdVar.p(R.string.welcome_close_button, new ece((Object) this, 10));
        iqdVar.a.n = true;
        cq b = iqdVar.b();
        b.show();
        return b;
    }

    @Override // defpackage.ag
    public final void ad() {
        boolean z;
        dyt dytVar = this.ag;
        boolean z2 = true;
        if (dytVar.e != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI not attached");
        if (dytVar.e != this) {
            z2 = false;
        }
        hwx.K(z2, "detaching wrong UI");
        this.ah = null;
        dytVar.e = null;
        super.ad();
    }

    @Override // defpackage.ag
    public final void af() {
        boolean z;
        super.af();
        dyt dytVar = this.ag;
        if (dytVar.e == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "UI already attached");
        dytVar.e = this;
        dytVar.e.ah = dytVar.f;
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.af = A().getInt("serverTosVersion", 2);
    }

    @Override // defpackage.v, defpackage.ag
    public final void k() {
        super.k();
        Dialog dialog = this.d;
        if (dialog != null) {
            TextView textView = (TextView) dialog.findViewById(android.R.id.message);
            textView.getClass();
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        throw new IllegalStateException(a.af(this, "DialogFragment ", " does not have a Dialog."));
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ksf ksfVar = this.ah;
        if (ksfVar != null) {
            ksfVar.a();
        }
    }
}
