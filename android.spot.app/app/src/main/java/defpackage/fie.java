package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fie extends fid {
    protected final bym a;

    public fie(int i, bym bymVar) {
        super(i);
        this.a = bymVar;
    }

    protected abstract void c(fjb fjbVar);

    @Override // defpackage.fij
    public final void d(Status status) {
        this.a.t(new fhn(status));
    }

    @Override // defpackage.fij
    public final void e(Exception exc) {
        this.a.t(exc);
    }

    @Override // defpackage.fij
    public final void f(fjb fjbVar) {
        try {
            c(fjbVar);
        } catch (DeadObjectException e) {
            d(fij.h(e));
            throw e;
        } catch (RemoteException e2) {
            d(fij.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    @Override // defpackage.fij
    public void g(gok gokVar, boolean z) {
    }
}
