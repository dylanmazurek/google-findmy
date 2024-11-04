package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class muk extends mse {
    private final mun f;

    public muk(mmx mmxVar, mun munVar) {
        super(mmxVar, 1);
        this.f = munVar;
    }

    @Override // defpackage.mse
    protected final String n() {
        return "AwaitContinuation";
    }

    @Override // defpackage.mse
    public final Throwable q(muf mufVar) {
        Throwable d;
        Object B = this.f.B();
        if ((B instanceof mum) && (d = ((mum) B).d()) != null) {
            return d;
        }
        if (B instanceof msm) {
            return ((msm) B).b;
        }
        return mufVar.n();
    }
}
