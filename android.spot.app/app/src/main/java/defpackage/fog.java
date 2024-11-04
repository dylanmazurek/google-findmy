package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fog extends fnz {
    final /* synthetic */ bym a;

    public fog(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fnz
    public final void b(Status status, OwnersLocationReportResponse ownersLocationReportResponse) {
        fma.ba(status, ownersLocationReportResponse, this.a);
    }
}
