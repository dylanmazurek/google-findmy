package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import defpackage.hwx;
import defpackage.hzc;
import defpackage.inc;
import defpackage.isa;
import defpackage.isr;
import defpackage.isw;
import defpackage.isz;
import defpackage.ita;
import defpackage.itb;
import defpackage.ksr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationRailView extends isw {
    public Boolean c;
    public Boolean d;
    public Boolean e;
    private final int f;
    private final int g;
    private View h;

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private final isz f() {
        return (isz) this.a;
    }

    private final boolean g() {
        View view = this.h;
        if (view != null && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // defpackage.isw
    public final int a() {
        return 7;
    }

    @Override // defpackage.isw
    protected final /* synthetic */ isr b(Context context) {
        return new isz(context);
    }

    public final boolean e(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return getFitsSystemWindows();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        isz f = f();
        int i5 = 0;
        if (g()) {
            int bottom = this.h.getBottom() + this.g;
            int top = f.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if ((f.D.gravity & 112) == 48) {
            i5 = this.f;
        }
        if (i5 > 0) {
            f.layout(f.getLeft(), f.getTop() + i5, f.getRight(), f.getBottom() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        }
        super.onMeasure(i, i2);
        if (g()) {
            measureChild(f(), i, View.MeasureSpec.makeMeasureSpec(((getMeasuredHeight() - this.h.getMeasuredHeight()) - this.f) - this.g, Integer.MIN_VALUE));
        }
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.c = null;
        this.d = null;
        this.e = null;
        ksr e = isa.e(getContext(), attributeSet, itb.a, i, i2, new int[0]);
        int o = e.o(0, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        this.f = o;
        this.g = e.o(2, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        int s = e.s(1, 0);
        if (s != 0) {
            View inflate = LayoutInflater.from(getContext()).inflate(s, (ViewGroup) this, false);
            View view = this.h;
            if (view != null) {
                removeView(view);
            }
            this.h = inflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.topMargin = o;
            addView(inflate, 0, layoutParams);
        }
        int p = e.p(5, 49);
        isz f = f();
        if (f.D.gravity != p) {
            f.D.gravity = p;
            f.setLayoutParams(f.D);
        }
        if (e.A(3)) {
            int o2 = e.o(3, -1);
            isz iszVar = (isz) this.a;
            if (iszVar.a != o2) {
                iszVar.a = o2;
                iszVar.requestLayout();
            }
        }
        if (e.A(8)) {
            this.c = Boolean.valueOf(e.z(8, false));
        }
        if (e.A(6)) {
            this.d = Boolean.valueOf(e.z(6, false));
        }
        if (e.A(7)) {
            this.e = Boolean.valueOf(e.z(7, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float a = inc.a(0.0f, 1.0f, 0.3f, 1.0f, hzc.f(r8) - 1.0f);
        float b = inc.b(this.a.p, dimensionPixelOffset, a);
        float b2 = inc.b(this.a.q, dimensionPixelOffset2, a);
        d(Math.round(b));
        c(Math.round(b2));
        int o3 = e.o(4, 0);
        isz f2 = f();
        if (f2.C != o3) {
            f2.C = o3;
            f2.requestLayout();
        }
        e.y();
        hwx.m(this, new ita(this));
    }
}
