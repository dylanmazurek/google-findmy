package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brd {
    public static int a(TypedArray typedArray, int i) {
        return typedArray.getType(i);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bzo.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float c(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bzo.b(edgeEffect, f, f2);
        }
        bzn.a(edgeEffect, f, f2);
        return f;
    }

    public static EdgeEffect d(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return bzo.c(context, attributeSet);
        }
        return new EdgeEffect(context);
    }
}
