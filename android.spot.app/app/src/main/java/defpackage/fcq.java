package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcq implements ServiceConnection {
    public volatile boolean a;
    public final /* synthetic */ fcr b;
    public volatile fdk c;

    /* JADX INFO: Access modifiers changed from: protected */
    public fcq(fcr fcrVar) {
        this.b = fcrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062 A[Catch: all -> 0x0044, TRY_ENTER, TryCatch #0 {all -> 0x0044, blocks: (B:5:0x0008, B:12:0x0015, B:14:0x0021, B:16:0x002b, B:18:0x0033, B:33:0x0047, B:28:0x0050, B:20:0x0062, B:22:0x0066, B:26:0x007d, B:34:0x002e, B:35:0x003b), top: B:3:0x0006, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ServiceConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "AnalyticsServiceConnection.onServiceConnected"
            defpackage.fma.aJ(r4)
            monitor-enter(r3)
            if (r5 != 0) goto L14
            fcr r4 = r3.b     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "Service connected with null binder"
            r4.u(r5)     // Catch: java.lang.Throwable -> L44
            r3.notifyAll()     // Catch: java.lang.Throwable -> L88
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            return
        L14:
            r4 = 0
            java.lang.String r0 = r5.getInterfaceDescriptor()     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            if (r1 == 0) goto L3b
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r5.queryLocalInterface(r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            boolean r1 = r0 instanceof defpackage.fdk     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            if (r1 == 0) goto L2e
            fdk r0 = (defpackage.fdk) r0     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            goto L33
        L2e:
            fdk r0 = new fdk     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
        L33:
            fcr r5 = r3.b     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L47
            java.lang.String r1 = "Bound to IAnalyticsService interface"
            r5.y(r1)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L47
            goto L4e
        L3b:
            fcr r5 = r3.b     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r5.v(r1, r0)     // Catch: java.lang.Throwable -> L44 android.os.RemoteException -> L46
            r0 = r4
            goto L4e
        L44:
            r4 = move-exception
            goto L84
        L46:
            r0 = r4
        L47:
            fcr r5 = r3.b     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "Service connect failed to get IAnalyticsService"
            r5.u(r1)     // Catch: java.lang.Throwable -> L44
        L4e:
            if (r0 != 0) goto L62
            flr r4 = defpackage.flr.a()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L7f
            fcr r5 = r3.b     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L7f
            android.content.Context r5 = r5.f()     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L7f
            fcr r0 = r3.b     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L7f
            fcq r0 = r0.a     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L7f
            r4.b(r5, r0)     // Catch: java.lang.Throwable -> L44 java.lang.IllegalArgumentException -> L7f
            goto L7f
        L62:
            boolean r5 = r3.a     // Catch: java.lang.Throwable -> L44
            if (r5 != 0) goto L7d
            fcr r5 = r3.b     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = "onServiceConnected received after the timeout limit"
            r5.B(r1)     // Catch: java.lang.Throwable -> L44
            fcr r5 = r3.b     // Catch: java.lang.Throwable -> L44
            fbm r5 = r5.h()     // Catch: java.lang.Throwable -> L44
            fbh r1 = new fbh     // Catch: java.lang.Throwable -> L44
            r2 = 3
            r1.<init>(r3, r0, r2, r4)     // Catch: java.lang.Throwable -> L44
            r5.c(r1)     // Catch: java.lang.Throwable -> L44
            goto L7f
        L7d:
            r3.c = r0     // Catch: java.lang.Throwable -> L44
        L7f:
            r3.notifyAll()     // Catch: java.lang.Throwable -> L88
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            return
        L84:
            r3.notifyAll()     // Catch: java.lang.Throwable -> L88
            throw r4     // Catch: java.lang.Throwable -> L88
        L88:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L88
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcq.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fma.aJ("AnalyticsServiceConnection.onServiceDisconnected");
        this.b.h().c(new fbh(this, componentName, 4));
    }
}
