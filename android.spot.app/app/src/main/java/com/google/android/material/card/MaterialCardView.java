package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import defpackage.bpu;
import defpackage.bsc;
import defpackage.hzc;
import defpackage.ipi;
import defpackage.ipj;
import defpackage.iqg;
import defpackage.isa;
import defpackage.iuv;
import defpackage.ivc;
import defpackage.ivf;
import defpackage.ivl;
import defpackage.ivw;
import defpackage.iyj;
import defpackage.ro;
import defpackage.rp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialCardView extends ro implements Checkable, ivw {
    private static final int[] g = {R.attr.state_checkable};
    private static final int[] h = {R.attr.state_checked};
    public final ipi i;
    public boolean j;
    private boolean k;

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ivw
    public final void cy(ivl ivlVar) {
        RectF rectF = new RectF();
        rectF.set(this.i.d.getBounds());
        setClipToOutline(ivlVar.g(rectF));
        this.i.g(ivlVar);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.j;
    }

    public final void j(int i) {
        this.i.e(ColorStateList.valueOf(i));
    }

    public final void k(float f) {
        rp rpVar = (rp) this.f.a;
        if (f != rpVar.a) {
            rpVar.a = f;
            rpVar.a(null);
            rpVar.invalidateSelf();
        }
        ipi ipiVar = this.i;
        ipiVar.g(ipiVar.n.e(f));
        ipiVar.j.invalidateSelf();
        if (ipiVar.m() || ipiVar.l()) {
            ipiVar.i();
        }
        if (ipiVar.m()) {
            if (!ipiVar.s) {
                super.setBackgroundDrawable(ipiVar.d(ipiVar.d));
            }
            ipiVar.b.setForeground(ipiVar.d(ipiVar.j));
        }
    }

    public final boolean l() {
        ipi ipiVar = this.i;
        if (ipiVar != null && ipiVar.t) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i.h();
        ivc.c(this, this.i.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (l()) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        if (this.j) {
            mergeDrawableStates(onCreateDrawableState, h);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.j);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(l());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.j);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ipi ipiVar = this.i;
        if (ipiVar.q != null) {
            if (ipiVar.b.a) {
                float b = ipiVar.b();
                i3 = (int) Math.ceil(b + b);
                float a = ipiVar.a();
                i4 = (int) Math.ceil(a + a);
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (ipiVar.k()) {
                i5 = ((measuredWidth - ipiVar.f) - ipiVar.g) - i4;
            } else {
                i5 = ipiVar.f;
            }
            if (ipiVar.j()) {
                i6 = ipiVar.f;
            } else {
                i6 = ((measuredHeight - ipiVar.f) - ipiVar.g) - i3;
            }
            int i11 = i6;
            if (ipiVar.k()) {
                i7 = ipiVar.f;
            } else {
                i7 = ((measuredWidth - ipiVar.f) - ipiVar.g) - i4;
            }
            if (ipiVar.j()) {
                i8 = ((measuredHeight - ipiVar.f) - ipiVar.g) - i3;
            } else {
                i8 = ipiVar.f;
            }
            int i12 = i8;
            int layoutDirection = ipiVar.b.getLayoutDirection();
            if (layoutDirection == 1) {
                i9 = i5;
            } else {
                i9 = i7;
            }
            if (layoutDirection != 1) {
                i10 = i5;
            } else {
                i10 = i7;
            }
            ipiVar.q.setLayerInset(2, i10, i12, i9, i11);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            ipi ipiVar = this.i;
            if (!ipiVar.s) {
                ipiVar.s = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.j != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        ipi ipiVar = this.i;
        if (ipiVar != null) {
            ipiVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ipi ipiVar;
        Drawable drawable;
        if (l() && isEnabled()) {
            this.j = !this.j;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26 && (drawable = (ipiVar = this.i).p) != null) {
                Rect bounds = drawable.getBounds();
                int i = bounds.bottom;
                ipiVar.p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
                ipiVar.p.setBounds(bounds.left, bounds.top, bounds.right, i);
            }
            this.i.f(this.j, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, com.google.android.apps.adm.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.j = false;
        this.k = true;
        TypedArray a = isa.a(getContext(), attributeSet, ipj.b, i, com.google.android.apps.adm.R.style.Widget_MaterialComponents_CardView, new int[0]);
        ipi ipiVar = new ipi(this, attributeSet, i);
        this.i = ipiVar;
        ipiVar.e(((rp) this.f.a).e);
        ipiVar.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        ipiVar.i();
        ipiVar.o = hzc.i(ipiVar.b.getContext(), a, 11);
        if (ipiVar.o == null) {
            ipiVar.o = ColorStateList.valueOf(-1);
        }
        ipiVar.i = a.getDimensionPixelSize(12, 0);
        boolean z = a.getBoolean(0, false);
        ipiVar.t = z;
        ipiVar.b.setLongClickable(z);
        ipiVar.m = hzc.i(ipiVar.b.getContext(), a, 6);
        Drawable j = hzc.j(ipiVar.b.getContext(), a, 2);
        if (j != null) {
            ipiVar.k = bpu.i(j).mutate();
            bsc.g(ipiVar.k, ipiVar.m);
            ipiVar.f(ipiVar.b.j, false);
        } else {
            ipiVar.k = ipi.a;
        }
        LayerDrawable layerDrawable = ipiVar.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.apps.adm.R.id.mtrl_card_checked_layer_id, ipiVar.k);
        }
        ipiVar.g = a.getDimensionPixelSize(5, 0);
        ipiVar.f = a.getDimensionPixelSize(4, 0);
        ipiVar.h = a.getInteger(3, 8388661);
        ipiVar.l = hzc.i(ipiVar.b.getContext(), a, 7);
        if (ipiVar.l == null) {
            ipiVar.l = ColorStateList.valueOf(iqg.c(ipiVar.b, com.google.android.apps.adm.R.attr.colorControlHighlight));
        }
        ColorStateList i2 = hzc.i(ipiVar.b.getContext(), a, 1);
        ipiVar.e.L(i2 == null ? ColorStateList.valueOf(0) : i2);
        int i3 = iuv.b;
        Drawable drawable = ipiVar.p;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(ipiVar.l);
        } else {
            ivf ivfVar = ipiVar.r;
        }
        ipiVar.d.K(ipiVar.b.f.b.getElevation());
        ipiVar.e.Q(ipiVar.i, ipiVar.o);
        super.setBackgroundDrawable(ipiVar.d(ipiVar.d));
        ipiVar.j = ipiVar.n() ? ipiVar.c() : ipiVar.e;
        ipiVar.b.setForeground(ipiVar.d(ipiVar.j));
        a.recycle();
    }
}
