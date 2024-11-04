package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class z extends al {
    final /* synthetic */ ag a;

    public z(ag agVar) {
        this.a = agVar;
    }

    @Override // defpackage.al
    public final View a(int i) {
        View view = this.a.P;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this.a + " does not have a view");
    }

    @Override // defpackage.al
    public final boolean b() {
        if (this.a.P != null) {
            return true;
        }
        return false;
    }
}
