package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzv {
    static int a(PopupWindow popupWindow) {
        int windowLayoutType;
        windowLayoutType = popupWindow.getWindowLayoutType();
        return windowLayoutType;
    }

    public static void b(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    public static void c(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    static boolean d(PopupWindow popupWindow) {
        boolean overlapAnchor;
        overlapAnchor = popupWindow.getOverlapAnchor();
        return overlapAnchor;
    }
}
