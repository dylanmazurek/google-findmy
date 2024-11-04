package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.adm.R;
import defpackage.hzc;
import defpackage.iqf;
import defpackage.isa;
import defpackage.ivf;
import defpackage.iyj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialDivider extends View {
    private final ivf a;
    private int b;
    private int c;
    private int d;
    private int e;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int i;
        int width;
        int i2;
        super.onDraw(canvas);
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        if (z) {
            i = this.e;
        } else {
            i = this.d;
        }
        if (z) {
            width = getWidth();
            i2 = this.d;
        } else {
            width = getWidth();
            i2 = this.e;
        }
        this.a.setBounds(i, 0, width - i2, getBottom() - getTop());
        this.a.draw(canvas);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i3 = this.b;
        if (i3 > 0 && measuredHeight != i3) {
            measuredHeight = i3;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, i);
        Context context2 = getContext();
        ivf ivfVar = new ivf();
        this.a = ivfVar;
        TypedArray a = isa.a(context2, attributeSet, iqf.a, i, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.b = a.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.d = a.getDimensionPixelOffset(2, 0);
        this.e = a.getDimensionPixelOffset(1, 0);
        int defaultColor = hzc.i(context2, a, 0).getDefaultColor();
        if (this.c != defaultColor) {
            this.c = defaultColor;
            ivfVar.L(ColorStateList.valueOf(defaultColor));
            invalidate();
        }
        a.recycle();
    }
}
