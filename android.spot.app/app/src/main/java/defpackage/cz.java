package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cz extends bxb {
    final /* synthetic */ dn a;

    public cz(dn dnVar) {
        this.a = dnVar;
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void a() {
        this.a.r.setAlpha(1.0f);
        this.a.M.i(null);
        this.a.M = null;
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void b() {
        this.a.r.setVisibility(0);
        if (this.a.r.getParent() instanceof View) {
            bvz.c((View) this.a.r.getParent());
        }
    }
}
