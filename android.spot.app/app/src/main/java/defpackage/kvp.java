package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvp extends mjo {
    public boolean a;
    final /* synthetic */ kvt b;
    public final mjo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvp(kvt kvtVar, mjo mjoVar) {
        super(null);
        this.b = kvtVar;
        this.a = false;
        this.c = mjoVar;
    }

    @Override // defpackage.mjo
    public final void S(mbc mbcVar) {
        this.b.a.execute(new koq(this, mbcVar, 19));
    }

    @Override // defpackage.mjo
    public final void a(mca mcaVar, mbc mbcVar) {
        this.b.a.execute(new kvo((mjo) this, mcaVar, mbcVar, 0));
    }

    @Override // defpackage.mjo
    public final void f(Object obj) {
        this.b.a.execute(new koq(this, obj, 20));
    }

    @Override // defpackage.mjo
    public final void g() {
        this.b.a.execute(new jxe(this, 15));
    }
}
