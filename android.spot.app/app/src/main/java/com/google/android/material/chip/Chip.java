package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.bym;
import defpackage.byn;
import defpackage.hy;
import defpackage.ipt;
import defpackage.ipu;
import defpackage.iro;
import defpackage.ius;
import defpackage.iut;
import defpackage.iuv;
import defpackage.ivc;
import defpackage.ivl;
import defpackage.ivw;
import defpackage.njz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Chip extends hy implements ipt, ivw, iro {
    private static final int b = 2132019103;
    public ipu e;
    public CompoundButton.OnCheckedChangeListener f;
    public boolean g;
    public final Rect h;
    public njz i;
    private InsetDrawable k;
    private RippleDrawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private final RectF s;
    private final iut t;
    public static final Rect d = new Rect();
    private static final int[] c = {R.attr.state_selected};
    private static final int[] j = {R.attr.state_checkable};

    public Chip(Context context) {
        this(context, null);
    }

    private final void e() {
        float f;
        if (this.k != null) {
            this.k = null;
            setMinWidth(0);
            ipu ipuVar = this.e;
            if (ipuVar != null) {
                f = ipuVar.a;
            } else {
                f = 0.0f;
            }
            setMinHeight((int) f);
            int i = iuv.b;
            o();
        }
    }

    private final void m(boolean z) {
        if (this.o != z) {
            this.o = z;
            refreshDrawableState();
        }
    }

    private final void n(boolean z) {
        if (this.n != z) {
            this.n = z;
            refreshDrawableState();
        }
    }

    private final void o() {
        this.l = new RippleDrawable(iuv.b(this.e.b), d(), null);
        boolean z = this.e.l;
        setBackground(this.l);
        p();
    }

    private final void p() {
        ipu ipuVar;
        if (!TextUtils.isEmpty(getText()) && (ipuVar = this.e) != null) {
            float b2 = ipuVar.j + ipuVar.i + ipuVar.b();
            int a = (int) (ipuVar.g + ipuVar.h + ipuVar.a());
            int i = (int) b2;
            if (this.k != null) {
                Rect rect = new Rect();
                this.k.getPadding(rect);
                a += rect.left;
                i += rect.right;
            }
            setPaddingRelative(a, getPaddingTop(), i, getPaddingBottom());
        }
    }

    private final void q() {
        ius iusVar;
        TextPaint paint = getPaint();
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            paint.drawableState = ipuVar.getState();
        }
        ipu ipuVar2 = this.e;
        if (ipuVar2 != null) {
            iusVar = ipuVar2.h();
        } else {
            iusVar = null;
        }
        if (iusVar != null) {
            iusVar.c(getContext(), paint, this.t);
        }
    }

    public final RectF c() {
        this.s.setEmpty();
        j();
        return this.s;
    }

    @Override // defpackage.ivw
    public final void cy(ivl ivlVar) {
        this.e.cy(ivlVar);
    }

    public final Drawable d() {
        InsetDrawable insetDrawable = this.k;
        if (insetDrawable == null) {
            return this.e;
        }
        return insetDrawable;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    @Override // defpackage.hy, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ipu ipuVar = this.e;
        if (ipuVar != null && ipu.r(ipuVar.e)) {
            ipu ipuVar2 = this.e;
            ?? isEnabled = isEnabled();
            int i = isEnabled;
            if (this.g) {
                i = isEnabled + 1;
            }
            int i2 = i;
            if (this.o) {
                i2 = i + 1;
            }
            int i3 = i2;
            if (this.n) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (isChecked()) {
                i4 = i3 + 1;
            }
            int[] iArr = new int[i4];
            int i5 = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i5 = 1;
            }
            if (this.g) {
                iArr[i5] = 16842908;
                i5++;
            }
            if (this.o) {
                iArr[i5] = 16843623;
                i5++;
            }
            if (this.n) {
                iArr[i5] = 16842919;
                i5++;
            }
            if (isChecked()) {
                iArr[i5] = 16842913;
            }
            if (ipuVar2.s(iArr)) {
                invalidate();
            }
        }
    }

    @Override // defpackage.ipt
    public final void f() {
        i(this.r);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        if (h()) {
            ViewParent parent = getParent();
            if ((parent instanceof ChipGroup) && ((ChipGroup) parent).b()) {
                return "android.widget.RadioButton";
            }
            return "android.widget.Button";
        }
        if (!isClickable()) {
            return "android.view.View";
        }
        return "android.widget.Button";
    }

    @Override // android.widget.TextView
    public final TextUtils.TruncateAt getEllipsize() {
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            return ipuVar.m;
        }
        return null;
    }

    public final boolean h() {
        ipu ipuVar = this.e;
        if (ipuVar != null && ipuVar.f) {
            return true;
        }
        return false;
    }

    public final void i(int i) {
        int i2;
        int i3;
        this.r = i;
        if (!this.p) {
            if (this.k != null) {
                e();
                return;
            } else {
                int i4 = iuv.b;
                o();
                return;
            }
        }
        int max = Math.max(0, i - this.e.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.k != null) {
                e();
                return;
            } else {
                int i5 = iuv.b;
                o();
                return;
            }
        }
        if (max2 > 0) {
            i2 = max2 >> 1;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max >> 1;
        } else {
            i3 = 0;
        }
        if (this.k != null) {
            Rect rect = new Rect();
            this.k.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                int i6 = iuv.b;
                o();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.k = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        int i7 = iuv.b;
        o();
    }

    public final void j() {
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            ipuVar.d();
        }
    }

    public final void k() {
        playSoundEffect(0);
    }

    @Override // defpackage.iro
    public final void l(njz njzVar) {
        this.i = njzVar;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ivc.c(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, c);
        }
        if (h()) {
            mergeDrawableStates(onCreateDrawableState, j);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                m(false);
            }
        } else {
            m(c().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(h());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            byn bynVar = new byn(accessibilityNodeInfo);
            int i2 = -1;
            if (chipGroup.d) {
                i = 0;
                for (int i3 = 0; i3 < chipGroup.getChildCount(); i3++) {
                    View childAt = chipGroup.getChildAt(i3);
                    if ((childAt instanceof Chip) && chipGroup.a(i3)) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(com.google.android.apps.adm.R.id.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            bynVar.w(bym.a(i2, 1, i, 1, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        PointerIcon systemIcon;
        if (!c().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
        return systemIcon;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.q != i) {
            this.q = i;
            p();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:            if (r0 != false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:            if (r0 != 3) goto L24;     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[RETURN] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.c()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3b
            if (r0 == r3) goto L2d
            r4 = 2
            if (r0 == r4) goto L23
            r1 = 3
            if (r0 == r1) goto L21
            goto L41
        L21:
            r0 = 0
            goto L35
        L23:
            boolean r0 = r5.n
            if (r0 == 0) goto L41
            if (r1 != 0) goto L47
            r5.n(r2)
            return r3
        L2d:
            boolean r0 = r5.n
            if (r0 == 0) goto L21
            r5.k()
            r0 = 1
        L35:
            r5.n(r2)
            if (r0 != 0) goto L47
            goto L41
        L3b:
            if (r1 == 0) goto L41
            r5.n(r3)
            goto L47
        L41:
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L48
        L47:
            return r3
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (drawable != d() && drawable != this.l) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.hy, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != d() && drawable != this.l) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.hy, android.view.View
    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        ipu ipuVar = this.e;
        if (ipuVar == null) {
            this.m = z;
        } else if (ipuVar.f) {
            super.setChecked(z);
        }
    }

    @Override // defpackage.hy, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(null, drawable2, null, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // defpackage.hy, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            ipuVar.K(f);
        }
    }

    @Override // android.widget.TextView
    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                ipu ipuVar = this.e;
                if (ipuVar != null) {
                    ipuVar.m = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    @Override // android.widget.TextView
    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public final void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            ipuVar.o = i;
        }
    }

    @Override // android.widget.TextView
    public final void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f = onCheckedChangeListener;
    }

    @Override // android.widget.TextView
    public final void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(true);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (true != ipuVar.n) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            ipu ipuVar2 = this.e;
            if (ipuVar2 != null) {
                ipuVar2.o(charSequence);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            ipuVar.q(i);
        }
        q();
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            ius h = ipuVar.h();
            if (h != null) {
                h.k = applyDimension;
                ipuVar.k.a.setTextSize(applyDimension);
                ipuVar.e();
            }
        }
        q();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.chipStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ipu ipuVar = this.e;
        if (ipuVar != null) {
            ipuVar.q(i);
        }
        q();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }
}
