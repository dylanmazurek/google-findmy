package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msj extends muh implements msi {
    public final mun a;

    public msj(mun munVar) {
        this.a = munVar;
    }

    @Override // defpackage.muc
    public final void b(Throwable th) {
        this.a.L(e());
    }

    @Override // defpackage.msi
    public final muf c() {
        return e();
    }

    @Override // defpackage.msi
    public final boolean d(Throwable th) {
        return e().M(th);
    }
}
