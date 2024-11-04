package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class erp extends mnp implements mol {
    final /* synthetic */ msw a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ gga d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erp(msw mswVar, boolean z, gga ggaVar, boolean z2, mmx mmxVar) {
        super(2, mmxVar);
        this.a = mswVar;
        this.b = z;
        this.d = ggaVar;
        this.c = z2;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((erp) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mjo.o(obj);
        mpp.q(this.a, null, 0, new ero(this.b, this.d, this.c, null), 3);
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new erp(this.a, this.b, this.d, this.c, mmxVar);
    }
}
