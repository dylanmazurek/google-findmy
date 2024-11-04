package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cms {
    public static final cmu a;
    static final Property b;

    static {
        cmu cmwVar;
        if (Build.VERSION.SDK_INT >= 29) {
            a = new cnb();
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                cmwVar = new cna();
            } else if (Build.VERSION.SDK_INT >= 22) {
                cmwVar = new cmy();
            } else {
                cmwVar = new cmw();
            }
            a = cmwVar;
        }
        b = new cmq(Float.class);
        new cmr(Rect.class);
    }

    public static float a(View view) {
        return a.a(view);
    }

    public static void b(View view, int i, int i2, int i3, int i4) {
        a.b(view, i, i2, i3, i4);
    }

    public static void c(View view, float f) {
        a.c(view, f);
    }

    public static void d(View view, int i) {
        a.d(view, i);
    }
}
