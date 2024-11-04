package defpackage;

/* loaded from: classes.dex */
public final class mxm extends mnl {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ mxi d;
    mxi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxm(mxi mxiVar, mmx mmxVar) {
        super(mmxVar);
        this.d = mxiVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.dt(null, this);
    }
}
