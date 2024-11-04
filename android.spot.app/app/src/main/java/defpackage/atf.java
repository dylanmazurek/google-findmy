package defpackage;

import android.os.Build;
import android.view.Surface;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atf {
    public static final atf a = new atf();
    private static Method b;
    private static boolean c;

    private atf() {
    }

    public final boolean a() {
        Method method;
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 22) {
            synchronized (this) {
                method = null;
                try {
                    Method method2 = b;
                    if (!c) {
                        c = true;
                        method2 = Surface.class.getDeclaredMethod("lockHardwareCanvas", null);
                        method2.setAccessible(true);
                        b = method2;
                    }
                    method = method2;
                } catch (Throwable unused) {
                    b = null;
                }
            }
            if (method != null) {
                return true;
            }
        }
        return false;
    }
}
