package defpackage;

/* loaded from: classes.dex */
public final class mwx extends mnl {
    /* synthetic */ Object a;
    int b;
    Object c;
    Object d;
    final /* synthetic */ mwy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwx(mwy mwyVar, mmx mmxVar) {
        super(mmxVar);
        this.e = mwyVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
