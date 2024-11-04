package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class idq extends idn {
    final /* synthetic */ idt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idq(idt idtVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(1, bluetoothGattCharacteristic);
        this.c = idtVar;
    }

    @Override // defpackage.ido
    public final boolean a() {
        String uuid = this.a.getUuid().toString();
        if ((uuid.equals("a3c87501-8ed3-4bdf-8a39-a01bebede295") || uuid.equals(idy.b) || uuid.equals(idy.c) || uuid.equals("a3c87602-0005-1000-8000-001a11000100")) && this.a.getValue() != null) {
            ((jni) ((jni) idt.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$ReadCommand", "execute", 211, "GattClientImpl.java")).u("using cached value of %s", idy.a(this.a.getUuid()));
            this.c.l(this.a);
            return true;
        }
        ((jni) ((jni) idt.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$ReadCommand", "execute", 216, "GattClientImpl.java")).u("reading %s", idy.a(this.a.getUuid()));
        idt idtVar = this.c;
        return idtVar.n.a.readCharacteristic(this.a);
    }
}
