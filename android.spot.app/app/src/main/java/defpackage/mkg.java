package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mkg extends jwq {
    public final lyv a;

    public mkg(lyv lyvVar) {
        this.a = lyvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final String a() {
        jeq q = ivc.q(this);
        q.b("clientCall", this.a);
        return q.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jwq
    public final boolean d(Object obj) {
        return super.d(obj);
    }

    @Override // defpackage.jwq
    protected final void l() {
        this.a.c("GrpcFuture was cancelled", null);
    }
}
