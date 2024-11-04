package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.BidiFormatter;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epa extends epe {
    public BidiFormatter af;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        int i;
        iqd iqdVar = new iqd(F(), R.style.ThemeOverlay_Fmd_ErrorDialog);
        iqdVar.m(R.drawable.gs_error_vd_theme_24);
        iqdVar.s(R.string.spot_remove_device_failed_to_reset_dialog_title);
        if (true != A().getBoolean("IS_DEVICE_NOT_NEARBY")) {
            i = R.string.spot_remove_device_not_given_necessary_permissions_dialog_text;
        } else {
            i = R.string.spot_remove_device_not_nearby_dialog_text;
        }
        iqdVar.o(U(i, this.af.unicodeWrap(ivc.n(A().getString("DEVICE_NAME_KEY")))));
        iqdVar.r(R.string.spot_remove_device_button_text, new eos(this, 3));
        iqdVar.p(android.R.string.cancel, new eos(this, 4));
        return iqdVar.b();
    }

    public final void aF(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILED_TO_UNPROVISION_DIALOG_RESULT_KEY", z);
        H().P("FAILED_TO_UNPROVISION_DIALOG_REQUEST_KEY", bundle);
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aF(false);
    }
}
