package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erj extends mpe implements mom {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ agt d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erj(dat datVar, aox aoxVar, agt agtVar, agt agtVar2, gga ggaVar, int i) {
        super(3);
        this.f = i;
        this.b = datVar;
        this.e = aoxVar;
        this.d = agtVar;
        this.a = agtVar2;
        this.c = ggaVar;
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, aox] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, aox] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, aox] */
    @Override // defpackage.mom
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i = this.f;
        if (i != 0) {
            if (i != 1) {
                abi abiVar = (abi) obj2;
                ((Number) obj3).intValue();
                ((tv) obj).getClass();
                cyb g = ((dat) this.b).g();
                abiVar.u(-90807079);
                boolean B = abiVar.B(this.b);
                Object g2 = abiVar.g();
                if (B || g2 == abh.a) {
                    g2 = new ctm(this.b, 18);
                    abiVar.w(g2);
                }
                abiVar.o();
                bpp.d(g, (mnw) g2, rc.d(jw.b(this.e, new erg(this.a, this.d, 3)), "OUTER_STAR_TAG"), (gga) this.c, abiVar, 134217736, 0);
                return mlh.a;
            }
            abi abiVar2 = (abi) obj2;
            ((Number) obj3).intValue();
            ((tv) obj).getClass();
            cyb g3 = ((dat) this.b).g();
            abiVar2.u(1143915825);
            boolean B2 = abiVar2.B(this.b);
            Object g4 = abiVar2.g();
            if (B2 || g4 == abh.a) {
                g4 = new ctm(this.b, 16);
                abiVar2.w(g4);
            }
            mnw mnwVar = (mnw) g4;
            abiVar2.o();
            ?? r8 = this.e;
            abiVar2.u(1143918816);
            boolean B3 = abiVar2.B(this.d) | abiVar2.B(this.a);
            agt agtVar = this.d;
            Object obj4 = this.a;
            Object g5 = abiVar2.g();
            if (B3 || g5 == abh.a) {
                g5 = new erg(agtVar, obj4, 2);
                abiVar2.w(g5);
            }
            abiVar2.o();
            bpp.d(g3, mnwVar, rc.d(jw.b(r8, (moh) g5), "INNER_STAR_TAG"), (gga) this.c, abiVar2, 134217736, 0);
            return mlh.a;
        }
        abi abiVar3 = (abi) obj2;
        ((Number) obj3).intValue();
        ((tv) obj).getClass();
        long j = erl.a;
        cyb a = ((daz) this.e).a();
        abiVar3.u(-807123542);
        boolean B4 = abiVar3.B(this.d);
        Object g6 = abiVar3.g();
        if (B4 || g6 == abh.a) {
            g6 = new ctm(this.d, 17);
            abiVar3.w(g6);
        }
        abiVar3.o();
        bpp.d(a, (mnw) g6, rc.d(jw.b(this.a, new eeo(this.c, 9)), "INNER_STAR_WATERMARK_TEST_TAG"), (gga) this.b, abiVar3, 134217736, 0);
        return mlh.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erj(dat datVar, aox aoxVar, gga ggaVar, daz dazVar, erz erzVar, int i) {
        super(3);
        this.f = i;
        this.d = datVar;
        this.a = aoxVar;
        this.b = ggaVar;
        this.e = dazVar;
        this.c = erzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erj(dat datVar, aox aoxVar, gga ggaVar, gga ggaVar2, agt agtVar, int i) {
        super(3);
        this.f = i;
        this.b = datVar;
        this.e = aoxVar;
        this.c = ggaVar;
        this.a = ggaVar2;
        this.d = agtVar;
    }
}
