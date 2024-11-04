package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icv {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/FastPairEddystoneHelper");
    public static final lim b = iji.f(1);
    public static final jjr c = new jms(ico.RING);
    public static final lim d = iji.g(8);
    public final jzd e;
    public final icu f;
    public final BluetoothGattCharacteristic g;
    public final Object h = new Object();
    public boolean i = false;
    public jer j = jdl.a;
    public final Map k = new EnumMap(ico.class);
    public jer l = jdl.a;
    public bmf m;
    public jyz n;
    public final idt o;

    public icv(jzd jzdVar, idt idtVar, icu icuVar) {
        this.e = jzdVar;
        this.o = idtVar;
        this.f = icuVar;
        jer g = g(idtVar);
        hwx.J(g.g());
        this.g = hqk.g((BluetoothGattService) g.c(), "fe2c1238-8366-4814-8eb0-01de32100bea");
    }

    public static lim d(ico icoVar, jer jerVar, byte b2, lim limVar, lim limVar2, icx icxVar) {
        if (limVar.d() < 8) {
            ((jni) ((jni) a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneHelper", "verifySignatureAndGetData", 543, "FastPairEddystoneHelper.java")).u("Ignoring notification with unexpected size for dataId %s", icoVar);
            return null;
        }
        lim j = limVar.j(0, 8);
        lim w = limVar.w(8);
        byte[] bArr = {icxVar.b};
        int i = iji.a;
        lim r = lim.t(bArr).r(limVar2).r(lim.t(new byte[]{icoVar.o, b2})).r(w).r(b);
        jerVar.g();
        lim h = ijm.h((lim) jerVar.c(), r);
        if (h.d() >= j.d() && h.j(0, j.d()).equals(j)) {
            return w;
        }
        ((jni) ((jni) a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/FastPairEddystoneHelper", "verifySignatureAndGetData", 557, "FastPairEddystoneHelper.java")).u("Ignoring notification with unexpected auth for dataId %s", icoVar);
        return null;
    }

    public static boolean e(idt idtVar) {
        return hqk.i(g(idtVar), "fe2c1238-8366-4814-8eb0-01de32100bea");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, jyz] */
    private final jyz f() {
        ?? c2;
        jyz jyzVar;
        synchronized (this.h) {
            if (!this.l.g()) {
                if (this.f.c) {
                    idt idtVar = this.o;
                    synchronized (idtVar.j) {
                        if (idtVar.q.g()) {
                            ((Integer) idtVar.q.c()).intValue();
                            jyzVar = jyv.a;
                        } else {
                            idtVar.q = jer.i(83);
                            jyzVar = idtVar.e(idtVar.c(new idp(idtVar)));
                        }
                    }
                } else {
                    jyzVar = jyv.a;
                }
                this.l = jer.i(jbx.d(jyzVar).f(new hxj(this, 10), this.e).b(Throwable.class, new hxj(this, 11), this.e));
            }
            c2 = this.l.c();
        }
        return c2;
    }

    private static jer g(idt idtVar) {
        return idtVar.a(UUID.fromString("0000fe2c-0000-1000-8000-00805f9b34fb"));
    }

    public final jyz a() {
        hwx.U(this.f.b.g());
        return jbx.d(f()).e(new huw(this, 10), this.e);
    }

    public final jyz b(ico icoVar, jer jerVar, icq icqVar) {
        synchronized (this.h) {
            int i = 1;
            hwx.U(!this.j.g());
            jdl jdlVar = jdl.a;
            if (icoVar != null) {
                if (jerVar != null) {
                    this.j = jer.i(hzc.c(icoVar, jerVar, jdlVar, jdlVar));
                    this.n = bei.d(new icy(this, i));
                } else {
                    throw new NullPointerException("Null authenticationKey");
                }
            } else {
                throw new NullPointerException("Null dataId");
            }
        }
        return jbx.d(f()).f(new hxj(this, 7), this.e).f(new hxk(this, icqVar, icoVar, jerVar, 3), this.e).f(new hxj(this, 8), this.e).e(new huw(this, 11), this.e).b(Throwable.class, new hxj(this, 9), this.e);
    }

    public final jyz c(ico icoVar, lim limVar, icq icqVar) {
        return b(icoVar, jer.i(limVar), icqVar);
    }
}
