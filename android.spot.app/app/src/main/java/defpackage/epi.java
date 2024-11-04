package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epi extends op {
    final /* synthetic */ epj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epi(epj epjVar) {
        super(true);
        this.a = epjVar;
    }

    @Override // defpackage.op
    public final void b() {
        eoz eozVar = this.a.a;
        if (eozVar.a.g(eozVar.b)) {
            this.a.aq.s();
        } else {
            h(false);
            this.a.F().c().d();
        }
    }
}
