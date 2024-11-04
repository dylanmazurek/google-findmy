package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ids extends idn {
    final /* synthetic */ idt c;
    private final lim d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ids(idt idtVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, lim limVar) {
        super(2, bluetoothGattCharacteristic);
        this.c = idtVar;
        limVar.getClass();
        this.d = limVar;
    }

    @Override // defpackage.ido
    public final boolean a() {
        String str;
        String concat;
        lim limVar = this.d;
        if (limVar.z()) {
            concat = "(EMPTY)";
        } else {
            String h = iji.h(limVar.j(0, 1));
            int d = this.d.d() - 1;
            if (d >= 0) {
                if (d != 0) {
                    str = "XX";
                    if (d != 1) {
                        if (Integer.MAX_VALUE / d >= 2) {
                            StringBuilder sb = new StringBuilder(d + d);
                            for (int i = 0; i < d; i++) {
                                sb.append("XX");
                            }
                            str = sb.toString();
                        } else {
                            throw new OutOfMemoryError(a.am(d, "Repeating 2 bytes String ", " times will produce a String exceeding maximum size."));
                        }
                    }
                } else {
                    str = "";
                }
                concat = String.valueOf(h).concat(str);
            } else {
                throw new IllegalArgumentException(a.ae(d, "count is negative: "));
            }
        }
        ((jni) ((jni) idt.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl$WriteCommand", "execute", 237, "GattClientImpl.java")).y("writing %s, data: %s", idy.a(this.a.getUuid()), concat);
        this.a.setValue(this.d.A());
        return this.c.n.a.writeCharacteristic(this.a);
    }
}
