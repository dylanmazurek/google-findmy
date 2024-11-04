package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class exc extends mnl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ dhx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exc(dhx dhxVar, mmx mmxVar) {
        super(mmxVar);
        this.c = dhxVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.f(null, this);
    }
}
