package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class myd extends mnl {
    Object a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ mye e;
    int f;
    myg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myd(mye myeVar, mmx mmxVar) {
        super(mmxVar);
        this.e = myeVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return mye.f(this.e, null, this);
    }
}
