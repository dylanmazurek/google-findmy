package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.BidiFormatter;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eor extends epc {
    public BidiFormatter af;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        iqd iqdVar = new iqd(F(), R.style.ThemeOverlay_Material3_MaterialAlertDialog_Centered);
        iqdVar.m(R.drawable.gs_bluetooth_vd_theme_24);
        iqdVar.s(R.string.spot_remove_device_enable_bluetooth_dialog_title);
        iqdVar.o(U(R.string.spot_remove_device_dialog_bluetooth_text, this.af.unicodeWrap(ivc.n(A().getString("DEVICE_NAME_KEY")))));
        iqdVar.r(R.string.spot_remove_device_turn_on_button_text, new ece((Object) this, 20));
        iqdVar.p(R.string.spot_remove_device_no_thanks_button_text, new eos(this, 1));
        return iqdVar.b();
    }

    public final void aF(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ENABLE_BLUETOOTH_DIALOG_RESULT_KEY", z);
        H().P("ENABLE_BLUETOOTH_DIALOG_REQUEST_KEY", bundle);
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aF(false);
    }
}
