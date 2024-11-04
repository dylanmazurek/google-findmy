package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idm extends fzb {
    final /* synthetic */ bmf b;
    public final /* synthetic */ idt c;

    public idm(idt idtVar, bmf bmfVar) {
        this.b = bmfVar;
        this.c = idtVar;
    }

    @Override // defpackage.fzb
    public final void a(fyz fyzVar, int i, int i2) {
        ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onConnectionStateChange", 641, "GattClientImpl.java")).x("Bluetooth connection state changed, status: %s, state: %s", hzc.d(i), i2);
        synchronized (this.c.j) {
            this.c.o = i2;
        }
        if (i2 == 2) {
            this.b.c(this.c);
            idt idtVar = this.c;
            if (!idtVar.f) {
                return;
            }
            idtVar.m(1, fyzVar);
            jbx.d(idtVar.d()).c(new ide(idtVar, 3), idtVar.d);
            return;
        }
        if (i2 == 0) {
            idt idtVar2 = this.c;
            if (idtVar2.f) {
                synchronized (idtVar2.j) {
                    idt idtVar3 = this.c;
                    if (idtVar3.n != null) {
                        idtVar3.n = null;
                        fyzVar.b();
                    }
                }
                fyzVar.a();
                this.b.d(new iec("Disconnected."));
            }
            this.c.j();
            synchronized (this.c.j) {
                while (true) {
                    bmf bmfVar = (bmf) this.c.l.poll();
                    if (bmfVar == null) {
                        break;
                    } else {
                        bmfVar.d(new iec("Disconnected."));
                    }
                }
            }
            synchronized (this.c.j) {
                while (true) {
                    bmf bmfVar2 = (bmf) this.c.m.poll();
                    if (bmfVar2 != null) {
                        bmfVar2.d(new iec("Disconnected."));
                    }
                }
            }
            return;
        }
        ((jni) ((jni) idt.a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onConnectionStateChange", 683, "GattClientImpl.java")).s("Unexpected call of onConnectionStateChange with state %d", i2);
    }

    @Override // defpackage.fzb
    public final void b(fyz fyzVar) {
        ((jni) ((jni) idt.a.c().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onServiceChanged", 795, "GattClientImpl.java")).u("onServiceChanged, startedServiceDiscovery: %b", Boolean.valueOf(fyzVar.c()));
    }

    @Override // defpackage.fzb
    public final void c(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        lim c = iji.c(bluetoothGattCharacteristic.getValue());
        for (idd iddVar : this.c.t.b(bluetoothGattCharacteristic)) {
            idt idtVar = this.c;
            idtVar.d.execute(jbn.f(new hlt(iddVar, bluetoothGattCharacteristic, c, 6)));
        }
    }

    @Override // defpackage.fzb
    public final void d(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.c.d.execute(jbn.f(new oa(this, bluetoothGattCharacteristic, i, 12, (byte[]) null)));
        ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onCharacteristicRead", 721, "GattClientImpl.java")).z("onCharacteristicRead for %s, data: %s, status: %s.", idy.a(bluetoothGattCharacteristic.getUuid()), idt.i(bluetoothGattCharacteristic.getValue()), hzc.d(i));
    }

    @Override // defpackage.fzb
    public final void e(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        this.c.d.execute(jbn.f(new oa(this, bluetoothGattCharacteristic, i, 11, (byte[]) null)));
        ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onCharacteristicWrite", 736, "GattClientImpl.java")).z("onCharacteristicWrite for %s, data: %s, status: %s.", idy.a(bluetoothGattCharacteristic.getUuid()), idt.i(bluetoothGattCharacteristic.getValue()), hzc.d(i));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.List, java.util.Collection] */
    @Override // defpackage.fzb
    public final void f(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
        if (i != 0) {
            jgk jgkVar = this.c.t;
            Collection collection = (Collection) ((jge) jgkVar).a.remove(characteristic);
            if (collection == null) {
                Collections.emptyList();
            } else {
                ?? a = jgkVar.a();
                a.addAll(collection);
                ((jge) jgkVar).b -= collection.size();
                collection.clear();
                DesugarCollections.unmodifiableList(a);
            }
        }
        this.c.d.execute(jbn.f(new oa(this, characteristic, i, 10, (byte[]) null)));
        ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onDescriptorWrite", 755, "GattClientImpl.java")).y("onDescriptorWrite for %s, status: %s.", idy.a(characteristic.getUuid()), hzc.d(i));
    }

    @Override // defpackage.fzb
    public final void g(int i, int i2) {
        this.c.d.execute(jbn.f(new ide(this, 4)));
        ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onMtuChanged", 787, "GattClientImpl.java")).w("onMtuChanged mtu: %d, status: %s.", i, hzc.d(i2));
    }

    @Override // defpackage.fzb
    public final void h(final int i, final int i2) {
        this.c.d.execute(jbn.f(new Runnable() { // from class: idl
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                idt idtVar = idm.this.c;
                synchronized (idtVar.j) {
                    bmf bmfVar = (bmf) idtVar.m.poll();
                    if (bmfVar != null) {
                        int i4 = i2;
                        if (i4 == 0) {
                            bmfVar.c(Integer.valueOf(i3));
                        } else {
                            bmfVar.d(new ien(i4));
                        }
                    } else {
                        ((jni) ((jni) idt.a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "onRssiResult", 896, "GattClientImpl.java")).r("Got rssi result without a resultCompleter present.");
                    }
                }
            }
        }));
        ((jni) ((jni) idt.a.d().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onReadRemoteRssi", 775, "GattClientImpl.java")).w("onReadRemoteRssi, rssi: %s, status: %s.", i, hzc.d(i2));
    }

    @Override // defpackage.fzb
    public final void i(int i) {
        idt idtVar = this.c;
        if (!idtVar.f) {
            ((jni) ((jni) idt.a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onServicesDiscovered", 691, "GattClientImpl.java")).r("Services must be discovered BEFORE creating a preconnected GattClient.");
            return;
        }
        synchronized (idtVar.j) {
            if (this.c.r == null) {
                return;
            }
            if (i == 0) {
                ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onServicesDiscovered", 701, "GattClientImpl.java")).r("Discovered services.");
                idt idtVar2 = this.c;
                idtVar2.r.c(idtVar2);
            } else {
                ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$4", "onServicesDiscovered", 704, "GattClientImpl.java")).s("Service discovery failed with status: %s.", i);
                this.c.r.d(new iec(a.ae(i, "Service discovery failed with status ")));
            }
            this.c.r = null;
        }
    }
}
