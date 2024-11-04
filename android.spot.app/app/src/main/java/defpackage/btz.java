package defpackage;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btz {
    private static Method a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                return btx.a((Locale) a.invoke(null, locale));
            } catch (IllegalAccessException e) {
                Log.w("ICUCompat", e);
                return btx.a(locale);
            } catch (InvocationTargetException e2) {
                Log.w("ICUCompat", e2);
                return btx.a(locale);
            }
        }
        return bty.c(bty.a(bty.b(locale)));
    }
}
