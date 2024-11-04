package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.google.android.apps.adm.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxk extends bxn {
    public static final Interpolator a = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final Interpolator b = new cec();
    public static final Interpolator c = new DecelerateInterpolator();

    public bxk(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bxf b(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof bxj) {
            return ((bxj) tag).a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, bya byaVar, List list) {
        bxf b2 = b(view);
        if (b2 == null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    c(viewGroup.getChildAt(i), byaVar, list);
                }
                return;
            }
            return;
        }
        b2.c(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(View view, lrs lrsVar) {
        bxf b2 = b(view);
        if (b2 == null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    d(viewGroup.getChildAt(i), lrsVar);
                }
                return;
            }
            return;
        }
        b2.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view, lrs lrsVar, WindowInsets windowInsets, boolean z) {
        bxf b2 = b(view);
        if (b2 != null) {
            b2.a = windowInsets;
            if (!z) {
                b2.b();
                z = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), lrsVar, windowInsets, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, lrs lrsVar, bxe bxeVar) {
        bxf b2 = b(view);
        if (b2 == null) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    f(viewGroup.getChildAt(i), lrsVar, bxeVar);
                }
                return;
            }
            return;
        }
        b2.d();
    }
}
