package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fih extends fid {
    private final fjz a;
    private final bym b;

    public fih(int i, fjz fjzVar, bym bymVar) {
        super(i);
        this.b = bymVar;
        this.a = fjzVar;
        if (i == 2 && fjzVar.c) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.fid
    public final boolean a(fjb fjbVar) {
        return this.a.c;
    }

    @Override // defpackage.fid
    public final Feature[] b(fjb fjbVar) {
        return this.a.b;
    }

    @Override // defpackage.fij
    public final void d(Status status) {
        this.b.t(fma.aW(status));
    }

    @Override // defpackage.fij
    public final void e(Exception exc) {
        this.b.t(exc);
    }

    @Override // defpackage.fij
    public final void f(fjb fjbVar) {
        try {
            this.a.a(fjbVar.b, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            d(fij.h(e2));
        } catch (RuntimeException e3) {
            e(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.fij
    public final void g(gok gokVar, boolean z) {
        ?? r0 = gokVar.b;
        bym bymVar = this.b;
        r0.put(bymVar, Boolean.valueOf(z));
        ((fxs) bymVar.a).k(new fiw(gokVar, bymVar));
    }
}
