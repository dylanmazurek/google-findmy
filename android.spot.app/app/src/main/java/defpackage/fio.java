package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fio extends BasePendingResult implements fip {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fio(fht fhtVar) {
        super(fhtVar);
        fma.aS(fhtVar, "GoogleApiClient must not be null");
    }

    private final void b(RemoteException remoteException) {
        j(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    protected abstract void c(fhh fhhVar);

    public final void i(fhh fhhVar) {
        try {
            c(fhhVar);
        } catch (DeadObjectException e) {
            b(e);
            throw e;
        } catch (RemoteException e2) {
            b(e2);
        }
    }

    public final void j(Status status) {
        fma.aG(!status.a(), "Failed result must not be success");
        n(a(status));
    }

    @Override // defpackage.fip
    public /* bridge */ /* synthetic */ void k(Object obj) {
        throw null;
    }
}
