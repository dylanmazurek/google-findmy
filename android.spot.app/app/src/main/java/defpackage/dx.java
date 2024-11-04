package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dx extends bxb {
    final /* synthetic */ ea a;

    public dx(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void a() {
        View view;
        ea eaVar = this.a;
        if (eaVar.j && (view = eaVar.e) != null) {
            view.setTranslationY(0.0f);
            this.a.c.setTranslationY(0.0f);
        }
        this.a.c.setVisibility(8);
        this.a.c.a(false);
        ea eaVar2 = this.a;
        eaVar2.l = null;
        fh fhVar = eaVar2.h;
        if (fhVar != null) {
            fhVar.a(eaVar2.g);
            eaVar2.g = null;
            eaVar2.h = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.b;
        if (actionBarOverlayLayout != null) {
            bvz.c(actionBarOverlayLayout);
        }
    }
}
