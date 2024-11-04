package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.BidiFormatter;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoq extends epb {
    public BidiFormatter af;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        int i;
        iqd iqdVar = new iqd(F());
        iqdVar.s(R.string.spot_remove_confirmation_dialog_title);
        if (true != A().getBoolean("IS_LOCATOR_TAG_KEY")) {
            i = R.string.spot_remove_confirmation_dialog_text_accessory;
        } else {
            i = R.string.spot_remove_confirmation_dialog_text_tag;
        }
        iqdVar.o(U(i, this.af.unicodeWrap(ivc.n(A().getString("DEVICE_NAME_KEY")))));
        iqdVar.r(R.string.spot_remove_device_confirmation_dialog_positive_button, new ece((Object) this, 19));
        iqdVar.p(android.R.string.cancel, new elb(3));
        return iqdVar.b();
    }
}
