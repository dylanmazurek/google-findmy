package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dav extends mpe implements mol {
    final /* synthetic */ cyb a;
    final /* synthetic */ mnw b;
    final /* synthetic */ aox c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ gga f;
    private final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dav(cyb cybVar, mnw mnwVar, aox aoxVar, gga ggaVar, int i, int i2, int i3) {
        super(2);
        this.g = i3;
        this.a = cybVar;
        this.b = mnwVar;
        this.c = aoxVar;
        this.f = ggaVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.g != 0) {
            ((Number) obj2).intValue();
            cyb cybVar = this.a;
            mnw mnwVar = this.b;
            aox aoxVar = this.c;
            gga ggaVar = this.f;
            bpp.d(cybVar, mnwVar, aoxVar, ggaVar, (abi) obj, aev.a(this.d | 1), aev.a(this.e));
            return mlh.a;
        }
        ((Number) obj2).intValue();
        cyb cybVar2 = this.a;
        mnw mnwVar2 = this.b;
        aox aoxVar2 = this.c;
        gga ggaVar2 = this.f;
        bpp.d(cybVar2, mnwVar2, aoxVar2, ggaVar2, (abi) obj, aev.a(this.d | 1), aev.a(this.e));
        return mlh.a;
    }
}
