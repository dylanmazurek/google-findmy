package defpackage;

import android.content.res.Resources;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eik {
    public final String a;
    public final int b;
    public final boolean c;
    public final String d;

    public eik() {
        throw null;
    }

    public static jer a(int i, Resources resources) {
        int i2;
        int i3;
        boolean z;
        int i4 = i - 1;
        if (i4 != 0) {
            if (i4 != 1) {
                i2 = R.drawable.gs_battery_alert_vd_theme_24;
                if (i4 != 2) {
                    i3 = R.string.spot_device_battery_level_critical;
                    z = true;
                    String string = resources.getString(i3);
                    return jer.i(new eik(string, i2, z, resources.getString(R.string.spot_device_battery_level_content_description, string)));
                }
                i3 = R.string.spot_device_battery_level_low;
            } else {
                i2 = R.drawable.gs_battery_full_vd_theme_24;
                i3 = R.string.spot_device_battery_level_ok;
            }
            z = false;
            String string2 = resources.getString(i3);
            return jer.i(new eik(string2, i2, z, resources.getString(R.string.spot_device_battery_level_content_description, string2)));
        }
        return jdl.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean b(Object obj) {
        kym kymVar = ((kzb) obj).b;
        if (kymVar == null) {
            kymVar = kym.f;
        }
        if (kymVar.b == 9) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eik) {
            eik eikVar = (eik) obj;
            if (this.a.equals(eikVar.a) && this.b == eikVar.b && this.c == eikVar.c && this.d.equals(eikVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((((hashCode * 1000003) ^ this.b) * 1000003) ^ i) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "BatteryDisplayInfo{batteryLevelTextString=" + this.a + ", batteryLevelImage=" + this.b + ", shouldShowErrorColor=" + this.c + ", contentDescription=" + this.d + "}";
    }

    public eik(String str, int i, boolean z, String str2) {
        if (str == null) {
            throw new NullPointerException("Null batteryLevelTextString");
        }
        this.a = str;
        this.b = i;
        this.c = z;
        if (str2 != null) {
            this.d = str2;
            return;
        }
        throw new NullPointerException("Null contentDescription");
    }
}
