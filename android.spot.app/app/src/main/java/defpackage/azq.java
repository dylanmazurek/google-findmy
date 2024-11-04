package defpackage;

import android.os.Build;
import android.view.View;
import java.lang.ref.Reference;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class azq extends azc implements awg, avs, azv {
    private static final moh f = awu.l;
    public static final moh l = awu.k;
    public static final ark m = new ark();
    public static final ayi n = new ayi();
    public static final azl o;
    public static final azl p;
    private ble A;
    private bln B;
    private awi D;
    private Map E;
    private aqj G;
    private boolean g;
    private boolean h;
    public final ayr q;
    public boolean r;
    public boolean s;
    public azq t;
    public azq u;
    public moh v;
    public float w;
    public ayi x;
    public boolean y;
    public azt z;
    private float C = 0.8f;
    private long F = 0;
    private final mol H = new yj(this, 6);
    private final mnw I = new azp(this, 0);

    static {
        arb.e();
        o = new azk(1);
        p = new azk(0);
    }

    public azq(ayr ayrVar) {
        this.q = ayrVar;
        this.A = ayrVar.i;
        this.B = ayrVar.j;
    }

    private final long B(azq azqVar, long j, boolean z) {
        if (azqVar == this) {
            return j;
        }
        azq azqVar2 = this.u;
        if (azqVar2 != null && !amr.i(azqVar, azqVar2)) {
            return ap(azqVar2.B(azqVar, j, z));
        }
        return ap(j);
    }

    private final void C(azq azqVar, aqj aqjVar, boolean z) {
        if (azqVar != this) {
            azq azqVar2 = this.u;
            if (azqVar2 != null) {
                azqVar2.C(azqVar, aqjVar, z);
            }
            long j = this.F;
            float a = blk.a(j);
            aqjVar.a -= a;
            aqjVar.c -= a;
            float b = blk.b(j);
            aqjVar.b -= b;
            aqjVar.d -= b;
            azt aztVar = this.z;
            if (aztVar != null) {
                aztVar.d(aqjVar, true);
                if (this.h && z) {
                    long j2 = this.c;
                    aqjVar.a(0.0f, 0.0f, blm.b(j2), blm.a(j2));
                }
            }
        }
    }

    public final void au(boolean z) {
        ayr ayrVar;
        baw bawVar;
        azt aztVar = this.z;
        if (aztVar != null) {
            moh mohVar = this.v;
            if (mohVar != null) {
                ark arkVar = m;
                arkVar.q(1.0f);
                arkVar.r(1.0f);
                arkVar.l(1.0f);
                arkVar.v(0.0f);
                arkVar.w(0.0f);
                arkVar.m(ara.a);
                arkVar.t(ara.a);
                arkVar.p(0.0f);
                arkVar.n(8.0f);
                arkVar.u(aro.a);
                arkVar.s(ari.a);
                arkVar.o(false);
                arkVar.x();
                arkVar.y();
                arkVar.o = 9205357640488583168L;
                arkVar.r = null;
                arkVar.a = 0;
                ayr ayrVar2 = this.q;
                arkVar.p = ayrVar2.i;
                arkVar.q = ayrVar2.j;
                arkVar.o = bef.n(this.c);
                V().d(this, f, new azp(mohVar, 2));
                ayi ayiVar = this.x;
                if (ayiVar == null) {
                    ayiVar = new ayi();
                    this.x = ayiVar;
                }
                ayiVar.a = arkVar.b;
                ayiVar.b = arkVar.c;
                ayiVar.c = arkVar.e;
                ayiVar.d = arkVar.f;
                ayiVar.e = arkVar.i;
                ayiVar.f = arkVar.j;
                ayiVar.g = arkVar.k;
                aztVar.i(arkVar);
                this.h = arkVar.m;
                this.C = arkVar.d;
                if (z && (bawVar = (ayrVar = this.q).t) != null) {
                    bawVar.s(ayrVar);
                    return;
                }
                return;
            }
            ll.h("updateLayerParameters requires a non-null layerBlock");
            throw new mks();
        }
        if (this.v != null) {
            ll.g("null layer with a non-null layerBlock");
        }
    }

    private static final azq av(avs avsVar) {
        awf awfVar;
        azq b;
        if (avsVar instanceof awf) {
            awfVar = (awf) avsVar;
        } else {
            awfVar = null;
        }
        if (awfVar != null && (b = awfVar.b()) != null) {
            return b;
        }
        avsVar.getClass();
        return (azq) avsVar;
    }

    public void A(aqv aqvVar, asq asqVar) {
        throw null;
    }

    @Override // defpackage.azc
    public final long E() {
        return this.F;
    }

    @Override // defpackage.azc
    public final awi G() {
        awi awiVar = this.D;
        if (awiVar != null) {
            return awiVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // defpackage.azc
    public final azc H() {
        return this.t;
    }

    @Override // defpackage.azc
    public final void J() {
        r(this.F, this.w, this.v);
    }

    @Override // defpackage.azc
    public final boolean K() {
        if (this.D != null) {
            return true;
        }
        return false;
    }

    public final float M(long j, long j2) {
        float q;
        float ce;
        if (q() < aqn.b(j2) || ce() < aqn.a(j2)) {
            long N = N(j2);
            float b = aqn.b(N);
            float a = aqn.a(N);
            float b2 = aqk.b(j);
            if (b2 < 0.0f) {
                q = -b2;
            } else {
                q = b2 - q();
            }
            float max = Math.max(0.0f, q);
            float c = aqk.c(j);
            if (c < 0.0f) {
                ce = -c;
            } else {
                ce = c - ce();
            }
            long k = a.k(max, Math.max(0.0f, ce));
            if ((b > 0.0f || a > 0.0f) && aqk.b(k) <= b && aqk.c(k) <= a) {
                float intBitsToFloat = Float.intBitsToFloat((int) (k >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (k & 4294967295L));
                return (intBitsToFloat * intBitsToFloat) + (intBitsToFloat2 * intBitsToFloat2);
            }
            return Float.POSITIVE_INFINITY;
        }
        return Float.POSITIVE_INFINITY;
    }

    public final long N(long j) {
        return a.k(Math.max(0.0f, (aqn.b(j) - q()) / 2.0f), Math.max(0.0f, (aqn.a(j) - ce()) / 2.0f));
    }

    public final long O() {
        return this.A.ck(this.q.k.d());
    }

    public final long P(avs avsVar, long j, boolean z) {
        if (avsVar instanceof awf) {
            awf awfVar = (awf) avsVar;
            awfVar.b().ac();
            return aqk.f(awfVar.a(this, aqk.f(j), z));
        }
        azq av = av(avsVar);
        av.ac();
        azq U = U(av);
        while (av != U) {
            j = av.ar(j);
            av = av.u;
            av.getClass();
        }
        return B(U, j, z);
    }

    public final aow Q(int i) {
        aow aowVar;
        boolean g = azr.g(i);
        if (g) {
            aowVar = v();
        } else {
            aowVar = v().n;
            if (aowVar == null) {
                return null;
            }
        }
        for (aow R = R(g); R != null && (R.m & i) != 0; R = R.o) {
            if ((R.l & i) != 0) {
                return R;
            }
            if (R == aowVar) {
                return null;
            }
        }
        return null;
    }

    public final aow R(boolean z) {
        aow v;
        if (this.q.t() == this) {
            return this.q.n.e;
        }
        if (z) {
            azq azqVar = this.u;
            if (azqVar != null && (v = azqVar.v()) != null) {
                return v.o;
            }
        } else {
            azq azqVar2 = this.u;
            if (azqVar2 != null) {
                return azqVar2.v();
            }
        }
        return null;
    }

    public final aqj S() {
        aqj aqjVar = this.G;
        if (aqjVar == null) {
            aqj aqjVar2 = new aqj();
            this.G = aqjVar2;
            return aqjVar2;
        }
        return aqjVar;
    }

    public final axn T() {
        return this.q.o.q;
    }

    public final azq U(azq azqVar) {
        ayr ayrVar = azqVar.q;
        ayr ayrVar2 = this.q;
        if (ayrVar == ayrVar2) {
            aow v = azqVar.v();
            aow v2 = v();
            if (!v2.bX().t) {
                ll.g("visitLocalAncestors called on an unattached node");
            }
            aow bX = v2.bX();
            while (true) {
                bX = bX.n;
                if (bX != null) {
                    if ((bX.l & 2) != 0 && bX == v) {
                        return azqVar;
                    }
                } else {
                    return this;
                }
            }
        } else {
            while (ayrVar.f > ayrVar2.f) {
                ayrVar = ayrVar.o();
                ayrVar.getClass();
            }
            while (ayrVar2.f > ayrVar.f) {
                ayrVar2 = ayrVar2.o();
                ayrVar2.getClass();
            }
            while (ayrVar != ayrVar2) {
                ayrVar = ayrVar.o();
                ayrVar2 = ayrVar2.o();
                if (ayrVar == null || ayrVar2 == null) {
                    throw new IllegalArgumentException("layouts are not part of the same hierarchy");
                }
            }
            if (ayrVar2 != this.q) {
                if (ayrVar != azqVar.q) {
                    return ayrVar.s();
                }
                return azqVar;
            }
            return this;
        }
    }

    public final azw V() {
        return ayu.a(this.q).l;
    }

    public final void W(aqv aqvVar, asq asqVar) {
        azt aztVar = this.z;
        if (aztVar != null) {
            aztVar.c(aqvVar, asqVar);
            return;
        }
        long j = this.F;
        float a = blk.a(j);
        float b = blk.b(j);
        aqvVar.f(a, b);
        X(aqvVar, asqVar);
        aqvVar.f(-a, -b);
    }

    public final void X(aqv aqvVar, asq asqVar) {
        aow Q = Q(4);
        if (Q == null) {
            A(aqvVar, asqVar);
            return;
        }
        ayt p2 = this.q.p();
        long n2 = bef.n(this.c);
        aiu aiuVar = null;
        while (Q != null) {
            if (Q instanceof aya) {
                p2.q(aqvVar, n2, this, (aya) Q, asqVar);
            } else if ((Q.l & 4) != 0 && (Q instanceof axx)) {
                int i = 0;
                for (aow aowVar = ((axx) Q).d; aowVar != null; aowVar = aowVar.o) {
                    if ((aowVar.l & 4) != 0) {
                        i++;
                        if (i == 1) {
                            Q = aowVar;
                        } else {
                            if (aiuVar == null) {
                                aiuVar = new aiu(new aow[16]);
                            }
                            if (Q != null) {
                                aiuVar.o(Q);
                            }
                            aiuVar.o(aowVar);
                            Q = null;
                        }
                    }
                }
                if (i != 1) {
                }
            }
            Q = qg.d(aiuVar);
        }
    }

    public final void Y(aow aowVar, azl azlVar, long j, ayf ayfVar, boolean z, boolean z2) {
        if (aowVar == null) {
            z(azlVar, j, ayfVar, z, z2);
        } else {
            ayfVar.b(aowVar, -1.0f, z2, new azn(this, aowVar, azlVar, j, ayfVar, z, z2));
        }
    }

    public final void Z(aow aowVar, azl azlVar, long j, ayf ayfVar, boolean z, boolean z2, float f2) {
        if (aowVar == null) {
            z(azlVar, j, ayfVar, z, z2);
        } else {
            ayfVar.b(aowVar, f2, z2, new azo(this, aowVar, azlVar, j, ayfVar, z, z2, f2));
        }
    }

    @Override // defpackage.ble
    public final float a() {
        return this.q.i.a();
    }

    public final void aa(azl azlVar, long j, ayf ayfVar, boolean z, boolean z2) {
        float M;
        aow Q = Q(azlVar.a());
        if (!an(j)) {
            if (z) {
                float M2 = M(j, O());
                if (!Float.isInfinite(M2) && !Float.isNaN(M2) && ayfVar.d(M2, false)) {
                    Z(Q, azlVar, j, ayfVar, true, false, M2);
                    return;
                }
                return;
            }
            return;
        }
        if (Q == null) {
            z(azlVar, j, ayfVar, z, z2);
            return;
        }
        float b = aqk.b(j);
        float c = aqk.c(j);
        if (b >= 0.0f && c >= 0.0f && b < q() && c < ce()) {
            Y(Q, azlVar, j, ayfVar, z, z2);
            return;
        }
        if (!z) {
            M = Float.POSITIVE_INFINITY;
        } else {
            M = M(j, O());
        }
        if (!Float.isInfinite(M) && !Float.isNaN(M)) {
            if (ayfVar.d(M, z2)) {
                Z(Q, azlVar, j, ayfVar, z, z2, M);
                return;
            }
        }
        ak(Q, azlVar, j, ayfVar, z, z2, M);
    }

    public final void ab() {
        azt aztVar = this.z;
        if (aztVar != null) {
            aztVar.invalidate();
            return;
        }
        azq azqVar = this.u;
        if (azqVar != null) {
            azqVar.ab();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ac() {
        /*
            r5 = this;
            ayr r0 = r5.q
            ayz r0 = r0.o
            ayr r1 = r0.a
            int r1 = r1.ah()
            r2 = 3
            r3 = 4
            r4 = 1
            if (r1 == r2) goto L12
            if (r1 != r3) goto L1f
            r1 = 4
        L12:
            ayx r2 = r0.q
            boolean r2 = r2.t
            if (r2 == 0) goto L1c
            r0.j(r4)
            goto L1f
        L1c:
            r0.i(r4)
        L1f:
            if (r1 != r3) goto L30
            ayw r1 = r0.r
            if (r1 == 0) goto L2d
            boolean r1 = r1.q
            if (r1 != r4) goto L2d
            r0.l(r4)
            return
        L2d:
            r0.k(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azq.ac():void");
    }

    public final void ad() {
        azt aztVar = this.z;
        if (aztVar != null) {
            aztVar.invalidate();
        }
    }

    public final void ae() {
        moh mohVar;
        aow aowVar;
        aow R = R(azr.g(128));
        if (R != null && (R.bX().m & 128) != 0) {
            amz a = amy.a();
            if (a != null) {
                mohVar = a.j();
            } else {
                mohVar = null;
            }
            amz c = amy.c(a);
            try {
                boolean g = azr.g(128);
                if (g) {
                    aowVar = v();
                } else {
                    aowVar = v().n;
                    if (aowVar == null) {
                    }
                }
                for (aow R2 = R(g); R2 != null; R2 = R2.o) {
                    if ((R2.m & 128) == 0) {
                        break;
                    }
                    if ((R2.l & 128) != 0) {
                        aiu aiuVar = null;
                        aow aowVar2 = R2;
                        while (aowVar2 != null) {
                            if (aowVar2 instanceof axp) {
                                aov aovVar = ((axp) aowVar2).a;
                                if (aovVar instanceof awo) {
                                    ((awo) aovVar).d();
                                }
                            } else if ((aowVar2.l & 128) != 0 && (aowVar2 instanceof axx)) {
                                int i = 0;
                                for (aow aowVar3 = ((axx) aowVar2).d; aowVar3 != null; aowVar3 = aowVar3.o) {
                                    if ((aowVar3.l & 128) != 0) {
                                        i++;
                                        if (i == 1) {
                                            aowVar2 = aowVar3;
                                        } else {
                                            if (aiuVar == null) {
                                                aiuVar = new aiu(new aow[16]);
                                            }
                                            if (aowVar2 != null) {
                                                aiuVar.o(aowVar2);
                                            }
                                            aiuVar.o(aowVar3);
                                            aowVar2 = null;
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            aowVar2 = qg.d(aiuVar);
                        }
                    }
                    if (R2 == aowVar) {
                        break;
                    }
                }
            } finally {
                amy.g(a, c, mohVar);
            }
        }
    }

    public final void af() {
        aow aowVar;
        boolean g = azr.g(128);
        if (g) {
            aowVar = v();
        } else {
            aowVar = v().n;
            if (aowVar == null) {
                return;
            }
        }
        for (aow R = R(g); R != null && (R.m & 128) != 0; R = R.o) {
            if ((R.l & 128) != 0) {
                aow aowVar2 = R;
                aiu aiuVar = null;
                while (aowVar2 != null) {
                    if (aowVar2 instanceof axp) {
                        ((axp) aowVar2).v(this);
                    } else if ((aowVar2.l & 128) != 0 && (aowVar2 instanceof axx)) {
                        int i = 0;
                        for (aow aowVar3 = ((axx) aowVar2).d; aowVar3 != null; aowVar3 = aowVar3.o) {
                            if ((aowVar3.l & 128) != 0) {
                                i++;
                                if (i == 1) {
                                    aowVar2 = aowVar3;
                                } else {
                                    if (aiuVar == null) {
                                        aiuVar = new aiu(new aow[16]);
                                    }
                                    if (aowVar2 != null) {
                                        aiuVar.o(aowVar2);
                                    }
                                    aiuVar.o(aowVar3);
                                    aowVar2 = null;
                                }
                            }
                        }
                        if (i != 1) {
                        }
                    }
                    aowVar2 = qg.d(aiuVar);
                }
            }
            if (R == aowVar) {
                return;
            }
        }
    }

    public final void ag() {
        this.g = true;
        this.I.a();
        ai();
    }

    public final void ah(aqj aqjVar, boolean z, boolean z2) {
        azt aztVar = this.z;
        if (aztVar != null) {
            if (this.h) {
                if (z2) {
                    long O = O();
                    float b = aqn.b(O) / 2.0f;
                    float a = aqn.a(O) / 2.0f;
                    long j = this.c;
                    aqjVar.a(-b, -a, blm.b(j) + b, blm.a(j) + a);
                } else if (z) {
                    long j2 = this.c;
                    aqjVar.a(0.0f, 0.0f, blm.b(j2), blm.a(j2));
                }
                if (aqjVar.b()) {
                    return;
                }
            }
            aztVar.d(aqjVar, false);
        }
        long j3 = this.F;
        float a2 = blk.a(j3);
        aqjVar.a += a2;
        aqjVar.c += a2;
        float b2 = blk.b(j3);
        aqjVar.b += b2;
        aqjVar.d += b2;
    }

    public final void ai() {
        if (this.z != null) {
            al(null, false);
            ayr.ap(this.q);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0060, code lost:            if (r3 == null) goto L154;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [aow] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aj(defpackage.awi r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azq.aj(awi):void");
    }

    public final void ak(aow aowVar, azl azlVar, long j, ayf ayfVar, boolean z, boolean z2, float f2) {
        if (aowVar == null) {
            z(azlVar, j, ayfVar, z, z2);
        } else {
            azlVar.d(aowVar);
            ak(qn.e(aowVar, azlVar.a()), azlVar, j, ayfVar, z, z2, f2);
        }
    }

    public final void al(moh mohVar, boolean z) {
        baw bawVar;
        bcm bdlVar;
        ayr ayrVar = this.q;
        boolean z2 = true;
        if (!z && this.v == mohVar && amr.i(this.A, ayrVar.i) && this.B == ayrVar.j) {
            z2 = false;
        }
        this.A = ayrVar.i;
        this.B = ayrVar.j;
        Object obj = null;
        if (ayrVar.ad() && mohVar != null) {
            this.v = mohVar;
            if (this.z == null) {
                baw a = ayu.a(ayrVar);
                mol molVar = this.H;
                mnw mnwVar = this.I;
                bfi bfiVar = a.I;
                bfiVar.c();
                while (true) {
                    aiu aiuVar = (aiu) bfiVar.b;
                    if (!aiuVar.m()) {
                        break;
                    }
                    Object obj2 = ((Reference) aiuVar.b(aiuVar.b - 1)).get();
                    if (obj2 != null) {
                        obj = obj2;
                        break;
                    }
                }
                azt aztVar = (azt) obj;
                if (aztVar != null) {
                    aztVar.g(molVar, mnwVar);
                } else if (a.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && Build.VERSION.SDK_INT != 28) {
                    aqr aqrVar = a.C;
                    aztVar = new bcq(aqrVar.a(), aqrVar, a, molVar, mnwVar);
                } else {
                    if (a.isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && a.r) {
                        try {
                            aztVar = new bdb(a, molVar, mnwVar);
                        } catch (Throwable unused) {
                            a.r = false;
                        }
                    }
                    if (a.n == null) {
                        if (!bdk.c) {
                            rf.e(new View(a.getContext()));
                        }
                        if (bdk.d) {
                            bdlVar = new bcm(a.getContext());
                        } else {
                            bdlVar = new bdl(a.getContext());
                        }
                        a.n = bdlVar;
                        a.addView(a.n);
                    }
                    bcm bcmVar = a.n;
                    bcmVar.getClass();
                    aztVar = new bdk(a, bcmVar, molVar, mnwVar);
                }
                aztVar.f(this.c);
                aztVar.e(this.F);
                this.z = aztVar;
                au(true);
                ayrVar.ar();
                this.I.a();
                return;
            }
            if (z2) {
                au(true);
                return;
            }
            return;
        }
        this.v = null;
        azt aztVar2 = this.z;
        if (aztVar2 != null) {
            aztVar2.b();
            ayrVar.ar();
            this.I.a();
            if (j() && (bawVar = ayrVar.t) != null) {
                bawVar.s(ayrVar);
            }
        }
        this.z = null;
        this.y = false;
    }

    public final boolean am() {
        if (this.z != null && this.C <= 0.0f) {
            return true;
        }
        azq azqVar = this.u;
        if (azqVar != null) {
            return azqVar.am();
        }
        return false;
    }

    public final boolean an(long j) {
        long j2 = 9187343241974906880L ^ (j & 9187343241974906880L);
        if (((~j2) & ((-4294967297L) + j2) & (-9223372034707292160L)) != 0) {
            return false;
        }
        azt aztVar = this.z;
        if (aztVar != null && this.h && !aztVar.j(j)) {
            return false;
        }
        return true;
    }

    public final void ao(aqv aqvVar, aqs aqsVar) {
        long j = this.c;
        aqvVar.g(new aql(0.5f, 0.5f, blm.b(j) - 0.5f, blm.a(j) - 0.5f), aqsVar);
    }

    public final long ap(long j) {
        long j2 = this.F;
        long k = a.k(aqk.b(j) - blk.a(j2), aqk.c(j) - blk.b(j2));
        azt aztVar = this.z;
        if (aztVar != null) {
            return aztVar.a(k, true);
        }
        return k;
    }

    public final void aq(long j, float f2, moh mohVar) {
        al(mohVar, false);
        if (!a.n(this.F, j)) {
            this.F = j;
            this.q.o.q.m();
            azt aztVar = this.z;
            if (aztVar != null) {
                aztVar.e(j);
            } else {
                azq azqVar = this.u;
                if (azqVar != null) {
                    azqVar.ab();
                }
            }
            L(this);
            ayr ayrVar = this.q;
            baw bawVar = ayrVar.t;
            if (bawVar != null) {
                bawVar.s(ayrVar);
            }
        }
        this.w = f2;
        if (!this.j) {
            I(G());
        }
    }

    public final long ar(long j) {
        azt aztVar = this.z;
        if (aztVar != null) {
            j = aztVar.a(j, false);
        }
        long j2 = this.F;
        return a.k(aqk.b(j) + blk.a(j2), aqk.c(j) + blk.b(j2));
    }

    @Override // defpackage.blj
    public final float b() {
        return this.q.i.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [aow] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [aiu] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.awr, defpackage.avq
    public final Object c() {
        if (!this.q.n.j(64)) {
            return null;
        }
        v();
        mpn mpnVar = new mpn();
        for (aow aowVar = this.q.n.d; aowVar != null; aowVar = aowVar.n) {
            if ((aowVar.l & 64) != 0) {
                ?? r5 = 0;
                axx axxVar = aowVar;
                while (axxVar != 0) {
                    if (axxVar instanceof azx) {
                        ble bleVar = this.q.i;
                        mpnVar.a = ((azx) axxVar).cb();
                    } else if ((axxVar.l & 64) != 0 && (axxVar instanceof axx)) {
                        aow aowVar2 = axxVar.d;
                        int i = 0;
                        axxVar = axxVar;
                        r5 = r5;
                        while (aowVar2 != null) {
                            if ((aowVar2.l & 64) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    axxVar = aowVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new aiu(new aow[16]);
                                    }
                                    if (axxVar != 0) {
                                        r5.o(axxVar);
                                    }
                                    r5.o(aowVar2);
                                    axxVar = 0;
                                }
                            }
                            aowVar2 = aowVar2.o;
                            axxVar = axxVar;
                            r5 = r5;
                        }
                        if (i != 1) {
                        }
                    }
                    axxVar = qg.d(r5);
                }
            }
        }
        return mpnVar.a;
    }

    @Override // defpackage.avs
    public final long d() {
        return this.c;
    }

    @Override // defpackage.avs
    public final long e(avs avsVar, long j) {
        return P(avsVar, j, false);
    }

    @Override // defpackage.avs
    public final long f(long j) {
        if (!j()) {
            ll.g("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ac();
        for (azq azqVar = this; azqVar != null; azqVar = azqVar.u) {
            j = azqVar.ar(j);
        }
        return j;
    }

    @Override // defpackage.avs
    public final long g(long j) {
        ayr ayrVar = this.q;
        long f2 = f(j);
        baw a = ayu.a(ayrVar);
        a.w();
        return arb.a(a.q, f2);
    }

    @Override // defpackage.avs
    public final aql h(avs avsVar, boolean z) {
        if (!j()) {
            ll.g("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!avsVar.j()) {
            ll.g(a.af(avsVar, "LayoutCoordinates ", " is not attached!"));
        }
        azq av = av(avsVar);
        av.ac();
        azq U = U(av);
        aqj S = S();
        S.a = 0.0f;
        S.b = 0.0f;
        S.c = blm.b(avsVar.d());
        S.d = blm.a(avsVar.d());
        while (av != U) {
            av.ah(S, z, false);
            if (S.b()) {
                return aql.a;
            }
            av = av.u;
            av.getClass();
        }
        C(U, S, z);
        return iy.e(S);
    }

    @Override // defpackage.avs
    public final avs i() {
        if (!j()) {
            ll.g("LayoutCoordinate operations are only valid when isAttached is true");
        }
        ac();
        return this.q.t().u;
    }

    @Override // defpackage.avs
    public final boolean j() {
        return v().t;
    }

    @Override // defpackage.avs
    public final long k(avs avsVar) {
        return P(avsVar, 0L, true);
    }

    @Override // defpackage.avr
    public final bln m() {
        return this.q.j;
    }

    @Override // defpackage.awr
    public void r(long j, float f2, moh mohVar) {
        if (this.r) {
            azd w = w();
            w.getClass();
            aq(w.h, f2, mohVar);
            return;
        }
        aq(j, f2, mohVar);
    }

    public abstract aow v();

    public abstract azd w();

    public abstract void x();

    @Override // defpackage.azv
    public final boolean y() {
        if (this.z != null && !this.g && this.q.ad()) {
            return true;
        }
        return false;
    }

    public void z(azl azlVar, long j, ayf ayfVar, boolean z, boolean z2) {
        azq azqVar = this.t;
        if (azqVar != null) {
            azqVar.aa(azlVar, azqVar.ap(j), ayfVar, z, z2);
        }
    }

    @Override // defpackage.azc
    public final avs F() {
        return this;
    }
}
