package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayh extends azq {
    private static final aqs h;
    public final bac f;
    public azd g;

    static {
        aqs aqsVar = new aqs();
        aqsVar.e(aqx.b);
        aqsVar.g();
        aqsVar.f(1);
        h = aqsVar;
    }

    public ayh(ayr ayrVar) {
        super(ayrVar);
        ayg aygVar;
        bac bacVar = new bac();
        this.f = bacVar;
        bacVar.q = this;
        if (ayrVar.e != null) {
            aygVar = new ayg(this);
        } else {
            aygVar = null;
        }
        this.g = aygVar;
    }

    @Override // defpackage.azq
    public final void A(aqv aqvVar, asq asqVar) {
        ayr ayrVar = this.q;
        baw a = ayu.a(ayrVar);
        aiu m = ayrVar.m();
        int i = m.b;
        if (i > 0) {
            Object[] objArr = m.a;
            int i2 = 0;
            do {
                ayr ayrVar2 = (ayr) objArr[i2];
                if (ayrVar2.d()) {
                    ayrVar2.E(aqvVar, asqVar);
                }
                i2++;
            } while (i2 < i);
        }
        if (a.m) {
            ao(aqvVar, h);
        }
    }

    @Override // defpackage.awg
    public final awr l(long j) {
        if (this.s) {
            azd azdVar = this.g;
            azdVar.getClass();
            j = azdVar.d;
        }
        t(j);
        aiu n = this.q.n();
        int i = n.b;
        if (i > 0) {
            Object[] objArr = n.a;
            int i2 = 0;
            do {
                ((ayr) objArr[i2]).r().A = 3;
                i2++;
            } while (i2 < i);
        }
        ayr ayrVar = this.q;
        aj(ayrVar.h.a(this, ayrVar.x(), j));
        ae();
        return this;
    }

    @Override // defpackage.azq, defpackage.awr
    public final void r(long j, float f, moh mohVar) {
        super.r(j, f, mohVar);
        if (this.i) {
            return;
        }
        af();
        this.q.r().n();
    }

    @Override // defpackage.azc
    public final int u(avc avcVar) {
        azd azdVar = this.g;
        if (azdVar != null) {
            return azdVar.u(avcVar);
        }
        ayx ayxVar = (ayx) T();
        ayz ayzVar = ayxVar.z;
        if (ayzVar.u == 1) {
            axm axmVar = ayxVar.r;
            axmVar.d = true;
            if (axmVar.b) {
                ayzVar.d();
            }
        } else {
            ayxVar.r.e = true;
        }
        ayxVar.d().j = true;
        ayxVar.f();
        ayxVar.d().j = false;
        Integer num = (Integer) ayxVar.r.f.get(avcVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.azq
    public final /* synthetic */ aow v() {
        return this.f;
    }

    @Override // defpackage.azq
    public final azd w() {
        return this.g;
    }

    @Override // defpackage.azq
    public final void x() {
        if (this.g == null) {
            this.g = new ayg(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.azq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(defpackage.azl r20, long r21, defpackage.ayf r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayh.z(azl, long, ayf, boolean, boolean):void");
    }
}
