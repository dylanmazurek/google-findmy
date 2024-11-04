package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nx implements cfa {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        View view;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((coo) this.a).a(false);
                return;
            } else {
                if (cevVar == cev.ON_STOP && (view = ((ag) this.a).P) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            }
        }
        ((oc) this.a).n();
        ((cd) this.a).f.c(this);
    }
}
