package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dvn {
    private static final jnk c = jnk.l("com/google/android/apps/adm/api/ActionsInProgress");
    public final Object a = new Object();
    public final HashMap b = new HashMap();
    private final bym d;

    public dvn(bym bymVar) {
        this.d = bymVar;
    }

    public final jer a(String str) {
        jer h;
        synchronized (this.a) {
            h = jer.h((dvm) this.b.get(str));
        }
        return h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.Runnable] */
    public final void b(lqj lqjVar, jer jerVar, long j) {
        long j2;
        lqt lqtVar = lqjVar.d;
        if (lqtVar == null) {
            lqtVar = lqt.h;
        }
        String str = lqtVar.e;
        hwx.J(!str.isEmpty());
        if (jerVar.g()) {
            this.d.m(jerVar.c(), j);
            j2 = System.currentTimeMillis() + j;
        } else {
            j2 = 0;
        }
        synchronized (this.a) {
            this.b.put(str, dvm.a(lqjVar, jerVar, j2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void c(String str) {
        synchronized (this.a) {
            dvm dvmVar = (dvm) this.b.get(str);
            if (dvmVar == null) {
                ((jni) ((jni) c.g()).j("com/google/android/apps/adm/api/ActionsInProgress", "cancelTimeout", 117, "ActionsInProgress.java")).u("cancelTimeout: got an unknown requestTrackingId: %s", str);
                return;
            }
            jer jerVar = dvmVar.b;
            if (!jerVar.g()) {
                ((jni) ((jni) c.g()).j("com/google/android/apps/adm/api/ActionsInProgress", "cancelTimeout", 122, "ActionsInProgress.java")).u("cancelTimeout: no timeout runnable for requestTrackingId: %s", str);
            } else {
                this.d.n(jerVar.c());
                this.b.put(str, dvm.a(dvmVar.a, jdl.a, 0L));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Runnable] */
    public final void d(String str) {
        synchronized (this.a) {
            dvm dvmVar = (dvm) this.b.get(str);
            if (dvmVar != null) {
                jer jerVar = dvmVar.b;
                if (jerVar.g()) {
                    this.d.n(jerVar.c());
                }
                this.b.remove(str);
            }
        }
    }
}
