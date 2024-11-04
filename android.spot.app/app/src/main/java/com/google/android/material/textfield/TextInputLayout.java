package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.bpu;
import defpackage.bqx;
import defpackage.brh;
import defpackage.bro;
import defpackage.bsc;
import defpackage.bwn;
import defpackage.clu;
import defpackage.cmh;
import defpackage.hwx;
import defpackage.hzc;
import defpackage.ib;
import defpackage.ide;
import defpackage.inc;
import defpackage.ioj;
import defpackage.iqg;
import defpackage.irk;
import defpackage.irl;
import defpackage.iuu;
import defpackage.ivc;
import defpackage.ive;
import defpackage.ivf;
import defpackage.ivj;
import defpackage.ivl;
import defpackage.ixk;
import defpackage.ixl;
import defpackage.ixm;
import defpackage.ixt;
import defpackage.ixw;
import defpackage.ixx;
import defpackage.ixz;
import defpackage.iyc;
import defpackage.iyd;
import defpackage.iye;
import defpackage.iyg;
import defpackage.jv;
import defpackage.njz;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int s = 0;
    private static final int[][] t = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private TextView C;
    private ColorStateList D;
    private int E;
    private clu F;
    private clu G;
    private ColorStateList H;
    private ColorStateList I;
    private ColorStateList J;
    private ColorStateList K;
    private boolean L;
    private CharSequence M;
    private ivf N;
    private ivf O;
    private StateListDrawable P;
    private boolean Q;
    private ivf R;
    private ivf S;
    private ivl T;
    private boolean U;
    private final int V;
    private int W;
    public final iyc a;
    private ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final Rect af;
    private final Rect ag;
    private final RectF ah;
    private Drawable ai;
    private int aj;
    private Drawable ak;
    private int al;
    private Drawable am;
    private ColorStateList an;
    private ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private ColorStateList as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public final ixt b;
    public EditText c;
    public final ixx d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public boolean k;
    public int l;
    public Typeface m;
    public final LinkedHashSet n;
    public int o;
    public boolean p;
    public final irk q;
    public boolean r;
    private final FrameLayout u;
    private CharSequence v;
    private int w;
    private int x;
    private int y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private final int G() {
        float b;
        if (this.L) {
            int i = this.l;
            if (i != 0) {
                if (i != 2) {
                    return 0;
                }
                b = this.q.b() / 2.0f;
            } else {
                b = this.q.b();
            }
            return (int) b;
        }
        return 0;
    }

    private final int H(int i, boolean z) {
        int a;
        if (!z) {
            if (e() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingLeft();
        } else {
            if (f() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingLeft();
        }
        return i + a;
    }

    private final int I(int i, boolean z) {
        int a;
        if (!z) {
            if (f() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingRight();
        } else {
            if (e() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingRight();
        }
        return i - a;
    }

    private final Drawable J() {
        if (this.O == null) {
            this.O = L(true);
        }
        return this.O;
    }

    private final clu K() {
        clu cluVar = new clu();
        cluVar.c = hzc.n(getContext(), com.google.android.apps.adm.R.attr.motionDurationShort2, 87);
        cluVar.d = hwx.h(getContext(), com.google.android.apps.adm.R.attr.motionEasingLinearInterpolator, inc.a);
        return cluVar;
    }

    private final ivf L(boolean z) {
        float dimensionPixelOffset;
        float f;
        ColorStateList colorStateList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.google.android.apps.adm.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        if (editText instanceof ixz) {
            dimensionPixelOffset = ((ixz) editText).b;
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.apps.adm.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        if (true != z) {
            f = 0.0f;
        } else {
            f = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.apps.adm.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ivj ivjVar = new ivj();
        ivjVar.c(f);
        ivjVar.d(f);
        ivjVar.a(dimensionPixelOffset2);
        ivjVar.b(dimensionPixelOffset2);
        ivl ivlVar = new ivl(ivjVar);
        EditText editText2 = this.c;
        if (editText2 instanceof ixz) {
            colorStateList = ((ixz) editText2).c;
        } else {
            colorStateList = null;
        }
        ivf D = ivf.D(getContext(), dimensionPixelOffset, colorStateList);
        D.cy(ivlVar);
        ive iveVar = D.q;
        if (iveVar.j == null) {
            iveVar.j = new Rect();
        }
        D.q.j.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        D.invalidateSelf();
        return D;
    }

    private final void M() {
        ColorStateList valueOf;
        ivf ivfVar = this.N;
        if (ivfVar == null) {
            return;
        }
        ivl E = ivfVar.E();
        ivl ivlVar = this.T;
        if (E != ivlVar) {
            this.N.cy(ivlVar);
        }
        if (this.l == 2 && aa()) {
            this.N.P(this.aa, this.ad);
        }
        int i = this.ae;
        if (this.l == 1) {
            i = bro.b(this.ae, iqg.d(getContext(), com.google.android.apps.adm.R.attr.colorSurface, 0));
        }
        this.ae = i;
        this.N.L(ColorStateList.valueOf(i));
        ivf ivfVar2 = this.R;
        if (ivfVar2 != null && this.S != null) {
            if (aa()) {
                if (this.c.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.ap);
                } else {
                    valueOf = ColorStateList.valueOf(this.ad);
                }
                ivfVar2.L(valueOf);
                this.S.L(ColorStateList.valueOf(this.ad));
            }
            invalidate();
        }
        y();
    }

    private final void N() {
        if (ab()) {
            ((ixm) this.N).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void O() {
        TextView textView = this.C;
        if (textView != null && this.j) {
            textView.setText((CharSequence) null);
            cmh.b(this.u, this.G);
            this.C.setVisibility(4);
        }
    }

    private final void P() {
        int i = this.l;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.L && !(this.N instanceof ixm)) {
                        ivl ivlVar = this.T;
                        if (ivlVar == null) {
                            ivlVar = new ivl();
                        }
                        this.N = new ixl(new ixk(ivlVar, new RectF()));
                    } else {
                        this.N = new ivf(this.T);
                    }
                    this.R = null;
                    this.S = null;
                } else {
                    throw new IllegalArgumentException(i + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
            } else {
                this.N = new ivf(this.T);
                this.R = new ivf();
                this.S = new ivf();
            }
        } else {
            this.N = null;
            this.R = null;
            this.S = null;
        }
        y();
        B();
        if (this.l == 1) {
            if (hzc.l(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (hzc.k(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.c != null && this.l == 1) {
            if (hzc.l(getContext())) {
                EditText editText = this.c;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (hzc.k(getContext())) {
                EditText editText2 = this.c;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.adm.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.l != 0) {
            W();
        }
        EditText editText3 = this.c;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.l;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(J());
                    return;
                }
                if (i2 == 1) {
                    if (this.P == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.P = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, J());
                        this.P.addState(new int[0], L(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.P);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Q() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Q():void");
    }

    private static void R(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                R((ViewGroup) childAt, z);
            }
        }
    }

    private final void S(boolean z) {
        if (this.j == z) {
            return;
        }
        if (z) {
            TextView textView = this.C;
            if (textView != null) {
                this.u.addView(textView);
                this.C.setVisibility(0);
            }
        } else {
            TextView textView2 = this.C;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.C = null;
        }
        this.j = z;
    }

    private final void T() {
        Editable text;
        if (this.h != null) {
            EditText editText = this.c;
            if (editText == null) {
                text = null;
            } else {
                text = editText.getText();
            }
            w(text);
        }
    }

    private final void U() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            if (this.g) {
                i = this.A;
            } else {
                i = this.B;
            }
            v(textView, i);
            if (!this.g && (colorStateList2 = this.H) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (this.g && (colorStateList = this.I) != null) {
                this.h.setTextColor(colorStateList);
            }
        }
    }

    private final void V() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.J;
        if (colorStateList2 == null) {
            colorStateList2 = iqg.g(getContext(), com.google.android.apps.adm.R.attr.colorControlActivated);
        }
        EditText editText = this.c;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.c.getTextCursorDrawable();
                Drawable mutate = bpu.i(textCursorDrawable2).mutate();
                if ((E() || (this.h != null && this.g)) && (colorStateList = this.K) != null) {
                    colorStateList2 = colorStateList;
                }
                bsc.g(mutate, colorStateList2);
            }
        }
    }

    private final void W() {
        if (this.l != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.u.getLayoutParams();
            int G = G();
            if (G != layoutParams.topMargin) {
                layoutParams.topMargin = G;
                this.u.requestLayout();
            }
        }
    }

    private final void X(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        ColorStateList colorStateList2;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.c;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.c;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ColorStateList colorStateList3 = this.an;
        if (colorStateList3 != null) {
            this.q.i(colorStateList3);
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.an;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.ax);
            } else {
                i = this.ax;
            }
            this.q.i(ColorStateList.valueOf(i));
        } else if (E()) {
            irk irkVar = this.q;
            TextView textView2 = this.d.h;
            if (textView2 != null) {
                colorStateList2 = textView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            irkVar.i(colorStateList2);
        } else if (this.g && (textView = this.h) != null) {
            this.q.i(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ao) != null) {
            this.q.l(colorStateList);
        }
        if (!z3 && this.ay && (!isEnabled() || !z4)) {
            if (z2 || !this.p) {
                ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.az) {
                    g(0.0f);
                } else {
                    this.q.r(0.0f);
                }
                if (ab() && !((ixm) this.N).a.x.isEmpty()) {
                    N();
                }
                this.p = true;
                O();
                this.a.b(true);
                this.b.e(true);
                return;
            }
            return;
        }
        if (!z2 && !this.p) {
            return;
        }
        ValueAnimator valueAnimator2 = this.aA;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.aA.cancel();
        }
        if (z && this.az) {
            g(1.0f);
        } else {
            this.q.r(1.0f);
        }
        this.p = false;
        if (ab()) {
            Q();
        }
        Y();
        this.a.b(false);
        this.b.e(false);
    }

    private final void Y() {
        Editable text;
        EditText editText = this.c;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        A(text);
    }

    private final void Z(boolean z, boolean z2) {
        int defaultColor = this.as.getDefaultColor();
        int colorForState = this.as.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.as.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ad = defaultColor;
    }

    private final boolean aa() {
        if (this.aa >= 0 && this.ad != 0) {
            return true;
        }
        return false;
    }

    private final boolean ab() {
        if (this.L && !TextUtils.isEmpty(this.M) && (this.N instanceof ixm)) {
            return true;
        }
        return false;
    }

    private final boolean ac() {
        if (this.l == 1 && this.c.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A(Editable editable) {
        if (b(editable) == 0 && !this.p) {
            if (this.C != null && this.j && !TextUtils.isEmpty(this.i)) {
                this.C.setText(this.i);
                cmh.b(this.u, this.F);
                this.C.setVisibility(0);
                this.C.bringToFront();
                announceForAccessibility(this.i);
                return;
            }
            return;
        }
        O();
    }

    public final void B() {
        boolean z;
        int i;
        TextView textView;
        int i2;
        int i3;
        EditText editText;
        EditText editText2;
        if (this.N != null && this.l != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.c) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.c) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.ad = this.ax;
            } else if (E()) {
                if (this.as != null) {
                    Z(z, z2);
                } else {
                    this.ad = a();
                }
            } else {
                if (this.g && (textView = this.h) != null) {
                    if (this.as != null) {
                        Z(z, z2);
                    } else {
                        i = textView.getCurrentTextColor();
                    }
                } else if (z) {
                    i = this.ar;
                } else if (z2) {
                    i = this.aq;
                } else {
                    i = this.ap;
                }
                this.ad = i;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                V();
            }
            ixt ixtVar = this.b;
            ixtVar.o();
            ivc.g(ixtVar.a, ixtVar.b, ixtVar.c);
            ixtVar.f();
            if (ixtVar.c().t()) {
                if (ixtVar.a.E() && ixtVar.b() != null) {
                    Drawable mutate = bpu.i(ixtVar.b()).mutate();
                    bsc.f(mutate, ixtVar.a.a());
                    ixtVar.d.setImageDrawable(mutate);
                } else {
                    ivc.f(ixtVar.a, ixtVar.d, ixtVar.f, ixtVar.g);
                }
            }
            this.a.c();
            if (this.l == 2) {
                int i4 = this.aa;
                if (z && isEnabled()) {
                    i3 = this.ac;
                    this.aa = i3;
                } else {
                    i3 = this.ab;
                    this.aa = i3;
                }
                if (i3 != i4 && ab() && !this.p) {
                    N();
                    Q();
                }
            }
            if (this.l == 1) {
                if (!isEnabled()) {
                    this.ae = this.au;
                } else {
                    if (z2 && !z) {
                        i2 = this.aw;
                    } else if (z) {
                        i2 = this.av;
                    } else {
                        i2 = this.at;
                    }
                    this.ae = i2;
                }
            }
            M();
        }
    }

    public final boolean C() {
        return this.d.g;
    }

    public final boolean D() {
        return this.d.n;
    }

    public final boolean E() {
        ixx ixxVar = this.d;
        if (ixxVar.e == 1 && ixxVar.h != null && !TextUtils.isEmpty(ixxVar.f)) {
            return true;
        }
        return false;
    }

    public final boolean F() {
        boolean z;
        if (this.c == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((this.a.c.getDrawable() != null || (e() != null && this.a.a.getVisibility() == 0)) && this.a.getMeasuredWidth() > 0) {
            int measuredWidth = this.a.getMeasuredWidth() - this.c.getPaddingLeft();
            if (this.ai == null || this.aj != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ai = colorDrawable;
                this.aj = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ai;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ai != null) {
                Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
                this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ai = null;
                z = true;
            }
            z = false;
        }
        if ((this.b.s() || ((this.b.q() && this.b.r()) || this.b.h != null)) && this.b.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.b.i.getMeasuredWidth() - this.c.getPaddingRight();
            ixt ixtVar = this.b;
            if (ixtVar.s()) {
                checkableImageButton = ixtVar.b;
            } else if (ixtVar.q() && ixtVar.r()) {
                checkableImageButton = ixtVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ak;
            if (drawable3 != null && this.al != measuredWidth2) {
                this.al = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ak, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.ak = colorDrawable2;
                this.al = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.ak;
            if (drawable4 != drawable5) {
                this.am = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ak != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ak) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.am, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ak = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.u.addView(view, layoutParams2);
            this.u.setLayoutParams(layoutParams);
            W();
            EditText editText = (EditText) view;
            if (this.c == null) {
                int i2 = this.b.e;
                this.c = editText;
                int i3 = this.w;
                if (i3 != -1) {
                    r(i3);
                } else {
                    s(this.y);
                }
                int i4 = this.x;
                if (i4 != -1) {
                    p(i4);
                } else {
                    q(this.z);
                }
                this.Q = false;
                P();
                iye iyeVar = new iye(this);
                EditText editText2 = this.c;
                if (editText2 != null) {
                    bwn.q(editText2, iyeVar);
                }
                this.q.v(this.c.getTypeface());
                this.q.q(this.c.getTextSize());
                irk irkVar = this.q;
                float letterSpacing = this.c.getLetterSpacing();
                if (irkVar.o != letterSpacing) {
                    irkVar.o = letterSpacing;
                    irkVar.g();
                }
                int gravity = this.c.getGravity();
                this.q.m((gravity & (-113)) | 48);
                this.q.p(gravity);
                this.o = editText.getMinimumHeight();
                this.c.addTextChangedListener(new iyd(this, editText));
                if (this.an == null) {
                    this.an = this.c.getHintTextColors();
                }
                if (this.L) {
                    if (TextUtils.isEmpty(this.M)) {
                        CharSequence hint = this.c.getHint();
                        this.v = hint;
                        o(hint);
                        this.c.setHint((CharSequence) null);
                    }
                    this.k = true;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    V();
                }
                if (this.h != null) {
                    w(this.c.getText());
                }
                x();
                this.d.b();
                this.a.bringToFront();
                this.b.bringToFront();
                Iterator it = this.n.iterator();
                while (it.hasNext()) {
                    ((njz) it.next()).h(this);
                }
                this.b.p();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                X(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    public final CharSequence c() {
        ixx ixxVar = this.d;
        if (ixxVar.g) {
            return ixxVar.f;
        }
        return null;
    }

    public final CharSequence d() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        AutofillId autofillId;
        ViewStructure newChild;
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.v != null) {
            boolean z = this.k;
            this.k = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.v);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.k = z;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.u.getChildCount());
        for (int i2 = 0; i2 < this.u.getChildCount(); i2++) {
            View childAt = this.u.getChildAt(i2);
            newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.c) {
                newChild.setHint(d());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ivf ivfVar;
        super.draw(canvas);
        if (this.L) {
            this.q.d(canvas);
        }
        if (this.S != null && (ivfVar = this.R) != null) {
            ivfVar.draw(canvas);
            if (this.c.isFocused()) {
                Rect bounds = this.S.getBounds();
                Rect bounds2 = this.R.getBounds();
                float f = this.q.a;
                int centerX = bounds2.centerX();
                bounds.left = inc.b(centerX, bounds2.left, f);
                bounds.right = inc.b(centerX, bounds2.right, f);
                this.S.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        boolean z;
        if (this.aB) {
            return;
        }
        boolean z2 = true;
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        irk irkVar = this.q;
        if (irkVar != null) {
            z = irkVar.z(drawableState);
        } else {
            z = false;
        }
        if (this.c != null) {
            if (!isLaidOut() || !isEnabled()) {
                z2 = false;
            }
            z(z2);
        }
        x();
        B();
        if (z) {
            invalidate();
        }
        this.aB = false;
    }

    public final CharSequence e() {
        return this.a.b;
    }

    public final CharSequence f() {
        return this.b.h;
    }

    final void g(float f) {
        if (this.q.a == f) {
            return;
        }
        if (this.aA == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aA = valueAnimator;
            valueAnimator.setInterpolator(hwx.h(getContext(), com.google.android.apps.adm.R.attr.motionEasingEmphasizedInterpolator, inc.b));
            this.aA.setDuration(hzc.n(getContext(), com.google.android.apps.adm.R.attr.motionDurationMedium4, 167));
            this.aA.addUpdateListener(new ioj(this, 8));
        }
        this.aA.setFloatValues(this.q.a, f);
        this.aA.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + G();
        }
        return super.getBaseline();
    }

    public final void h(boolean z) {
        if (this.e != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.h = appCompatTextView;
                appCompatTextView.setId(com.google.android.apps.adm.R.id.textinput_counter);
                Typeface typeface = this.m;
                if (typeface != null) {
                    this.h.setTypeface(typeface);
                }
                this.h.setMaxLines(1);
                this.d.a(this.h, 2);
                ((ViewGroup.MarginLayoutParams) this.h.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.google.android.apps.adm.R.dimen.mtrl_textinput_counter_margin_start));
                U();
                T();
            } else {
                this.d.e(this.h, 2);
                this.h = null;
            }
            this.e = z;
        }
    }

    public final void i(int i) {
        if (this.f != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f = i;
            if (this.e) {
                T();
            }
        }
    }

    public final void j(boolean z) {
        this.b.l(z);
    }

    public final void k(CharSequence charSequence) {
        if (!this.d.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                l(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            ixx ixxVar = this.d;
            ixxVar.c();
            ixxVar.f = charSequence;
            ixxVar.h.setText(charSequence);
            int i = ixxVar.d;
            if (i != 1) {
                ixxVar.e = 1;
            }
            ixxVar.l(i, ixxVar.e, ixxVar.m(ixxVar.h, charSequence));
            return;
        }
        this.d.d();
    }

    public final void l(boolean z) {
        ixx ixxVar = this.d;
        if (ixxVar.g == z) {
            return;
        }
        ixxVar.c();
        if (z) {
            ixxVar.h = new AppCompatTextView(ixxVar.a);
            ixxVar.h.setId(com.google.android.apps.adm.R.id.textinput_error);
            ixxVar.h.setTextAlignment(5);
            Typeface typeface = ixxVar.r;
            if (typeface != null) {
                ixxVar.h.setTypeface(typeface);
            }
            ixxVar.h(ixxVar.k);
            ixxVar.i(ixxVar.l);
            ixxVar.g(ixxVar.i);
            ixxVar.f(ixxVar.j);
            ixxVar.h.setVisibility(4);
            ixxVar.a(ixxVar.h, 0);
        } else {
            ixxVar.d();
            ixxVar.e(ixxVar.h, 0);
            ixxVar.h = null;
            ixxVar.b.x();
            ixxVar.b.B();
        }
        ixxVar.g = z;
    }

    public final void m(boolean z) {
        ixx ixxVar = this.d;
        if (ixxVar.n == z) {
            return;
        }
        ixxVar.c();
        if (z) {
            ixxVar.o = new AppCompatTextView(ixxVar.a);
            ixxVar.o.setId(com.google.android.apps.adm.R.id.textinput_helper_text);
            ixxVar.o.setTextAlignment(5);
            Typeface typeface = ixxVar.r;
            if (typeface != null) {
                ixxVar.o.setTypeface(typeface);
            }
            ixxVar.o.setVisibility(4);
            ixxVar.o.setAccessibilityLiveRegion(1);
            ixxVar.j(ixxVar.p);
            ixxVar.k(ixxVar.q);
            ixxVar.a(ixxVar.o, 1);
            ixxVar.o.setAccessibilityDelegate(new ixw(ixxVar));
        } else {
            ixxVar.c();
            int i = ixxVar.d;
            if (i == 2) {
                ixxVar.e = 0;
            }
            ixxVar.l(i, ixxVar.e, ixxVar.m(ixxVar.o, ""));
            ixxVar.e(ixxVar.o, 1);
            ixxVar.o = null;
            ixxVar.b.x();
            ixxVar.b.B();
        }
        ixxVar.n = z;
    }

    public final void n(int i) {
        o(getResources().getText(i));
    }

    public final void o(CharSequence charSequence) {
        if (this.L) {
            if (!TextUtils.equals(charSequence, this.M)) {
                this.M = charSequence;
                this.q.t(charSequence);
                if (!this.p) {
                    Q();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.f(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aC = false;
        if (this.c != null) {
            int max = Math.max(this.b.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < max) {
                this.c.setMinimumHeight(max);
                z = true;
            }
        }
        boolean F = F();
        if (!z && !F) {
            return;
        }
        this.c.post(new ide(this, 19));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.af;
            irl.a(this, editText, rect);
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.L) {
                this.q.q(this.c.getTextSize());
                int gravity = this.c.getGravity();
                this.q.m((gravity & (-113)) | 48);
                this.q.p(gravity);
                irk irkVar = this.q;
                if (this.c != null) {
                    Rect rect2 = this.ag;
                    boolean o = hwx.o(this);
                    rect2.bottom = rect.bottom;
                    int i5 = this.l;
                    if (i5 != 1) {
                        if (i5 != 2) {
                            rect2.left = H(rect.left, o);
                            rect2.top = getPaddingTop();
                            rect2.right = I(rect.right, o);
                        } else {
                            rect2.left = rect.left + this.c.getPaddingLeft();
                            rect2.top = rect.top - G();
                            rect2.right = rect.right - this.c.getPaddingRight();
                        }
                    } else {
                        rect2.left = H(rect.left, o);
                        rect2.top = rect.top + this.W;
                        rect2.right = I(rect.right, o);
                    }
                    irkVar.j(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    irk irkVar2 = this.q;
                    if (this.c != null) {
                        Rect rect3 = this.ag;
                        irkVar2.e(irkVar2.n);
                        float f = -irkVar2.n.ascent();
                        rect3.left = rect.left + this.c.getCompoundPaddingLeft();
                        if (ac()) {
                            compoundPaddingTop = (int) (rect.centerY() - (f / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.c.getCompoundPaddingTop();
                        }
                        rect3.top = compoundPaddingTop;
                        rect3.right = rect.right - this.c.getCompoundPaddingRight();
                        if (ac()) {
                            compoundPaddingBottom = (int) (rect3.top + f);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.c.getCompoundPaddingBottom();
                        }
                        rect3.bottom = compoundPaddingBottom;
                        irkVar2.n(rect3.left, rect3.top, rect3.right, rect3.bottom);
                        this.q.g();
                        if (ab() && !this.p) {
                            Q();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.C != null && (editText = this.c) != null) {
            this.C.setGravity(editText.getGravity());
            this.C.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.p();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof iyg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        iyg iygVar = (iyg) parcelable;
        super.onRestoreInstanceState(iygVar.d);
        k(iygVar.a);
        if (iygVar.b) {
            post(new ide(this, 20, null));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.U) {
            float a = this.T.b.a(this.ah);
            float a2 = this.T.c.a(this.ah);
            float a3 = this.T.e.a(this.ah);
            float a4 = this.T.d.a(this.ah);
            ivl ivlVar = this.T;
            iuu iuuVar = ivlVar.j;
            iuu iuuVar2 = ivlVar.k;
            iuu iuuVar3 = ivlVar.m;
            iuu iuuVar4 = ivlVar.l;
            ivj ivjVar = new ivj();
            ivjVar.j(iuuVar2);
            ivjVar.k(iuuVar);
            ivjVar.h(iuuVar4);
            ivjVar.i(iuuVar3);
            ivjVar.c(a2);
            ivjVar.d(a);
            ivjVar.a(a4);
            ivjVar.b(a3);
            ivl ivlVar2 = new ivl(ivjVar);
            this.U = z;
            ivf ivfVar = this.N;
            if (ivfVar != null && ivfVar.E() != ivlVar2) {
                this.T = ivlVar2;
                M();
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        iyg iygVar = new iyg(super.onSaveInstanceState());
        if (E()) {
            iygVar.a = c();
        }
        ixt ixtVar = this.b;
        boolean z = false;
        if (ixtVar.q() && ixtVar.d.a) {
            z = true;
        }
        iygVar.b = z;
        return iygVar;
    }

    public final void p(int i) {
        this.x = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public final void q(int i) {
        this.z = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public final void r(int i) {
        this.w = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public final void s(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        R(this, z);
        super.setEnabled(z);
    }

    public final void t(int i) {
        this.E = i;
        TextView textView = this.C;
        if (textView != null) {
            brh.j(textView, i);
        }
    }

    public final void u(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            TextView textView = this.C;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public final void v(TextView textView, int i) {
        try {
            brh.j(textView, i);
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
            brh.j(textView, com.google.android.apps.adm.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(bqx.c(getContext(), com.google.android.apps.adm.R.color.design_error));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(android.text.Editable r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w(android.text.Editable):void");
    }

    public final void x() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText != null && this.l == 0 && (background = editText.getBackground()) != null) {
            int i = jv.a;
            Drawable mutate = background.mutate();
            if (E()) {
                mutate.setColorFilter(ib.b(a(), PorterDuff.Mode.SRC_IN));
            } else if (this.g && (textView = this.h) != null) {
                mutate.setColorFilter(ib.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                bpu.j(mutate);
                this.c.refreshDrawableState();
            }
        }
    }

    public final void y() {
        Drawable drawable;
        EditText editText = this.c;
        if (editText != null && this.N != null) {
            if ((this.Q || editText.getBackground() == null) && this.l != 0) {
                EditText editText2 = this.c;
                if ((editText2 instanceof AutoCompleteTextView) && !ivc.l(editText2)) {
                    int c = iqg.c(this.c, com.google.android.apps.adm.R.attr.colorControlHighlight);
                    int i = this.l;
                    if (i == 2) {
                        Context context = getContext();
                        ivf ivfVar = this.N;
                        int[][] iArr = t;
                        int e = iqg.e(context, com.google.android.apps.adm.R.attr.colorSurface, "TextInputLayout");
                        ivf ivfVar2 = new ivf(ivfVar.E());
                        int f = iqg.f(c, e, 0.1f);
                        ivfVar2.L(new ColorStateList(iArr, new int[]{f, 0}));
                        ivfVar2.setTint(e);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f, e});
                        ivf ivfVar3 = new ivf(ivfVar.E());
                        ivfVar3.setTint(-1);
                        drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ivfVar2, ivfVar3), ivfVar});
                    } else if (i == 1) {
                        ivf ivfVar4 = this.N;
                        int i2 = this.ae;
                        drawable = new RippleDrawable(new ColorStateList(t, new int[]{iqg.f(c, i2, 0.1f), i2}), ivfVar4, ivfVar4);
                    } else {
                        drawable = null;
                    }
                } else {
                    drawable = this.N;
                }
                this.c.setBackground(drawable);
                this.Q = true;
            }
        }
    }

    public final void z(boolean z) {
        X(z, false);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.adm.R.attr.textInputStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x042e  */
    /* JADX WARN: Type inference failed for: r3v111 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
