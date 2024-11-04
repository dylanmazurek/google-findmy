package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.BaselineLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class isp extends FrameLayout implements gu {
    private final TextView A;
    private int B;
    private ColorStateList C;
    private Drawable D;
    private Drawable E;
    private ValueAnimator F;
    private boolean G;
    private int H;
    private int I;
    private hwx L;
    public boolean a;
    Drawable b;
    public final LinearLayout c;
    public final View d;
    public final ImageView e;
    public gj f;
    public float g;
    public int h;
    public boolean i;
    public int j;
    public inv k;
    public int l;
    private ColorStateList n;
    private int o;
    private int p;
    private int q;
    private float r;
    private float s;
    private float t;
    private int u;
    private boolean v;
    private final LinearLayout w;
    private final FrameLayout x;
    private final BaselineLayout y;
    private final TextView z;
    private static final int[] m = {R.attr.state_checked};
    private static final hwx J = new hwx();
    private static final hwx K = new iso();

    public isp(Context context) {
        super(context);
        this.a = false;
        this.B = 0;
        this.L = J;
        this.g = 0.0f;
        this.G = false;
        this.h = 0;
        this.H = 0;
        this.i = false;
        this.j = 0;
        this.I = 0;
        LayoutInflater.from(context).inflate(c(), (ViewGroup) this, true);
        this.w = (LinearLayout) findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_inner_content_container);
        this.c = linearLayout;
        this.d = findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_active_indicator_view);
        this.x = (FrameLayout) findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_icon_container);
        this.e = (ImageView) findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_labels_group);
        this.y = baselineLayout;
        TextView textView = (TextView) findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_small_label_view);
        this.z = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.apps.adm.R.id.navigation_bar_item_large_label_view);
        this.A = textView2;
        setBackgroundResource(com.google.android.apps.adm.R.drawable.mtrl_navigation_bar_item_background);
        this.o = getResources().getDimensionPixelSize(b());
        this.p = baselineLayout.getPaddingBottom();
        this.q = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        G(textView.getTextSize(), textView2.getTextSize());
        linearLayout.addOnLayoutChangeListener(new ecu(this, 4));
    }

    private final void G(float f, float f2) {
        this.r = f - f2;
        this.s = f2 / f;
        this.t = f / f2;
    }

    private final void H() {
        gj gjVar = this.f;
        if (gjVar != null) {
            o(gjVar.isChecked());
        }
    }

    private final void I() {
        Drawable drawable = this.b;
        boolean z = true;
        RippleDrawable rippleDrawable = null;
        if (this.n != null) {
            Drawable d = d();
            if (this.G && d() != null && d != null) {
                rippleDrawable = new RippleDrawable(iuv.b(this.n), null, d);
                z = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(iuv.a(this.n), null, null);
            }
        }
        this.x.setPadding(0, 0, 0, 0);
        this.x.setForeground(rippleDrawable);
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    private final void J(View view, View view2, float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4 = this.l;
        if (i4 == 0) {
            i = (int) (this.o + f2);
        } else {
            i = 0;
        }
        LinearLayout linearLayout = this.w;
        if (i4 == 0) {
            i2 = 49;
        } else {
            i2 = 17;
        }
        M(linearLayout, i, 0, i2);
        BaselineLayout baselineLayout = this.y;
        if (this.l == 0) {
            i3 = this.p;
        } else {
            i3 = 0;
        }
        O(baselineLayout, i3);
        this.y.setVisibility(0);
        N(view, 1.0f, 1.0f, 0);
        N(view2, f, f, 4);
    }

    private final void K() {
        LinearLayout linearLayout = this.w;
        int i = this.o;
        M(linearLayout, i, i, 17);
        O(this.y, 0);
        this.y.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void L(android.widget.TextView r4, int r5) {
        /*
            defpackage.brh.j(r4, r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = 0
            goto L4d
        Lc:
            int[] r2 = defpackage.iup.b
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r5.getValue(r1, r2)
            r5.recycle()
            if (r3 != 0) goto L21
            goto La
        L21:
            int r5 = defpackage.hzc.g(r2)
            r3 = 2
            if (r5 != r3) goto L3f
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4d
        L3f:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4d:
            if (r5 == 0) goto L53
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isp.L(android.widget.TextView, int):void");
    }

    private static void M(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private static void N(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private static void O(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private final boolean P() {
        if (this.i && this.u == 2) {
            return true;
        }
        return false;
    }

    public final void A(boolean z) {
        z(this.B);
        TextView textView = this.A;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    public final void B(int i) {
        L(this.z, i);
        G(this.z.getTextSize(), this.A.getTextSize());
        this.z.setMinimumHeight(hzc.m(this.z.getContext(), i));
    }

    public final void C(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.z.setTextColor(colorStateList);
            this.A.setTextColor(colorStateList);
        }
    }

    public final void D(View view) {
        if (!F()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            inv invVar = this.k;
            if (invVar != null) {
                if (invVar.c() != null) {
                    invVar.c().setForeground(null);
                } else {
                    view.getOverlay().remove(invVar);
                }
            }
        }
        this.k = null;
    }

    public final void E(int i) {
        if (i <= 0) {
            return;
        }
        int i2 = this.h;
        int i3 = this.j;
        int min = Math.min(i2, i - (i3 + i3));
        int i4 = this.H;
        if (this.l == 1) {
            min = Math.max(this.w.getMeasuredWidth(), min);
            i4 = getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.m3_expressive_horizontal_item_active_indicator_height);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        if (true == P()) {
            i4 = min;
        }
        layoutParams.height = i4;
        layoutParams.width = min;
        this.d.setLayoutParams(layoutParams);
    }

    public final boolean F() {
        if (this.k != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gu
    public final gj a() {
        return this.f;
    }

    protected int b() {
        throw null;
    }

    protected abstract int c();

    public final Drawable d() {
        return this.d.getBackground();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.G) {
            this.x.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.gu
    public final boolean e() {
        return false;
    }

    @Override // defpackage.gu
    public final void f(gj gjVar) {
        CharSequence charSequence;
        int i;
        this.f = gjVar;
        gjVar.isCheckable();
        refreshDrawableState();
        o(gjVar.isChecked());
        setEnabled(gjVar.isEnabled());
        Drawable icon = gjVar.getIcon();
        if (icon != this.D) {
            this.D = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = bpu.i(icon).mutate();
                this.E = icon;
                ColorStateList colorStateList = this.C;
                if (colorStateList != null) {
                    bsc.g(icon, colorStateList);
                }
            }
            this.e.setImageDrawable(icon);
        }
        CharSequence charSequence2 = gjVar.d;
        this.z.setText(charSequence2);
        this.A.setText(charSequence2);
        gj gjVar2 = this.f;
        if (gjVar2 == null || TextUtils.isEmpty(gjVar2.l)) {
            setContentDescription(charSequence2);
        }
        gj gjVar3 = this.f;
        if (gjVar3 != null && !TextUtils.isEmpty(gjVar3.m)) {
            charSequence2 = this.f.m;
        }
        if (Build.VERSION.SDK_INT > 23) {
            in.b(this, charSequence2);
        }
        setId(gjVar.a);
        if (!TextUtils.isEmpty(gjVar.l)) {
            setContentDescription(gjVar.l);
        }
        if (!TextUtils.isEmpty(gjVar.m)) {
            charSequence = gjVar.m;
        } else {
            charSequence = gjVar.d;
        }
        if (Build.VERSION.SDK_INT > 23) {
            in.b(this, charSequence);
        }
        if (true != gjVar.isVisible()) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
        this.a = true;
    }

    public final void g(Drawable drawable) {
        this.d.setBackground(drawable);
        I();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.w.getLayoutParams();
        return this.w.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        int minimumWidth;
        if (this.l == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            return this.c.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.y.getLayoutParams();
        int measuredWidth = layoutParams2.leftMargin + this.y.getMeasuredWidth() + layoutParams2.rightMargin;
        inv invVar = this.k;
        if (invVar == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = invVar.getMinimumWidth() - this.k.b.g();
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.x.getLayoutParams();
        return Math.max(Math.max(minimumWidth, layoutParams3.leftMargin) + this.e.getMeasuredWidth() + Math.max(minimumWidth, layoutParams3.rightMargin), measuredWidth);
    }

    public final void h(boolean z) {
        int i;
        this.G = z;
        I();
        if (true != z) {
            i = 8;
        } else {
            i = 0;
        }
        this.d.setVisibility(i);
        requestLayout();
    }

    public final void i(int i) {
        this.H = i;
        E(getWidth());
    }

    public final void j(int i) {
        if (this.q != i) {
            this.q = i;
            ((LinearLayout.LayoutParams) this.y.getLayoutParams()).topMargin = i;
            requestLayout();
        }
    }

    public final void k(int i) {
        this.j = i;
        if (this.l == 1) {
            setPadding(i, 0, i, 0);
        }
        E(getWidth());
    }

    public final void l(float f, float f2) {
        float f3;
        float f4;
        hwx hwxVar = this.L;
        View view = this.d;
        view.setScaleX(hwx.f(f));
        view.setScaleY(hwxVar.g(f));
        if (f2 == 0.0f) {
            f3 = 0.8f;
        } else {
            f3 = 0.0f;
        }
        if (f2 == 0.0f) {
            f4 = 1.0f;
        } else {
            f4 = 0.2f;
        }
        view.setAlpha(inc.a(0.0f, 1.0f, f3, f4, f));
        this.g = f;
    }

    public final void m(int i) {
        this.h = i;
        E(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(inv invVar) {
        if (this.k != invVar) {
            if (F() && this.e != null) {
                Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
                D(this.e);
            }
            this.k = invVar;
            int i = this.I;
            iny inyVar = invVar.b;
            if (inyVar.l != i) {
                inyVar.l = i;
                invVar.g();
            }
            ImageView imageView = this.e;
            if (imageView != null && F()) {
                setClipChildren(false);
                setClipToPadding(false);
                inv invVar2 = this.k;
                hrc.b(invVar2, imageView);
                if (invVar2.c() != null) {
                    invVar2.c().setForeground(invVar2);
                } else {
                    imageView.getOverlay().add(invVar2);
                }
            }
        }
    }

    public final void o(boolean z) {
        float f;
        this.A.setPivotX(this.A.getWidth() / 2);
        this.A.setPivotY(this.A.getBaseline());
        this.z.setPivotX(this.z.getWidth() / 2);
        this.z.setPivotY(this.z.getBaseline());
        boolean z2 = this.G;
        if (true != z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (z2 && this.a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g, f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new isn(this, f));
            this.F.setInterpolator(hwx.h(getContext(), com.google.android.apps.adm.R.attr.motionEasingEmphasizedInterpolator, inc.b));
            this.F.setDuration(hzc.n(getContext(), com.google.android.apps.adm.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.apps.adm.R.integer.material_motion_duration_long_1)));
            this.F.start();
        } else {
            l(f, f);
        }
        int i = this.u;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        K();
                    }
                } else if (z) {
                    J(this.A, this.z, this.s, this.r);
                    z = true;
                } else {
                    J(this.z, this.A, this.t, 0.0f);
                    z = false;
                }
            } else if (z) {
                J(this.A, this.z, this.s, 0.0f);
                z = true;
            } else {
                K();
                z = false;
            }
        } else if (this.v) {
            if (z) {
                J(this.A, this.z, this.s, 0.0f);
                z = true;
            } else {
                K();
                z = false;
            }
        } else if (z) {
            J(this.A, this.z, this.s, this.r);
            z = true;
        } else {
            J(this.z, this.A, this.t, 0.0f);
            z = false;
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        gj gjVar = this.f;
        if (gjVar != null && gjVar.isCheckable() && gjVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, m);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        inv invVar = this.k;
        if (invVar != null && invVar.isVisible()) {
            gj gjVar = this.f;
            CharSequence charSequence = gjVar.d;
            if (!TextUtils.isEmpty(gjVar.l)) {
                charSequence = this.f.l;
            }
            String valueOf = String.valueOf(charSequence);
            inv invVar2 = this.k;
            Object obj = null;
            if (invVar2.isVisible()) {
                if (invVar2.i()) {
                    obj = invVar2.b.b.o;
                    if (obj == null) {
                        obj = invVar2.d();
                    }
                } else if (invVar2.h()) {
                    if (invVar2.b.f() != 0 && (context = (Context) invVar2.a.get()) != null) {
                        if (invVar2.c != -2) {
                            int b = invVar2.b();
                            int i = invVar2.c;
                            if (b > i) {
                                obj = context.getString(invVar2.b.b.r, Integer.valueOf(i));
                            }
                        }
                        obj = context.getResources().getQuantityString(invVar2.b.f(), invVar2.b(), Integer.valueOf(invVar2.b()));
                    }
                } else {
                    obj = invVar2.b.b.p;
                }
            }
            accessibilityNodeInfo.setContentDescription(valueOf + ", " + String.valueOf(obj));
        }
        byn bynVar = new byn(accessibilityNodeInfo);
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < indexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof isp) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        bynVar.w(bym.a(0, 1, i2, 1, isSelected()));
        if (isSelected()) {
            bynVar.u(false);
            bynVar.af(byi.a);
        }
        bynVar.N(getResources().getString(com.google.android.apps.adm.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new bth(this, i, 4, null));
    }

    public final void p(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.e.setLayoutParams(layoutParams);
    }

    public final void q(ColorStateList colorStateList) {
        Drawable drawable;
        this.C = colorStateList;
        if (this.f != null && (drawable = this.E) != null) {
            bsc.g(drawable, colorStateList);
            this.E.invalidateSelf();
        }
    }

    public final void r(int i) {
        Drawable a;
        if (i == 0) {
            a = null;
        } else {
            a = bqq.a(getContext(), i);
        }
        if (a != null && a.getConstantState() != null) {
            a = a.getConstantState().newDrawable().mutate();
        }
        this.b = a;
        I();
    }

    public final void s(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.l != i) {
            this.l = i;
            int i8 = this.q;
            this.I = 0;
            if (i == 1) {
                i4 = getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.m3_expressive_navigation_item_leading_trailing_space);
                i5 = this.q;
                this.I = 1;
                int i9 = this.j;
                BaselineLayout baselineLayout = this.y;
                i2 = 17;
                if (baselineLayout.getParent() != this.c) {
                    this.w.removeView(this.y);
                    this.c.addView(this.y);
                }
                i6 = i9;
                i3 = 0;
            } else {
                BaselineLayout baselineLayout2 = this.y;
                i2 = 49;
                if (baselineLayout2.getParent() != this.w) {
                    this.c.removeView(this.y);
                    this.w.addView(this.y);
                }
                i3 = i8;
                i4 = 0;
                i5 = 0;
                i6 = 0;
            }
            ((FrameLayout.LayoutParams) this.w.getLayoutParams()).gravity = i2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams.leftMargin = i4;
            layoutParams.rightMargin = i4;
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.y.getLayoutParams();
            if (getLayoutDirection() == 1) {
                i7 = i5;
            } else {
                i7 = 0;
            }
            layoutParams2.rightMargin = i7;
            if (getLayoutDirection() == 1) {
                i5 = 0;
            }
            layoutParams2.leftMargin = i5;
            layoutParams2.topMargin = i3;
            setPadding(i6, 0, i6, 0);
            E(getWidth());
            I();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.z.setEnabled(z);
        this.A.setEnabled(z);
        this.e.setEnabled(z);
        if (z) {
            bwn.x(this, bet.l(getContext()));
        } else {
            bwn.x(this, null);
        }
    }

    public final void t(int i) {
        if (this.p != i) {
            this.p = i;
            H();
        }
    }

    public final void u(int i) {
        if (this.o != i) {
            this.o = i;
            H();
        }
    }

    public final void v(ColorStateList colorStateList) {
        this.n = colorStateList;
        I();
    }

    public final void w(int i) {
        if (this.u != i) {
            this.u = i;
            if (P()) {
                this.L = K;
            } else {
                this.L = J;
            }
            E(getWidth());
            H();
        }
    }

    public final void x(boolean z) {
        this.y.a = z;
        this.z.setIncludeFontPadding(z);
        this.A.setIncludeFontPadding(z);
        requestLayout();
    }

    public final void y(boolean z) {
        if (this.v != z) {
            this.v = z;
            H();
        }
    }

    public final void z(int i) {
        this.B = i;
        L(this.A, i);
        G(this.z.getTextSize(), this.A.getTextSize());
        this.A.setMinimumHeight(hzc.m(this.A.getContext(), i));
    }
}
