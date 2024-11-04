package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ilm implements ilo {
    public final /* synthetic */ ilp a;
    private final /* synthetic */ int b;

    public /* synthetic */ ilm(ilp ilpVar, int i) {
        this.b = i;
        this.a = ilpVar;
    }

    @Override // defpackage.ilo
    public final jyz a(IOException iOException, jck jckVar) {
        if (this.b != 0) {
            return jckVar.m(iOException, this.a.d);
        }
        ilp ilpVar = this.a;
        return ilpVar.f.b(jbn.b(new etm(ilpVar, jckVar, 8)), ilpVar.c);
    }
}
