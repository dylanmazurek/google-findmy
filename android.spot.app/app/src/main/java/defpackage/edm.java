package defpackage;

/* loaded from: classes.dex */
public final class edm extends mnl {
    public /* synthetic */ Object a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    final /* synthetic */ mwt f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edm(mwt mwtVar, mmx mmxVar) {
        super(mmxVar);
        this.f = mwtVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.f.dt(null, this);
    }
}
