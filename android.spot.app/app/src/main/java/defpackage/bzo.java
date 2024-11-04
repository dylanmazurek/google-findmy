package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzo {
    public static long a;
    public static Method b;
    public static Method c;
    private static Method d;

    public static float a(EdgeEffect edgeEffect) {
        float distance;
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        float onPullDistance;
        try {
            onPullDistance = edgeEffect.onPullDistance(f, f2);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static String d(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static void e(String str) {
        Trace.beginSection(d(str));
    }

    public static boolean f() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                if (d == null) {
                    a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean) d.invoke(null, Long.valueOf(a))).booleanValue();
            } catch (Exception e) {
                g(e);
                return false;
            }
        }
        return clj.a();
    }

    public static void g(Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
