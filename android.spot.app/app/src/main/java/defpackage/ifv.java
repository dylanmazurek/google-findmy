package defpackage;

import android.bluetooth.le.ScanRecord;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifv {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/ScanUtil");

    public static lim a(lim limVar) {
        if (limVar != null && (limVar.a(0) & (-16)) == 64) {
            if (d(limVar)) {
                return limVar.j(1, 21);
            }
            if (e(limVar)) {
                return limVar.j(1, 33);
            }
            return lim.b;
        }
        return lim.b;
    }

    public static lim b(ScanRecord scanRecord) {
        if (scanRecord == null) {
            return lim.b;
        }
        lim c = iji.c(scanRecord.getServiceData(ifs.a));
        if (!c.z()) {
            int a2 = c.a(0) & (-16);
            if (a2 != 0) {
                if (a2 == 64 && (d(c) || e(c))) {
                    return a(c);
                }
            } else if (c.d() == 20) {
                if (c != null && c.d() >= 18) {
                    return c.j(2, 18);
                }
                return lim.b;
            }
        }
        return lim.b;
    }

    public static lim c(lim limVar, byte b) {
        byte[] bArr = {b};
        int i = iji.a;
        return lim.t(bArr).r(limVar.w(1));
    }

    private static boolean d(lim limVar) {
        if (limVar.d() != 21 && limVar.d() != 22) {
            return false;
        }
        return true;
    }

    private static boolean e(lim limVar) {
        if (limVar.d() != 33 && limVar.d() != 34) {
            return false;
        }
        return true;
    }
}
