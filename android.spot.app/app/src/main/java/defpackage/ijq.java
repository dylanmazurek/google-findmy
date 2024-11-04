package defpackage;

import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijq {
    private static final Method a;

    static {
        Method method = null;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                method = cls.getMethod("get", String.class, String.class);
                cls.getMethod("getInt", String.class, Integer.TYPE);
                cls.getMethod("getLong", String.class, Long.TYPE);
                cls.getMethod("getBoolean", String.class, Boolean.TYPE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            a = method;
        }
    }

    public static String a(String str) {
        try {
            String str2 = (String) a.invoke(null, str, null);
            if ("".equals(str2)) {
                return null;
            }
            return str2;
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
            return null;
        }
    }
}
