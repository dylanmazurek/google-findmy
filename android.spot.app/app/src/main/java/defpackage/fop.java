package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fop extends fhq implements fhu {
    private static final fma a = new foi();

    public fop(Context context) {
        super(context, new gok("Spot.API", a, (byte[]) null), fhl.a, fhp.a);
    }

    public final fxs a(ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest) {
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fnv.a};
        fjyVar.a = new fep(changeFindMyDeviceSettingsRequest, 10);
        fjyVar.c = 33310;
        return f(fjyVar.a());
    }

    public final fxs b(GetFindMyDeviceSettingsRequest getFindMyDeviceSettingsRequest) {
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fnv.a};
        fjyVar.a = new fep(getFindMyDeviceSettingsRequest, 11);
        fjyVar.c = 33309;
        return f(fjyVar.a());
    }

    public final fxs q(GetKeychainLockScreenKnowledgeFactorSupportRequest getKeychainLockScreenKnowledgeFactorSupportRequest) {
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fnv.a};
        fjyVar.a = new fep(getKeychainLockScreenKnowledgeFactorSupportRequest, 12);
        fjyVar.c = 33316;
        return f(fjyVar.a());
    }
}
