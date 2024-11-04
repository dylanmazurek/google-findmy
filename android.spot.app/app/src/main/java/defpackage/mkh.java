package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkh extends mjo {
    public final mkg a;
    private Object b;
    private boolean c;

    public mkh() {
        throw null;
    }

    @Override // defpackage.mjo
    public final void a(mca mcaVar, mbc mbcVar) {
        if (mcaVar.f()) {
            if (!this.c) {
                this.a.n(new mcc(mca.h.d("No value received for unary call"), null));
            }
            this.a.d(this.b);
            return;
        }
        this.a.n(new mcc(mcaVar, null));
    }

    @Override // defpackage.mjo
    public final void f(Object obj) {
        if (!this.c) {
            this.b = obj;
            this.c = true;
            return;
        }
        throw new mcc(mca.h.d("More than one value received for unary call"));
    }

    public mkh(mkg mkgVar) {
        super(null);
        this.c = false;
        this.a = mkgVar;
    }

    @Override // defpackage.mjo
    public final void S(mbc mbcVar) {
    }
}
