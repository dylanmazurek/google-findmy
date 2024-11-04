package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mfa implements meb {
    @Override // defpackage.mdt
    public mdq a(mbg mbgVar, mbc mbcVar, lys lysVar, lyy[] lyyVarArr) {
        throw null;
    }

    @Override // defpackage.mhf
    public final Runnable b(mhe mheVar) {
        return d().b(mheVar);
    }

    @Override // defpackage.mad
    public final lzz c() {
        return d().c();
    }

    protected abstract meb d();

    @Override // defpackage.mhf
    public void e(mca mcaVar) {
        d().e(mcaVar);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", d());
        return q.toString();
    }
}
