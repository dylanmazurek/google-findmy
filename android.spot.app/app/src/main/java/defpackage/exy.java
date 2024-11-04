package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exy extends ext {
    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        iqd iqdVar = new iqd(F(), R.style.ThemeOverlay_Material3_MaterialAlertDialog_Centered);
        iqdVar.s(A().getInt("TITLE_STRING_KEY"));
        iqdVar.o(A().getString("MESSAGE_STRING_KEY"));
        iqdVar.r(R.string.permission_continue_button_text, new eos(this, 10));
        iqdVar.p(R.string.permission_negative_button_text, new eos(this, 11));
        int i = A().getInt("ICON_STRING_KEY");
        if (i != 0) {
            iqdVar.m(i);
        }
        return iqdVar.b();
    }

    public final void aG(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("PERMISSION_RESULT_FRAGMENT_RESULT_KEY", z);
        bundle.putStringArray("PERMISSIONS_ARRAY_KEY", A().getStringArray("PERMISSIONS_ARRAY_KEY"));
        H().P("PERMISSION_RESULT_FRAGMENT_RESULT", bundle);
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        aG(false);
    }
}
