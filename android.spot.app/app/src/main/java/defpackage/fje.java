package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fje implements Handler.Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object c = new Object();
    public static fje d;
    public final Context g;
    public final fgp h;
    public final Handler n;
    public volatile boolean o;
    public final frk p;
    private TelemetryData q;
    private flp s;
    public long e = 10000;
    public boolean f = false;
    public final AtomicInteger i = new AtomicInteger(1);
    public final AtomicInteger j = new AtomicInteger(0);
    public final Map k = new ConcurrentHashMap(5, 0.75f, 1);
    public fix l = null;
    public final Set m = new rz();
    private final Set r = new rz();

    private fje(Context context, Looper looper, fgp fgpVar) {
        this.o = true;
        this.g = context;
        fqw fqwVar = new fqw(looper, this);
        this.n = fqwVar;
        this.h = fgpVar;
        this.p = new frk(fgpVar);
        Boolean bool = flu.a;
        PackageManager packageManager = context.getPackageManager();
        if (flu.b == null) {
            flu.b = Boolean.valueOf(fma.w() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (flu.b.booleanValue()) {
            this.o = false;
        }
        fqwVar.sendMessage(fqwVar.obtainMessage(6));
    }

    public static Status a(fik fikVar, ConnectionResult connectionResult) {
        return new Status(17, "API: " + fikVar.a() + " is not available on this device. Connection failed with: " + String.valueOf(connectionResult), connectionResult.d, connectionResult);
    }

    public static fje c(Context context) {
        fje fjeVar;
        HandlerThread handlerThread;
        synchronized (c) {
            if (d == null) {
                synchronized (fkw.a) {
                    handlerThread = fkw.b;
                    if (handlerThread == null) {
                        fkw.b = new HandlerThread("GoogleApiHandler", 9);
                        fkw.b.start();
                        handlerThread = fkw.b;
                    }
                }
                d = new fje(context.getApplicationContext(), handlerThread.getLooper(), fgp.a);
            }
            fjeVar = d;
        }
        return fjeVar;
    }

    private final fjb j(fhq fhqVar) {
        Map map = this.k;
        fik fikVar = fhqVar.e;
        fjb fjbVar = (fjb) map.get(fikVar);
        if (fjbVar == null) {
            fjbVar = new fjb(this, fhqVar);
            this.k.put(fikVar, fjbVar);
        }
        if (fjbVar.p()) {
            this.r.add(fikVar);
        }
        fjbVar.d();
        return fjbVar;
    }

    private final void k() {
        TelemetryData telemetryData = this.q;
        if (telemetryData != null) {
            if (telemetryData.a > 0 || g()) {
                l().a(telemetryData);
            }
            this.q = null;
        }
    }

    private final flp l() {
        if (this.s == null) {
            this.s = new flp(this.g, fll.b);
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fjb b(fik fikVar) {
        return (fjb) this.k.get(fikVar);
    }

    public final void d(ConnectionResult connectionResult, int i) {
        if (!h(connectionResult, i)) {
            Handler handler = this.n;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public final void e() {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void f(fix fixVar) {
        synchronized (c) {
            if (this.l != fixVar) {
                this.l = fixVar;
                this.m.clear();
            }
            this.m.addAll(fixVar.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (this.f) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = flk.a().a;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        int f = this.p.f(203400000);
        if (f != -1 && f != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(ConnectionResult connectionResult, int i) {
        PendingIntent i2;
        Context context = this.g;
        if (fma.f(context)) {
            return false;
        }
        fgp fgpVar = this.h;
        if (connectionResult.a()) {
            i2 = connectionResult.d;
        } else {
            i2 = fgpVar.i(context, connectionResult.c, null);
        }
        if (i2 == null) {
            return false;
        }
        fgpVar.d(context, connectionResult.c, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, i2, i, true), fqs.a | 134217728));
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.Map, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Status status;
        Feature[] b2;
        long j = 300000;
        fjb fjbVar = null;
        switch (message.what) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.e = j;
                this.n.removeMessages(12);
                for (fik fikVar : this.k.keySet()) {
                    Handler handler = this.n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, fikVar), this.e);
                }
                return true;
            case 2:
                fil filVar = (fil) message.obj;
                Iterator it = ((rx) filVar.b).keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        fik fikVar2 = (fik) it.next();
                        fjb fjbVar2 = (fjb) this.k.get(fikVar2);
                        if (fjbVar2 == null) {
                            filVar.a(fikVar2, new ConnectionResult(13), null);
                        } else if (fjbVar2.b.m()) {
                            filVar.a(fikVar2, ConnectionResult.a, fjbVar2.b.i());
                        } else {
                            fma.aI(fjbVar2.k.n);
                            ConnectionResult connectionResult = fjbVar2.i;
                            if (connectionResult != null) {
                                filVar.a(fikVar2, connectionResult, null);
                            } else {
                                fma.aI(fjbVar2.k.n);
                                fjbVar2.d.add(filVar);
                                fjbVar2.d();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (fjb fjbVar3 : this.k.values()) {
                    fjbVar3.c();
                    fjbVar3.d();
                }
                return true;
            case 4:
            case 8:
            case 13:
                hxh hxhVar = (hxh) message.obj;
                fjb fjbVar4 = (fjb) this.k.get(((fhq) hxhVar.b).e);
                if (fjbVar4 == null) {
                    fjbVar4 = j((fhq) hxhVar.b);
                }
                if (fjbVar4.p() && this.j.get() != hxhVar.a) {
                    ((fij) hxhVar.c).d(a);
                    fjbVar4.n();
                } else {
                    fjbVar4.e((fij) hxhVar.c);
                }
                return true;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult2 = (ConnectionResult) message.obj;
                Iterator it2 = this.k.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        fjb fjbVar5 = (fjb) it2.next();
                        if (fjbVar5.f == i) {
                            fjbVar = fjbVar5;
                        }
                    }
                }
                if (fjbVar != null) {
                    if (connectionResult2.c == 13) {
                        int i2 = fhd.c;
                        fjbVar.f(new Status(17, "Error resolution was canceled by the user, original error message: CANCELED: " + connectionResult2.e));
                    } else {
                        fjbVar.f(a(fjbVar.c, connectionResult2));
                    }
                } else {
                    Log.wtf("GoogleApiManager", a.am(i, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                }
                return true;
            case 6:
                if (this.g.getApplicationContext() instanceof Application) {
                    fin.b((Application) this.g.getApplicationContext());
                    fin.a.a(new fja(this));
                    fin finVar = fin.a;
                    if (!finVar.c.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!finVar.c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            finVar.b.set(true);
                        }
                    }
                    if (!finVar.c()) {
                        this.e = 300000L;
                    }
                }
                return true;
            case 7:
                j((fhq) message.obj);
                return true;
            case 9:
                if (this.k.containsKey(message.obj)) {
                    fjb fjbVar6 = (fjb) this.k.get(message.obj);
                    fma.aI(fjbVar6.k.n);
                    if (fjbVar6.g) {
                        fjbVar6.d();
                    }
                }
                return true;
            case 10:
                ry ryVar = new ry((rz) this.r);
                while (ryVar.hasNext()) {
                    fjb fjbVar7 = (fjb) this.k.remove((fik) ryVar.next());
                    if (fjbVar7 != null) {
                        fjbVar7.n();
                    }
                }
                this.r.clear();
                return true;
            case 11:
                if (this.k.containsKey(message.obj)) {
                    fjb fjbVar8 = (fjb) this.k.get(message.obj);
                    fma.aI(fjbVar8.k.n);
                    if (fjbVar8.g) {
                        fjbVar8.o();
                        fje fjeVar = fjbVar8.k;
                        if (fjeVar.h.f(fjeVar.g) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        fjbVar8.f(status);
                        fjbVar8.b.f("Timing out connection while resuming.");
                    }
                }
                return true;
            case 12:
                if (this.k.containsKey(message.obj)) {
                    fjb fjbVar9 = (fjb) this.k.get(message.obj);
                    fma.aI(fjbVar9.k.n);
                    if (fjbVar9.b.m() && fjbVar9.e.isEmpty()) {
                        gok gokVar = fjbVar9.l;
                        if (gokVar.a.isEmpty() && gokVar.b.isEmpty()) {
                            fjbVar9.b.f("Timing out service connection.");
                        } else {
                            fjbVar9.m();
                        }
                    }
                }
                return true;
            case 14:
                throw null;
            case 15:
                fjc fjcVar = (fjc) message.obj;
                if (this.k.containsKey(fjcVar.a)) {
                    fjb fjbVar10 = (fjb) this.k.get(fjcVar.a);
                    if (fjbVar10.h.contains(fjcVar) && !fjbVar10.g) {
                        if (!fjbVar10.b.m()) {
                            fjbVar10.d();
                        } else {
                            fjbVar10.g();
                        }
                    }
                }
                return true;
            case 16:
                fjc fjcVar2 = (fjc) message.obj;
                if (this.k.containsKey(fjcVar2.a)) {
                    fjb fjbVar11 = (fjb) this.k.get(fjcVar2.a);
                    if (fjbVar11.h.remove(fjcVar2)) {
                        fjbVar11.k.n.removeMessages(15, fjcVar2);
                        fjbVar11.k.n.removeMessages(16, fjcVar2);
                        Feature feature = fjcVar2.b;
                        ArrayList arrayList = new ArrayList(fjbVar11.a.size());
                        for (fij fijVar : fjbVar11.a) {
                            if ((fijVar instanceof fid) && (b2 = ((fid) fijVar).b(fjbVar11)) != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= b2.length) {
                                        break;
                                    }
                                    if (amr.g(b2[0], feature)) {
                                        arrayList.add(fijVar);
                                    } else {
                                        i3 = 1;
                                    }
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            fij fijVar2 = (fij) arrayList.get(i4);
                            fjbVar11.a.remove(fijVar2);
                            fijVar2.e(new fic(feature));
                        }
                    }
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                fjq fjqVar = (fjq) message.obj;
                if (fjqVar.c == 0) {
                    l().a(new TelemetryData(fjqVar.b, Arrays.asList(fjqVar.a)));
                } else {
                    TelemetryData telemetryData = this.q;
                    if (telemetryData != null) {
                        List list = telemetryData.b;
                        if (telemetryData.a == fjqVar.b && (list == null || list.size() < fjqVar.d)) {
                            TelemetryData telemetryData2 = this.q;
                            MethodInvocation methodInvocation = fjqVar.a;
                            if (telemetryData2.b == null) {
                                telemetryData2.b = new ArrayList();
                            }
                            telemetryData2.b.add(methodInvocation);
                        } else {
                            this.n.removeMessages(17);
                            k();
                        }
                    }
                    if (this.q == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(fjqVar.a);
                        this.q = new TelemetryData(fjqVar.b, arrayList2);
                        Handler handler2 = this.n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), fjqVar.c);
                    }
                }
                return true;
            case 19:
                this.f = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
    }

    public final void i(bym bymVar, int i, fhq fhqVar) {
        long j;
        long j2;
        if (i != 0) {
            fik fikVar = fhqVar.e;
            fjp fjpVar = null;
            if (g()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = flk.a().a;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        fjb b2 = b(fikVar);
                        if (b2 != null) {
                            Object obj = b2.b;
                            if (obj instanceof fkn) {
                                fkn fknVar = (fkn) obj;
                                if (fknVar.B() && !fknVar.n()) {
                                    ConnectionTelemetryConfiguration b3 = fjp.b(b2, fknVar, i);
                                    if (b3 != null) {
                                        b2.j++;
                                        z = b3.c;
                                    }
                                }
                            }
                        }
                        z = z2;
                    }
                }
                if (z) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                if (z) {
                    j2 = SystemClock.elapsedRealtime();
                } else {
                    j2 = 0;
                }
                fjpVar = new fjp(this, i, fikVar, j, j2);
            }
            if (fjpVar != null) {
                Object obj2 = bymVar.a;
                Handler handler = this.n;
                handler.getClass();
                ((fxs) obj2).l(new fiz(handler, 0), fjpVar);
            }
        }
    }
}
