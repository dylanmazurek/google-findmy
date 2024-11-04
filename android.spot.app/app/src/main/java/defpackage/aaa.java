package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaa extends mpe implements mol {
    final /* synthetic */ int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaa(aox aoxVar, wi wiVar, Integer num, Integer num2, int i, int i2) {
        super(2);
        this.f = i2;
        this.c = aoxVar;
        this.b = wiVar;
        this.e = num;
        this.d = num2;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, aox] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, aox] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, avo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, mol] */
    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    abi abiVar = (abi) obj;
                    ((Number) obj2).intValue();
                    Object obj3 = this.b;
                    Object obj4 = this.c;
                    aae aaeVar = (aae) obj4;
                    zw zwVar = (zw) obj3;
                    fzo.i(zwVar, aaeVar, (aaj) this.d, this.e, abiVar, aev.a(this.a | 1));
                    return mlh.a;
                }
                abi abiVar2 = (abi) obj;
                ((Number) obj2).intValue();
                ?? r0 = this.c;
                Object obj5 = this.b;
                Object obj6 = this.e;
                wi wiVar = (wi) obj5;
                bsn.q(r0, wiVar, (Integer) obj6, (Integer) this.d, abiVar2, aev.a(this.a | 1));
                return mlh.a;
            }
            abi abiVar3 = (abi) obj;
            ((Number) obj2).intValue();
            ri.b((atq) this.d, this.c, this.b, this.e, abiVar3, aev.a(this.a | 1));
            return mlh.a;
        }
        abi abiVar4 = (abi) obj;
        ((Number) obj2).intValue();
        Object obj7 = this.b;
        Object obj8 = this.c;
        aaj aajVar = (aaj) this.d;
        zw zwVar2 = (zw) obj7;
        dd.g(zwVar2, (aae) obj8, aajVar, this.e, abiVar4, aev.a(this.a | 1));
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaa(atq atqVar, aox aoxVar, aon aonVar, avo avoVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.d = atqVar;
        this.c = aoxVar;
        this.b = aonVar;
        this.e = avoVar;
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaa(zw zwVar, aae aaeVar, aaj aajVar, mol molVar, int i, int i2) {
        super(2);
        this.f = i2;
        this.b = zwVar;
        this.c = aaeVar;
        this.d = aajVar;
        this.e = molVar;
        this.a = i;
    }
}
