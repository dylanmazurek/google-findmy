package defpackage;

import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ein {
    public final jer a;
    public final boolean b;

    public ein() {
        throw null;
    }

    public static ein a(GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse) {
        jer i;
        boolean z = getFindMyDeviceSettingsResponse.a;
        FindMyDeviceNetworkSettings findMyDeviceNetworkSettings = getFindMyDeviceSettingsResponse.c;
        if (findMyDeviceNetworkSettings == null) {
            i = jdl.a;
        } else {
            i = jer.i(Integer.valueOf(findMyDeviceNetworkSettings.a));
        }
        return new ein(i, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ein) {
            ein einVar = (ein) obj;
            if (this.a.equals(einVar.a) && this.b == einVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "FindMyDeviceOptInState{fmdnState=" + String.valueOf(this.a) + ", fmdEnabled=" + this.b + "}";
    }

    public ein(jer jerVar, boolean z) {
        this.a = jerVar;
        this.b = z;
    }
}
