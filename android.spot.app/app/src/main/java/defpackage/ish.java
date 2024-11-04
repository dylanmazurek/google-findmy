package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ish {
    public final TimeInterpolator a = bza.c(0.1f, 0.1f, 0.0f, 1.0f);
    public final View b;
    public final int c;
    public final int d;
    public final int e;
    public nu f;
    private final float g;
    private final float h;

    public ish(View view) {
        this.b = view;
        Context context = view.getContext();
        this.c = hzc.n(context, R.attr.motionDurationMedium2, 300);
        this.d = hzc.n(context, R.attr.motionDurationShort3, 150);
        this.e = hzc.n(context, R.attr.motionDurationShort2, 100);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final Animator a() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.b, (Property<View, Float>) View.SCALE_Y, 1.0f));
        View view = this.b;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new ced());
        return animatorSet;
    }

    public final void b(float f) {
        float f2;
        float interpolation = this.a.getInterpolation(f);
        float width = this.b.getWidth();
        float height = this.b.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f3 = this.g / width;
            float f4 = this.h / height;
            TimeInterpolator timeInterpolator = inc.a;
            float f5 = 1.0f - (((f3 + 0.0f) * interpolation) + 0.0f);
            this.b.setScaleX(f5);
            this.b.setPivotY(height);
            float f6 = 1.0f - ((interpolation * (f4 + 0.0f)) + 0.0f);
            this.b.setScaleY(f6);
            View view = this.b;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    childAt.setPivotY(-childAt.getTop());
                    if (f6 != 0.0f) {
                        f2 = f5 / f6;
                    } else {
                        f2 = 1.0f;
                    }
                    childAt.setScaleY(f2);
                }
            }
        }
    }
}
