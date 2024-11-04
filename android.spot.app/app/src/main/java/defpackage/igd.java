package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igd {
    public final jyz a;
    public final ige b;
    public final String c;
    public final jzd d;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    final /* synthetic */ igh h;
    private final jbw i;
    private final jjr j;

    public igd(igh ighVar, jyz jyzVar, jbw jbwVar, ige igeVar, String str, jjr jjrVar, jzd jzdVar) {
        this.h = ighVar;
        this.i = jbwVar;
        this.a = jyzVar;
        this.b = igeVar;
        this.c = str;
        this.j = jjrVar;
        this.d = jzdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jbw a(jer jerVar) {
        jbw d;
        synchronized (this.h.c) {
            this.e++;
            ((jni) ((jni) igh.a.e()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$GattClientValueAndCloser", "getImmutableGattClient", 547, "SharedGattConnectionManagerInternal.java")).s("Creating immutable GATT client. Number of active clients: %d", this.e);
            jbi jbiVar = new jbi(this, jerVar);
            jxv jxvVar = jxv.a;
            int i = jbn.a;
            jbi jbiVar2 = new jbi(jbu.b(), jbiVar);
            jxk jxkVar = new jxk();
            jzt jztVar = new jzt(new jxg(jbiVar2, jxkVar, 0));
            jxvVar.execute(jztVar);
            d = new jbw(new jxp(jztVar, jxkVar)).e(new idg((jxd) new etl(17), 3), jxv.a).d(new ijj(1), jxv.a);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final jyz b() {
        jyz h;
        synchronized (this.h.c) {
            d();
            h = jwu.h(jys.q(ivc.F(this.a)), new etl(17), jxv.a);
        }
        return h;
    }

    public final void c() {
        ((jni) ((jni) igh.a.e()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$GattClientValueAndCloser", "disconnect", 637, "SharedGattConnectionManagerInternal.java")).u("Disconnecting from GATT client for device %s", this.c);
        this.h.b(this);
        if (this.i.g()) {
            return;
        }
        ivc.N(this.a, new ems(6), this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        synchronized (this.h.c) {
            this.f = true;
        }
    }

    public final void e(boolean z) {
        synchronized (this.h.c) {
            this.g = z;
        }
    }

    public final boolean f(jjr jjrVar) {
        synchronized (this.h.c) {
            if (jjrVar.isEmpty()) {
                return true;
            }
            if (this.g) {
                return true;
            }
            if (g()) {
                try {
                    ihy ihyVar = ((ibu) ((jck) ivc.M(this.a)).c()).a;
                    if (ihyVar.d()) {
                        ((jni) ((jni) igh.a.g()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$GattClientValueAndCloser", "canBeUsedFor", 685, "SharedGattConnectionManagerInternal.java")).r("BUG: connectAndExecute called for device, then for component");
                        return true;
                    }
                    return jjrVar.contains(ihyVar.a());
                } catch (ExecutionException unused) {
                    ((jni) ((jni) igh.a.g()).j("com/google/android/libraries/spot/ble/SharedGattConnectionManagerInternal$GattClientValueAndCloser", "canBeUsedFor", 693, "SharedGattConnectionManagerInternal.java")).r("BUG: valueAndCloserFuture has failed, not removed");
                    return false;
                }
            }
            return this.j.equals(jjrVar);
        }
    }

    public final boolean g() {
        if (!this.a.isDone()) {
            return false;
        }
        try {
            return true;
        } catch (CancellationException | ExecutionException unused) {
            return false;
        }
    }
}
