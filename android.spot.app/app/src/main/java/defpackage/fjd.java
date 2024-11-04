package defpackage;

import com.google.android.gms.common.ConnectionResult;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjd implements fki {
    public final fhm a;
    public final fik b;
    public final /* synthetic */ fje e;
    public fla f = null;
    public Set c = null;
    public boolean d = false;

    public fjd(fje fjeVar, fhm fhmVar, fik fikVar) {
        this.e = fjeVar;
        this.a = fhmVar;
        this.b = fikVar;
    }

    @Override // defpackage.fki
    public final void a(ConnectionResult connectionResult) {
        this.e.n.post(new fbh(this, connectionResult, 7));
    }

    public final void b(ConnectionResult connectionResult) {
        fjb fjbVar = (fjb) this.e.k.get(this.b);
        if (fjbVar != null) {
            fjbVar.l(connectionResult);
        }
    }

    public final void c() {
        fla flaVar;
        if (this.d && (flaVar = this.f) != null) {
            this.a.r(flaVar, this.c);
        }
    }
}
