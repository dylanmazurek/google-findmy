package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.Trace;
import com.google.hardware.techeng.sensors.finder.Status;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hsi implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hsi(hzt hztVar, int i) {
        this.b = i;
        this.a = hztVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [jfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.concurrent.Future, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        long startElapsedRealtime;
        float f;
        Status status;
        boolean z = true;
        switch (this.b) {
            case 0:
                hsn hsnVar = (hsn) this.a;
                if (hsnVar.s.b == null) {
                    z = false;
                }
                hsnVar.e = z;
                return;
            case 1:
                hsn hsnVar2 = (hsn) this.a;
                if (hsnVar2.s.b == null) {
                    z = false;
                }
                hsnVar2.d = z;
                return;
            case 2:
                hsn hsnVar3 = (hsn) this.a;
                if (hsnVar3.s.b == null) {
                    z = false;
                }
                hsnVar3.f = z;
                return;
            case 3:
                int i = hsk.b;
                ijs.c();
                hsm hsmVar = (hsm) this.a;
                if (hsmVar.b.m != null) {
                    return;
                }
                hsmVar.b.m = hpj.a();
                return;
            case 4:
                int i2 = hsk.b;
                ijs.c();
                ?? r0 = this.a;
                hsm hsmVar2 = (hsm) r0;
                if (hsmVar2.b.n != null) {
                    return;
                }
                hsmVar2.b.n = hpj.a();
                long j = hsmVar2.b.n.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    startElapsedRealtime = Process.getStartElapsedRealtime();
                    Trace.setCounter("Primes-ttfdd-end-and-length-ms", j - startElapsedRealtime);
                    Trace.setCounter("Primes-ttfdd-end-and-length-ms", 0L);
                }
                hsmVar2.a.unregisterActivityLifecycleCallbacks(r0);
                return;
            case 5:
                ijs.c();
                hsm hsmVar3 = (hsm) this.a;
                if (hsmVar3.b.p != null) {
                    return;
                }
                hsmVar3.b.p = hpj.a();
                return;
            case 6:
                ijs.c();
                hsm hsmVar4 = (hsm) this.a;
                if (hsmVar4.b.o != null) {
                    return;
                }
                hsmVar4.b.o = hpj.a();
                return;
            case 7:
                Object obj = this.a;
                try {
                    AtomicReference atomicReference = ((htj) obj).b;
                    hot hotVar = ((htj) obj).c;
                    if (((hth) ((htj) obj).a.a()).b()) {
                        f = ((hth) ((htj) obj).a.a()).a;
                    } else {
                        f = 0.0f;
                    }
                    atomicReference.set(hotVar.b(f));
                    return;
                } catch (Throwable unused) {
                    htj htjVar = (htj) obj;
                    htjVar.b.set(htjVar.c.b(0.0f));
                    return;
                }
            case 8:
                ((BroadcastReceiver.PendingResult) this.a).finish();
                return;
            case 9:
                ((hxc) this.a).c();
                return;
            case 10:
                ((hxc) this.a).a();
                return;
            case 11:
                Object obj2 = this.a;
                hxc hxcVar = (hxc) obj2;
                if (hxcVar.d.equals("")) {
                    return;
                }
                hvq hvqVar = hxcVar.b;
                jyz b = hxg.b(hvqVar).b(new emc(hxcVar.c, 14), hvqVar.b());
                b.c(new hka(obj2, b, 10), hxcVar.b.b());
                return;
            case 12:
                throw new RuntimeException(((ExecutionException) this.a).getCause());
            case 13:
                try {
                    ivc.M(this.a);
                    return;
                } catch (ExecutionException e) {
                    ijs.e(new hsi(e, 12));
                    return;
                }
            case 14:
                if (((Boolean) ((hxh) this.a).c.a()).booleanValue()) {
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 15:
                try {
                    ivc.M(this.a);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 16:
                ((jni) ((jni) hyy.a.e()).j("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl", "startFusingAlgorithm", 269, "PrecisionRangingImpl.java")).r("Starting fusion algorithm.");
                Object obj3 = this.a;
                hyy hyyVar = (hyy) obj3;
                if (hyyVar.l.isEmpty()) {
                    hyyVar.l = Optional.of(new kwu((ncr) hyyVar.j.g.get()));
                }
                hyyVar.m = Optional.of(new njz(obj3, null));
                Object obj4 = hyyVar.l.get();
                Object obj5 = hyyVar.m.get();
                synchronized (((kwu) obj4).f) {
                    ((kwu) obj4).m.add(obj5);
                }
                Object obj6 = hyyVar.l.get();
                Context context = hyyVar.i;
                synchronized (((kwu) obj6).f) {
                    if (((kwu) obj6).k) {
                        status = Status.OK;
                    } else {
                        if (((kwu) obj6).e && ((kwu) obj6).b == null) {
                            ((kwu) obj6).b = new HandlerThread("MultiSensorFinder");
                            ((kwu) obj6).b.start();
                            ((kwu) obj6).c = new Handler(((kwu) obj6).b.getLooper());
                        }
                        long j2 = ((kwu) obj6).l;
                        if (j2 == 0) {
                            j2 = ((kwu) obj6).h.createSession(((kwu) obj6).d.g());
                            ((kwu) obj6).l = j2;
                        }
                        if (j2 == 0) {
                            ((jni) ((jni) kwu.a.g()).j("com/google/hardware/techeng/sensors/finder/ArCoreMultiSensorFinder", "start", 254, "ArCoreMultiSensorFinder.java")).r("Could not create session.");
                            status = Status.UNKNOWN_ERROR;
                        } else {
                            Status start = ((kwu) obj6).h.start(j2, context);
                            if (start != Status.OK) {
                                ((jni) ((jni) kwu.a.g()).j("com/google/hardware/techeng/sensors/finder/ArCoreMultiSensorFinder", "start", 261, "ArCoreMultiSensorFinder.java")).u("Could not start session: %s", start);
                                status = start;
                            } else {
                                ((kwu) obj6).k = true;
                                if (!((kwu) obj6).i) {
                                    ((kwu) obj6).c.post(((kwu) obj6).n);
                                    ((kwu) obj6).i = true;
                                }
                                status = Status.OK;
                            }
                        }
                    }
                }
                if (status != Status.OK) {
                    ((jni) ((jni) hyy.a.g()).j("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl", "startFusingAlgorithm", 280, "PrecisionRangingImpl.java")).u("Fusion algorithm start failed: %s", status);
                    return;
                }
                return;
            case 17:
                Status a = ((kwu) ((hyy) this.a).l.get()).a();
                if (a != Status.OK) {
                    ((jni) ((jni) hyy.a.g()).j("com/google/android/libraries/precisionfinding/ranging/PrecisionRangingImpl", "lambda$stopPrecisionRanging$2", 473, "PrecisionRangingImpl.java")).u("Fusion alg stop failed: %s", a);
                    return;
                }
                return;
            case 18:
                hzu.a.add(this.a);
                int i3 = hzu.b;
                if (i3 != -1) {
                    ((hzt) this.a).b(i3);
                    return;
                }
                return;
            case 19:
                ((ibf) this.a).g();
                return;
            default:
                Object obj7 = this.a;
                synchronized (((ibf) obj7).f) {
                    if (((ibf) obj7).i.equals(ibe.ACTIVE_OK_TO_STOP)) {
                        ((jni) ((jni) ibf.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "lambda$scheduleScanStops$2", 317, "BleScannerImpl.java")).r("Reached max native scan time, restarting scan.");
                        ((ibf) obj7).h(false);
                        ((ibf) obj7).g();
                    }
                }
                return;
        }
    }

    public /* synthetic */ hsi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
