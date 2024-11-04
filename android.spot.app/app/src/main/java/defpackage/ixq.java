package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixq extends ixu {
    public AutoCompleteTextView a;
    public boolean b;
    public boolean c;
    public ValueAnimator d;
    private final int i;
    private final int j;
    private final TimeInterpolator k;
    private final View.OnClickListener l;
    private final View.OnFocusChangeListener m;
    private boolean n;
    private long o;
    private AccessibilityManager p;
    private ValueAnimator q;
    private final njz r;

    public ixq(ixt ixtVar) {
        super(ixtVar);
        this.l = new ewu(this, 13);
        this.m = new ixo(this, 0);
        this.r = new njz(this);
        this.o = Long.MAX_VALUE;
        this.j = hzc.n(ixtVar.getContext(), R.attr.motionDurationShort3, 67);
        this.i = hzc.n(ixtVar.getContext(), R.attr.motionDurationShort3, 50);
        this.k = hwx.h(ixtVar.getContext(), R.attr.motionEasingLinearInterpolator, inc.a);
    }

    private final ValueAnimator z(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.k);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new bwy(this, 10, null));
        return ofFloat;
    }

    @Override // defpackage.ixu
    public final int a() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.ixu
    public final int b() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.ixu
    public final View.OnClickListener c() {
        return this.l;
    }

    @Override // defpackage.ixu
    public final View.OnFocusChangeListener d() {
        return this.m;
    }

    public final void f(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.d.cancel();
            this.q.start();
        }
    }

    @Override // defpackage.ixu
    public final void g(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.a = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new hbo(this, 3));
            this.a.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ixn
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    ixq ixqVar = ixq.this;
                    ixqVar.m();
                    ixqVar.f(false);
                }
            });
            this.a.setThreshold(0);
            this.e.b.m(null);
            if (!ivc.l(editText) && this.p.isTouchExplorationEnabled()) {
                this.h.setImportantForAccessibility(2);
            }
            this.e.j(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.ixu
    public final void i() {
        this.d = z(this.j, 0.0f, 1.0f);
        ValueAnimator z = z(this.i, 1.0f, 0.0f);
        this.q = z;
        z.addListener(new ixp(this));
        this.p = (AccessibilityManager) this.g.getSystemService("accessibility");
    }

    @Override // defpackage.ixu
    public final void j() {
        AutoCompleteTextView autoCompleteTextView = this.a;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.a.setOnDismissListener(null);
        }
    }

    public final void k() {
        if (this.a == null) {
            return;
        }
        if (o()) {
            this.c = false;
        }
        if (!this.c) {
            f(!this.n);
            if (this.n) {
                this.a.requestFocus();
                this.a.showDropDown();
                return;
            } else {
                this.a.dismissDropDown();
                return;
            }
        }
        this.c = false;
    }

    @Override // defpackage.ixu
    public final void l() {
        if (this.p.isTouchExplorationEnabled() && ivc.l(this.a) && !this.h.hasFocus()) {
            this.a.dismissDropDown();
        }
        this.a.post(new ide(this, 18));
    }

    public final void m() {
        this.c = true;
        this.o = System.currentTimeMillis();
    }

    @Override // defpackage.ixu
    public final boolean n(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ixu
    public final boolean p() {
        return true;
    }

    @Override // defpackage.ixu
    public final boolean q() {
        return this.b;
    }

    @Override // defpackage.ixu
    public final boolean r() {
        return true;
    }

    @Override // defpackage.ixu
    public final boolean s() {
        return this.n;
    }

    @Override // defpackage.ixu
    public final boolean t() {
        return true;
    }

    @Override // defpackage.ixu
    public final void u(byn bynVar) {
        boolean V;
        if (!ivc.l(this.a)) {
            bynVar.t(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT < 26) {
            V = bynVar.V(4);
        } else {
            V = bynVar.b.isShowingHintText();
        }
        if (V) {
            bynVar.E(null);
        }
    }

    @Override // defpackage.ixu
    public final void v(AccessibilityEvent accessibilityEvent) {
        if (this.p.isEnabled() && !ivc.l(this.a)) {
            boolean z = false;
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.a.isPopupShowing()) {
                z = true;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                k();
                m();
            }
        }
    }

    @Override // defpackage.ixu
    public final njz w() {
        return this.r;
    }
}
