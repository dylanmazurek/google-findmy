package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxs extends mnl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ cbb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxs(cbb cbbVar, mmx mmxVar) {
        super(mmxVar);
        this.c = cbbVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.dt(null, this);
    }
}
