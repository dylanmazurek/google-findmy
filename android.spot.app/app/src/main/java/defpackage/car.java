package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class car extends mnl {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ cby c;
    cby d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public car(cby cbyVar, mmx mmxVar) {
        super(mmxVar);
        this.c = cbyVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
