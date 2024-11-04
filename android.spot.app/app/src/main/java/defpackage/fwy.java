package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwy {
    public static final Object a;
    public static boolean b;
    private static Method c;

    static {
        int i = fgq.c;
        a = new Object();
        c = null;
        b = false;
    }

    public static void a(Context context, String str) {
        String th;
        try {
            if (c == null) {
                c = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    th = e.toString();
                } else {
                    th = cause.toString();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(th)));
            }
            throw new fhb();
        }
    }
}
