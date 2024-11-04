package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jv {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {R.attr.state_checked};
    private static final int[] c = new int[0];

    static {
        new Rect();
    }

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        if (Build.VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            b(drawable);
        } else if (Build.VERSION.SDK_INT >= 29 && Build.VERSION.SDK_INT < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            b(drawable);
        }
    }

    private static void b(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(c);
        } else {
            drawable.setState(b);
        }
        drawable.setState(state);
    }
}
