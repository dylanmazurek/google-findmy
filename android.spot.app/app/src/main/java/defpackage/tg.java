package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tg extends mpe implements mol {
    final /* synthetic */ wi a;
    final /* synthetic */ Object b;
    final /* synthetic */ moh c;
    final /* synthetic */ to d;
    final /* synthetic */ anr e;
    final /* synthetic */ mon f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tg(wi wiVar, Object obj, moh mohVar, to toVar, anr anrVar, mon monVar) {
        super(2);
        this.a = wiVar;
        this.b = obj;
        this.c = mohVar;
        this.d = toVar;
        this.e = anrVar;
        this.f = monVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ug ugVar;
        abi abiVar = (abi) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && abiVar.G()) {
            abiVar.r();
        } else {
            moh mohVar = this.c;
            to toVar = this.d;
            Object g = abiVar.g();
            if (g == abh.a) {
                g = mohVar.a(toVar);
                abiVar.w(g);
            }
            ua uaVar = (ua) g;
            boolean C = abiVar.C(amr.i(this.a.c().b(), this.b));
            wi wiVar = this.a;
            Object obj3 = this.b;
            moh mohVar2 = this.c;
            to toVar2 = this.d;
            Object g2 = abiVar.g();
            if (C || g2 == abh.a) {
                if (amr.i(wiVar.c().b(), obj3)) {
                    ugVar = ug.a;
                } else {
                    ugVar = ((ua) mohVar2.a(toVar2)).b;
                }
                g2 = ugVar;
                abiVar.w(g2);
            }
            Object obj4 = this.b;
            wi wiVar2 = this.a;
            ug ugVar2 = (ug) g2;
            Object g3 = abiVar.g();
            if (g3 == abh.a) {
                g3 = new tl(amr.i(obj4, wiVar2.e()));
                abiVar.w(g3);
            }
            uf ufVar = uaVar.a;
            tl tlVar = (tl) g3;
            aou aouVar = aox.d;
            boolean D = abiVar.D(uaVar);
            Object g4 = abiVar.g();
            if (D || g4 == abh.a) {
                g4 = new dht(uaVar, 1);
                abiVar.w(g4);
            }
            aox e = nk.e(aouVar, (mom) g4);
            tlVar.a.h(Boolean.valueOf(amr.i(this.b, this.a.e())));
            aox a = e.a(tlVar);
            wi wiVar3 = this.a;
            boolean D2 = abiVar.D(this.b);
            Object obj5 = this.b;
            Object g5 = abiVar.g();
            if (D2 || g5 == abh.a) {
                g5 = new oq(obj5, 4);
                abiVar.w(g5);
            }
            moh mohVar3 = (moh) g5;
            boolean B = abiVar.B(ugVar2);
            Object g6 = abiVar.g();
            if (B || g6 == abh.a) {
                g6 = new yj(ugVar2, 1);
                abiVar.w(g6);
            }
            nq.d(wiVar3, mohVar3, a, ufVar, ugVar2, (mol) g6, alg.e(-616195562, new tf(this.e, this.b, this.d, this.f), abiVar), abiVar, 12582912);
        }
        return mlh.a;
    }
}
