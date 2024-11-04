package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwc {
    static int a(View view) {
        int scrollIndicators;
        scrollIndicators = view.getScrollIndicators();
        return scrollIndicators;
    }

    public static bya b(View view) {
        WindowInsets rootWindowInsets;
        rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        bya m = bya.m(rootWindowInsets);
        m.q(m);
        m.o(view.getRootView());
        return m;
    }

    static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
