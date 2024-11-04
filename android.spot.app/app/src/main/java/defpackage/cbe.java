package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbe extends mnl {
    public Object a;
    public boolean b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ hpd e;
    public hpd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbe(hpd hpdVar, mmx mmxVar) {
        super(mmxVar);
        this.e = hpdVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.i(false, this);
    }
}
