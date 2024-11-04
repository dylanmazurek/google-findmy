package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hoa {
    public static volatile ActivityManager a;
    static volatile boolean b;
    private static volatile String c;

    private hoa() {
    }

    public static hob a(Context context) {
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            int i = jis.d;
            return new hob(false, jmi.a);
        }
        return new hob(true, jis.o(runningAppProcesses));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:            if (r2 == null) goto L23;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b() {
        /*
            java.lang.String r0 = defpackage.hoa.c
            if (r0 == 0) goto L5
            goto L44
        L5:
            int r0 = android.os.Process.myPid()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L40
        Ld:
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L37
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L37
            java.lang.String r4 = "/proc/"
            java.lang.String r5 = "/cmdline"
            java.lang.String r0 = defpackage.a.am(r0, r4, r5)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L37
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L37
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L37
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            r0.getClass()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            java.lang.String r1 = r0.trim()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2e
            goto L3b
        L2b:
            r0 = move-exception
            r1 = r2
            goto L31
        L2e:
            goto L39
        L30:
            r0 = move-exception
        L31:
            if (r1 == 0) goto L36
            r1.close()     // Catch: java.io.IOException -> L36
        L36:
            throw r0
        L37:
            r2 = r1
        L39:
            if (r2 == 0) goto L40
        L3b:
            r2.close()     // Catch: java.io.IOException -> L3f
            goto L40
        L3f:
        L40:
            if (r1 == 0) goto L44
            defpackage.hoa.c = r1
        L44:
            java.lang.String r0 = defpackage.hoa.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hoa.b():java.lang.String");
    }

    public static String c(String str, String str2) {
        if (str2 != null && str != null && str2.startsWith(str)) {
            int length = str.length();
            if (str2.length() == length) {
                return null;
            }
            return str2.substring(length + 1);
        }
        return str2;
    }

    public static boolean d(Context context) {
        Object systemService = context.getSystemService("power");
        systemService.getClass();
        return ((PowerManager) systemService).isInteractive();
    }

    public static boolean e(Context context, hob hobVar) {
        if (!hobVar.a) {
            return false;
        }
        jis<ActivityManager.RunningAppProcessInfo> a2 = hobVar.a();
        String packageName = context.getPackageName();
        String valueOf = String.valueOf(packageName);
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
            if (runningAppProcessInfo.importance == 100) {
                if (!runningAppProcessInfo.processName.equals(packageName)) {
                    if (runningAppProcessInfo.processName.startsWith(valueOf.concat(":"))) {
                    }
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    return true;
                }
                return d(context);
            }
        }
        return false;
    }
}
