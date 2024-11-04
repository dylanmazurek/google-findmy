package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fif extends fij {
    protected final fio a;

    public fif(int i, fio fioVar) {
        super(i);
        this.a = fioVar;
    }

    @Override // defpackage.fij
    public final void d(Status status) {
        try {
            this.a.j(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.fij
    public final void e(Exception exc) {
        try {
            this.a.j(new Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.fij
    public final void f(fjb fjbVar) {
        try {
            this.a.i(fjbVar.b);
        } catch (RuntimeException e) {
            e(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    @Override // defpackage.fij
    public final void g(gok gokVar, boolean z) {
        fio fioVar = this.a;
        gokVar.a.put(fioVar, Boolean.valueOf(z));
        fioVar.d(new flj(gokVar, fioVar, 1));
    }
}
