package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvp extends fhq implements DeviceContactsSyncClient {
    private static final gok a;
    private static final fma l;

    static {
        fvk fvkVar = new fvk();
        l = fvkVar;
        a = new gok("People.API", fvkVar, (byte[]) null);
    }

    public fvp(Activity activity) {
        super(activity, activity, a, fhl.a, fhp.a);
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final fxs getDeviceContactsSyncSetting() {
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fuw.v};
        fjyVar.a = new fun(5);
        fjyVar.c = 2731;
        return f(fjyVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final fxs launchDeviceContactsSyncSettingActivity(Context context) {
        fma.aS(context, "Please provide a non-null context");
        fjy fjyVar = new fjy();
        fjyVar.b = new Feature[]{fuw.v};
        fjyVar.a = new fsw(context, 8);
        fjyVar.c = 2733;
        return f(fjyVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final fxs registerSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        fjo d = d(syncSettingUpdatedListener, "dataChangedListenerKey");
        fsw fswVar = new fsw(d, 9);
        fun funVar = new fun(4);
        fjt fjtVar = new fjt();
        fjtVar.c = d;
        fjtVar.a = fswVar;
        fjtVar.b = funVar;
        fjtVar.d = new Feature[]{fuw.u};
        fjtVar.f = 2729;
        return p(fjtVar.a());
    }

    @Override // com.google.android.gms.people.contactssync.DeviceContactsSyncClient
    public final fxs unregisterSyncSettingUpdatedListener(DeviceContactsSyncClient.SyncSettingUpdatedListener syncSettingUpdatedListener) {
        return g(fma.aX(syncSettingUpdatedListener, "dataChangedListenerKey"), 2730);
    }

    public fvp(Context context) {
        super(context, a, fhl.a, fhp.a);
    }
}
