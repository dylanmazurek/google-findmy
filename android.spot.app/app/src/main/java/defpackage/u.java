package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class u extends al {
    final /* synthetic */ al a;
    final /* synthetic */ v b;

    public u(v vVar, al alVar) {
        this.b = vVar;
        this.a = alVar;
    }

    @Override // defpackage.al
    public final View a(int i) {
        al alVar = this.a;
        if (alVar.b()) {
            return alVar.a(i);
        }
        Dialog dialog = this.b.d;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.al
    public final boolean b() {
        if (!this.a.b() && !this.b.e) {
            return false;
        }
        return true;
    }
}
