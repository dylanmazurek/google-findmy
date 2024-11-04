package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkk implements fki {
    final /* synthetic */ fkn a;

    public fkk(fkn fknVar) {
        this.a = fknVar;
    }

    @Override // defpackage.fki
    public final void a(ConnectionResult connectionResult) {
        if (connectionResult.b()) {
            fkn fknVar = this.a;
            fknVar.r(null, ((fku) fknVar).s);
        } else {
            njz njzVar = this.a.q;
            if (njzVar != null) {
                njzVar.o(connectionResult);
            }
        }
    }
}
