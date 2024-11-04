package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.provider.Settings;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqg implements Handler.Callback, ServiceConnection {
    public final Handler a;
    private final Context b;
    private final HandlerThread c;
    private final Map d = new HashMap();
    private Set e = new HashSet();

    public bqg(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.c = handlerThread;
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper(), this);
    }

    private final void a(bqf bqfVar) {
        if (bqfVar.b) {
            this.b.unbindService(this);
            bqfVar.b = false;
        }
        bqfVar.c = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008a, code lost:            c(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x008d, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:            if (r6.c != null) goto L16;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:            r0 = (defpackage.bqe) r6.d.peek();     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:            if (r0 != null) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:            r2 = r6.c;        r3 = r0.c;        r2.a(r0.a, r0.b, r3);        r6.d.remove();     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:            if (r6.d.isEmpty() != false) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:            c(r6);     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:            r2 = r6.a;        java.util.Objects.toString(r2);        android.util.Log.w("NotifManCompat", "RemoteException communicating with ".concat(java.lang.String.valueOf(r2)), r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0047, code lost:            if (r6.b != false) goto L14;     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void b(defpackage.bqf r6) {
        /*
            r5 = this;
            java.util.ArrayDeque r0 = r6.d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            goto L89
        La:
            boolean r0 = r6.b
            java.lang.String r1 = "NotifManCompat"
            if (r0 == 0) goto L11
            goto L49
        L11:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r0.<init>(r2)
            android.content.ComponentName r2 = r6.a
            android.content.Intent r0 = r0.setComponent(r2)
            android.content.Context r2 = r5.b
            r3 = 33
            boolean r0 = r2.bindService(r0, r5, r3)
            r6.b = r0
            if (r0 == 0) goto L2e
            r0 = 0
            r6.e = r0
            goto L45
        L2e:
            android.content.ComponentName r0 = r6.a
            java.util.Objects.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Unable to bind to listener "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.w(r1, r0)
            android.content.Context r0 = r5.b
            r0.unbindService(r5)
        L45:
            boolean r0 = r6.b
            if (r0 == 0) goto L8a
        L49:
            bt r0 = r6.c
            if (r0 == 0) goto L8a
        L4d:
            java.util.ArrayDeque r0 = r6.d
            java.lang.Object r0 = r0.peek()
            bqe r0 = (defpackage.bqe) r0
            if (r0 != 0) goto L58
            goto L7e
        L58:
            bt r2 = r6.c     // Catch: android.os.RemoteException -> L69 android.os.DeadObjectException -> L7d
            android.app.Notification r3 = r0.c     // Catch: android.os.RemoteException -> L69 android.os.DeadObjectException -> L7d
            java.lang.String r4 = r0.b     // Catch: android.os.RemoteException -> L69 android.os.DeadObjectException -> L7d
            java.lang.String r0 = r0.a     // Catch: android.os.RemoteException -> L69 android.os.DeadObjectException -> L7d
            r2.a(r0, r4, r3)     // Catch: android.os.RemoteException -> L69 android.os.DeadObjectException -> L7d
            java.util.ArrayDeque r0 = r6.d     // Catch: android.os.RemoteException -> L69 android.os.DeadObjectException -> L7d
            r0.remove()     // Catch: android.os.RemoteException -> L69 android.os.DeadObjectException -> L7d
            goto L4d
        L69:
            r0 = move-exception
            android.content.ComponentName r2 = r6.a
            java.util.Objects.toString(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "RemoteException communicating with "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.w(r1, r2, r0)
            goto L7e
        L7d:
        L7e:
            java.util.ArrayDeque r0 = r6.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L89
            r5.c(r6)
        L89:
            return
        L8a:
            r5.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqg.b(bqf):void");
    }

    private final void c(bqf bqfVar) {
        if (this.a.hasMessages(3, bqfVar.a)) {
            return;
        }
        int i = bqfVar.e + 1;
        bqfVar.e = i;
        if (i > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + bqfVar.d.size() + " tasks to " + bqfVar.a + " after " + bqfVar.e + " retries");
            bqfVar.d.clear();
            return;
        }
        this.a.sendMessageDelayed(this.a.obtainMessage(3, bqfVar.a), (1 << r0) * 1000);
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, android.os.IBinder] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Set set;
        bt brVar;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    bqf bqfVar = (bqf) this.d.get((ComponentName) message.obj);
                    if (bqfVar != null) {
                        b(bqfVar);
                    }
                    return true;
                }
                bqf bqfVar2 = (bqf) this.d.get((ComponentName) message.obj);
                if (bqfVar2 != null) {
                    a(bqfVar2);
                }
                return true;
            }
            elo eloVar = (elo) message.obj;
            Object obj = eloVar.b;
            ?? r10 = eloVar.a;
            bqf bqfVar3 = (bqf) this.d.get(obj);
            if (bqfVar3 != null) {
                int i2 = bs.a;
                if (r10 == 0) {
                    brVar = null;
                } else {
                    IInterface queryLocalInterface = r10.queryLocalInterface(bs.b);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof bt)) {
                        brVar = (bt) queryLocalInterface;
                    } else {
                        brVar = new br(r10);
                    }
                }
                bqfVar3.c = brVar;
                bqfVar3.e = 0;
                b(bqfVar3);
            }
            return true;
        }
        bqe bqeVar = (bqe) message.obj;
        Context context = this.b;
        Object obj2 = bqh.a;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (bqh.a) {
            if (string != null) {
                if (!string.equals(bqh.b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    bqh.c = hashSet;
                    bqh.b = string;
                }
            }
            set = bqh.c;
        }
        if (!set.equals(this.e)) {
            this.e = set;
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ComponentName componentName = new ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", a.af(componentName, "Permission present on component ", ", not adding listener record."));
                    } else {
                        hashSet2.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet2) {
                if (!this.d.containsKey(componentName2)) {
                    this.d.put(componentName2, new bqf(componentName2));
                }
            }
            Iterator it = this.d.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    a((bqf) entry.getValue());
                    it.remove();
                }
            }
        }
        for (bqf bqfVar4 : this.d.values()) {
            bqfVar4.d.add(bqeVar);
            b(bqfVar4);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.obtainMessage(1, new elo(componentName, iBinder, (char[]) null)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.obtainMessage(2, componentName).sendToTarget();
    }
}
