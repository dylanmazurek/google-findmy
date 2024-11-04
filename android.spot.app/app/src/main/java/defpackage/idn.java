package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class idn extends ido {
    protected final BluetoothGattCharacteristic a;

    public idn(int i, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(i);
        bluetoothGattCharacteristic.getClass();
        this.a = bluetoothGattCharacteristic;
    }

    @Override // defpackage.ido
    public final String toString() {
        return String.valueOf(this.a.getUuid()) + " " + super.toString();
    }
}
