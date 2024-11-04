package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbl extends mnl {
    public /* synthetic */ Object a;
    public int b;
    public mpl c;
    final /* synthetic */ hpd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbl(hpd hpdVar, mmx mmxVar) {
        super(mmxVar);
        this.d = hpdVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.l(null, false, this);
    }
}
