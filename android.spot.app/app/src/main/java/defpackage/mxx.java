package defpackage;

/* loaded from: classes.dex */
public final class mxx extends mnl {
    /* synthetic */ Object a;
    int b;
    Object c;
    Object d;
    final /* synthetic */ mxi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxx(mxi mxiVar, mmx mmxVar) {
        super(mmxVar);
        this.e = mxiVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.dt(null, this);
    }
}
