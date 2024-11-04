package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frn {
    private static final String a = "frn";
    private static boolean b = false;
    private static frm c = frm.LEGACY;

    private frn() {
    }

    public static synchronized void a(Context context) {
        synchronized (frn.class) {
            b(context, null, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:15|16|(1:18)(2:51|(1:53)(1:54))|19|(1:21)(2:47|(1:49)(1:50))|22|(1:24)|26|27|(8:29|(1:(1:32))|33|34|(1:36)|37|38|(3:40|41|42))|46|33|34|(0)|37|38|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a5, code lost:            r7 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:            android.util.Log.e(defpackage.frn.a, "Failed to retrieve renderer type or log initialization.", r7);     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[Catch: RemoteException -> 0x00a5, all -> 0x00c6, TryCatch #3 {RemoteException -> 0x00a5, blocks: (B:34:0x0086, B:36:0x008c, B:37:0x0090), top: B:33:0x0086, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000c, B:14:0x0013, B:16:0x0017, B:19:0x003b, B:22:0x0065, B:24:0x006c, B:27:0x0074, B:29:0x007a, B:34:0x0086, B:36:0x008c, B:37:0x0090, B:38:0x00ad, B:40:0x00b4, B:45:0x00a6, B:47:0x0053, B:49:0x005d, B:50:0x0060, B:51:0x0029, B:53:0x0033, B:54:0x0036, B:56:0x00be, B:57:0x00c3), top: B:3:0x0003, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void b(android.content.Context r7, defpackage.frm r8, defpackage.fma r9) {
        /*
            java.lang.Class<frn> r0 = defpackage.frn.class
            monitor-enter(r0)
            java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Lc6
            boolean r1 = defpackage.frn.b     // Catch: java.lang.Throwable -> Lc6
            if (r1 == 0) goto L13
            if (r9 == 0) goto Lbb
            frm r7 = defpackage.frn.c     // Catch: java.lang.Throwable -> Lc6
            defpackage.fma.bW(r7)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r0)
            return
        L13:
            frr r1 = defpackage.fry.a(r7, r8)     // Catch: defpackage.fhb -> Lc4 java.lang.Throwable -> Lc6
            android.os.Parcel r2 = r1.a()     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            r3 = 4
            android.os.Parcel r2 = r1.b(r3, r2)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            android.os.IBinder r3 = r2.readStrongBinder()     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            r4 = 0
            if (r3 != 0) goto L29
            r5 = r4
            goto L3b
        L29:
            java.lang.String r5 = "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate"
            android.os.IInterface r5 = r3.queryLocalInterface(r5)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            boolean r6 = r5 instanceof defpackage.frq     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            if (r6 == 0) goto L36
            frq r5 = (defpackage.frq) r5     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            goto L3b
        L36:
            frq r5 = new frq     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            r5.<init>(r3)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
        L3b:
            r2.recycle()     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            defpackage.fma.aR(r5)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            defpackage.frx.c = r5     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            android.os.Parcel r2 = r1.a()     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            r3 = 5
            android.os.Parcel r2 = r1.b(r3, r2)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            android.os.IBinder r3 = r2.readStrongBinder()     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            if (r3 != 0) goto L53
            goto L65
        L53:
            java.lang.String r4 = "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            boolean r5 = r4 instanceof defpackage.fsd     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            if (r5 == 0) goto L60
            fsd r4 = (defpackage.fsd) r4     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            goto L65
        L60:
            fsd r4 = new fsd     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            r4.<init>(r3)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
        L65:
            r2.recycle()     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            fsd r2 = defpackage.frx.b     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            if (r2 != 0) goto L73
            java.lang.String r2 = "delegate must not be null"
            defpackage.fma.aS(r4, r2)     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
            defpackage.frx.b = r4     // Catch: android.os.RemoteException -> Lbd java.lang.Throwable -> Lc6
        L73:
            r2 = 1
            defpackage.frn.b = r2     // Catch: java.lang.Throwable -> Lc6
            r3 = 2
            r4 = 0
            if (r8 == 0) goto L85
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> Lc6
            if (r8 == 0) goto L86
            if (r8 == r2) goto L83
            goto L85
        L83:
            r2 = 2
            goto L86
        L85:
            r2 = 0
        L86:
            int r8 = r1.e()     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            if (r8 != r3) goto L90
            frm r8 = defpackage.frm.LATEST     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            defpackage.frn.c = r8     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
        L90:
            fmm r8 = new fmm     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            r8.<init>(r7)     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            android.os.Parcel r7 = r1.a()     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            defpackage.duh.d(r7, r8)     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            r7.writeInt(r2)     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            r8 = 10
            r1.c(r8, r7)     // Catch: android.os.RemoteException -> La5 java.lang.Throwable -> Lc6
            goto Lad
        La5:
            r7 = move-exception
            java.lang.String r8 = defpackage.frn.a     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r8, r1, r7)     // Catch: java.lang.Throwable -> Lc6
        Lad:
            frm r7 = defpackage.frn.c     // Catch: java.lang.Throwable -> Lc6
            java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto Lbb
            frm r7 = defpackage.frn.c     // Catch: java.lang.Throwable -> Lc6
            defpackage.fma.bW(r7)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r0)
            return
        Lbb:
            monitor-exit(r0)
            return
        Lbd:
            r7 = move-exception
            fsc r8 = new fsc     // Catch: java.lang.Throwable -> Lc6
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Lc6
            throw r8     // Catch: java.lang.Throwable -> Lc6
        Lc4:
            monitor-exit(r0)
            return
        Lc6:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frn.b(android.content.Context, frm, fma):void");
    }
}
