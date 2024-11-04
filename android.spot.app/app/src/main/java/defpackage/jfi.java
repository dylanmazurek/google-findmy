package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jfi {
    public static final /* synthetic */ int a = 0;
    private static final Object b;

    static {
        Object c = c();
        b = c;
        if (c != null) {
            d("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (c == null) {
            return;
        }
        e(c);
    }

    public static void a(Throwable th, Class cls) {
        if (!cls.isInstance(th)) {
        } else {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void b(Throwable th) {
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                return;
            } else {
                throw ((Error) th);
            }
        }
        throw ((RuntimeException) th);
    }

    private static Object c() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void e(Object obj) {
        try {
            Method d = d("getStackTraceDepth", Throwable.class);
            if (d == null) {
                return;
            }
            d.invoke(obj, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
