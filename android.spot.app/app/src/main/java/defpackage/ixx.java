package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ixx {
    private FrameLayout A;
    private final float B;
    public final Context a;
    public final TextInputLayout b;
    public Animator c;
    public int d;
    public int e;
    public CharSequence f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public int j;
    public int k;
    public ColorStateList l;
    public CharSequence m;
    public boolean n;
    public TextView o;
    public int p;
    public ColorStateList q;
    public Typeface r;
    private final int s;
    private final int t;
    private final int u;
    private final TimeInterpolator v;
    private final TimeInterpolator w;
    private final TimeInterpolator x;
    private LinearLayout y;
    private int z;

    public ixx(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.b = textInputLayout;
        this.B = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.s = hzc.n(context, R.attr.motionDurationShort4, 217);
        this.t = hzc.n(context, R.attr.motionDurationMedium4, 167);
        this.u = hzc.n(context, R.attr.motionDurationShort4, 167);
        this.v = hwx.h(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, inc.d);
        this.w = hwx.h(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, inc.a);
        this.x = hwx.h(context, R.attr.motionEasingLinearInterpolator, inc.a);
    }

    static final boolean n(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public static final void o(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private final int p(boolean z, int i, int i2) {
        if (z) {
            return this.a.getResources().getDimensionPixelSize(i);
        }
        return i2;
    }

    private final TextView q(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.o;
        }
        return this.h;
    }

    private final void r(List list, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        float f;
        int i4;
        TimeInterpolator timeInterpolator;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Property property = View.ALPHA;
                if (i3 == i) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, f);
                if (z2) {
                    i4 = this.t;
                } else {
                    i4 = this.u;
                }
                ofFloat.setDuration(i4);
                if (z2) {
                    timeInterpolator = this.w;
                } else {
                    timeInterpolator = this.x;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i3 == i && i2 != 0) {
                    ofFloat.setStartDelay(this.u);
                }
                list.add(ofFloat);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.B, 0.0f);
                    ofFloat2.setDuration(this.s);
                    ofFloat2.setInterpolator(this.v);
                    ofFloat2.setStartDelay(this.u);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public final void a(TextView textView, int i) {
        if (this.y == null && this.A == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.y = linearLayout;
            linearLayout.setOrientation(0);
            this.b.addView(this.y, -1, -2);
            this.A = new FrameLayout(this.a);
            this.y.addView(this.A, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.b.c != null) {
                b();
            }
        }
        if (n(i)) {
            this.A.setVisibility(0);
            this.A.addView(textView);
        } else {
            this.y.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.y.setVisibility(0);
        this.z++;
    }

    public final void b() {
        EditText editText;
        if (this.y != null && (editText = this.b.c) != null) {
            boolean k = hzc.k(this.a);
            this.y.setPaddingRelative(p(k, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingStart()), p(k, R.dimen.material_helper_text_font_1_3_padding_top, this.a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), p(k, R.dimen.material_helper_text_font_1_3_padding_horizontal, editText.getPaddingEnd()), 0);
        }
    }

    public final void c() {
        Animator animator = this.c;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d() {
        this.f = null;
        c();
        if (this.d == 1) {
            if (this.n && !TextUtils.isEmpty(this.m)) {
                this.e = 2;
            } else {
                this.e = 0;
            }
        }
        l(this.d, this.e, m(this.h, ""));
    }

    public final void e(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            if (n(i) && (frameLayout = this.A) != null) {
                frameLayout.removeView(textView);
            } else {
                linearLayout.removeView(textView);
            }
            int i2 = this.z - 1;
            this.z = i2;
            LinearLayout linearLayout2 = this.y;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final void f(int i) {
        this.j = i;
        TextView textView = this.h;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i);
        }
    }

    public final void g(CharSequence charSequence) {
        this.i = charSequence;
        TextView textView = this.h;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public final void h(int i) {
        this.k = i;
        TextView textView = this.h;
        if (textView != null) {
            this.b.v(textView, i);
        }
    }

    public final void i(ColorStateList colorStateList) {
        this.l = colorStateList;
        TextView textView = this.h;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void j(int i) {
        this.p = i;
        TextView textView = this.o;
        if (textView != null) {
            brh.j(textView, i);
        }
    }

    public final void k(ColorStateList colorStateList) {
        this.q = colorStateList;
        TextView textView = this.o;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void l(int i, int i2, boolean z) {
        TextView q;
        TextView q2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.c = animatorSet;
            ArrayList arrayList = new ArrayList();
            r(arrayList, this.n, this.o, 2, i, i2);
            r(arrayList, this.g, this.h, 1, i, i2);
            hrc.c(animatorSet, arrayList);
            animatorSet.addListener(new ixv(this, i2, q(i), i, q(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (q2 = q(i2)) != null) {
                q2.setVisibility(0);
                q2.setAlpha(1.0f);
            }
            if (i != 0 && (q = q(i)) != null) {
                q.setVisibility(4);
                if (i == 1) {
                    q.setText((CharSequence) null);
                }
            }
            this.d = i2;
        }
        this.b.x();
        this.b.z(z);
        this.b.B();
    }

    public final boolean m(TextView textView, CharSequence charSequence) {
        if (!this.b.isLaidOut() || !this.b.isEnabled()) {
            return false;
        }
        if (this.e == this.d && textView != null && TextUtils.equals(textView.getText(), charSequence)) {
            return false;
        }
        return true;
    }
}
