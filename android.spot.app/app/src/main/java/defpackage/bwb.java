package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bwb {
    public static float a(View view) {
        return view.getElevation();
    }

    public static float b(View view) {
        return view.getTranslationZ();
    }

    public static float c(View view) {
        return view.getZ();
    }

    public static ColorStateList d(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode e(View view) {
        return view.getBackgroundTintMode();
    }

    public static bya f(View view, bya byaVar, Rect rect) {
        WindowInsets e = byaVar.e();
        if (e != null) {
            return bya.n(view.computeSystemWindowInsets(e, rect), view);
        }
        rect.setEmpty();
        return byaVar;
    }

    public static bya g(View view) {
        bxs bxpVar;
        if (!bxo.d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = bxo.a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) bxo.b.get(obj);
            Rect rect2 = (Rect) bxo.c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                bxpVar = new bxr();
            } else if (Build.VERSION.SDK_INT >= 29) {
                bxpVar = new bxq();
            } else {
                bxpVar = new bxp();
            }
            bxpVar.b(brq.c(rect));
            bxpVar.c(brq.c(rect2));
            bya a = bxpVar.a();
            a.q(a);
            a.o(view.getRootView());
            return a;
        } catch (IllegalAccessException e) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. ".concat(String.valueOf(e.getMessage())), e);
            return null;
        }
    }

    public static String h(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void l(View view, float f) {
        view.setElevation(f);
    }

    static void m(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void n(View view, bvj bvjVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, bvjVar);
        }
        if (bvjVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new bwa(view, bvjVar));
        }
    }

    public static void o(View view, String str) {
        view.setTransitionName(str);
    }

    public static void p(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void q(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(View view) {
        view.stopNestedScroll();
    }

    static boolean s(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    static boolean t(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    static boolean u(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    static boolean v(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    static boolean w(View view) {
        return view.hasNestedScrollingParent();
    }

    static boolean x(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean y(View view) {
        return view.isNestedScrollingEnabled();
    }

    static boolean z(View view, int i) {
        return view.startNestedScroll(i);
    }
}
