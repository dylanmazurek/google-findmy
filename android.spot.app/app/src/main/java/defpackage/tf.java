package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tf extends mpe implements mom {
    final /* synthetic */ anr a;
    final /* synthetic */ Object b;
    final /* synthetic */ to c;
    final /* synthetic */ mon d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(anr anrVar, Object obj, to toVar, mon monVar) {
        super(3);
        this.a = anrVar;
        this.b = obj;
        this.c = toVar;
        this.d = monVar;
    }

    @Override // defpackage.mom
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        boolean D;
        int i;
        tv tvVar = (tv) obj;
        abi abiVar = (abi) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if ((intValue & 8) == 0) {
                D = abiVar.B(tvVar);
            } else {
                D = abiVar.D(tvVar);
            }
            if (true != D) {
                i = 2;
            } else {
                i = 4;
            }
            intValue |= i;
        }
        if ((intValue & 19) == 18 && abiVar.G()) {
            abiVar.r();
        } else {
            boolean B = abiVar.B(this.a) | abiVar.D(this.b) | abiVar.D(this.c);
            anr anrVar = this.a;
            Object obj4 = this.b;
            to toVar = this.c;
            Object g = abiVar.g();
            if (B || g == abh.a) {
                g = new ud(anrVar, obj4, toVar, 1);
                abiVar.w(g);
            }
            act.c(tvVar, (moh) g, abiVar);
            to toVar2 = this.c;
            Object obj5 = this.b;
            tvVar.getClass();
            toVar2.d.e(obj5, ((tw) tvVar).a);
            Object g2 = abiVar.g();
            if (g2 == abh.a) {
                g2 = new tk();
                abiVar.w(g2);
            }
            this.d.e((tk) g2, this.b, abiVar, 0);
        }
        return mlh.a;
    }
}
