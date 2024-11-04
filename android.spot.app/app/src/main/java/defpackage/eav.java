package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eav extends mnl {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ eay c;
    int d;
    eay e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eav(eay eayVar, mmx mmxVar) {
        super(mmxVar);
        this.c = eayVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
