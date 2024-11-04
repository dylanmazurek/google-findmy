package defpackage;

/* loaded from: classes.dex */
public final class ewl extends mnl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ mxi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewl(mxi mxiVar, mmx mmxVar) {
        super(mmxVar);
        this.c = mxiVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.dt(null, this);
    }
}
