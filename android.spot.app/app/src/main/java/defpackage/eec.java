package defpackage;

/* loaded from: classes.dex */
public final class eec extends mnl {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ eed c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eec(eed eedVar, mmx mmxVar) {
        super(mmxVar);
        this.c = eedVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.dt(null, this);
    }
}
