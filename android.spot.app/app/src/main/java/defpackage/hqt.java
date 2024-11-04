package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.WindowManager;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqt {
    public static volatile long a;
    private static volatile float b;

    private hqt() {
    }

    public static jer a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return jdl.a;
        }
        float f = b;
        if (f == 0.0f) {
            synchronized (hqt.class) {
                f = b;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    b = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return jer.i(Float.valueOf(f));
    }

    public static void b(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        executor.execute(jbn.f(new bxi(level, th, str, objArr, 5)));
    }

    public static void c(Level level, Executor executor, String str, Object... objArr) {
        b(level, executor, null, str, objArr);
    }

    public static Object d(hvh hvhVar) {
        try {
            return hvhVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return hvhVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static File e(Uri uri) {
        if (uri.getScheme().equals("file")) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getAuthority())) {
                    return new File(uri.getPath());
                }
                throw new ikh("Did not expect uri to have authority");
            }
            throw new ikh("Did not expect uri to have query");
        }
        throw new ikh("Scheme must be 'file'");
    }

    public static File f(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            SystemClock.sleep(100L);
            filesDir = context.getFilesDir();
            if (filesDir == null) {
                throw new IllegalStateException("getFilesDir returned null twice.");
            }
        }
        return filesDir;
    }

    public static boolean g(lim limVar, lim limVar2, lim limVar3, jer jerVar, jer jerVar2) {
        if (limVar2.z()) {
            return false;
        }
        int[] iArr = new int[8];
        lim r = limVar.r(limVar3);
        if (jerVar.g()) {
            r = r.r((lim) jerVar.c());
        }
        if (jerVar2.g()) {
            r = r.r((lim) jerVar2.c());
        }
        ijm.i(r).m().asIntBuffer().get(iArr);
        for (int i = 0; i < 8; i++) {
            int P = (int) (ivc.P(iArr[i]) % ivc.P(limVar2.d() * 8));
            if (((1 << (P % 8)) & limVar2.a(P / 8)) == 0) {
                return false;
            }
        }
        return true;
    }

    public static jjr h(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                return jmo.a;
            }
            return jjr.r(ihx.RIGHT_BUD, ihx.LEFT_BUD, ihx.CASE, ihx.BOTH_BUDS, ihx.CASE_WITH_BOTH_BUDS);
        }
        return jjr.p(ihx.RIGHT_BUD, ihx.LEFT_BUD, ihx.BOTH_BUDS);
    }

    public static jjr k(int i) {
        int i2 = i - 2;
        if (i2 != 2) {
            if (i2 != 3) {
                return new jms(kyh.DEVICE_COMPONENT_UNSPECIFIED);
            }
            return jjr.p(kyh.DEVICE_COMPONENT_RIGHT, kyh.DEVICE_COMPONENT_LEFT, kyh.DEVICE_COMPONENT_CASE);
        }
        return jjr.o(kyh.DEVICE_COMPONENT_RIGHT, kyh.DEVICE_COMPONENT_LEFT);
    }

    public static boolean l(int i) {
        int i2 = i - 2;
        if (i2 != 2 && i2 != 3) {
            return false;
        }
        return true;
    }

    public hqt(byte[] bArr) {
    }
}
