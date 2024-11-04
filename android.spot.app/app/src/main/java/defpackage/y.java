package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class y extends ae {
    final /* synthetic */ ag a;

    public y(ag agVar) {
        this.a = agVar;
    }

    @Override // defpackage.ae
    public final void a() {
        Bundle bundle;
        this.a.ae.d();
        cge.c(this.a);
        Bundle bundle2 = this.a.h;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        this.a.ae.e(bundle);
    }
}
