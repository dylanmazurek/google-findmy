package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class mfc extends mbn {
    public final mbn a;

    public mfc(mbn mbnVar) {
        this.a = mbnVar;
    }

    @Override // defpackage.mbn
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.mbn
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.mbn
    public void c() {
        throw null;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", this.a);
        return q.toString();
    }
}
