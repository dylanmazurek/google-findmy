package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fuv {
    public static String b = "0";
    private static final String c = "fuv";
    private static fmz e;
    private static final fgq d = fgq.d;
    public static final Object a = new Object();

    private fuv() {
    }

    public static fmz a() {
        fmz fmzVar;
        synchronized (a) {
            fmzVar = e;
        }
        return fmzVar;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            fma.aS(context, "Context must not be null");
            ClassLoader classLoader = fuv.class.getClassLoader();
            fma.aR(classLoader);
            try {
                classLoader.loadClass("org.chromium.net.CronetEngine");
                fhd.d(context, 11925000);
                try {
                    fmz b2 = fmz.b(context, fmz.a, "com.google.android.gms.cronet_dynamite");
                    try {
                        Class<?> loadClass = b2.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                        if (loadClass.getClassLoader() != fuv.class.getClassLoader()) {
                            Method method = loadClass.getMethod("getApiLevel", null);
                            Method method2 = loadClass.getMethod("getCronetVersion", null);
                            Integer num = (Integer) d(method, new Object[0]);
                            fma.aR(num);
                            int intValue = num.intValue();
                            String str = (String) d(method2, new Object[0]);
                            fma.aR(str);
                            b = str;
                            if (intValue < 3) {
                                Intent h = d.h(context, 2, "cr");
                                if (h == null) {
                                    Log.e(c, "Unable to fetch error resolution intent");
                                    throw new fhb();
                                }
                                throw new fhc("Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + intValue + ". The Cronet implementation version is " + b, h);
                            }
                            e = b2;
                            return;
                        }
                        Log.e(c, "ImplVersion class is missing from Cronet module.");
                        throw new fhb();
                    } catch (Exception e2) {
                        Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                        throw ((fhb) new fhb().initCause(e2));
                    }
                } catch (fmv e3) {
                    Log.e(c, "Unable to load Cronet module", e3);
                    throw ((fhb) new fhb().initCause(e3));
                }
            } catch (ClassNotFoundException e4) {
                Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                throw ((fhb) new fhb().initCause(e4));
            }
        }
    }

    public static boolean c() {
        if (a() != null) {
            return true;
        }
        return false;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}
