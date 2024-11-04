package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixt extends LinearLayout {
    public final TextInputLayout a;
    public final CheckableImageButton b;
    public ColorStateList c;
    public final CheckableImageButton d;
    public int e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public CharSequence h;
    public final TextView i;
    public EditText j;
    public final TextWatcher k;
    private final FrameLayout l;
    private PorterDuff.Mode m;
    private final ixs n;
    private final LinkedHashSet o;
    private int p;
    private boolean q;
    private final AccessibilityManager r;
    private final njz s;
    private njz t;

    public ixt(TextInputLayout textInputLayout, ksr ksrVar) {
        super(textInputLayout.getContext());
        this.e = 0;
        this.o = new LinkedHashSet();
        this.k = new ixr(this);
        njz njzVar = new njz(this, null);
        this.s = njzVar;
        this.r = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.l = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton t = t(this, from, R.id.text_input_error_icon);
        this.b = t;
        CheckableImageButton t2 = t(frameLayout, from, R.id.text_input_end_icon);
        this.d = t2;
        this.n = new ixs(this, ksrVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.i = appCompatTextView;
        int[] iArr = iyb.a;
        if (ksrVar.A(38)) {
            this.c = hzc.ae(getContext(), ksrVar, 38);
        }
        if (ksrVar.A(39)) {
            this.m = a.h(ksrVar.p(39, -1), null);
        }
        if (ksrVar.A(37)) {
            m(ksrVar.u(37));
        }
        t.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        t.setImportantForAccessibility(2);
        t.setClickable(false);
        t.c = false;
        t.setFocusable(false);
        if (!ksrVar.A(53)) {
            if (ksrVar.A(32)) {
                this.f = hzc.ae(getContext(), ksrVar, 32);
            }
            if (ksrVar.A(33)) {
                this.g = a.h(ksrVar.p(33, -1), null);
            }
        }
        if (ksrVar.A(30)) {
            k(ksrVar.p(30, 0));
            if (ksrVar.A(27)) {
                j(ksrVar.w(27));
            }
            i(ksrVar.z(26, true));
        } else if (ksrVar.A(53)) {
            if (ksrVar.A(54)) {
                this.f = hzc.ae(getContext(), ksrVar, 54);
            }
            if (ksrVar.A(55)) {
                this.g = a.h(ksrVar.p(55, -1), null);
            }
            k(ksrVar.z(53, false) ? 1 : 0);
            j(ksrVar.w(51));
        }
        int o = ksrVar.o(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (o >= 0) {
            if (o != this.p) {
                this.p = o;
                ivc.i(t2, o);
                ivc.i(t, o);
            }
            if (ksrVar.A(31)) {
                ImageView.ScaleType e = ivc.e(ksrVar.p(31, -1));
                t2.setScaleType(e);
                t.setScaleType(e);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            appCompatTextView.setAccessibilityLiveRegion(1);
            brh.j(appCompatTextView, ksrVar.s(72, 0));
            if (ksrVar.A(73)) {
                appCompatTextView.setTextColor(ksrVar.t(73));
            }
            CharSequence w = ksrVar.w(71);
            this.h = true != TextUtils.isEmpty(w) ? w : null;
            appCompatTextView.setText(w);
            v();
            frameLayout.addView(t2);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(t);
            textInputLayout.n.add(njzVar);
            if (textInputLayout.c != null) {
                njzVar.h(textInputLayout);
            }
            addOnAttachStateChangeListener(new fz(this, 6));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    private final CheckableImageButton t(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        ivc.h(checkableImageButton);
        if (hzc.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private final void u() {
        int i;
        char c;
        int i2 = 0;
        if (this.d.getVisibility() == 0 && !s()) {
            i = 0;
        } else {
            i = 8;
        }
        this.l.setVisibility(i);
        if (this.h != null && !this.q) {
            c = 0;
        } else {
            c = '\b';
        }
        if (!r() && !s() && c != 0) {
            i2 = 8;
        }
        setVisibility(i2);
    }

    private final void v() {
        int visibility = this.i.getVisibility();
        boolean z = false;
        int i = 8;
        if (this.h != null && !this.q) {
            i = 0;
        }
        if (visibility != i) {
            ixu c = c();
            if (i == 0) {
                z = true;
            }
            c.h(z);
        }
        u();
        this.i.setVisibility(i);
        this.a.F();
    }

    public final int a() {
        int marginStart;
        if (!r() && !s()) {
            marginStart = 0;
        } else {
            CheckableImageButton checkableImageButton = this.d;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        }
        return getPaddingEnd() + this.i.getPaddingEnd() + marginStart;
    }

    public final Drawable b() {
        return this.d.getDrawable();
    }

    public final ixu c() {
        ixu ixjVar;
        int i = this.e;
        ixs ixsVar = this.n;
        ixu ixuVar = (ixu) ixsVar.a.get(i);
        if (ixuVar == null) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ixjVar = new ixq(ixsVar.b);
                            } else {
                                throw new IllegalArgumentException(a.ae(i, "Invalid end icon mode: "));
                            }
                        } else {
                            ixjVar = new ixi(ixsVar.b);
                        }
                    } else {
                        ixuVar = new iya(ixsVar.b, ixsVar.d);
                        ixsVar.a.append(i, ixuVar);
                    }
                } else {
                    ixjVar = new ixu(ixsVar.b);
                }
            } else {
                ixjVar = new ixj(ixsVar.b);
            }
            ixuVar = ixjVar;
            ixsVar.a.append(i, ixuVar);
        }
        return ixuVar;
    }

    public final void d() {
        if (this.t != null && this.r != null && isAttachedToWindow()) {
            this.r.addTouchExplorationStateChangeListener(new byh(this.t));
        }
    }

    public final void e(boolean z) {
        this.q = z;
        v();
    }

    public final void f() {
        ivc.g(this.a, this.d, this.f);
    }

    public final void g(boolean z) {
        boolean isActivated;
        boolean z2;
        ixu c = c();
        boolean z3 = false;
        boolean z4 = true;
        if (c.r() && (z2 = this.d.a) != c.s()) {
            this.d.setChecked(!z2);
            z3 = true;
        }
        if (c.p() && (isActivated = this.d.isActivated()) != c.q()) {
            this.d.setActivated(!isActivated);
        } else {
            z4 = z3;
        }
        if (!z && !z4) {
            return;
        }
        f();
    }

    public final void h() {
        AccessibilityManager accessibilityManager;
        njz njzVar = this.t;
        if (njzVar != null && (accessibilityManager = this.r) != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new byh(njzVar));
        }
    }

    final void i(boolean z) {
        this.d.a(z);
    }

    final void j(CharSequence charSequence) {
        if (this.d.getContentDescription() != charSequence) {
            this.d.setContentDescription(charSequence);
        }
    }

    final void k(int i) {
        boolean z;
        Drawable drawable;
        if (this.e == i) {
            return;
        }
        ixu c = c();
        h();
        CharSequence charSequence = null;
        this.t = null;
        c.j();
        this.e = i;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((iyf) it.next()).a();
        }
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        l(z);
        ixu c2 = c();
        int i2 = this.n.c;
        if (i2 == 0) {
            i2 = c2.b();
        }
        if (i2 != 0) {
            drawable = cu.c(getContext(), i2);
        } else {
            drawable = null;
        }
        this.d.setImageDrawable(drawable);
        if (drawable != null) {
            ivc.f(this.a, this.d, this.f, this.g);
            f();
        }
        int a = c2.a();
        if (a != 0) {
            charSequence = getResources().getText(a);
        }
        j(charSequence);
        i(c2.r());
        int i3 = this.a.l;
        if (c2.n(i3)) {
            c2.i();
            this.t = c2.w();
            d();
            ivc.j(this.d, c2.c());
            EditText editText = this.j;
            if (editText != null) {
                c2.g(editText);
                n(c2);
            }
            ivc.f(this.a, this.d, this.f, this.g);
            g(true);
            return;
        }
        throw new IllegalStateException(a.ad(i, i3, "The current box background mode ", " is not supported by the end icon mode "));
    }

    public final void l(boolean z) {
        int i;
        if (r() != z) {
            CheckableImageButton checkableImageButton = this.d;
            if (true != z) {
                i = 8;
            } else {
                i = 0;
            }
            checkableImageButton.setVisibility(i);
            u();
            p();
            this.a.F();
        }
    }

    public final void m(Drawable drawable) {
        this.b.setImageDrawable(drawable);
        o();
        ivc.f(this.a, this.b, this.c, this.m);
    }

    public final void n(ixu ixuVar) {
        EditText editText = this.j;
        if (editText != null) {
            if (ixuVar.d() != null) {
                editText.setOnFocusChangeListener(ixuVar.d());
            }
            if (ixuVar.e() != null) {
                this.d.setOnFocusChangeListener(ixuVar.e());
            }
        }
    }

    public final void o() {
        boolean z;
        int i = 0;
        if (this.b.getDrawable() != null && this.a.C() && this.a.E()) {
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton checkableImageButton = this.b;
        if (true != z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        u();
        p();
        if (!q()) {
            this.a.F();
        }
    }

    public final void p() {
        if (this.a.c == null) {
            return;
        }
        int i = 0;
        if (!r() && !s()) {
            i = this.a.c.getPaddingEnd();
        }
        this.i.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), this.a.c.getPaddingTop(), i, this.a.c.getPaddingBottom());
    }

    public final boolean q() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (this.l.getVisibility() == 0 && this.d.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (this.b.getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
