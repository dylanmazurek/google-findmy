package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqk {
    public hqk() {
    }

    public static boolean b(kyf kyfVar) {
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        int ab = hwx.ab(kylVar.g);
        if (ab == 0) {
            ab = 1;
        }
        int i = ab - 2;
        if (i == 0 || i == 1 || i == 3 || i == 5) {
            return true;
        }
        return false;
    }

    public static boolean c(kyf kyfVar) {
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        int ab = hwx.ab(kylVar.g);
        if (ab == 0) {
            ab = 1;
        }
        int i = ab - 2;
        if (i == 2 || i == 3 || i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    public static boolean d(kyf kyfVar) {
        kyl kylVar = kyfVar.c;
        if (kylVar == null) {
            kylVar = kyl.j;
        }
        int ab = hwx.ab(kylVar.g);
        if (ab == 0) {
            ab = 1;
        }
        int i = ab - 2;
        if (i == 5 || i == 6) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        if (i - 2 != 0) {
            return false;
        }
        return true;
    }

    public static iff f(jer jerVar, jer jerVar2, jer jerVar3, int i) {
        if (i != 0) {
            return new iff(jerVar, jerVar2, jerVar3, i);
        }
        throw new IllegalStateException("Missing required properties: precisionFindingStatus");
    }

    public static BluetoothGattCharacteristic g(BluetoothGattService bluetoothGattService, String str) {
        boolean z;
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(UUID.fromString(str));
        if (characteristic != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.U(z);
        return characteristic;
    }

    public static jer h(BluetoothGattService bluetoothGattService, String str) {
        return jer.h(bluetoothGattService.getCharacteristic(UUID.fromString(str)));
    }

    public static boolean i(jer jerVar, String... strArr) {
        if (!jerVar.g()) {
            return false;
        }
        if (((BluetoothGattService) jerVar.c()).getCharacteristic(UUID.fromString(strArr[0])) == null) {
            return false;
        }
        return true;
    }

    public static void j(jer jerVar, String str) {
        if (jerVar.g()) {
            h((BluetoothGattService) jerVar.c(), str);
        }
    }

    public hqk(byte[] bArr) {
    }

    public static Context a(Context context) {
        return context;
    }
}
