package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.ImportGivenOwnerKeyResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fom extends fob {
    final /* synthetic */ bym a;

    public fom(bym bymVar) {
        this.a = bymVar;
    }

    @Override // defpackage.fob
    public final void f(Status status, ImportGivenOwnerKeyResponse importGivenOwnerKeyResponse) {
        fma.ba(status, importGivenOwnerKeyResponse, this.a);
    }
}
