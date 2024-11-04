package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecj extends ebv {
    public String af;
    public efw ag;
    public ebf ah;

    @Override // defpackage.ag
    public final void X(Bundle bundle) {
        super.X(bundle);
        if (bundle != null) {
            String string = bundle.getString("bundle_key_password");
            if (!TextUtils.isEmpty(string)) {
                this.af = string;
            }
        }
    }

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        cp cpVar = new cp(F());
        cpVar.j(R.string.set_password_dialog_title);
        cpVar.d(R.string.set_password_confirmation_dialog_message);
        cpVar.i(android.R.string.ok, new ece((Object) this, 5));
        cpVar.f(android.R.string.cancel, new ece((Object) this, 6));
        return cpVar.b();
    }

    @Override // defpackage.v, defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.af = A().getString("bundle_key_password", "");
        this.ag = (efw) new ddh((cgq) D()).q(efw.class);
    }

    @Override // defpackage.v, defpackage.ag
    public final void j(Bundle bundle) {
        super.j(bundle);
        bundle.putString("bundle_key_password", this.af);
    }
}
