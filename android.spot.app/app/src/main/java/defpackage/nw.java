package defpackage;

import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nw implements cfa {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        Window window;
        View peekDecorView;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (cevVar == cev.ON_DESTROY) {
                            lrv lrvVar = (lrv) this.a;
                            lrvVar.a = null;
                            lrvVar.b = null;
                            lrvVar.c = null;
                            return;
                        }
                        return;
                    }
                    Object obj = this.a;
                    if (cevVar == cev.ON_START) {
                        ((cjy) obj).e = true;
                        return;
                    } else {
                        if (cevVar == cev.ON_STOP) {
                            ((cjy) obj).e = false;
                            return;
                        }
                        return;
                    }
                }
                if (cevVar == cev.ON_DESTROY) {
                    ((bah) this.a).b();
                    return;
                }
                return;
            }
            if (cevVar == cev.ON_STOP && (window = ((oc) this.a).getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                peekDecorView.cancelPendingInputEvents();
                return;
            }
            return;
        }
        if (cevVar == cev.ON_DESTROY) {
            oc ocVar = (oc) this.a;
            ocVar.g.b = null;
            if (!ocVar.isChangingConfigurations()) {
                ocVar.aE().p();
            }
            nz nzVar = ocVar.n;
            nzVar.b.getWindow().getDecorView().removeCallbacks(nzVar);
            nzVar.b.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nzVar);
        }
    }

    public nw(lrv lrvVar, int i) {
        this.b = i;
        this.a = lrvVar;
    }
}
