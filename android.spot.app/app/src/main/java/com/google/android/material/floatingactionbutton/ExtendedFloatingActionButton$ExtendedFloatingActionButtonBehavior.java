package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.bop;
import defpackage.bos;
import defpackage.iqp;
import defpackage.ird;
import defpackage.irl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends bop {
    private Rect a;
    private final boolean b;
    private final boolean c;

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
        this.b = false;
        this.c = true;
    }

    private static boolean u(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof bos) {
            return ((bos) layoutParams).a instanceof BottomSheetBehavior;
        }
        return false;
    }

    private final boolean v(View view, iqp iqpVar) {
        bos bosVar = (bos) iqpVar.getLayoutParams();
        if ((!this.b && !this.c) || bosVar.f != view.getId()) {
            return false;
        }
        return true;
    }

    private final void w(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, iqp iqpVar) {
        if (!v(appBarLayout, iqpVar)) {
            return;
        }
        if (this.a == null) {
            this.a = new Rect();
        }
        Rect rect = this.a;
        irl.a(coordinatorLayout, appBarLayout, rect);
        if (rect.bottom <= appBarLayout.d()) {
            int i = iqp.c;
            throw null;
        }
        int i2 = iqp.c;
        throw null;
    }

    private final void x(View view, iqp iqpVar) {
        if (!v(view, iqpVar)) {
            return;
        }
        if (view.getTop() < (iqpVar.getHeight() / 2) + ((bos) iqpVar.getLayoutParams()).topMargin) {
            throw null;
        }
        throw null;
    }

    @Override // defpackage.bop
    public final void a(bos bosVar) {
        if (bosVar.h == 0) {
            bosVar.h = 80;
        }
    }

    @Override // defpackage.bop
    public final /* bridge */ /* synthetic */ boolean e(CoordinatorLayout coordinatorLayout, View view, int i) {
        iqp iqpVar = (iqp) view;
        List a = coordinatorLayout.a(iqpVar);
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) a.get(i2);
            if (view2 instanceof AppBarLayout) {
                w(coordinatorLayout, (AppBarLayout) view2, iqpVar);
            } else if (u(view2)) {
                x(view2, iqpVar);
            }
        }
        coordinatorLayout.j(iqpVar, i);
        return true;
    }

    @Override // defpackage.bop
    public final /* bridge */ /* synthetic */ void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        iqp iqpVar = (iqp) view;
        if (view2 instanceof AppBarLayout) {
            w(coordinatorLayout, (AppBarLayout) view2, iqpVar);
        } else if (u(view2)) {
            x(view2, iqpVar);
        }
    }

    @Override // defpackage.bop
    public final /* bridge */ /* synthetic */ boolean r(View view, Rect rect) {
        return false;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ird.a);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.c = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
