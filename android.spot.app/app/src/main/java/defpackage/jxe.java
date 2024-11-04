package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.hardware.techeng.sensors.finder.Status;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jxe implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jxe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.Map$Entry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, fri, frh, frj] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        ApplicationInfo applicationInfo;
        final boolean z = true;
        switch (this.b) {
            case 0:
                jyy jyyVar = jxp.a;
                try {
                    this.a.close();
                    return;
                } catch (Exception e) {
                    ivc.x(e);
                    jxp.a.a().logp(Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "lambda$closeQuietly$0", "thrown by close()", (Throwable) e);
                    return;
                }
            case 1:
                ((Future) ((AtomicReference) this.a).get()).cancel(false);
                return;
            case 2:
                ((jxp) this.a).b(jxn.WILL_CLOSE, jxn.CLOSING);
                ((jxp) this.a).c();
                ((jxp) this.a).b(jxn.CLOSING, jxn.CLOSED);
                return;
            case 3:
                this.a.cancel(false);
                return;
            case 4:
                ksg ksgVar = (ksg) ((njz) this.a.getKey()).a;
                if (ksgVar.b()) {
                    ksgVar.a.g();
                    return;
                }
                return;
            case 5:
                ((krc) this.a).i();
                return;
            case 6:
                ((krc) this.a).i();
                return;
            case 7:
                ksc.a((Intent) this.a);
                return;
            case 8:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.a;
                if (firebaseMessaging.i()) {
                    firebaseMessaging.g();
                    return;
                }
                return;
            case 9:
                final Context context = ((FirebaseMessaging) this.a).e;
                if (hwx.ap(context).getBoolean("proxy_notification_initialized", false)) {
                    return;
                }
                pt ptVar = new pt(10);
                try {
                    Context applicationContext = context.getApplicationContext();
                    PackageManager packageManager = applicationContext.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                        z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                if (!fma.y()) {
                    fma.o(null);
                    return;
                } else {
                    final bym bymVar = new bym((int[]) null);
                    ptVar.execute(new Runnable() { // from class: ksk
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object systemService;
                            String notificationDelegate;
                            Context context2 = context;
                            bym bymVar2 = bymVar;
                            try {
                                if (Binder.getCallingUid() != context2.getApplicationInfo().uid) {
                                    Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                } else {
                                    SharedPreferences.Editor edit = hwx.ap(context2).edit();
                                    edit.putBoolean("proxy_notification_initialized", true);
                                    edit.apply();
                                    systemService = context2.getSystemService((Class<Object>) NotificationManager.class);
                                    NotificationManager notificationManager = (NotificationManager) systemService;
                                    if (!z) {
                                        notificationDelegate = notificationManager.getNotificationDelegate();
                                        if ("com.google.android.gms".equals(notificationDelegate)) {
                                            notificationManager.setNotificationDelegate(null);
                                        }
                                    } else {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    }
                                }
                            } finally {
                                bymVar2.u(null);
                            }
                        }
                    });
                    return;
                }
            case 10:
                Object obj = this.a;
                synchronized (((nca) obj).c) {
                    SharedPreferences.Editor edit = ((nca) obj).a.edit();
                    Object obj2 = ((nca) obj).d;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) ((nca) obj).c).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) ((nca) obj).e);
                    }
                    edit.putString((String) obj2, sb.toString()).commit();
                }
                return;
            case 11:
                kuv kuvVar = (kuv) this.a;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + ((Intent) kuvVar.a).getAction() + " finishing.");
                kuvVar.f();
                return;
            case 12:
                ((kvd) this.a).b().d();
                return;
            case 13:
                ((kvi) this.a).b.d();
                return;
            case 14:
                kvt kvtVar = (kvt) this.a;
                if (!kvtVar.h) {
                    kvtVar.f = true;
                    kvtVar.b();
                    return;
                }
                return;
            case 15:
                kvp kvpVar = (kvp) this.a;
                if (!kvpVar.a) {
                    kvpVar.c.g();
                    return;
                }
                return;
            case 16:
                ((mjo) this.a).g();
                return;
            case 17:
                Object obj3 = this.a;
                kwu kwuVar = (kwu) obj3;
                synchronized (kwuVar.f) {
                    if (!((kwu) obj3).k) {
                        ((kwu) obj3).i = false;
                        return;
                    }
                    ((kwu) obj3).h.pollAndProcessOdometryUpdate(((kwu) obj3).l);
                    ((kwu) obj3).h.getEstimate(((kwu) obj3).l, ((kwu) obj3).j);
                    if (((kwu) obj3).j.status != Status.ESTIMATE_NOT_AVAILABLE) {
                        ((kwu) obj3).c(((kwu) obj3).j);
                    }
                    ((kwu) obj3).b(((kwu) obj3).j);
                    kwuVar.c.postDelayed(kwuVar.n, kwuVar.g);
                    return;
                }
            case 18:
                ((lbh) this.a).sendEmptyMessage(1);
                return;
            case 19:
                ?? r0 = this.a;
                lbk lbkVar = (lbk) r0;
                frk frkVar = lbkVar.a;
                if (frkVar != 0) {
                    frkVar.b(r0);
                    try {
                        Object obj4 = lbkVar.a.a;
                        fen fenVar = new fen((fri) r0, 10);
                        Parcel a = ((duf) obj4).a();
                        duh.d(a, fenVar);
                        ((duf) obj4).c(84, a);
                        lbkVar.a.c(r0);
                        try {
                            Object obj5 = lbkVar.a.a;
                            fen fenVar2 = new fen((lbk) r0, 12, (byte[]) null);
                            Parcel a2 = ((duf) obj5).a();
                            duh.d(a2, fenVar2);
                            ((duf) obj5).c(31, a2);
                            try {
                                Object obj6 = lbkVar.a.a;
                                fen fenVar3 = new fen((lbk) r0, 6);
                                Parcel a3 = ((duf) obj6).a();
                                duh.d(a3, fenVar3);
                                ((duf) obj6).c(33, a3);
                                return;
                            } catch (RemoteException e2) {
                                throw new fsc(e2);
                            }
                        } catch (RemoteException e3) {
                            throw new fsc(e3);
                        }
                    } catch (RemoteException e4) {
                        throw new fsc(e4);
                    }
                }
                return;
            default:
                mcq mcqVar = (mcq) this.a;
                List list = ((mft) mcqVar.b).c.e;
                lyp lypVar = mcqVar.h;
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    mcqVar.h = lypVar;
                    mhe mheVar = ((mcq) this.a).b;
                    mft mftVar = (mft) mheVar;
                    mftVar.c.d.a(2, "READY");
                    mftVar.c.f.execute(new meg(mheVar, 16));
                    return;
                }
                throw null;
        }
    }

    public jxe(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
