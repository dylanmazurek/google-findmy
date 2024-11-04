package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eco extends v {
    private String af;
    private boolean ag;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        String U;
        int i;
        iqd iqdVar = new iqd(y(), R.style.ThemeOverlay_GoogleMaterial3_MaterialAlertDialog);
        if (this.ag) {
            U = U(R.string.wipe_confirmation_dialog_message_for_profile, this.af);
        } else {
            U = U(R.string.wipe_confirmation_dialog_message, this.af);
        }
        iqdVar.o(U);
        if (true != this.ag) {
            i = R.string.erase;
        } else {
            i = R.string.delete;
        }
        iqdVar.r(i, new ece((Object) this, 11));
        iqdVar.p(android.R.string.cancel, new ece((Object) this, 12));
        return iqdVar.b();
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.af = A().getString("wipe_device_name", "");
        this.ag = A().getBoolean("is_managed_profile");
    }
}
