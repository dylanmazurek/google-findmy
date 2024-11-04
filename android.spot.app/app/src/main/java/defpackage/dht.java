package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dht extends mpe implements mom {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dht(Object obj, int i) {
        super(3);
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.mom
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int i;
        awi cd;
        awi cd2;
        float f;
        int i2 = this.b;
        dig digVar = null;
        if (i2 != 0) {
            if (i2 != 1) {
                int i3 = 2;
                if (i2 != 2) {
                    xy xyVar = (xy) obj;
                    abi abiVar = (abi) obj2;
                    int intValue = ((Number) obj3).intValue();
                    xyVar.getClass();
                    if ((intValue & 14) == 0) {
                        if (true == abiVar.B(xyVar)) {
                            i3 = 4;
                        }
                        intValue |= i3;
                    }
                    if ((intValue & 91) == 18 && abiVar.G()) {
                        abiVar.r();
                    } else {
                        long j = xyVar.b;
                        ble bleVar = xyVar.a;
                        if (bld.g(j)) {
                            f = bleVar.cg(bld.a(j));
                        } else {
                            f = Float.POSITIVE_INFINITY;
                        }
                        aaj aajVar = ert.a;
                        abiVar.u(-1205672086);
                        ble bleVar2 = (ble) abiVar.f(bcg.a);
                        float f2 = ert.c;
                        float cc = bleVar2.cc(ert.a.a.f());
                        abiVar.o();
                        if (Float.compare(f, f2 + cc + cc) > 0) {
                            ert.a((equ) ((wi) this.a).e(), abiVar, 8);
                        }
                    }
                    return mlh.a;
                }
                abi abiVar2 = (abi) obj2;
                ((Number) obj3).intValue();
                ((wc) obj).getClass();
                abiVar2.u(1853977405);
                abiVar2.o();
                return this.a;
            }
            awr l = ((awg) obj2).l(((bld) obj3).a);
            cd2 = ((awj) obj).cd(l.a, l.b, mly.a, new tn(l, this.a, 1, null));
            return cd2;
        }
        awj awjVar = (awj) obj;
        awg awgVar = (awg) obj2;
        long j2 = ((bld) obj3).a;
        awjVar.getClass();
        awgVar.getClass();
        int i4 = Integer.MIN_VALUE;
        if (bld.h(j2)) {
            i = bld.b(j2);
        } else {
            i = Integer.MIN_VALUE;
        }
        if (bld.g(j2)) {
            i4 = bld.a(j2);
        }
        if (dtq.k(i) && dtq.k(i4)) {
            digVar = new dig(i, i4);
        }
        if (digVar != null) {
            ((mun) ((dhx) this.a).a).R(digVar);
        }
        awr l2 = awgVar.l(j2);
        cd = awjVar.cd(l2.a, l2.b, mly.a, new bco(l2, 16));
        return cd;
    }
}
