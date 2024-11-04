package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.SyncOwnerKeyResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fon extends fob {
    final /* synthetic */ bym a;

    public fon(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fob
    public final void g(Status status, SyncOwnerKeyResponse syncOwnerKeyResponse) {
        fma.ba(status, syncOwnerKeyResponse, this.a);
    }
}
