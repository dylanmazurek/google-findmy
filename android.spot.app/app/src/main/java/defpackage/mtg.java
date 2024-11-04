package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtg extends nbg {
    public final mrp b;

    public mtg(mnb mnbVar, mmx mmxVar) {
        super(mnbVar, mmxVar);
        this.b = new mrp(0, mrs.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nbg, defpackage.mun
    public final void a(Object obj) {
        dk(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nbg, defpackage.mrt
    public final void dk(Object obj) {
        do {
            int i = this.b.b;
            if (i != 0) {
                if (i == 1) {
                    mmx mmxVar = this.e;
                    nao.a(mjo.w(mmxVar), msz.s(obj, mmxVar));
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!this.b.c(0, 2));
    }
}
