package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ere extends mnp implements mol {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ere(eay eayVar, lqc lqcVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = eayVar;
        this.a = lqcVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return ((ere) c((msw) obj, (mmx) obj2)).b(mlh.a);
                }
                return ((ere) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((ere) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((ere) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        Object obj2;
        grv d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    mjo.o(obj);
                    Object obj3 = this.b;
                    Object obj4 = this.a;
                    try {
                        try {
                            synchronized (((grx) obj4).b) {
                                grv grvVar = (grv) ((grx) obj4).b.get(obj3);
                                if (grvVar != null) {
                                    if (!grx.f(grvVar)) {
                                        ((grx) obj4).e(grvVar);
                                    }
                                    ((grx) obj4).e(grvVar);
                                    d = ((grx) obj4).d((gru) obj3);
                                    grx.a.k().z("Refreshed oauth token for [%s, %s] expiration %s", ((gru) obj3).a, ((gru) obj3).b, d.c);
                                }
                                grvVar = ((grx) obj4).d((gru) obj3);
                                ((grx) obj4).e(grvVar);
                                d = ((grx) obj4).d((gru) obj3);
                                grx.a.k().z("Refreshed oauth token for [%s, %s] expiration %s", ((gru) obj3).a, ((gru) obj3).b, d.c);
                            }
                            synchronized (((grx) obj4).c) {
                            }
                            obj2 = d;
                        } catch (Throwable th) {
                            synchronized (((grx) obj4).c) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        obj2 = mjo.n(th2);
                    }
                    return new mky(obj2);
                }
                mjo.o(obj);
                msw mswVar = (msw) this.c;
                mpp.q(mswVar, null, 0, new dzk((esx) this.a, (esu) this.b, (mmx) null, 6), 3);
                mpp.q(mswVar, null, 0, new eau((esu) this.b, (mmx) null, 11), 3);
                return mlh.a;
            }
            mjo.o(obj);
            return mpp.o((msw) this.c, new dzk((eay) this.b, (lqc) this.a, (mmx) null, 2));
        }
        mjo.o(obj);
        mpp.q((msw) this.c, null, 0, new dzk((wi) this.a, (gga) this.b, (mmx) null, 4), 3);
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    ere ereVar = new ere((grx) this.a, (gru) this.b, mmxVar, 3);
                    ereVar.c = obj;
                    return ereVar;
                }
                ere ereVar2 = new ere((esx) this.a, (esu) this.b, mmxVar, 2);
                ereVar2.c = obj;
                return ereVar2;
            }
            ere ereVar3 = new ere((eay) this.b, (lqc) this.a, mmxVar, 1);
            ereVar3.c = obj;
            return ereVar3;
        }
        ere ereVar4 = new ere((wi) this.a, (gga) this.b, mmxVar, 0);
        ereVar4.c = obj;
        return ereVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ere(esx esxVar, esu esuVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.a = esxVar;
        this.b = esuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ere(grx grxVar, gru gruVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.a = grxVar;
        this.b = gruVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ere(wi wiVar, gga ggaVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.a = wiVar;
        this.b = ggaVar;
    }
}
