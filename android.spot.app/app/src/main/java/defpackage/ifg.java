package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifg implements idu {
    public final /* synthetic */ ifh a;

    public ifg(ifh ifhVar) {
        this.a = ifhVar;
    }

    @Override // defpackage.idu
    public final void b(idz idzVar) {
        jer i = jer.i(ivc.u(new hka(this, idzVar, 13, (byte[]) null), 0L, ifh.a.toMillis(), TimeUnit.MILLISECONDS, this.a.f));
        ifh ifhVar = this.a;
        ifhVar.k = i;
        ifhVar.b();
    }

    @Override // defpackage.idu
    public final void c() {
        this.a.c();
        this.a.a();
    }

    @Override // defpackage.icj
    public final /* synthetic */ void a(ick ickVar) {
    }
}
