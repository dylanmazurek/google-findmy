package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjr {
    private static final mjr c = new mjr();
    public final IdentityHashMap a = new IdentityHashMap();
    public ScheduledExecutorService b;

    public static Object a(mjq mjqVar) {
        return c.b(mjqVar);
    }

    public static void d(mjq mjqVar, Object obj) {
        c.e(mjqVar, obj);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.concurrent.ScheduledFuture, java.lang.Object] */
    final synchronized Object b(mjq mjqVar) {
        mjp mjpVar;
        mjpVar = (mjp) this.a.get(mjqVar);
        if (mjpVar == null) {
            mjpVar = new mjp(mjqVar.a());
            this.a.put(mjqVar, mjpVar);
        }
        ?? r3 = mjpVar.c;
        if (r3 != 0) {
            r3.cancel(false);
            mjpVar.c = null;
        }
        mjpVar.b++;
        return mjpVar.a;
    }

    final synchronized void e(mjq mjqVar, Object obj) {
        boolean z;
        boolean z2;
        mjp mjpVar = (mjp) this.a.get(mjqVar);
        if (mjpVar != null) {
            boolean z3 = true;
            if (obj == mjpVar.a) {
                z = true;
            } else {
                z = false;
            }
            hwx.K(z, "Releasing the wrong instance");
            if (mjpVar.b > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.V(z2, "Refcount has already reached zero");
            int i = mjpVar.b - 1;
            mjpVar.b = i;
            if (i == 0) {
                if (mjpVar.c != null) {
                    z3 = false;
                }
                hwx.V(z3, "Destroy task already scheduled");
                if (this.b == null) {
                    this.b = Executors.newSingleThreadScheduledExecutor(mfh.h("grpc-shared-destroyer-%d"));
                }
                mjpVar.c = this.b.schedule(new mfy(new bxi(this, mjpVar, mjqVar, obj, 10)), 1L, TimeUnit.SECONDS);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(String.valueOf(mjqVar))));
    }
}
