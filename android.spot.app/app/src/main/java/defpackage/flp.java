package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flp extends fhq implements fhu {
    private static final gok a;
    private static final fma l;

    static {
        flo floVar = new flo();
        l = floVar;
        a = new gok("ClientTelemetry.API", floVar, (byte[]) null);
    }

    public flp(Context context, fll fllVar) {
        super(context, a, fllVar, fhp.a);
    }

    public final void a(TelemetryData telemetryData) {
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{ffz.a};
        fjyVar.b();
        fjyVar.a = new fep(telemetryData, 5);
        o(fjyVar.a());
    }
}
