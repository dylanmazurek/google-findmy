package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class t implements DialogInterface.OnDismissListener {
    final /* synthetic */ v a;

    public t(v vVar) {
        this.a = vVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        v vVar = this.a;
        Dialog dialog = vVar.d;
        if (dialog != null) {
            vVar.onDismiss(dialog);
        }
    }
}
