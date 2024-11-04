package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tt extends mpe implements mol {
    final /* synthetic */ boolean a;
    final /* synthetic */ aox b;
    final /* synthetic */ uf c;
    final /* synthetic */ ug d;
    final /* synthetic */ String e;
    final /* synthetic */ mom f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(boolean z, aox aoxVar, uf ufVar, ug ugVar, String str, mom momVar, int i) {
        super(2);
        this.a = z;
        this.b = aoxVar;
        this.c = ufVar;
        this.d = ugVar;
        this.e = str;
        this.f = momVar;
        this.g = i;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nq.e(this.a, this.b, this.c, this.d, this.e, this.f, (abi) obj, aev.a(this.g | 1));
        return mlh.a;
    }
}
