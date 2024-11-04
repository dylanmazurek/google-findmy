package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ud extends mpe implements moh {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(anr anrVar, Object obj, to toVar, int i) {
        super(1);
        this.d = i;
        this.b = anrVar;
        this.c = obj;
        this.a = toVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v65, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [mvy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r0v72, types: [mvy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, agt] */
    /* JADX WARN: Type inference failed for: r1v13, types: [awj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [awj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [axw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r1v7, types: [awj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [awj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v22, types: [awj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23, types: [awj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [awj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [awj, java.lang.Object] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        float f;
        float f2;
        long j;
        long j2;
        boolean booleanValue;
        mlh mlhVar;
        Object obj2 = null;
        switch (this.d) {
            case 0:
                ?? r0 = this.a;
                ark arkVar = (ark) obj;
                float f3 = 1.0f;
                if (r0 != 0) {
                    f = ((Number) r0.a()).floatValue();
                } else {
                    f = 1.0f;
                }
                arkVar.l(f);
                ?? r02 = this.b;
                if (r02 != 0) {
                    f2 = ((Number) r02.a()).floatValue();
                } else {
                    f2 = 1.0f;
                }
                arkVar.q(f2);
                ?? r03 = this.b;
                if (r03 != 0) {
                    f3 = ((Number) r03.a()).floatValue();
                }
                arkVar.r(f3);
                ?? r04 = this.c;
                if (r04 != 0) {
                    j = ((aro) r04.a()).b;
                } else {
                    j = aro.a;
                }
                arkVar.u(j);
                return mlh.a;
            case 1:
                return new te((anr) this.b, this.c, (to) this.a);
            case 2:
                int ordinal = ((ub) obj).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            uk ukVar = ((ug) this.b).b.d;
                            if (ukVar != null) {
                                obj2 = new aro(ukVar.b);
                            } else {
                                uk ukVar2 = ((uf) this.a).b.d;
                                if (ukVar2 != null) {
                                    obj2 = new aro(ukVar2.b);
                                }
                            }
                        } else {
                            throw new mku();
                        }
                    } else {
                        obj2 = this.c;
                    }
                } else {
                    uk ukVar3 = ((uf) this.a).b.d;
                    if (ukVar3 != null) {
                        obj2 = new aro(ukVar3.b);
                    } else {
                        uk ukVar4 = ((ug) this.b).b.d;
                        if (ukVar4 != null) {
                            obj2 = new aro(ukVar4.b);
                        }
                    }
                }
                if (obj2 != null) {
                    j2 = ((aro) obj2).b;
                } else {
                    j2 = aro.a;
                }
                return new aro(j2);
            case 3:
                ut utVar = (ut) obj;
                ra.h(utVar, (uv) ((gga) this.a).g);
                Object b = ((gga) this.a).b(utVar.a());
                if (!amr.i(b, utVar.a())) {
                    ((uv) ((gga) this.a).g).b(b);
                    ((uv) this.b).b(b);
                    utVar.c();
                    utVar.b.a();
                    ((mpk) this.c).a = true;
                }
                return mlh.a;
            case 4:
                awq awqVar = (awq) obj;
                ye yeVar = (ye) this.a;
                if (yeVar.c) {
                    awq.d(awqVar, (awr) this.c, this.b.cj(yeVar.a), this.b.cj(((ye) this.a).b));
                } else {
                    awq.f((awr) this.c, this.b.cj(yeVar.a), this.b.cj(((ye) this.a).b), 0.0f);
                }
                return mlh.a;
            case 5:
                awq awqVar2 = (awq) obj;
                yf yfVar = (yf) this.a;
                if (yfVar.d) {
                    awq.d(awqVar2, (awr) this.c, this.b.cj(yfVar.a), this.b.cj(((yf) this.a).b));
                } else {
                    awq.f((awr) this.c, this.b.cj(yfVar.a), this.b.cj(((yf) this.a).b), 0.0f);
                }
                return mlh.a;
            case 6:
                apm apmVar = (apm) obj;
                if (!apmVar.t) {
                    return bad.SkipSubtreeAndContinueTraversal;
                }
                apm apmVar2 = apmVar.c;
                apmVar.a.a(this.a);
                apmVar.c = null;
                apm apmVar3 = apmVar.c;
                mpk mpkVar = (mpk) this.c;
                mpkVar.a = mpkVar.a;
                return bad.ContinueTraversal;
            case 7:
                bae baeVar = (bae) obj;
                apm apmVar4 = (apm) baeVar;
                if (qg.i(this.b).B.b.contains(apmVar4) && fr.e(apmVar4, fr.f((bet) this.a))) {
                    ((mpn) this.c).a = baeVar;
                    return bad.CancelTraversal;
                }
                return bad.ContinueTraversal;
            case 8:
                aqh aqhVar = (aqh) obj;
                if (amr.i(aqhVar, this.b)) {
                    booleanValue = false;
                } else if (!amr.i(aqhVar, ((apx) this.a).c)) {
                    booleanValue = ((Boolean) this.c.a(aqhVar)).booleanValue();
                } else {
                    throw new IllegalStateException("Focus search landed at the root.");
                }
                return Boolean.valueOf(booleanValue);
            default:
                Throwable th = (Throwable) obj;
                this.b.a(th);
                ((eld) this.a).a.u(th);
                do {
                    Object a = mwc.a(((eld) this.a).a.i());
                    if (a != null) {
                        this.c.a(a, th);
                        mlhVar = mlh.a;
                    } else {
                        mlhVar = null;
                    }
                } while (mlhVar != null);
                return mlh.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(aow aowVar, awr awrVar, awj awjVar, int i) {
        super(1);
        this.d = i;
        this.a = aowVar;
        this.c = awrVar;
        this.b = awjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(aro aroVar, uf ufVar, ug ugVar, int i) {
        super(1);
        this.d = i;
        this.c = aroVar;
        this.a = ufVar;
        this.b = ugVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        super(1);
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(mpn mpnVar, apm apmVar, bet betVar, int i) {
        super(1);
        this.d = i;
        this.c = mpnVar;
        this.b = apmVar;
        this.a = betVar;
    }
}
