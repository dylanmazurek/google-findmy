package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.adm.R;
import defpackage.hwx;
import defpackage.iof;
import defpackage.iog;
import defpackage.ioh;
import defpackage.isa;
import defpackage.isr;
import defpackage.isw;
import defpackage.ksr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BottomNavigationView extends isw {
    public BottomNavigationView(Context context) {
        this(context, null);
    }

    @Override // defpackage.isw
    public final int a() {
        return 5;
    }

    @Override // defpackage.isw
    protected final isr b(Context context) {
        return new iof(context);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), Integer.MIN_VALUE);
        } else {
            i3 = i2;
        }
        super.onMeasure(i, i3);
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.max(getMeasuredHeight(), getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom()));
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ksr e = isa.e(getContext(), attributeSet, ioh.a, i, i2, new int[0]);
        boolean z = e.z(2, true);
        iof iofVar = (iof) this.a;
        if (iofVar.a != z) {
            iofVar.a = z;
            this.b.f(false);
        }
        if (e.A(0)) {
            setMinimumHeight(e.o(0, 0));
        }
        e.z(1, true);
        e.y();
        hwx.m(this, new iog());
    }
}
