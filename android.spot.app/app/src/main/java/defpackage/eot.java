package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.BidiFormatter;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eot extends epd {
    public BidiFormatter af;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        iqd iqdVar = new iqd(F(), R.style.ThemeOverlay_Material3_MaterialAlertDialog_Centered);
        iqdVar.m(R.drawable.gs_location_on_vd_theme_24);
        iqdVar.s(R.string.spot_remove_device_enable_location_dialog_title);
        iqdVar.o(U(R.string.spot_remove_device_dialog_enable_location_text, this.af.unicodeWrap(ivc.n(A().getString("DEVICE_NAME_KEY")))) + "\n\n" + T(R.string.spot_remove_device_setting_can_be_changed_anytime));
        iqdVar.r(R.string.spot_remove_device_turn_on_button_text, new eos(this, 0));
        iqdVar.p(R.string.spot_remove_device_no_thanks_button_text, new eos(this, 2));
        return iqdVar.b();
    }

    public final void aF(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ENABLE_LOCATION_DIALOG_RESULT_KEY", z);
        H().P("ENABLE_LOCATION_DIALOG_REQUEST_KEY", bundle);
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aF(false);
    }
}
