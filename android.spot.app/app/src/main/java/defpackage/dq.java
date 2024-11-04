package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dq extends v {
    @Override // defpackage.v
    public Dialog a(Bundle bundle) {
        return new dp(x(), this.b);
    }

    @Override // defpackage.v
    public final void p(Dialog dialog, int i) {
        if (dialog instanceof dp) {
            dp dpVar = (dp) dialog;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                } else {
                    dialog.getWindow().addFlags(24);
                }
            }
            dpVar.e();
            return;
        }
        super.p(dialog, i);
    }
}
