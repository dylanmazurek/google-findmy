package defpackage;

import android.bluetooth.BluetoothDevice;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyy {
    public final BluetoothDevice a;

    public fyy(BluetoothDevice bluetoothDevice) {
        this.a = bluetoothDevice;
    }

    public final String a() {
        return this.a.getAddress();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fyy)) {
            return false;
        }
        return this.a.equals(((fyy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
