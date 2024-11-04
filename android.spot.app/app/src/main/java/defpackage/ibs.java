package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibs implements ifr {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/EddystoneRingingClient");
    private static final int e;
    public final BluetoothGattCharacteristic b;
    public final jzd c;
    public final idt d;
    private final jer f;
    private final ibl g;

    static {
        int millis = (int) TimeUnit.SECONDS.toMillis(60L);
        e = millis;
        ifp ifpVar = new ifp((byte[]) null);
        ifpVar.b(false);
        ifpVar.c(millis);
        ifpVar.a();
    }

    public ibs(jzd jzdVar, idt idtVar, ibl iblVar) {
        boolean z;
        if (((lim) ((jeu) iblVar.a).a).d() == 16) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        this.c = jzdVar;
        this.d = idtVar;
        this.g = iblVar;
        jer h = h(idtVar);
        hwx.J(h.g());
        this.b = hqk.g((BluetoothGattService) h.c(), "a3c87601-0005-1000-8000-001a11000100");
        hqk.h((BluetoothGattService) h.c(), "a3c87602-0005-1000-8000-001a11000100");
        this.f = hqk.h((BluetoothGattService) h.c(), "a3c87603-0005-1000-8000-001a11000100");
    }

    public static lim d(lim limVar, lim limVar2, int i, byte b) {
        int i2 = iji.a;
        return ijm.c(limVar, lim.t(new byte[]{1}).r(limVar2.j(1, 13)).r(lim.t(new byte[]{b, (byte) (i >> 8), (byte) (i & 255)})));
    }

    public static jer h(idt idtVar) {
        return idtVar.a(UUID.fromString("a3c87600-0005-1000-8000-001a11000100"));
    }

    @Override // defpackage.ifr
    public final jyz a(int i, kzl kzlVar, kyh kyhVar, boolean z) {
        boolean z2;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.J(z2);
        if (i == 0) {
            return b(true, 65535, z, 10);
        }
        return b(true, Math.min(65534, (i + 99) / 100), z, 10);
    }

    public final jyz b(final boolean z, final int i, final boolean z2, final int i2) {
        Object obj = ((jeu) this.g.a).a;
        ((jni) ((jni) a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneRingingClient", "setRingingState", 256, "EddystoneRingingClient.java")).r("Ringing using Eddystone Ringing Service");
        final lim limVar = (lim) obj;
        return iuu.p(this.d.f(this.b), new jxd() { // from class: ibp
            @Override // defpackage.jxd
            public final jyz a(Object obj2) {
                lim d;
                lim limVar2 = limVar;
                lim d2 = ijm.d(limVar2, (lim) obj2, 2);
                byte a2 = d2.a(13);
                final boolean z3 = z2;
                if (a2 == 0 && z3) {
                    return ivc.E(0L);
                }
                final int i3 = i;
                final boolean z4 = z;
                if (z4) {
                    d = ibs.d(limVar2, d2, i3, (byte) 3);
                } else {
                    d = ibs.d(limVar2, d2, 0, (byte) 0);
                }
                final int i4 = i2;
                final ibs ibsVar = ibs.this;
                return iuu.j(iuu.o(ibsVar.d.h(ibsVar.b, d), new eww(i3, 2), ibsVar.c), iej.class, new jxd() { // from class: ibq
                    @Override // defpackage.jxd
                    public final jyz a(Object obj3) {
                        iej iejVar = (iej) obj3;
                        int i5 = iejVar.a;
                        if (i5 != -128) {
                            if (i5 != -127) {
                                if (i5 != 3) {
                                    return ivc.D(iejVar);
                                }
                                return ivc.D(new iep("Cannot ring the device with the given ring key"));
                            }
                            return ivc.D(new ieo());
                        }
                        int i6 = i4;
                        if (i6 <= 0) {
                            return ivc.D(new ieh("Device keeps replying with 'Concurrent Update' status"));
                        }
                        boolean z5 = z3;
                        return ibs.this.b(z4, i3, z5, i6 - 1);
                    }
                }, ibsVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.ifr
    public final jyz c() {
        return iuu.o(b(false, 65535, false, 10), new iaf(3), this.c);
    }

    @Override // defpackage.ifr
    public final boolean e() {
        return this.f.g();
    }

    @Override // defpackage.ifr
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ifr
    public final idt g() {
        return this.d;
    }

    @Override // defpackage.ifr
    public final jyz i(final njz njzVar) {
        hwx.U(this.f.g());
        return this.d.g((BluetoothGattCharacteristic) this.f.c(), new idd() { // from class: ibr
            @Override // defpackage.idd
            public final void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, lim limVar) {
                jnk jnkVar = ibs.a;
                njz njzVar2 = njz.this;
                if (limVar.z()) {
                    ((jni) ((jni) ibs.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneRingingClient", "lambda$subscribeToRingingTerminatedNotifications$2", 220, "EddystoneRingingClient.java")).r("Unexpected zero-length value in Ringing Terminated Notification");
                    njzVar2.l();
                    return;
                }
                byte a2 = limVar.a(0);
                if (a2 != 0) {
                    if (a2 != 1) {
                        ((jni) ((jni) ibs.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneRingingClient", "lambda$subscribeToRingingTerminatedNotifications$2", 233, "EddystoneRingingClient.java")).u("Unknown value in Ringing Terminated Notification %s", iji.h(limVar));
                        njzVar2.l();
                        return;
                    } else {
                        njzVar2.l();
                        return;
                    }
                }
                njzVar2.l();
            }
        });
    }
}
