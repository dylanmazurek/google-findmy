package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ui extends aow implements ayj {
    public wi a;
    public uf b;
    public ug c;
    public mnw d;
    public aon e;
    public uc f;
    private long g;

    public ui() {
        throw null;
    }

    @Override // defpackage.ayj
    public final awi a(awj awjVar, awg awgVar, long j) {
        agt agtVar;
        agt agtVar2;
        aro aroVar;
        long j2;
        long j3;
        long j4;
        awi cd;
        awi cd2;
        agt agtVar3 = null;
        if (this.a.d() == this.a.e()) {
            this.e = null;
        } else if (this.e == null) {
            if (this.a.c().d(ub.PreEnter, ub.Visible)) {
                um umVar = this.b.b;
                um umVar2 = this.c.b;
            } else {
                um umVar3 = this.c.b;
                um umVar4 = this.b.b;
            }
            int i = aon.a;
            this.e = aom.a;
        }
        if (awjVar.n()) {
            awr l = awgVar.l(j);
            long m = bef.m(l.a, l.b);
            this.g = m;
            cd2 = awjVar.cd(blm.b(m), blm.a(m), mly.a, new oq(l, 9));
            return cd2;
        }
        ((Boolean) this.d.a()).booleanValue();
        uc ucVar = this.f;
        kgf kgfVar = ucVar.d;
        kgf kgfVar2 = ucVar.e;
        wi wiVar = ucVar.a;
        uf ufVar = ucVar.b;
        ug ugVar = ucVar.c;
        kgf kgfVar3 = ucVar.f;
        vu vuVar = ue.a;
        if (kgfVar != null) {
            agtVar = kgfVar.b(new tn(ufVar, ugVar, 2), new tn(ufVar, ugVar, 3));
        } else {
            agtVar = null;
        }
        if (kgfVar2 != null) {
            agtVar2 = kgfVar2.b(new tn(ufVar, ugVar, 4), new tn(ufVar, ugVar, 5));
        } else {
            agtVar2 = null;
        }
        if (wiVar.d() == ub.PreEnter) {
            uk ukVar = ufVar.b.d;
            if (ukVar != null) {
                aroVar = new aro(ukVar.b);
            } else {
                uk ukVar2 = ugVar.b.d;
                if (ukVar2 != null) {
                    aroVar = new aro(ukVar2.b);
                }
                aroVar = null;
            }
        } else {
            uk ukVar3 = ugVar.b.d;
            if (ukVar3 != null) {
                aroVar = new aro(ukVar3.b);
            } else {
                uk ukVar4 = ufVar.b.d;
                if (ukVar4 != null) {
                    aroVar = new aro(ukVar4.b);
                }
                aroVar = null;
            }
        }
        if (kgfVar3 != null) {
            agtVar3 = kgfVar3.b(ts.g, new ud(aroVar, ufVar, ugVar, 2));
        }
        ud udVar = new ud(agtVar, agtVar2, agtVar3, 0);
        awr l2 = awgVar.l(j);
        long m2 = bef.m(l2.a, l2.b);
        long j5 = this.g;
        if (true == a.n(j5, tx.a)) {
            j3 = j;
            j2 = m2;
        } else {
            j2 = j5;
            j3 = j;
        }
        long m3 = bbc.m(j3, m2);
        aon aonVar = this.e;
        if (aonVar != null) {
            j4 = aonVar.a(j2, m3, bln.Ltr);
        } else {
            j4 = 0;
        }
        cd = awjVar.cd(blm.b(m3), blm.a(m3), mly.a, new gic(l2, blk.d(j4, 0L), 0L, udVar, 1));
        return cd;
    }

    @Override // defpackage.aow
    public final void bZ() {
        this.g = tx.a;
    }

    public ui(wi wiVar, uf ufVar, ug ugVar, mnw mnwVar, uc ucVar) {
        this.a = wiVar;
        this.b = ufVar;
        this.c = ugVar;
        this.d = mnwVar;
        this.f = ucVar;
        this.g = tx.a;
        bbc.o(0, 0, 15);
    }
}
