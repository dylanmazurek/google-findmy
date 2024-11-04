package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igg {
    public final kyf a;
    public jer b = jdl.a;
    public final Queue c = new ArrayDeque();
    boolean d = false;
    public final /* synthetic */ igh e;
    public final igo f;

    public igg(igh ighVar, kyf kyfVar, igo igoVar) {
        this.e = ighVar;
        this.a = kyfVar;
        this.f = igoVar;
    }

    public final void a(boolean z) {
        kxv kxvVar = this.a.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        igd igdVar = (igd) this.e.d.get(kxvVar.a);
        if (igdVar != null) {
            synchronized (igdVar.h.c) {
                igdVar.f = false;
                if (z || igdVar.e == 0) {
                    igdVar.c();
                }
            }
        }
    }

    public final void b() {
        if (this.c.isEmpty()) {
            this.d = false;
            a(false);
            return;
        }
        jni jniVar = (jni) ((jni) igh.a.e()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$TaskQueueManager", "runNextTask", 810, "SharedGattConnectionManagerInternal.java");
        kxv kxvVar = this.a.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        jniVar.u("Executing next task on the GATT connection for device %s", kxvVar.a);
        this.e.b.execute((Runnable) this.c.poll());
    }
}
