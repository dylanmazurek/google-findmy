package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class idr extends idn {
    final /* synthetic */ idt c;
    private final idd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idr(idt idtVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, idd iddVar) {
        super(4, bluetoothGattCharacteristic);
        this.c = idtVar;
        this.d = iddVar;
    }

    @Override // defpackage.ido
    public final boolean a() {
        if (((jge) this.c.t).a.containsKey(this.a)) {
            idt idtVar = this.c;
            if (!idtVar.t.s(this.a, this.d)) {
                idt idtVar2 = this.c;
                idtVar2.t.o(this.a, this.d);
            }
            this.c.l(this.a);
            return true;
        }
        idt idtVar3 = this.c;
        idtVar3.t.o(this.a, this.d);
        idt idtVar4 = this.c;
        idtVar4.n.a.setCharacteristicNotification(this.a, true);
        BluetoothGattDescriptor descriptor = this.a.getDescriptor(UUID.fromString("00002902-0000-1000-8000-00805f9b34fb"));
        if (descriptor == null) {
            this.c.k(null, new ieh("Missing CCCD for characteristic ".concat(String.valueOf(String.valueOf(this.a.getUuid())))), true);
            return true;
        }
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.c.n.a.writeDescriptor(descriptor);
    }
}
