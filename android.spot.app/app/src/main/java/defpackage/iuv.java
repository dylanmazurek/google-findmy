package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuv {
    public static final /* synthetic */ int b = 0;
    private static final int[] c = {R.attr.state_pressed};
    private static final int[] d = {R.attr.state_focused};
    private static final int[] e = {R.attr.state_selected, R.attr.state_pressed};
    private static final int[] f = {R.attr.state_selected};
    private static final int[] g = {R.attr.state_enabled, R.attr.state_pressed};
    static final String a = "iuv";

    private iuv() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        int c2 = c(colorStateList, e);
        int[] iArr = d;
        return new ColorStateList(new int[][]{f, iArr, StateSet.NOTHING}, new int[]{c2, c(colorStateList, iArr), c(colorStateList, c)});
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT >= 22 && Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(g, 0)) != 0) {
                Log.w(a, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        int alpha = Color.alpha(i);
        return bro.c(i, Math.min(alpha + alpha, 255));
    }
}
