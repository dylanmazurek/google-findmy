package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.findmydevice.spot.StartFinderAdvertisingRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fos extends fhq implements fhu {
    private static final fma a = new foq();

    public fos(Context context) {
        super(context, new gok("SpotWearableCompanion.API", a, (byte[]) null), fhl.a, fhp.a);
    }

    public final fxs a(StartFinderAdvertisingRequest startFinderAdvertisingRequest) {
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fnv.c};
        fjyVar.a = new fep(startFinderAdvertisingRequest, 15);
        fjyVar.c = 33320;
        return f(fjyVar.a());
    }
}
