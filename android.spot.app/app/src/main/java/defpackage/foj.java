package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class foj extends fob {
    final /* synthetic */ bym a;

    public foj(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fob
    public final void c(Status status, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse) {
        fma.ba(status, getFindMyDeviceSettingsResponse, this.a);
    }
}
