package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qt {
    public qt(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
    }

    public static int a(BiometricManager biometricManager, int i) {
        int canAuthenticate;
        canAuthenticate = biometricManager.canAuthenticate(i);
        return canAuthenticate;
    }

    public static final Object b(moh mohVar, mmx mmxVar) {
        bcs bcsVar = (bcs) mmxVar.o().get(bcs.a);
        if (bcsVar == null) {
            return adl.b(mohVar, mmxVar);
        }
        new cao(mohVar, (mmx) null, 1);
        return bcsVar.a();
    }

    public static final boolean c() {
        Object obj;
        Method method;
        try {
            Boolean bool = null;
            if (baw.a == null) {
                baw.a = Class.forName("android.os.SystemProperties");
                Class cls = baw.a;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                baw.b = method;
            }
            Method method2 = baw.b;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", false);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = (Boolean) obj;
            }
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
