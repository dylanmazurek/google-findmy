package defpackage;

import android.graphics.Rect;
import android.view.DisplayCutout;
import android.view.View;
import com.google.android.apps.adm.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buu {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(DisplayCutout displayCutout) {
        int safeInsetBottom;
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(DisplayCutout displayCutout) {
        int safeInsetLeft;
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(DisplayCutout displayCutout) {
        int safeInsetRight;
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(DisplayCutout displayCutout) {
        int safeInsetTop;
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }

    static DisplayCutout e(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    static List f(DisplayCutout displayCutout) {
        List boundingRects;
        boundingRects = displayCutout.getBoundingRects();
        return boundingRects;
    }

    public static final void g(View view, cgq cgqVar) {
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, cgqVar);
    }
}
