package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class s implements DialogInterface.OnCancelListener {
    final /* synthetic */ v a;

    public s(v vVar) {
        this.a = vVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        v vVar = this.a;
        Dialog dialog = vVar.d;
        if (dialog != null) {
            vVar.onCancel(dialog);
        }
    }
}
