package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mbs extends mjo {
    public final mjo f;

    /* JADX INFO: Access modifiers changed from: protected */
    public mbs(mjo mjoVar) {
        super(null);
        this.f = mjoVar;
    }

    @Override // defpackage.mjo
    public void S(mbc mbcVar) {
        this.f.S(mbcVar);
    }

    @Override // defpackage.mjo
    public void f(Object obj) {
        this.f.f(obj);
    }

    @Override // defpackage.mjo
    public final void g() {
        this.f.g();
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", this.f);
        return q.toString();
    }
}
