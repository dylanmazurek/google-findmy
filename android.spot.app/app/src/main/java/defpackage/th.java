package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class th extends mpe implements mol {
    final /* synthetic */ moh a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    final /* synthetic */ Object g;
    private final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(Object obj, aox aoxVar, moh mohVar, aon aonVar, moh mohVar2, mon monVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.d = obj;
        this.e = aoxVar;
        this.a = mohVar;
        this.c = aonVar;
        this.f = mohVar2;
        this.g = monVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, aox] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, aox] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [aon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, aox] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mon] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, mon] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, mom] */
    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                abi abiVar = (abi) obj;
                ((Number) obj2).intValue();
                Object obj3 = this.d;
                moh mohVar = this.a;
                ?? r4 = this.f;
                Object obj4 = this.c;
                uf ufVar = (uf) obj4;
                wi wiVar = (wi) obj3;
                nq.b(wiVar, mohVar, r4, ufVar, (ug) this.e, this.g, abiVar, aev.a(this.b | 1));
                return mlh.a;
            }
            ((Number) obj2).intValue();
            nk.c(this.d, this.e, this.a, this.c, this.f, this.g, (abi) obj, aev.a(this.b | 1));
            return mlh.a;
        }
        abi abiVar2 = (abi) obj;
        ((Number) obj2).intValue();
        nk.b((wi) this.c, this.d, this.a, this.e, this.f, this.g, abiVar2, aev.a(this.b | 1));
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(wi wiVar, aox aoxVar, moh mohVar, aon aonVar, moh mohVar2, mon monVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.c = wiVar;
        this.d = aoxVar;
        this.a = mohVar;
        this.e = aonVar;
        this.f = mohVar2;
        this.g = monVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th(wi wiVar, moh mohVar, aox aoxVar, uf ufVar, ug ugVar, mom momVar, int i, int i2) {
        super(2);
        this.h = i2;
        this.d = wiVar;
        this.a = mohVar;
        this.f = aoxVar;
        this.c = ufVar;
        this.e = ugVar;
        this.g = momVar;
        this.b = i;
    }
}
