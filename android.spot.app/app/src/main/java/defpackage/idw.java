package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idw implements ibh {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess");
    public final kyf f;
    public final ihy g;
    public final idu h;
    public final jzd i;
    private final kuv k;
    public final Object b = new Object();
    private jer j = jdl.a;
    public jyz c = jyv.a;
    public jer d = jdl.a;
    public boolean e = false;

    public idw(jzd jzdVar, kuv kuvVar, kyf kyfVar, kyh kyhVar, idu iduVar) {
        ihy ihyVar;
        this.i = jzdVar;
        this.k = kuvVar;
        this.f = kyfVar;
        ihy ihyVar2 = ihy.COMPONENTLESS;
        ihx ihxVar = ihx.RIGHT_BUD;
        int ordinal = kyhVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    ihyVar = ihy.COMPONENTLESS;
                } else {
                    ihyVar = ihy.CASE;
                }
            } else {
                ihyVar = ihy.LEFT_BUD;
            }
        } else {
            ihyVar = ihy.RIGHT_BUD;
        }
        this.g = ihyVar;
        this.h = iduVar;
        kyg kygVar = kyfVar.g;
        int I = a.I((kygVar == null ? kyg.d : kygVar).c);
        I = I == 0 ? 1 : I;
        if (hqt.l(I) != (kyhVar.a() > 1)) {
            ((jni) ((jni) a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "<init>", 77, "GattConnectionKeepAliveProcess.java")).v("BUG: %s used for device with %s components", kyhVar.a(), a.C(I));
        }
    }

    private final void d() {
        if (!this.j.g()) {
            return;
        }
        ((jbw) this.j.c()).f().cancel(false);
        this.j = jdl.a;
    }

    @Override // defpackage.ibh
    public final void a() {
        synchronized (this.b) {
            boolean z = false;
            if (!this.j.g() && !this.d.g()) {
                z = true;
            }
            hwx.V(z, "start() called twice.");
            hwx.V(!this.e, "start() called after close()");
            jni jniVar = (jni) ((jni) a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "start", 90, "GattConnectionKeepAliveProcess.java");
            kxv kxvVar = this.f.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            jniVar.y("Starting to establish a persistent connection to %s (%s)", kxvVar.a, this.g);
            b();
        }
    }

    public final void b() {
        jjr jmsVar;
        jbw a2;
        jer i = jer.i(this.h);
        kuv kuvVar = this.k;
        Object obj = kuvVar.a;
        Object obj2 = ((igh) obj).c;
        kyf kyfVar = this.f;
        ihy ihyVar = this.g;
        Object obj3 = kuvVar.b;
        synchronized (obj2) {
            if (ihyVar.d()) {
                jmsVar = jmo.a;
            } else {
                jmsVar = new jms(ihyVar.a());
            }
            a2 = ((igh) obj).c(kyfVar, jmsVar, (igo) obj3, jdl.a).a(i);
        }
        this.j = jer.i(a2.e(new idg((jxd) new hxj(this, 15), 3), this.i).a(Throwable.class, new idg((jxd) new hxj(this, 16), 3), this.i));
    }

    public final void c() {
        synchronized (this.b) {
            d();
            if (!this.e && !this.d.g()) {
                this.d = jer.i(this.i.schedule(new ide(this, 5), 1L, TimeUnit.SECONDS));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, jyz] */
    @Override // defpackage.ibh, java.lang.AutoCloseable
    public final void close() {
        jni jniVar = (jni) ((jni) a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattConnectionKeepAliveProcess", "stopKeepAliveConnection", 178, "GattConnectionKeepAliveProcess.java");
        kxv kxvVar = this.f.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        jniVar.y("Closing the persistent connection to %s (%s)", kxvVar.a, this.g);
        synchronized (this.b) {
            this.e = true;
            d();
            this.c.cancel(false);
            if (this.d.g()) {
                this.d.c().cancel(false);
                this.d = jdl.a;
            }
        }
    }
}
