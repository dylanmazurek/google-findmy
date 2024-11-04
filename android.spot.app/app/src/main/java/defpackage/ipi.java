package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.adm.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ipi {
    public static final Drawable a;
    private static final double v = Math.cos(Math.toRadians(45.0d));
    private final int A;
    public final MaterialCardView b;
    public final ivf d;
    public final ivf e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public ivl n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public ivf r;
    public boolean t;
    private ivf w;
    private ValueAnimator x;
    private final TimeInterpolator y;
    private final int z;
    public final Rect c = new Rect();
    public boolean s = false;
    public float u = 0.0f;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        a = colorDrawable;
    }

    public ipi(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.b = materialCardView;
        ivf ivfVar = new ivf(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.d = ivfVar;
        ivfVar.I(materialCardView.getContext());
        ivfVar.O(-12303292);
        ivj ivjVar = new ivj(ivfVar.E());
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ipj.a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            ivjVar.e(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.e = new ivf();
        g(new ivl(ivjVar));
        this.y = hwx.h(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, inc.a);
        this.z = hzc.n(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.A = hzc.n(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    private final float o() {
        float max = Math.max(q(this.n.j, this.d.u()), q(this.n.k, this.d.v()));
        iuu iuuVar = this.n.l;
        ivf ivfVar = this.d;
        float q = q(iuuVar, ivfVar.q.a.d.a(ivfVar.B()));
        iuu iuuVar2 = this.n.m;
        ivf ivfVar2 = this.d;
        return Math.max(max, Math.max(q, q(iuuVar2, ivfVar2.q.a.e.a(ivfVar2.B()))));
    }

    private final boolean p() {
        if (this.d.T()) {
            return true;
        }
        return false;
    }

    private static final float q(iuu iuuVar, float f) {
        if (iuuVar instanceof ivi) {
            return (float) ((1.0d - v) * f);
        }
        if (iuuVar instanceof ivb) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float f;
        float a2 = this.b.a();
        if (m()) {
            f = o();
        } else {
            f = 0.0f;
        }
        return a2 + f;
    }

    public final float b() {
        float f;
        float a2 = this.b.a() * 1.5f;
        if (m()) {
            f = o();
        } else {
            f = 0.0f;
        }
        return a2 + f;
    }

    public final Drawable c() {
        if (this.p == null) {
            int i = iuv.b;
            this.w = new ivf(this.n);
            this.p = new RippleDrawable(this.l, null, this.w);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.e, this.k});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    public final Drawable d(Drawable drawable) {
        int i;
        int i2;
        if (this.b.a) {
            i2 = (int) Math.ceil(b());
            i = (int) Math.ceil(a());
        } else {
            i = 0;
            i2 = 0;
        }
        return new iph(drawable, i, i2, i, i2);
    }

    public final void e(ColorStateList colorStateList) {
        this.d.L(colorStateList);
    }

    public final void f(boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        Drawable drawable = this.k;
        if (drawable != null) {
            if (true != z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            int i2 = 0;
            if (z2) {
                if (z) {
                    f2 = 1.0f - this.u;
                } else {
                    f2 = this.u;
                }
                ValueAnimator valueAnimator = this.x;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.x = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.u, f);
                this.x = ofFloat;
                ofFloat.addUpdateListener(new bwy(this, 6, null));
                this.x.setInterpolator(this.y);
                ValueAnimator valueAnimator2 = this.x;
                if (z) {
                    i = this.z;
                } else {
                    i = this.A;
                }
                valueAnimator2.setDuration(i * f2);
                this.x.start();
                return;
            }
            if (true == z) {
                i2 = 255;
            }
            drawable.setAlpha(i2);
            this.u = f;
        }
    }

    public final void g(ivl ivlVar) {
        this.n = ivlVar;
        this.d.cy(ivlVar);
        this.d.w = !r0.T();
        this.e.cy(ivlVar);
        ivf ivfVar = this.w;
        if (ivfVar != null) {
            ivfVar.cy(ivlVar);
        }
    }

    public final void h() {
        Drawable drawable;
        Drawable drawable2 = this.j;
        if (n()) {
            drawable = c();
        } else {
            drawable = this.e;
        }
        this.j = drawable;
        if (drawable2 != drawable) {
            if (Build.VERSION.SDK_INT >= 23 && (this.b.getForeground() instanceof InsetDrawable)) {
                ((InsetDrawable) this.b.getForeground()).setDrawable(drawable);
            } else {
                this.b.setForeground(d(drawable));
            }
        }
    }

    public final void i() {
        float o;
        float f = 0.0f;
        if (!l() && !m()) {
            o = 0.0f;
        } else {
            o = o();
        }
        MaterialCardView materialCardView = this.b;
        if (materialCardView.b && materialCardView.a) {
            f = (float) ((1.0d - v) * lb.c(materialCardView.f));
        }
        float f2 = o - f;
        MaterialCardView materialCardView2 = this.b;
        int i = (int) f2;
        materialCardView2.c.set(this.c.left + i, this.c.top + i, this.c.right + i, this.c.bottom + i);
        lb.d(materialCardView2.f);
    }

    public final boolean j() {
        if ((this.h & 80) == 80) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.h & 8388613) == 8388613) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.b.b && !p()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.b.b && p() && this.b.a) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.b.isClickable()) {
            return true;
        }
        View view = this.b;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }
}
