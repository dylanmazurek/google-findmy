package defpackage;

import android.graphics.Canvas;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdb implements azt {
    private static final mol a = tu.k;
    private final baw b;
    private mol c;
    private mnw d;
    private boolean e;
    private boolean g;
    private boolean h;
    private final bch k;
    private int l;
    private aqs m;
    private final bcx f = new bcx();
    private final bcu i = new bcu(a);
    private final bet n = new bet((byte[]) null, (char[]) null);
    private long j = aro.a;

    public bdb(baw bawVar, mol molVar, mnw mnwVar) {
        bch bcyVar;
        this.b = bawVar;
        this.c = molVar;
        this.d = mnwVar;
        if (Build.VERSION.SDK_INT >= 29) {
            bcyVar = new bcz();
        } else {
            bcyVar = new bcy(bawVar);
        }
        bcyVar.F();
        bcyVar.q(false);
        this.k = bcyVar;
    }

    private final void k(boolean z) {
        if (z != this.e) {
            this.e = z;
            this.b.p(this, z);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            bec.a.a(this.b);
        } else {
            this.b.invalidate();
        }
    }

    @Override // defpackage.azt
    public final long a(long j, boolean z) {
        if (z) {
            float[] b = this.i.b(this.k);
            if (b != null) {
                return arb.a(b, j);
            }
            return 9187343241974906880L;
        }
        return arb.a(this.i.c(this.k), j);
    }

    @Override // defpackage.azt
    public final void b() {
        if (this.k.D()) {
            this.k.i();
        }
        this.c = null;
        this.d = null;
        this.g = true;
        k(false);
        this.b.y();
        this.b.E(this);
    }

    @Override // defpackage.azt
    public final void c(aqv aqvVar, asq asqVar) {
        Canvas a2 = aqp.a(aqvVar);
        boolean z = false;
        if (a2.isHardwareAccelerated()) {
            h();
            if (this.k.b() > 0.0f) {
                z = true;
            }
            this.h = z;
            if (z) {
                aqvVar.c();
            }
            this.k.j(a2);
            if (this.h) {
                aqvVar.b();
                return;
            }
            return;
        }
        float e = this.k.e();
        float g = this.k.g();
        float f = this.k.f();
        float c = this.k.c();
        if (this.k.a() < 1.0f) {
            aqs aqsVar = this.m;
            if (aqsVar == null) {
                aqsVar = new aqs();
                this.m = aqsVar;
            }
            aqsVar.c(this.k.a());
            a2.saveLayer(e, g, f, c, aqsVar.a);
        } else {
            aqvVar.e();
        }
        aqvVar.f(e, g);
        aqvVar.a(this.i.c(this.k));
        if (this.k.C() || this.k.B()) {
            this.f.c(aqvVar);
        }
        mol molVar = this.c;
        if (molVar != null) {
            molVar.a(aqvVar, null);
        }
        aqvVar.d();
        k(false);
    }

    @Override // defpackage.azt
    public final void d(aqj aqjVar, boolean z) {
        if (z) {
            float[] b = this.i.b(this.k);
            if (b == null) {
                aqjVar.c();
                return;
            } else {
                arb.b(b, aqjVar);
                return;
            }
        }
        arb.b(this.i.c(this.k), aqjVar);
    }

    @Override // defpackage.azt
    public final void e(long j) {
        bch bchVar = this.k;
        int e = bchVar.e();
        int g = bchVar.g();
        int b = blk.b(j);
        int a2 = blk.a(j);
        if (e == a2 && g == b) {
            return;
        }
        if (e != a2) {
            this.k.l(a2 - e);
        }
        if (g != b) {
            this.k.m(b - g);
        }
        l();
        this.i.a();
    }

    @Override // defpackage.azt
    public final void f(long j) {
        float a2 = aro.a(this.j);
        int b = blm.b(j);
        this.k.t(a2 * b);
        float b2 = aro.b(this.j);
        int a3 = blm.a(j);
        this.k.u(b2 * a3);
        bch bchVar = this.k;
        if (this.k.E(bchVar.e(), bchVar.g(), bchVar.e() + b, this.k.g() + a3)) {
            this.k.s(this.f.a());
            invalidate();
            this.i.a();
        }
    }

    @Override // defpackage.azt
    public final void g(mol molVar, mnw mnwVar) {
        k(false);
        this.g = false;
        this.h = false;
        this.j = aro.a;
        this.c = molVar;
        this.d = mnwVar;
    }

    @Override // defpackage.azt
    public final void h() {
        if (!this.e && this.k.D()) {
            return;
        }
        if (this.k.C()) {
            bcx bcxVar = this.f;
            if (!bcxVar.d()) {
                bcxVar.b();
            }
        }
        mol molVar = this.c;
        if (molVar != null) {
            this.k.L(this.n, null, new bco(molVar, 3));
        }
        k(false);
    }

    @Override // defpackage.azt
    public final void i(ark arkVar) {
        boolean z;
        boolean z2;
        mnw mnwVar;
        boolean z3;
        int i = arkVar.a | this.l;
        int i2 = i & 4096;
        if (i2 != 0) {
            this.j = arkVar.k;
        }
        boolean z4 = true;
        if (this.k.C() && !this.f.d()) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 1) != 0) {
            this.k.w(arkVar.b);
        }
        if ((i & 2) != 0) {
            this.k.x(arkVar.c);
        }
        if ((i & 4) != 0) {
            this.k.n(arkVar.d);
        }
        if ((i & 8) != 0) {
            this.k.z(arkVar.e);
        }
        if ((i & 16) != 0) {
            this.k.A(arkVar.f);
        }
        if ((i & 32) != 0) {
            this.k.H();
        }
        if ((i & 64) != 0) {
            this.k.o(jw.d(arkVar.g));
        }
        if ((i & 128) != 0) {
            this.k.y(jw.d(arkVar.h));
        }
        if ((i & 1024) != 0) {
            this.k.v(arkVar.i);
        }
        if ((i & 256) != 0) {
            this.k.J();
        }
        if ((i & 512) != 0) {
            this.k.K();
        }
        if ((i & 2048) != 0) {
            this.k.p(arkVar.j);
        }
        if (i2 != 0) {
            this.k.t(aro.a(this.j) * this.k.h());
            this.k.u(aro.b(this.j) * this.k.d());
        }
        if (arkVar.m && arkVar.l != ari.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 24576) != 0) {
            this.k.r(z2);
            bch bchVar = this.k;
            if (arkVar.m && arkVar.l == ari.a) {
                z3 = true;
            } else {
                z3 = false;
            }
            bchVar.q(z3);
        }
        if ((131072 & i) != 0) {
            this.k.I();
        }
        if ((32768 & i) != 0) {
            bch bchVar2 = this.k;
            int i3 = arkVar.n;
            bchVar2.G();
        }
        boolean f = this.f.f(arkVar.r, arkVar.d, z2, arkVar.o);
        bcx bcxVar = this.f;
        if (bcxVar.a) {
            this.k.s(bcxVar.a());
        }
        if (!z2 || this.f.d()) {
            z4 = false;
        }
        if (z == z4 && (!z4 || !f)) {
            l();
        } else {
            invalidate();
        }
        if (!this.h && this.k.b() > 0.0f && (mnwVar = this.d) != null) {
            mnwVar.a();
        }
        if ((i & 7963) != 0) {
            this.i.a();
        }
        this.l = arkVar.a;
    }

    @Override // defpackage.azt
    public final void invalidate() {
        if (!this.e && !this.g) {
            this.b.invalidate();
            k(true);
        }
    }

    @Override // defpackage.azt
    public final boolean j(long j) {
        bch bchVar = this.k;
        float b = aqk.b(j);
        float c = aqk.c(j);
        if (bchVar.B()) {
            if (b >= 0.0f && b < this.k.h() && c >= 0.0f && c < this.k.d()) {
                return true;
            }
            return false;
        }
        if (!this.k.C()) {
            return true;
        }
        return this.f.e(j);
    }
}
