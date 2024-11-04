package defpackage;

import com.google.android.gms.people.contactssync.DeviceContactsSyncClient;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvt implements fjn {
    private final /* synthetic */ int a;

    public fvt(int i) {
        this.a = i;
    }

    @Override // defpackage.fjn
    public final /* synthetic */ void a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                ((fyg) obj).a();
                return;
            } else {
                ((DeviceContactsSyncClient.SyncSettingUpdatedListener) obj).onDeviceContactsSyncSettingUpdated();
                return;
            }
        }
        ((fuz) obj).a();
    }

    @Override // defpackage.fjn
    public final void b() {
    }
}
