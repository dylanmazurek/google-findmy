package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tq extends mpe implements mol {
    final /* synthetic */ wi a;
    final /* synthetic */ moh b;
    final /* synthetic */ aox c;
    final /* synthetic */ uf d;
    final /* synthetic */ ug e;
    final /* synthetic */ mol f;
    final /* synthetic */ mom g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(wi wiVar, moh mohVar, aox aoxVar, uf ufVar, ug ugVar, mol molVar, mom momVar, int i) {
        super(2);
        this.a = wiVar;
        this.b = mohVar;
        this.c = aoxVar;
        this.d = ufVar;
        this.e = ugVar;
        this.f = molVar;
        this.g = momVar;
        this.h = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nq.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (abi) obj, aev.a(this.h | 1));
        return mlh.a;
    }
}
