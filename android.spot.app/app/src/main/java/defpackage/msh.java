package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msh extends muh {
    public final mse a;

    public msh(mse mseVar) {
        this.a = mseVar;
    }

    @Override // defpackage.muc
    public final void b(Throwable th) {
        Throwable q = this.a.q(e());
        mse mseVar = this.a;
        if (mseVar.C()) {
            nan nanVar = (nan) mseVar.a;
            mrr mrrVar = nanVar.f;
            while (true) {
                Object obj = mrrVar.a;
                if (amr.i(obj, nao.b)) {
                    if (nanVar.f.d(nao.b, q)) {
                        return;
                    }
                } else if (!(obj instanceof Throwable)) {
                    if (nanVar.f.d(obj, null)) {
                        break;
                    }
                } else {
                    return;
                }
            }
        }
        mseVar.i(q);
        mseVar.y();
    }
}
