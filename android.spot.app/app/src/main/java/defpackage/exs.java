package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exs extends exq {
    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        iqd iqdVar = new iqd(F(), R.style.ThemeOverlay_Material3_MaterialAlertDialog_Centered);
        iqdVar.s(R.string.notification_permission_request_dialog_title);
        iqdVar.m(R.drawable.gs_notifications_active_vd_theme_24);
        iqdVar.n(A().getInt("DIALOG_BODY_STRING_KEY", 0));
        iqdVar.r(R.string.notification_permission_continue_button_text, new eos(this, 8));
        iqdVar.p(R.string.notification_permission_negative_button_text, new eos(this, 9));
        return iqdVar.b();
    }

    public final void aG(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("NOTIFICATION_PERMISSION_RESULT_FRAGMENT_RESULT_KEY", z);
        H().P("NOTIFICATION_PERMISSION_RESULT_FRAGMENT_RESULT", bundle);
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aG(false);
    }
}
