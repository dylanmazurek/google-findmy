package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class muw extends muj {
    private final mse a;

    public muw(mse mseVar) {
        this.a = mseVar;
    }

    @Override // defpackage.muc
    public final void b(Throwable th) {
        Object B = e().B();
        boolean z = msy.a;
        if (B instanceof msm) {
            this.a.p(mjo.n(((msm) B).b));
        } else {
            this.a.p(muo.b(B));
        }
    }
}
