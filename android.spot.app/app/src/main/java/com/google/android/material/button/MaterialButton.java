package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import defpackage.a;
import defpackage.bpu;
import defpackage.bsc;
import defpackage.cu;
import defpackage.hw;
import defpackage.hx;
import defpackage.hzc;
import defpackage.ipc;
import defpackage.ipd;
import defpackage.ipe;
import defpackage.ipf;
import defpackage.ipg;
import defpackage.isa;
import defpackage.ivc;
import defpackage.ivl;
import defpackage.ivw;
import defpackage.iyj;
import defpackage.na;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MaterialButton extends hx implements Checkable, ivw {
    private static final int[] c = {R.attr.state_checkable};
    private static final int[] d = {R.attr.state_checked};
    public Drawable b;
    private final ipe e;
    private final LinkedHashSet f;
    private PorterDuff.Mode g;
    private ColorStateList h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;

    public MaterialButton(Context context) {
        this(context, null);
    }

    private final void k() {
        if (o()) {
            setCompoundDrawablesRelative(this.b, null, null, null);
        } else if (n()) {
            setCompoundDrawablesRelative(null, null, this.b, null);
        } else if (p()) {
            setCompoundDrawablesRelative(null, this.b, null, null);
        }
    }

    private final void l(boolean z) {
        Drawable drawable = this.b;
        if (drawable != null) {
            Drawable mutate = bpu.i(drawable).mutate();
            this.b = mutate;
            bsc.g(mutate, this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                bsc.h(this.b, mode);
            }
            int i = this.i;
            if (i == 0) {
                i = this.b.getIntrinsicWidth();
            }
            int i2 = this.i;
            if (i2 == 0) {
                i2 = this.b.getIntrinsicHeight();
            }
            Drawable drawable2 = this.b;
            int i3 = this.j;
            int i4 = this.k;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.b.setVisible(true, z);
        }
        if (!z) {
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable drawable3 = compoundDrawablesRelative[0];
            Drawable drawable4 = compoundDrawablesRelative[1];
            Drawable drawable5 = compoundDrawablesRelative[2];
            if ((o() && drawable3 != this.b) || ((n() && drawable5 != this.b) || (p() && drawable4 != this.b))) {
                k();
                return;
            }
            return;
        }
        k();
    }

    private final void m(int i, int i2) {
        Layout.Alignment alignment;
        boolean z;
        int min;
        if (this.b != null && getLayout() != null) {
            boolean z2 = true;
            if (!o() && !n()) {
                if (p()) {
                    this.j = 0;
                    if (this.o == 16) {
                        this.k = 0;
                        l(false);
                        return;
                    }
                    int i3 = this.i;
                    if (i3 == 0) {
                        i3 = this.b.getIntrinsicHeight();
                    }
                    if (getLineCount() > 1) {
                        min = getLayout().getHeight();
                    } else {
                        TextPaint paint = getPaint();
                        String charSequence = getText().toString();
                        if (getTransformationMethod() != null) {
                            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
                        }
                        Rect rect = new Rect();
                        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                        min = Math.min(rect.height(), getLayout().getHeight());
                    }
                    int max = Math.max(0, (((((i2 - min) - getPaddingTop()) - i3) - this.l) - getPaddingBottom()) / 2);
                    if (this.k != max) {
                        this.k = max;
                        l(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.k = 0;
            int textAlignment = getTextAlignment();
            if (textAlignment != 1) {
                if (textAlignment != 6 && textAlignment != 3) {
                    if (textAlignment != 4) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                    alignment = Layout.Alignment.ALIGN_CENTER;
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                int gravity = getGravity() & 8388615;
                if (gravity != 1) {
                    if (gravity != 5 && gravity != 8388613) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    }
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            int i4 = this.o;
            if (i4 != 1 && i4 != 3 && ((i4 != 2 || alignment != Layout.Alignment.ALIGN_NORMAL) && (this.o != 4 || alignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i5 = this.i;
                if (i5 == 0) {
                    i5 = this.b.getIntrinsicWidth();
                }
                int lineCount = getLineCount();
                float f = 0.0f;
                for (int i6 = 0; i6 < lineCount; i6++) {
                    f = Math.max(f, getLayout().getLineWidth(i6));
                }
                int ceil = ((((i - ((int) Math.ceil(f))) - getPaddingEnd()) - i5) - this.l) - getPaddingStart();
                if (alignment == Layout.Alignment.ALIGN_CENTER) {
                    ceil /= 2;
                }
                if (getLayoutDirection() != 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (this.o != 4) {
                    z2 = false;
                }
                if (z != z2) {
                    ceil = -ceil;
                }
                if (this.j != ceil) {
                    this.j = ceil;
                    l(false);
                    return;
                }
                return;
            }
            this.j = 0;
            l(false);
        }
    }

    private final boolean n() {
        int i = this.o;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    private final boolean o() {
        int i = this.o;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    private final boolean p() {
        int i = this.o;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    private final boolean q() {
        ipe ipeVar = this.e;
        if (ipeVar != null && !ipeVar.n) {
            return true;
        }
        return false;
    }

    final String c() {
        Class cls;
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (true != j()) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    @Override // defpackage.ivw
    public final void cy(ivl ivlVar) {
        if (q()) {
            this.e.d(ivlVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public final void d(Drawable drawable) {
        if (this.b != drawable) {
            this.b = drawable;
            l(true);
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void e(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = cu.c(getContext(), i);
        } else {
            drawable = null;
        }
        d(drawable);
    }

    public final void f(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        na naVar;
        if (q()) {
            return this.e.j;
        }
        hw hwVar = this.a;
        if (hwVar == null || (naVar = hwVar.a) == null) {
            return null;
        }
        return naVar.a;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        na naVar;
        if (q()) {
            return this.e.i;
        }
        hw hwVar = this.a;
        if (hwVar == null || (naVar = hwVar.a) == null) {
            return null;
        }
        return naVar.b;
    }

    public final void h(ColorStateList colorStateList) {
        if (q()) {
            ipe ipeVar = this.e;
            if (ipeVar.j != colorStateList) {
                ipeVar.j = colorStateList;
                if (ipeVar.a() != null) {
                    bsc.g(ipeVar.a(), ipeVar.j);
                    return;
                }
                return;
            }
            return;
        }
        hw hwVar = this.a;
        if (hwVar != null) {
            if (hwVar.a == null) {
                hwVar.a = new na();
            }
            na naVar = hwVar.a;
            naVar.a = colorStateList;
            naVar.d = true;
            hwVar.a();
        }
    }

    public final void i(PorterDuff.Mode mode) {
        if (q()) {
            ipe ipeVar = this.e;
            if (ipeVar.i != mode) {
                ipeVar.i = mode;
                if (ipeVar.a() != null && ipeVar.i != null) {
                    bsc.h(ipeVar.a(), ipeVar.i);
                    return;
                }
                return;
            }
            return;
        }
        hw hwVar = this.a;
        if (hwVar != null) {
            if (hwVar.a == null) {
                hwVar.a = new na();
            }
            na naVar = hwVar.a;
            naVar.b = mode;
            naVar.c = true;
            hwVar.a();
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.m;
    }

    public final boolean j() {
        ipe ipeVar = this.e;
        if (ipeVar != null && ipeVar.o) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (q()) {
            ivc.c(this, this.e.a());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (j()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        if (this.m) {
            mergeDrawableStates(onCreateDrawableState, d);
        }
        return onCreateDrawableState;
    }

    @Override // defpackage.hx, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(c());
        accessibilityEvent.setChecked(this.m);
    }

    @Override // defpackage.hx, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(c());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(this.m);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hx, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ipe ipeVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (ipeVar = this.e) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = ipeVar.m;
            if (drawable != null) {
                drawable.setBounds(ipeVar.c, ipeVar.e, i6 - ipeVar.d, i5 - ipeVar.f);
            }
        }
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ipd)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ipd ipdVar = (ipd) parcelable;
        super.onRestoreInstanceState(ipdVar.d);
        setChecked(ipdVar.a);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ipd ipdVar = new ipd(super.onSaveInstanceState());
        ipdVar.a = this.m;
        return ipdVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.hx, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.e.p) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.b != null) {
            if (this.b.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (q()) {
            ipe ipeVar = this.e;
            if (ipeVar.a() != null) {
                ipeVar.a().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // defpackage.hx, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (q()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.e.c();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.hx, android.view.View
    public final void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = cu.c(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        h(colorStateList);
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        i(mode);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (j() && isEnabled() && this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (!(getParent() instanceof ipf)) {
                if (!this.n) {
                    this.n = true;
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((ipc) it.next()).a();
                    }
                    this.n = false;
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        if (q()) {
            this.e.a().K(f);
        }
    }

    @Override // android.view.View
    public final void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.m);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(iyj.a(context, attributeSet, i, 2132019089), attributeSet, i);
        this.f = new LinkedHashSet();
        this.m = false;
        this.n = false;
        Context context2 = getContext();
        TypedArray a = isa.a(context2, attributeSet, ipg.a, i, 2132019089, new int[0]);
        this.l = a.getDimensionPixelSize(12, 0);
        this.g = a.h(a.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.h = hzc.i(getContext(), a, 14);
        this.b = hzc.j(getContext(), a, 10);
        this.o = a.getInteger(11, 1);
        this.i = a.getDimensionPixelSize(13, 0);
        ipe ipeVar = new ipe(this, new ivl(ivl.c(context2, attributeSet, i, 2132019089)));
        this.e = ipeVar;
        ipeVar.c = a.getDimensionPixelOffset(1, 0);
        ipeVar.d = a.getDimensionPixelOffset(2, 0);
        ipeVar.e = a.getDimensionPixelOffset(3, 0);
        ipeVar.f = a.getDimensionPixelOffset(4, 0);
        if (a.hasValue(8)) {
            int dimensionPixelSize = a.getDimensionPixelSize(8, -1);
            ipeVar.g = dimensionPixelSize;
            ipeVar.d(ipeVar.b.e(dimensionPixelSize));
        }
        ipeVar.h = a.getDimensionPixelSize(20, 0);
        ipeVar.i = a.h(a.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        ipeVar.j = hzc.i(ipeVar.a.getContext(), a, 6);
        ipeVar.k = hzc.i(ipeVar.a.getContext(), a, 19);
        ipeVar.l = hzc.i(ipeVar.a.getContext(), a, 16);
        ipeVar.o = a.getBoolean(5, false);
        ipeVar.q = a.getDimensionPixelSize(9, 0);
        ipeVar.p = a.getBoolean(21, true);
        int paddingStart = ipeVar.a.getPaddingStart();
        int paddingTop = ipeVar.a.getPaddingTop();
        int paddingEnd = ipeVar.a.getPaddingEnd();
        int paddingBottom = ipeVar.a.getPaddingBottom();
        if (a.hasValue(0)) {
            ipeVar.c();
        } else {
            ipeVar.e();
        }
        ipeVar.a.setPaddingRelative(paddingStart + ipeVar.c, paddingTop + ipeVar.e, paddingEnd + ipeVar.d, paddingBottom + ipeVar.f);
        a.recycle();
        setCompoundDrawablePadding(this.l);
        l(this.b != null);
    }
}
