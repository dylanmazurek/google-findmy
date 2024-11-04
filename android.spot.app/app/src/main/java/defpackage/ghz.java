package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghz extends mnl {
    public /* synthetic */ Object a;
    public int b;
    final /* synthetic */ apc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghz(apc apcVar, mmx mmxVar) {
        super(mmxVar);
        this.c = apcVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.A(null, this);
    }
}
