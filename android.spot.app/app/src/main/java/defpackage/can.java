package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class can extends mnl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public int d;
    final /* synthetic */ brp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public can(brp brpVar, mmx mmxVar) {
        super(mmxVar);
        this.e = brpVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.e.b(null, null, this);
    }
}
