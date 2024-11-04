package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayt implements asn {
    public final asl a;
    private aya b;

    public ayt() {
        this(null);
    }

    @Override // defpackage.ble
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.blj
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.blj
    public final float cc(long j) {
        return bbp.e(this.a, j);
    }

    @Override // defpackage.ble
    public final float cf(float f) {
        return bbc.b(this.a, f);
    }

    @Override // defpackage.ble
    public final float cg(int i) {
        return bbc.c(this.a, i);
    }

    @Override // defpackage.ble
    public final float ch(long j) {
        return bbc.d(this.a, j);
    }

    @Override // defpackage.ble
    public final float ci(float f) {
        return bbc.e(this.a, f);
    }

    @Override // defpackage.ble
    public final int cj(float f) {
        throw null;
    }

    @Override // defpackage.ble
    public final long ck(long j) {
        return bbc.g(this.a, j);
    }

    @Override // defpackage.blj
    public final long cl(float f) {
        return bbp.f(this.a, f);
    }

    @Override // defpackage.ble
    public final long cm(float f) {
        return bbc.h(this.a, f);
    }

    @Override // defpackage.asn
    public final long l() {
        return kv.e(this.a);
    }

    @Override // defpackage.asn
    public final bln m() {
        return this.a.m();
    }

    @Override // defpackage.asn
    public final ask n() {
        return this.a.b;
    }

    public final void o() {
        aqv b = n().b();
        aya ayaVar = this.b;
        ayaVar.getClass();
        aow aowVar = ayaVar.bX().o;
        if (aowVar != null && (aowVar.m & 4) != 0) {
            while (aowVar != null) {
                int i = aowVar.l;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    aowVar = aowVar.o;
                }
            }
        }
        aowVar = null;
        if (aowVar != null) {
            aiu aiuVar = null;
            while (aowVar != null) {
                if (aowVar instanceof aya) {
                    aya ayaVar2 = (aya) aowVar;
                    asq asqVar = n().a;
                    azq g = qg.g(ayaVar2, 4);
                    g.q.p().q(b, bef.n(g.c), g, ayaVar2, asqVar);
                } else if ((aowVar.l & 4) != 0 && (aowVar instanceof axx)) {
                    int i2 = 0;
                    for (aow aowVar2 = ((axx) aowVar).d; aowVar2 != null; aowVar2 = aowVar2.o) {
                        if ((aowVar2.l & 4) != 0) {
                            i2++;
                            if (i2 == 1) {
                                aowVar = aowVar2;
                            } else {
                                if (aiuVar == null) {
                                    aiuVar = new aiu(new aow[16]);
                                }
                                if (aowVar != null) {
                                    aiuVar.o(aowVar);
                                }
                                aiuVar.o(aowVar2);
                                aowVar = null;
                            }
                        }
                    }
                    if (i2 != 1) {
                    }
                }
                aowVar = qg.d(aiuVar);
            }
            return;
        }
        azq g2 = qg.g(ayaVar, 4);
        if (g2.v() == ayaVar.bX()) {
            g2 = g2.t;
            g2.getClass();
        }
        g2.A(b, n().a);
    }

    @Override // defpackage.asn
    public final void p(long j, long j2, float f, kv kvVar, ji jiVar) {
        this.a.p(j, j2, f, kvVar, jiVar);
    }

    public final void q(aqv aqvVar, long j, azq azqVar, aya ayaVar, asq asqVar) {
        aya ayaVar2 = this.b;
        this.b = ayaVar;
        asl aslVar = this.a;
        ask askVar = aslVar.b;
        bln m = azqVar.m();
        ble c = aslVar.b.c();
        bln d = askVar.d();
        aqv b = askVar.b();
        long a = askVar.a();
        asq asqVar2 = askVar.a;
        askVar.f(azqVar);
        askVar.g(m);
        askVar.e(aqvVar);
        askVar.h(j);
        askVar.a = asqVar;
        aqvVar.e();
        try {
            ayaVar.ca(this);
            aqvVar.d();
            ask askVar2 = aslVar.b;
            askVar2.f(c);
            askVar2.g(d);
            askVar2.e(b);
            askVar2.h(a);
            askVar2.a = asqVar2;
            this.b = ayaVar2;
        } catch (Throwable th) {
            aqvVar.d();
            ask askVar3 = aslVar.b;
            askVar3.f(c);
            askVar3.g(d);
            askVar3.e(b);
            askVar3.h(a);
            askVar3.a = asqVar2;
            throw th;
        }
    }

    public /* synthetic */ ayt(byte[] bArr) {
        this.a = new asl();
    }
}
