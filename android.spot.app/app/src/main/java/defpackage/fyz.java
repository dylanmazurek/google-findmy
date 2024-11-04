package defpackage;

import android.bluetooth.BluetoothGatt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyz {
    public final BluetoothGatt a;

    public fyz(BluetoothGatt bluetoothGatt) {
        this.a = bluetoothGatt;
    }

    public final void a() {
        this.a.close();
    }

    public final void b() {
        this.a.disconnect();
    }

    public final boolean c() {
        return this.a.discoverServices();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fyz)) {
            return false;
        }
        return this.a.equals(((fyz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
