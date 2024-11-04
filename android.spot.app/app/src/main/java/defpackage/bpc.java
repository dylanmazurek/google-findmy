package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpc {
    protected static final Class a;
    public static final Field b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            defpackage.bpc.g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            defpackage.bpc.a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r0
        L24:
            defpackage.bpc.b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r2 = r0
        L34:
            defpackage.bpc.c = r2
            java.lang.Class r2 = defpackage.bpc.a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L41
        L3f:
            r2 = r0
            goto L59
        L41:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L57
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L57
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L57
            r7[r1] = r8     // Catch: java.lang.Throwable -> L57
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L57
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L57
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            goto L3f
        L59:
            defpackage.bpc.d = r2
            java.lang.Class r2 = defpackage.bpc.a
            if (r2 != 0) goto L61
        L5f:
            r2 = r0
            goto L75
        L61:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L73
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L73
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L73
            r7[r1] = r8     // Catch: java.lang.Throwable -> L73
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L73
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L73
            goto L75
        L73:
            goto L5f
        L75:
            defpackage.bpc.e = r2
            boolean r2 = a()
            if (r2 == 0) goto Lb2
            java.lang.Class r2 = defpackage.bpc.a
            if (r2 != 0) goto L82
            goto Lb2
        L82:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch: java.lang.Throwable -> Lb2
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb2
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb2
            r5 = 4
            r7[r5] = r3     // Catch: java.lang.Throwable -> Lb2
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r6 = 5
            r7[r6] = r5     // Catch: java.lang.Throwable -> Lb2
            r6 = 6
            r7[r6] = r5     // Catch: java.lang.Throwable -> Lb2
            r5 = 7
            r7[r5] = r3     // Catch: java.lang.Throwable -> Lb2
            r5 = 8
            r7[r5] = r3     // Catch: java.lang.Throwable -> Lb2
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lb2
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> Lb2
            r0 = r2
        Lb2:
            defpackage.bpc.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpc.<clinit>():void");
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT != 26 && Build.VERSION.SDK_INT != 27) {
            return false;
        }
        return true;
    }
}
