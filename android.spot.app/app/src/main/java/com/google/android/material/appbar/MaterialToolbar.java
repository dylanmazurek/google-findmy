package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import defpackage.bpu;
import defpackage.bsc;
import defpackage.bwb;
import defpackage.gh;
import defpackage.inr;
import defpackage.iqh;
import defpackage.isa;
import defpackage.isb;
import defpackage.ivc;
import defpackage.ivf;
import defpackage.iyj;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    private static final ImageView.ScaleType[] D = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private Integer E;
    private boolean F;
    private boolean G;
    private ImageView.ScaleType H;
    private Boolean I;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    private final void A(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth() / 2;
        int measuredWidth2 = view.getMeasuredWidth();
        int i = measuredWidth - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.support.v7.widget.Toolbar
    public final void m(int i) {
        Menu f = f();
        boolean z = f instanceof gh;
        if (z) {
            ((gh) f).s();
        }
        super.m(i);
        if (z) {
            ((gh) f).r();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ivc.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        Drawable drawable;
        ImageView imageView;
        Drawable drawable2;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.F || this.G) {
            List a = isb.a(this, this.s);
            if (a.isEmpty()) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(a, isb.a);
            }
            List a2 = isb.a(this, this.t);
            if (a2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(a2, isb.a);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.F && textView != null) {
                    A(textView, pair);
                }
                if (this.G && textView2 != null) {
                    A(textView2, pair);
                }
            }
        }
        ImageView imageView3 = this.d;
        if (imageView3 != null) {
            drawable = imageView3.getDrawable();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.I;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.H;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void p(Drawable drawable) {
        if (drawable != null && this.E != null) {
            drawable = bpu.i(drawable.mutate());
            bsc.f(drawable, this.E.intValue());
        }
        super.p(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ivc.a(this, f);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, 2132019189), attributeSet, i);
        ColorStateList b;
        Context context2 = getContext();
        TypedArray a = isa.a(context2, attributeSet, inr.e, i, 2132019189, new int[0]);
        if (a.hasValue(2)) {
            this.E = Integer.valueOf(a.getColor(2, -1));
            Drawable e = e();
            if (e != null) {
                p(e);
            }
        }
        this.F = a.getBoolean(4, false);
        this.G = a.getBoolean(3, false);
        int i2 = a.getInt(1, -1);
        if (i2 >= 0 && i2 < 8) {
            this.H = D[i2];
        }
        if (a.hasValue(0)) {
            this.I = Boolean.valueOf(a.getBoolean(0, false));
        }
        a.recycle();
        Drawable background = getBackground();
        if (background == null) {
            b = ColorStateList.valueOf(0);
        } else {
            b = iqh.b(background);
        }
        if (b != null) {
            ivf ivfVar = new ivf();
            ivfVar.L(b);
            ivfVar.I(context2);
            ivfVar.K(bwb.a(this));
            setBackground(ivfVar);
        }
    }
}
