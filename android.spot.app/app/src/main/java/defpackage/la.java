package defpackage;

import android.content.Context;
import android.os.Build;
import android.transition.Transition;
import android.view.KeyEvent;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class la {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }

    public static boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 23 && context != null && context.getPackageManager() != null && ri.a(context.getPackageManager())) {
            return true;
        }
        return false;
    }

    public static final int d(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static final long e(KeyEvent keyEvent) {
        return lb.k(keyEvent.getKeyCode());
    }
}
