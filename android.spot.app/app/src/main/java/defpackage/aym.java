package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aym extends azq {
    private static final aqs B;
    private avi A;
    public ayj f;
    public bld g;
    public azd h;

    static {
        aqs aqsVar = new aqs();
        aqsVar.e(aqx.c);
        aqsVar.g();
        aqsVar.f(1);
        B = aqsVar;
    }

    public aym(ayr ayrVar, ayj ayjVar) {
        super(ayrVar);
        ayk aykVar;
        this.f = ayjVar;
        if (ayrVar.e != null) {
            aykVar = new ayk(this);
        } else {
            aykVar = null;
        }
        this.h = aykVar;
        this.A = (ayjVar.bX().l & 512) != 0 ? new avi(this, (avg) ayjVar) : null;
    }

    @Override // defpackage.azq
    public final void A(aqv aqvVar, asq asqVar) {
        B().W(aqvVar, asqVar);
        if (ayu.a(this.q).m) {
            ao(aqvVar, B);
        }
    }

    public final azq B() {
        azq azqVar = this.t;
        azqVar.getClass();
        return azqVar;
    }

    public final void C(ayj ayjVar) {
        if (!amr.i(ayjVar, this.f)) {
            if ((ayjVar.bX().l & 512) != 0) {
                avg avgVar = (avg) ayjVar;
                avi aviVar = this.A;
                if (aviVar != null) {
                    aviVar.b = avgVar;
                } else {
                    aviVar = new avi(this, avgVar);
                }
                this.A = aviVar;
            } else {
                this.A = null;
            }
        }
        this.f = ayjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:            if (r1 == null) goto L37;     */
    @Override // defpackage.awg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.awr l(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.s
            if (r0 == 0) goto L13
            bld r9 = r8.g
            if (r9 == 0) goto Lb
            long r9 = r9.a
            goto L13
        Lb:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Lookahead constraints cannot be null in approach pass."
            r9.<init>(r10)
            throw r9
        L13:
            r8.t(r9)
            avi r0 = r8.A
            if (r0 == 0) goto La2
            aym r1 = r0.a
            avg r2 = r0.b
            azd r1 = r1.h
            r1.getClass()
            awi r1 = r1.G()
            r1.b()
            r1.a()
            boolean r1 = r2.c()
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L40
            bld r1 = r8.g
            boolean r1 = defpackage.bld.f(r9, r1)
            if (r1 != 0) goto L3e
            goto L40
        L3e:
            r1 = 0
            goto L41
        L40:
            r1 = 1
        L41:
            r0.c = r1
            if (r1 != 0) goto L4b
            azq r1 = r8.B()
            r1.s = r4
        L4b:
            r8.B()
            awi r1 = r2.b()
            azq r2 = r8.B()
            r2.s = r3
            int r2 = r1.b()
            azd r5 = r8.h
            r5.getClass()
            int r5 = r5.a
            if (r2 != r5) goto L73
            int r2 = r1.a()
            azd r5 = r8.h
            r5.getClass()
            int r5 = r5.b
            if (r2 != r5) goto L73
            r3 = 1
        L73:
            boolean r0 = r0.c
            if (r0 != 0) goto La0
            azq r0 = r8.B()
            long r4 = r0.c
            azq r0 = r8.B()
            azd r0 = r0.w()
            if (r0 == 0) goto L91
            long r6 = r0.w()
            blm r0 = new blm
            r0.<init>(r6)
            goto L92
        L91:
            r0 = 0
        L92:
            boolean r0 = defpackage.blm.d(r4, r0)
            if (r0 == 0) goto La0
            if (r3 != 0) goto La0
            ayl r0 = new ayl
            r0.<init>(r1, r8)
            r1 = r0
        La0:
            if (r1 != 0) goto Lac
        La2:
            ayj r0 = r8.f
            azq r1 = r8.B()
            awi r1 = r0.a(r8, r1, r9)
        Lac:
            r8.aj(r1)
            r8.ae()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aym.l(long):awr");
    }

    @Override // defpackage.azq, defpackage.awr
    public final void r(long j, float f, moh mohVar) {
        boolean z;
        blm blmVar;
        super.r(j, f, mohVar);
        if (this.i) {
            return;
        }
        af();
        avi aviVar = this.A;
        if (aviVar != null) {
            avg avgVar = aviVar.b;
            this.h.getClass();
            if (!avgVar.d() && !aviVar.c) {
                long j2 = this.c;
                azd azdVar = this.h;
                blm blmVar2 = null;
                if (azdVar != null) {
                    blmVar = new blm(azdVar.w());
                } else {
                    blmVar = null;
                }
                if (blm.d(j2, blmVar)) {
                    long j3 = B().c;
                    azd w = B().w();
                    if (w != null) {
                        blmVar2 = new blm(w.w());
                    }
                    if (blm.d(j3, blmVar2)) {
                        z = true;
                        B().r = z;
                    }
                }
            }
            z = false;
            B().r = z;
        }
        G().d();
        B().r = false;
    }

    @Override // defpackage.azc
    public final int u(avc avcVar) {
        azd azdVar = this.h;
        if (azdVar != null) {
            Integer num = (Integer) azdVar.m.get(avcVar);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        return qi.e(this, avcVar);
    }

    @Override // defpackage.azq
    public final aow v() {
        return this.f.bX();
    }

    @Override // defpackage.azq
    public final azd w() {
        return this.h;
    }

    @Override // defpackage.azq
    public final void x() {
        if (this.h == null) {
            this.h = new ayk(this);
        }
    }
}
