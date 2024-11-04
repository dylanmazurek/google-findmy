package defpackage;

import android.content.ContextWrapper;
import android.support.v4.app.FragmentContainerView;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class dvf implements bvj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ dvf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bvj
    public final bya a(View view, bya byaVar) {
        be a;
        View view2;
        boolean z;
        int ime;
        int i = this.b;
        aj ajVar = null;
        bya byaVar2 = null;
        boolean z2 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            iov iovVar = (iov) this.a;
                            iou iouVar = iovVar.g;
                            if (iouVar != null) {
                                iovVar.a.C(iouVar);
                            }
                            iov iovVar2 = (iov) this.a;
                            iovVar2.g = new iou(iovVar2.c, byaVar);
                            iov iovVar3 = (iov) this.a;
                            iovVar3.g.d(iovVar3.getWindow());
                            iov iovVar4 = (iov) this.a;
                            iovVar4.a.y(iovVar4.g);
                            return byaVar;
                        }
                        AppBarLayout appBarLayout = (AppBarLayout) this.a;
                        if (true == appBarLayout.getFitsSystemWindows()) {
                            byaVar2 = byaVar;
                        }
                        if (!Objects.equals(appBarLayout.c, byaVar2)) {
                            appBarLayout.c = byaVar2;
                            appBarLayout.k();
                            appBarLayout.requestLayout();
                        }
                        return byaVar;
                    }
                    int i2 = byaVar.f(1).c;
                    eur eurVar = (eur) this.a;
                    eurVar.ag = i2;
                    eurVar.a();
                    return byaVar;
                }
                Object obj = this.a;
                TransitionManager.beginDelayedTransition((ViewGroup) obj, new AutoTransition().setDuration(150L));
                ime = WindowInsets.Type.ime();
                ((View) obj).setPadding(0, 0, 0, byaVar.f(ime).e);
                return byaVar;
            }
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
            if (!Objects.equals(coordinatorLayout.e, byaVar)) {
                coordinatorLayout.e = byaVar;
                if (byaVar.d() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                coordinatorLayout.f = z;
                if (z || coordinatorLayout.getBackground() != null) {
                    z2 = false;
                }
                coordinatorLayout.setWillNotDraw(z2);
                if (!byaVar.r()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = coordinatorLayout.getChildAt(i3);
                        int[] iArr = bwn.a;
                        if (childAt.getFitsSystemWindows() && ((bos) childAt.getLayoutParams()).a != null && byaVar.r()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return byaVar;
        }
        brq f = byaVar.f(1);
        brq f2 = byaVar.f(2);
        dvg dvgVar = (dvg) this.a;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) dvgVar.K().findViewById(R.id.main_fragment);
        if (fragmentContainerView != null) {
            ag g = be.g(fragmentContainerView);
            if (g != null) {
                if (g.au()) {
                    a = g.G();
                } else {
                    throw new IllegalStateException("The Fragment " + g + " that owns View " + fragmentContainerView + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
                }
            } else {
                Object obj2 = fragmentContainerView.getContext();
                while (true) {
                    if (!(obj2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (obj2 instanceof aj) {
                        ajVar = (aj) obj2;
                        break;
                    }
                    obj2 = ((ContextWrapper) obj2).getBaseContext();
                }
                if (ajVar != null) {
                    a = ajVar.a();
                } else {
                    throw new IllegalStateException(a.af(fragmentContainerView, "View ", " is not within a subclass of FragmentActivity."));
                }
            }
            ag e = a.e(fragmentContainerView.getId());
            if (e != null && !(e instanceof exm) && (view2 = e.P) != null) {
                view2.setPadding(f2.b, f.c, f2.d, f2.e);
            }
        }
        FragmentContainerView fragmentContainerView2 = (FragmentContainerView) dvgVar.K().findViewById(R.id.container_map);
        if (fragmentContainerView2 != null) {
            fragmentContainerView2.setPadding(f2.b, 0, f2.d, f2.e);
        }
        return byaVar;
    }

    public dvf(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
