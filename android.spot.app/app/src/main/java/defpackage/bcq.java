package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcq implements azt {
    public mol a;
    private asq b;
    private final baw c;
    private mnw d;
    private boolean f;
    private float[] h;
    private boolean i;
    private int m;
    private arf o;
    private arg p;
    private final aqr r;
    private aqs s;
    private long e = bef.m(Integer.MAX_VALUE, Integer.MAX_VALUE);
    private final float[] g = arb.e();
    private ble j = new blf();
    private bln k = bln.Ltr;
    private final asl l = new asl();
    private long n = aro.a;
    private final moh q = new bco(this, 2);

    public bcq(asq asqVar, aqr aqrVar, baw bawVar, mol molVar, mnw mnwVar) {
        this.b = asqVar;
        this.r = aqrVar;
        this.c = bawVar;
        this.a = molVar;
        this.d = mnwVar;
    }

    private final void k(boolean z) {
        if (z != this.i) {
            this.i = z;
            this.c.p(this, z);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            bec.a.a(this.c);
        } else {
            this.c.invalidate();
        }
    }

    private final float[] m() {
        float[] n = n();
        float[] fArr = this.h;
        if (fArr == null) {
            fArr = arb.e();
            this.h = fArr;
        }
        if (rb.e(n, fArr)) {
            return fArr;
        }
        return null;
    }

    private final float[] n() {
        asq asqVar = this.b;
        long j = asqVar.k;
        if (iy.d(j)) {
            long n = bef.n(this.e);
            if (n == 9205357640488583168L) {
                ix.c();
                n = 9205357640488583168L;
            }
            j = a.k(Float.intBitsToFloat((int) (n >> 32)) / 2.0f, Float.intBitsToFloat((int) (n & 4294967295L)) / 2.0f);
        }
        arb.c(this.g);
        float[] fArr = this.g;
        float[] e = arb.e();
        arb.f(e, -aqk.b(j), -aqk.c(j));
        arb.d(fArr, e);
        float[] fArr2 = this.g;
        ass assVar = asqVar.a;
        float[] e2 = arb.e();
        arb.f(e2, assVar.f(), assVar.g());
        ass assVar2 = asqVar.a;
        float cos = (float) Math.cos(0.0d);
        float sin = (float) Math.sin(0.0d);
        float f = e2[1];
        float f2 = e2[2];
        float f3 = e2[5];
        float f4 = e2[6];
        float f5 = e2[9];
        float f6 = e2[10];
        float f7 = e2[13];
        float f8 = e2[14];
        e2[1] = (f * cos) - (f2 * sin);
        e2[2] = (f * sin) + (f2 * cos);
        e2[5] = (f3 * cos) - (f4 * sin);
        e2[6] = (f3 * sin) + (f4 * cos);
        e2[9] = (f5 * cos) - (f6 * sin);
        e2[10] = (f5 * sin) + (f6 * cos);
        e2[13] = (f7 * cos) - (f8 * sin);
        e2[14] = (f7 * sin) + (f8 * cos);
        ass assVar3 = asqVar.a;
        float cos2 = (float) Math.cos(0.0d);
        float sin2 = (float) Math.sin(0.0d);
        float f9 = e2[0];
        float f10 = e2[2];
        float f11 = e2[4];
        float f12 = e2[6];
        float f13 = e2[8];
        float f14 = e2[10];
        float f15 = e2[12];
        float f16 = e2[14];
        e2[0] = (f9 * cos2) + (f10 * sin2);
        e2[2] = ((-f9) * sin2) + (f10 * cos2);
        e2[4] = (f11 * cos2) + (f12 * sin2);
        e2[6] = ((-f11) * sin2) + (f12 * cos2);
        e2[8] = (f13 * cos2) + (f14 * sin2);
        e2[10] = ((-f13) * sin2) + (f14 * cos2);
        e2[12] = (f15 * cos2) + (f16 * sin2);
        e2[14] = ((-f15) * sin2) + (f16 * cos2);
        double c = (asqVar.a.c() * 3.141592653589793d) / 180.0d;
        float cos3 = (float) Math.cos(c);
        float sin3 = (float) Math.sin(c);
        float f17 = e2[0];
        float f18 = e2[4];
        float f19 = -sin3;
        float f20 = e2[1];
        float f21 = e2[5];
        float f22 = e2[2];
        float f23 = e2[6];
        float f24 = e2[3];
        float f25 = e2[7];
        e2[0] = (cos3 * f17) + (sin3 * f18);
        e2[1] = (cos3 * f20) + (sin3 * f21);
        e2[2] = (cos3 * f22) + (sin3 * f23);
        e2[3] = (cos3 * f24) + (sin3 * f25);
        e2[4] = (f17 * f19) + (f18 * cos3);
        e2[5] = (f20 * f19) + (f21 * cos3);
        e2[6] = (f22 * f19) + (f23 * cos3);
        e2[7] = (f19 * f24) + (cos3 * f25);
        ass assVar4 = asqVar.a;
        float d = assVar4.d();
        float e3 = assVar4.e();
        e2[0] = e2[0] * d;
        e2[1] = e2[1] * d;
        e2[2] = e2[2] * d;
        e2[3] = e2[3] * d;
        e2[4] = e2[4] * e3;
        e2[5] = e2[5] * e3;
        e2[6] = e2[6] * e3;
        e2[7] = e2[7] * e3;
        arb.d(fArr2, e2);
        float[] fArr3 = this.g;
        float[] e4 = arb.e();
        arb.f(e4, aqk.b(j), aqk.c(j));
        arb.d(fArr3, e4);
        return this.g;
    }

    @Override // defpackage.azt
    public final long a(long j, boolean z) {
        if (z) {
            float[] m = m();
            if (m != null) {
                return arb.a(m, j);
            }
            return 9187343241974906880L;
        }
        return arb.a(n(), j);
    }

    @Override // defpackage.azt
    public final void b() {
        this.a = null;
        this.d = null;
        this.f = true;
        k(false);
        aqr aqrVar = this.r;
        if (aqrVar != null) {
            asq asqVar = this.b;
            synchronized (aqrVar.b) {
                if (!asqVar.h) {
                    asqVar.h = true;
                    asqVar.d();
                }
            }
            this.c.E(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:            if (r2.w() != false) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x014a, code lost:            if (((defpackage.sy) r4).k(r2) == false) goto L64;     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.azt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.aqv r17, defpackage.asq r18) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcq.c(aqv, asq):void");
    }

    @Override // defpackage.azt
    public final void d(aqj aqjVar, boolean z) {
        if (z) {
            float[] m = m();
            if (m == null) {
                aqjVar.c();
                return;
            } else {
                arb.b(m, aqjVar);
                return;
            }
        }
        arb.b(n(), aqjVar);
    }

    @Override // defpackage.azt
    public final void e(long j) {
        this.b.t(j);
        l();
    }

    @Override // defpackage.azt
    public final void f(long j) {
        if (!a.n(j, this.e)) {
            this.e = j;
            invalidate();
        }
    }

    @Override // defpackage.azt
    public final void g(mol molVar, mnw mnwVar) {
        aqr aqrVar = this.r;
        if (aqrVar != null) {
            this.b = aqrVar.a();
            this.f = false;
            this.a = molVar;
            this.d = mnwVar;
            this.n = aro.a;
            this.e = bef.m(Integer.MAX_VALUE, Integer.MAX_VALUE);
            this.o = null;
            this.m = 0;
            return;
        }
        throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
    }

    @Override // defpackage.azt
    public final void h() {
        if (this.i) {
            if (!a.n(this.n, aro.a)) {
                asq asqVar = this.b;
                if (!a.n(asqVar.j, this.e)) {
                    asqVar.m(a.k(aro.a(this.n) * blm.b(this.e), aro.b(this.n) * blm.a(this.e)));
                }
            }
            asq asqVar2 = this.b;
            ble bleVar = this.j;
            bln blnVar = this.k;
            long j = this.e;
            moh mohVar = this.q;
            asqVar2.r(j);
            asqVar2.b = bleVar;
            asqVar2.c = blnVar;
            asqVar2.d = mohVar;
            ass assVar = asqVar2.a;
            asqVar2.f();
            k(false);
        }
    }

    @Override // defpackage.azt
    public final void i(ark arkVar) {
        int i;
        int i2 = arkVar.a | this.m;
        this.k = arkVar.q;
        this.j = arkVar.p;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.n = arkVar.k;
        }
        if ((i2 & 1) != 0) {
            this.b.p(arkVar.b);
        }
        if ((i2 & 2) != 0) {
            this.b.q(arkVar.c);
        }
        if ((i2 & 4) != 0) {
            this.b.h(arkVar.d);
        }
        if ((i2 & 8) != 0) {
            this.b.u(arkVar.e);
        }
        if ((i2 & 16) != 0) {
            this.b.v(arkVar.f);
        }
        if ((i2 & 64) != 0) {
            this.b.i(arkVar.g);
        }
        if ((i2 & 128) != 0) {
            this.b.s(arkVar.h);
        }
        if ((i2 & 1024) != 0) {
            this.b.o(arkVar.i);
        }
        if ((i2 & 2048) != 0) {
            this.b.j(arkVar.j);
        }
        if (i3 != 0) {
            if (a.n(this.n, aro.a)) {
                this.b.m(9205357640488583168L);
            } else {
                this.b.m(a.k(aro.a(this.n) * blm.b(this.e), aro.b(this.n) * blm.a(this.e)));
            }
        }
        if ((i2 & 16384) != 0) {
            this.b.k(arkVar.m);
        }
        if ((131072 & i2) != 0) {
            this.b.x();
        }
        boolean z = true;
        if ((32768 & i2) != 0) {
            asq asqVar = this.b;
            int i4 = arkVar.n;
            if (a.m(0, 0)) {
                i = 0;
            } else if (a.m(0, 1)) {
                i = 1;
            } else {
                i = 2;
                if (!a.m(0, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            asqVar.l(i);
        }
        if (!amr.i(this.o, arkVar.r)) {
            arf arfVar = arkVar.r;
            this.o = arfVar;
            if (arfVar != null) {
                asq asqVar2 = this.b;
                aql aqlVar = ((ard) arfVar).a;
                asqVar2.n(a.k(aqlVar.b, aqlVar.c), a.k(aqlVar.b(), aqlVar.a()));
            }
        } else {
            z = false;
        }
        this.m = arkVar.a;
        if (i2 == 0 && !z) {
            return;
        }
        l();
    }

    @Override // defpackage.azt
    public final void invalidate() {
        if (!this.i && !this.f) {
            this.c.invalidate();
            k(true);
        }
    }

    @Override // defpackage.azt
    public final boolean j(long j) {
        float b = aqk.b(j);
        float c = aqk.c(j);
        if (this.b.w()) {
            return rc.e(this.b.b(), b, c);
        }
        return true;
    }
}
