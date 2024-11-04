package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idt {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/GattClientImpl");
    public final Context c;
    public final jzd d;
    public final fyy e;
    public final boolean f;
    public final jer g;
    public final Map h;
    public fyz n;
    public int o;
    public jer q;
    public bmf r;
    public jer s;
    final jgk t;
    public final jua u;
    public final fma v;
    public final bym w;
    public final jfk b = new idj();
    public int i = 0;
    public final Object j = new Object();
    public final Queue k = new ArrayDeque();
    public final Queue l = new ArrayDeque();
    public final Queue m = new ArrayDeque();
    private boolean x = false;
    public final List p = new ArrayList();

    public idt(Context context, bym bymVar, jzd jzdVar, fma fmaVar, Map map, String str, ibj ibjVar) {
        jdl jdlVar = jdl.a;
        this.q = jdlVar;
        this.r = null;
        this.s = jdlVar;
        this.t = new jgk();
        this.u = new idk(this);
        this.f = true;
        this.c = context;
        this.w = bymVar;
        this.d = jzdVar;
        this.v = fmaVar;
        this.h = map;
        this.g = jer.i(ibjVar);
        this.e = bymVar.p(str);
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return "/null/";
        }
        return jtf.f.k(bArr);
    }

    public final jer a(UUID uuid) {
        jer h;
        synchronized (this.j) {
            h = jer.h(this.n.a.getService(uuid));
        }
        return h;
    }

    public final jyz b(bmh bmhVar) {
        return ivc.L(bei.d(bmhVar), 60L, TimeUnit.SECONDS, this.d);
    }

    public final jyz c(ido idoVar) {
        jyz b = b(new cqp(this, idoVar, 3, null));
        synchronized (this.j) {
            if (!this.x) {
                this.x = true;
                n();
            }
        }
        return b;
    }

    public final jyz d() {
        synchronized (this.j) {
            if (this.o != 2) {
                return jyv.a;
            }
            return bei.d(new icy(this, 3));
        }
    }

    public final jyz e(jyz jyzVar) {
        return iuu.o(jyzVar, new iaf(8), this.d);
    }

    public final jyz f(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return c(new idq(this, bluetoothGattCharacteristic));
    }

    public final jyz g(BluetoothGattCharacteristic bluetoothGattCharacteristic, idd iddVar) {
        return e(c(new idr(this, bluetoothGattCharacteristic, iddVar)));
    }

    public final jyz h(BluetoothGattCharacteristic bluetoothGattCharacteristic, lim limVar) {
        return e(c(new ids(this, bluetoothGattCharacteristic, limVar)));
    }

    public final void j() {
        synchronized (this.j) {
            Iterator it = this.p.iterator();
            while (it.hasNext()) {
                ((bmf) it.next()).c(null);
            }
        }
    }

    public final void k(lim limVar, Exception exc, boolean z) {
        synchronized (this.j) {
            bmf bmfVar = (bmf) this.l.poll();
            if (bmfVar != null) {
                if (exc == null) {
                    bmfVar.c(limVar);
                } else {
                    bmfVar.d(exc);
                }
            } else {
                ((jni) ((jni) a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "onGattOrImmediateResult", 913, "GattClientImpl.java")).r("Got result without a resultCompleter present.");
            }
        }
        if (z) {
            n();
        } else {
            this.d.schedule(new ide(this, 2), 20L, TimeUnit.MILLISECONDS);
        }
    }

    public final void l(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        k(iji.c(bluetoothGattCharacteristic.getValue()), null, true);
    }

    public final void m(int i, fyz fyzVar) {
        ((jni) ((jni) a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "requestConnectionPriority", 858, "GattClientImpl.java")).u("Request connection priority result %b ", Boolean.valueOf(fyzVar.a.requestConnectionPriority(0)));
        synchronized (this.j) {
            if (i >= ((Integer) this.g.b(new iaf(7)).e(0)).intValue()) {
                this.s = jdl.a;
            } else {
                int i2 = 9;
                this.s = jer.i(this.d.schedule(new oa(this, i, fyzVar, i2), ((Long) this.g.b(new iaf(i2)).e(5000L)).longValue(), TimeUnit.MILLISECONDS));
            }
        }
    }

    public final void n() {
        synchronized (this.j) {
            if (this.n == null) {
                this.x = false;
                return;
            }
            ido idoVar = (ido) this.k.poll();
            if (idoVar == null) {
                this.x = false;
                return;
            }
            if (!idoVar.a()) {
                ((bmf) this.l.remove()).d(new ieh(idoVar.toString() + " returned false"));
            }
        }
    }

    public final void o(int i, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i2) {
        iej iejVar;
        lim c = iji.c(bluetoothGattCharacteristic.getValue());
        if (i2 == 0) {
            iejVar = null;
        } else {
            iejVar = new iej(bluetoothGattCharacteristic.getUuid(), i, i2, c);
        }
        k(c, iejVar, false);
    }
}
