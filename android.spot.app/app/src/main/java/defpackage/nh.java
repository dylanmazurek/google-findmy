package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nh implements View.OnClickListener {
    final fv a;
    final /* synthetic */ nj b;

    public nh(nj njVar) {
        this.b = njVar;
        this.a = new fv(njVar.a.getContext(), njVar.c);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        nj njVar = this.b;
        Window.Callback callback = njVar.d;
        if (callback != null && njVar.e) {
            callback.onMenuItemSelected(0, this.a);
        }
    }
}
