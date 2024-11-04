package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkx implements ServiceConnection {
    public final Map a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final fkv e;
    public ComponentName f;
    public final /* synthetic */ fkw g;

    public fkx(fkw fkwVar, fkv fkvVar) {
        this.g = fkwVar;
        this.e = fkvVar;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.a.containsKey(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2) {
        this.a.put(serviceConnection, serviceConnection2);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:5:0x001f, B:7:0x002b, B:9:0x0030, B:11:0x003c, B:15:0x0066, B:16:0x005b, B:19:0x004a, B:21:0x0077, B:23:0x0091, B:25:0x009d, B:29:0x00b4, B:31:0x00b7, B:34:0x0085), top: B:4:0x001f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[Catch: all -> 0x00c4, TRY_LEAVE, TryCatch #0 {all -> 0x00c4, blocks: (B:5:0x001f, B:7:0x002b, B:9:0x0030, B:11:0x003c, B:15:0x0066, B:16:0x005b, B:19:0x004a, B:21:0x0077, B:23:0x0091, B:25:0x009d, B:29:0x00b4, B:31:0x00b7, B:34:0x0085), top: B:4:0x001f, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            r1 = 3
            r10.b = r1
            android.os.StrictMode$VmPolicy r1 = android.os.StrictMode.getVmPolicy()
            boolean r2 = defpackage.a.f()
            if (r2 == 0) goto L1f
            android.os.StrictMode$VmPolicy$Builder r2 = new android.os.StrictMode$VmPolicy$Builder
            r2.<init>(r1)
            android.os.StrictMode$VmPolicy$Builder r2 = defpackage.fma.c(r2)
            android.os.StrictMode$VmPolicy r2 = r2.build()
            android.os.StrictMode.setVmPolicy(r2)
        L1f:
            fkw r2 = r10.g     // Catch: java.lang.Throwable -> Lc4
            flr r3 = r2.f     // Catch: java.lang.Throwable -> Lc4
            android.content.Context r4 = r2.d     // Catch: java.lang.Throwable -> Lc4
            fkv r2 = r10.e     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = r2.b     // Catch: java.lang.Throwable -> Lc4
            if (r5 == 0) goto L85
            boolean r5 = r2.f     // Catch: java.lang.Throwable -> Lc4
            r6 = 0
            if (r5 == 0) goto L75
            android.os.Bundle r5 = new android.os.Bundle     // Catch: java.lang.Throwable -> Lc4
            r5.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = "serviceActionBundleKey"
            java.lang.String r8 = r2.b     // Catch: java.lang.Throwable -> Lc4
            r5.putString(r7, r8)     // Catch: java.lang.Throwable -> Lc4
            android.content.ContentResolver r7 = r4.getContentResolver()     // Catch: java.lang.IllegalArgumentException -> L49 java.lang.Throwable -> Lc4
            android.net.Uri r8 = defpackage.fkv.a     // Catch: java.lang.IllegalArgumentException -> L49 java.lang.Throwable -> Lc4
            java.lang.String r9 = "serviceIntentCall"
            android.os.Bundle r5 = r7.call(r8, r9, r6, r5)     // Catch: java.lang.IllegalArgumentException -> L49 java.lang.Throwable -> Lc4
            goto L58
        L49:
            r5 = move-exception
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = "Dynamic intent resolution failed: "
            java.lang.String r5 = r7.concat(r5)     // Catch: java.lang.Throwable -> Lc4
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> Lc4
            r5 = r6
        L58:
            if (r5 != 0) goto L5b
            goto L64
        L5b:
            java.lang.String r6 = "serviceResponseIntentKey"
            android.os.Parcelable r5 = r5.getParcelable(r6)     // Catch: java.lang.Throwable -> Lc4
            android.content.Intent r5 = (android.content.Intent) r5     // Catch: java.lang.Throwable -> Lc4
            r6 = r5
        L64:
            if (r6 != 0) goto L75
            java.lang.String r5 = r2.b     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r7 = "Dynamic lookup for intent failed for action: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = r7.concat(r5)     // Catch: java.lang.Throwable -> Lc4
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> Lc4
        L75:
            if (r6 != 0) goto L91
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r5 = r2.b     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = r2.c     // Catch: java.lang.Throwable -> Lc4
            android.content.Intent r0 = r0.setPackage(r2)     // Catch: java.lang.Throwable -> Lc4
            goto L90
        L85:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> Lc4
            r0.<init>()     // Catch: java.lang.Throwable -> Lc4
            android.content.ComponentName r2 = r2.d     // Catch: java.lang.Throwable -> Lc4
            android.content.Intent r0 = r0.setComponent(r2)     // Catch: java.lang.Throwable -> Lc4
        L90:
            r6 = r0
        L91:
            r8 = 4225(0x1081, float:5.92E-42)
            r5 = r11
            r7 = r10
            boolean r11 = r3.d(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Lc4
            r10.c = r11     // Catch: java.lang.Throwable -> Lc4
            if (r11 == 0) goto Lb4
            fkw r11 = r10.g     // Catch: java.lang.Throwable -> Lc4
            android.os.Handler r11 = r11.e     // Catch: java.lang.Throwable -> Lc4
            fkv r0 = r10.e     // Catch: java.lang.Throwable -> Lc4
            r2 = 1
            android.os.Message r11 = r11.obtainMessage(r2, r0)     // Catch: java.lang.Throwable -> Lc4
            fkw r0 = r10.g     // Catch: java.lang.Throwable -> Lc4
            android.os.Handler r0 = r0.e     // Catch: java.lang.Throwable -> Lc4
            fkw r2 = r10.g     // Catch: java.lang.Throwable -> Lc4
            long r2 = r2.g     // Catch: java.lang.Throwable -> Lc4
            r0.sendMessageDelayed(r11, r2)     // Catch: java.lang.Throwable -> Lc4
            goto Lc0
        Lb4:
            r11 = 2
            r10.b = r11     // Catch: java.lang.Throwable -> Lc4
            fkw r11 = r10.g     // Catch: java.lang.IllegalArgumentException -> Lc0 java.lang.Throwable -> Lc4
            flr r0 = r11.f     // Catch: java.lang.IllegalArgumentException -> Lc0 java.lang.Throwable -> Lc4
            android.content.Context r11 = r11.d     // Catch: java.lang.IllegalArgumentException -> Lc0 java.lang.Throwable -> Lc4
            r0.b(r11, r10)     // Catch: java.lang.IllegalArgumentException -> Lc0 java.lang.Throwable -> Lc4
        Lc0:
            android.os.StrictMode.setVmPolicy(r1)
            return
        Lc4:
            r11 = move-exception
            android.os.StrictMode.setVmPolicy(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkx.d(java.lang.String):void");
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.c) {
            this.g.e.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }
}
