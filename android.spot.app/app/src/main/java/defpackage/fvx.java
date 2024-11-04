package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvx implements fux {
    private final Status a;
    private final fkb b;

    public fvx(Status status, fkb fkbVar) {
        this.a = status;
        this.b = fkbVar;
    }

    @Override // defpackage.fhx
    public final void a() {
        fkb fkbVar = this.b;
        if (fkbVar != null) {
            fkbVar.a();
        }
    }

    @Override // defpackage.fhz
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.fux
    public final fkb c() {
        return this.b;
    }
}
