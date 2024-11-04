package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class inj extends buk {
    final /* synthetic */ AppBarLayout a;
    final /* synthetic */ CoordinatorLayout b;
    final /* synthetic */ AppBarLayout.BaseBehavior c;

    public inj(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, CoordinatorLayout coordinatorLayout) {
        this.a = appBarLayout;
        this.b = coordinatorLayout;
        this.c = baseBehavior;
    }

    @Override // defpackage.buk
    public final void c(View view, byn bynVar) {
        View C;
        super.c(view, bynVar);
        bynVar.t(ScrollView.class.getName());
        if (this.a.f() != 0 && (C = AppBarLayout.BaseBehavior.C(this.b)) != null) {
            AppBarLayout appBarLayout = this.a;
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((inl) appBarLayout.getChildAt(i).getLayoutParams()).a != 0) {
                    if (this.c.w() != (-this.a.f())) {
                        bynVar.j(byi.d);
                        bynVar.P(true);
                    }
                    if (this.c.w() != 0) {
                        if (C.canScrollVertically(-1)) {
                            if ((-this.a.b()) != 0) {
                                bynVar.j(byi.e);
                                bynVar.P(true);
                                return;
                            }
                            return;
                        }
                        bynVar.j(byi.e);
                        bynVar.P(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // defpackage.buk
    public final boolean i(View view, int i, Bundle bundle) {
        if (i == 4096) {
            this.a.i(false);
            return true;
        }
        if (i == 8192) {
            if (this.c.w() != 0) {
                View C = AppBarLayout.BaseBehavior.C(this.b);
                if (C.canScrollVertically(-1)) {
                    int i2 = -this.a.b();
                    if (i2 != 0) {
                        this.c.D(this.b, this.a, C, i2, new int[]{0, 0});
                        return true;
                    }
                } else {
                    this.a.i(true);
                    return true;
                }
            }
            return false;
        }
        return super.i(view, i, bundle);
    }
}
