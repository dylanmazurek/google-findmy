package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.adm.R;
import defpackage.bop;
import defpackage.hwx;
import defpackage.hzc;
import defpackage.inc;
import defpackage.ioa;
import defpackage.iob;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends bop {
    public ViewPropertyAnimator a;
    private final LinkedHashSet b;
    private int c;
    private int d;
    private TimeInterpolator e;
    private TimeInterpolator f;
    private int g;
    private int h;

    public HideBottomViewOnScrollBehavior() {
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }

    private final void u(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new ioa(this));
    }

    private final void v(int i) {
        this.h = i;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((iob) it.next()).a();
        }
    }

    @Override // defpackage.bop
    public final boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.g = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.c = hzc.n(view.getContext(), R.attr.motionDurationLong2, 225);
        this.d = hzc.n(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.e = hwx.h(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, inc.d);
        this.f = hwx.h(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, inc.c);
        return false;
    }

    @Override // defpackage.bop
    public final void n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.h != 1) {
                ViewPropertyAnimator viewPropertyAnimator = this.a;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                v(1);
                u(view, this.g, this.d, this.f);
                return;
            }
            return;
        }
        if (i < 0 && this.h != 2) {
            ViewPropertyAnimator viewPropertyAnimator2 = this.a;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            v(2);
            u(view, 0, this.c, this.e);
        }
    }

    @Override // defpackage.bop
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new LinkedHashSet();
        this.g = 0;
        this.h = 2;
    }
}
