package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fz implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ((ixt) this.a).d();
                                return;
                            } else {
                                ((hia) this.a).q(37);
                                ((hia) this.a).removeOnAttachStateChangeListener(this);
                                return;
                            }
                        }
                        if (((hbq) this.a).a.b.c()) {
                            hbq hbqVar = (hbq) this.a;
                            hbqVar.a(hbqVar.a.b.a());
                        }
                        ((hbq) this.a).b.removeOnAttachStateChangeListener(this);
                        return;
                    }
                    hbq hbqVar2 = (hbq) this.a;
                    hbqVar2.a.b.d(hbqVar2.d);
                    hbq hbqVar3 = (hbq) this.a;
                    hbqVar3.b.b.e(hbqVar3.c);
                    hbq hbqVar4 = (hbq) this.a;
                    jer jerVar = hbqVar4.a.h;
                    hbqVar4.c();
                    Object obj = this.a;
                    jer jerVar2 = ((hbq) obj).a.h;
                    hog.H(new gcb(obj, 16));
                    return;
                }
                return;
            }
            ((View) this.a).removeOnAttachStateChangeListener(this);
            bvz.c((View) this.a);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4 && i != 5) {
                            ((ixt) this.a).h();
                            return;
                        }
                        return;
                    }
                    hbq hbqVar = (hbq) this.a;
                    hcc hccVar = hbqVar.a;
                    jer jerVar = hccVar.h;
                    hccVar.b.e(hbqVar.d);
                    hbq hbqVar2 = (hbq) this.a;
                    hbqVar2.b.b.i(hbqVar2.c);
                    return;
                }
                ViewTreeObserver viewTreeObserver = ((gz) this.a).d;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ((gz) this.a).d = view.getViewTreeObserver();
                    }
                    gz gzVar = (gz) this.a;
                    gzVar.d.removeGlobalOnLayoutListener(gzVar.b);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver2 = ((gb) this.a).e;
        if (viewTreeObserver2 != null) {
            if (!viewTreeObserver2.isAlive()) {
                ((gb) this.a).e = view.getViewTreeObserver();
            }
            gb gbVar = (gb) this.a;
            gbVar.e.removeGlobalOnLayoutListener(gbVar.c);
        }
        view.removeOnAttachStateChangeListener(this);
    }
}
