package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.GetOwnerKeyResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fol extends fob {
    final /* synthetic */ bym a;

    public fol(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fob
    public final void e(Status status, GetOwnerKeyResponse getOwnerKeyResponse) {
        fma.ba(status, getOwnerKeyResponse, this.a);
    }
}
