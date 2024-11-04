package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import com.google.android.apps.adm.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class got implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ got(Object obj, Object obj2, Object obj3, long j, int i) {
        this.e = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = j;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [jzd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, gov] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                this.c.run();
                hwx.b(this.b.schedule(this, this.a, (TimeUnit) this.d));
                return;
            }
            final long j = this.a;
            Object obj = this.d;
            Object obj2 = this.c;
            final ese eseVar = (ese) this.b;
            final ifj ifjVar = (ifj) obj2;
            final jer jerVar = (jer) obj;
            elr elrVar = new elr() { // from class: esd
                @Override // defpackage.elr
                public final void a(ekk ekkVar) {
                    ekj ekjVar;
                    ifj ifjVar2 = ifjVar;
                    ekkVar.d(ifjVar2);
                    jer jerVar2 = jerVar;
                    if (!jerVar2.g()) {
                        ekjVar = ekj.NONE;
                    } else if (jerVar2.c() instanceof igk) {
                        ekjVar = ekj.UNAVAILABLE;
                    } else if (jerVar2.c() instanceof igm) {
                        ekjVar = ekj.DEVICE_NOT_FOUND;
                    } else if (jerVar2.c() instanceof igj) {
                        ekjVar = ekj.COMMUNICATION_ERROR;
                    } else if (jerVar2.c() instanceof igl) {
                        ekjVar = ekj.DEVICE_ERROR;
                    } else {
                        ((jni) ((jni) esf.a.f()).j("com/google/android/apps/adm/integrations/spot/ringing/BleRingingHandlerImpl", "getErrorType", 392, "BleRingingHandlerImpl.java")).u("Ignoring unexpected BluetoothException subclass %s", jerVar2.c().getClass());
                        ekjVar = ekj.NONE;
                    }
                    ese eseVar2 = ese.this;
                    ekkVar.c(ekjVar);
                    if (ifjVar2 == ifj.RINGING && !jerVar2.g()) {
                        long j2 = j;
                        ekkVar.g(Long.valueOf(SystemClock.elapsedRealtime()));
                        ekkVar.f(Integer.valueOf((int) j2));
                        eseVar2.b.i.m(R.string.ring_result_success);
                        return;
                    }
                    if (ifjVar2 == ifj.STOPPED) {
                        jdl jdlVar = jdl.a;
                        ekkVar.a = jdlVar;
                        ekkVar.b = jdlVar;
                        eseVar2.b.i.m(R.string.stop_ring_result_success);
                    }
                }
            };
            eseVar.b.h.k(eseVar.a, elrVar, true);
            if (jerVar.g()) {
                esf esfVar = eseVar.b;
                if (esfVar.h.o(eseVar.a)) {
                    int ordinal = ifjVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    eseVar.b.i.m(R.string.ring_result_fail);
                                    return;
                                }
                                return;
                            }
                        } else {
                            eseVar.b.i.m(R.string.stop_ring_result_fail);
                            return;
                        }
                    }
                    ((jni) ((jni) esf.a.f()).j("com/google/android/apps/adm/integrations/spot/ringing/BleRingingHandlerImpl$RingerCallback", "lambda$onRingingStateChanged$1", 328, "BleRingingHandlerImpl.java")).y("Ringing error in unexpected state%s, %s", obj2, obj);
                    return;
                }
                return;
            }
            return;
        }
        long j2 = this.a;
        ?? r2 = this.c;
        Intent intent = (Intent) this.b;
        ((jol) gou.a.e()).u("Executing action in BroadcastReceiver [%s].", intent.getAction());
        fzo.w(r2, intent, (gnd) ((mpn) this.d).a, j2);
    }

    public got(Runnable runnable, jzd jzdVar, long j, TimeUnit timeUnit, int i) {
        this.e = i;
        this.c = runnable;
        this.b = jzdVar;
        this.a = j;
        this.d = timeUnit;
    }
}
