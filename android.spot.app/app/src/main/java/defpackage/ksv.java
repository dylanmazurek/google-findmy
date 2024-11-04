package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksv implements Runnable {
    private static final Object c = new Object();
    private static Boolean d;
    private static Boolean e;
    public final Context a;
    public final kst b;
    private final ksj f;
    private final PowerManager.WakeLock g;
    private final long h;

    public ksv(kst kstVar, Context context, ksj ksjVar, long j) {
        this.b = kstVar;
        this.a = context;
        this.h = j;
        this.f = ksjVar;
        this.g = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    private static boolean b(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (c) {
            Boolean bool = d;
            if (bool == null) {
                booleanValue = c(context, "android.permission.WAKE_LOCK");
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            d = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean c(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public final synchronized boolean a() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null) {
            if (networkInfo.isConnected()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:            r4 = r3.b;        r5 = r4.hashCode();     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:            if (r5 == 83) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0081, code lost:            if (r5 == 85) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:            if (r4.equals("U") == false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:            r4 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:            if (r4 == 0) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:            if (r4 == 1) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:            r4 = r3.a;        r5 = r1.a;        r6 = r1.b.c();        r7 = new android.os.Bundle();        r7.putString("gcm.topic", "/topics/".concat(r4));        r7.putString("delete", "1");        defpackage.kst.a(defpackage.ksh.b(r5.a(r6, "/topics/".concat(r4), r7)));     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fc, code lost:            r1.d.c(r3);        r4 = r1.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0103, code lost:            monitor-enter(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0104, code lost:            r3 = r3.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:            if (r1.c.containsKey(r3) != false) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0111, code lost:            r5 = (java.util.ArrayDeque) r1.c.get(r3);        r6 = (defpackage.bym) r5.poll();     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x011f, code lost:            if (r6 == null) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:            r6.s(null);     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0129, code lost:            if (r5.isEmpty() == false) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012b, code lost:            r1.c.remove(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0130, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010e, code lost:            monitor-exit(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d1, code lost:            r4 = r3.a;        r5 = r1.a;        r6 = r1.b.c();        r7 = new android.os.Bundle();        r7.putString("gcm.topic", "/topics/".concat(r4));        defpackage.kst.a(defpackage.ksh.b(r5.a(r6, "/topics/".concat(r4), r7)));     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0098, code lost:            r4 = 65535;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0094, code lost:            if (r4.equals("S") == false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0096, code lost:            r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0136, code lost:            r1 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0141, code lost:            if ("SERVICE_NOT_AVAILABLE".equals(r1.getMessage()) == false) goto L67;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0154, code lost:            if (r1.getMessage() == null) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0156, code lost:            android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:            r10.b.d(r10.h);     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015e, code lost:            throw r1;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ksv.run():void");
    }
}
