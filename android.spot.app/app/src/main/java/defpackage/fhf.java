package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhf extends v {
    public Dialog af;
    public DialogInterface.OnCancelListener ag;
    private Dialog ah;

    @Override // defpackage.v
    public final Dialog a(Bundle bundle) {
        Dialog dialog = this.af;
        if (dialog == null) {
            this.c = false;
            if (this.ah == null) {
                Context x = x();
                fma.aR(x);
                this.ah = new AlertDialog.Builder(x).create();
            }
            return this.ah;
        }
        return dialog;
    }

    @Override // defpackage.v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ag;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
