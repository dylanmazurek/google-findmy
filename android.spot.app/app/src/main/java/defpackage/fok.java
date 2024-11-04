package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fok extends fob {
    final /* synthetic */ bym a;

    public fok(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fob
    public final void b(Status status, ChangeFindMyDeviceSettingsResponse changeFindMyDeviceSettingsResponse) {
        fma.ba(status, changeFindMyDeviceSettingsResponse, this.a);
    }
}
