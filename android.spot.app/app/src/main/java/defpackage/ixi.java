package defpackage;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixi extends ixu {
    public EditText a;
    private final int b;
    private final int c;
    private final TimeInterpolator d;
    private final TimeInterpolator i;
    private final View.OnClickListener j;
    private final View.OnFocusChangeListener k;
    private AnimatorSet l;
    private ValueAnimator m;

    public ixi(ixt ixtVar) {
        super(ixtVar);
        this.j = new ewu(this, 12);
        this.k = new ixo(this, 1);
        this.b = hzc.n(ixtVar.getContext(), R.attr.motionDurationShort3, 100);
        this.c = hzc.n(ixtVar.getContext(), R.attr.motionDurationShort3, 150);
        this.d = hwx.h(ixtVar.getContext(), R.attr.motionEasingLinearInterpolator, inc.a);
        this.i = hwx.h(ixtVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, inc.d);
    }

    private final ValueAnimator m(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.d);
        ofFloat.setDuration(this.b);
        ofFloat.addUpdateListener(new bwy(this, 8, null));
        return ofFloat;
    }

    @Override // defpackage.ixu
    public final int a() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // defpackage.ixu
    public final int b() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // defpackage.ixu
    public final View.OnClickListener c() {
        return this.j;
    }

    @Override // defpackage.ixu
    public final View.OnFocusChangeListener d() {
        return this.k;
    }

    @Override // defpackage.ixu
    public final View.OnFocusChangeListener e() {
        return this.k;
    }

    public final void f(boolean z) {
        boolean r = this.f.r();
        if (z) {
            if (!this.l.isRunning()) {
                this.m.cancel();
                this.l.start();
                if (r) {
                    this.l.end();
                    return;
                }
                return;
            }
            return;
        }
        this.l.cancel();
        this.m.start();
        if (!r) {
            this.m.end();
        }
    }

    @Override // defpackage.ixu
    public final void g(EditText editText) {
        this.a = editText;
        this.e.j(k());
    }

    @Override // defpackage.ixu
    public final void h(boolean z) {
        if (this.f.h == null) {
            return;
        }
        f(z);
    }

    @Override // defpackage.ixu
    public final void i() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.i);
        ofFloat.setDuration(this.c);
        ofFloat.addUpdateListener(new bwy(this, 9, null));
        ValueAnimator m = m(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.playTogether(ofFloat, m);
        this.l.addListener(new ixg(this));
        ValueAnimator m2 = m(1.0f, 0.0f);
        this.m = m2;
        m2.addListener(new ixh(this));
    }

    @Override // defpackage.ixu
    public final void j() {
        EditText editText = this.a;
        if (editText != null) {
            editText.post(new ide(this, 17));
        }
    }

    public final boolean k() {
        EditText editText = this.a;
        if (editText != null) {
            if ((editText.hasFocus() || this.h.hasFocus()) && this.a.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ixu
    public final void l() {
        if (this.f.h != null) {
            return;
        }
        f(k());
    }
}
