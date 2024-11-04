package defpackage;

import android.graphics.Outline;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asq {
    public final ass a;
    public arg e;
    public boolean f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public boolean l;
    public aqs m;
    private final asy o;
    private Outline p;
    private float t;
    private arf u;
    private arg v;
    public ble b = asm.a;
    public bln c = bln.Ltr;
    public moh d = wo.r;
    private boolean q = true;
    private long r = 0;
    private long s = 9205357640488583168L;
    public final mbd n = new mbd();

    static {
        if (!asy.a && Build.VERSION.SDK_INT < 28 && Build.VERSION.SDK_INT >= 22) {
            atf.a.a();
        }
    }

    public asq(ass assVar, asy asyVar) {
        this.a = assVar;
        this.o = asyVar;
        assVar.t(false);
        this.i = 0L;
        this.j = 0L;
        this.k = 9205357640488583168L;
    }

    private final void A(long j, long j2) {
        this.a.x(blk.a(j), blk.b(j), j2);
    }

    private final Outline y() {
        Outline outline = this.p;
        if (outline == null) {
            Outline outline2 = new Outline();
            this.p = outline2;
            return outline2;
        }
        return outline;
    }

    private final void z() {
        this.u = null;
        this.v = null;
        this.s = 9205357640488583168L;
        this.r = 0L;
        this.t = 0.0f;
        this.q = true;
    }

    public final float a() {
        return this.a.a();
    }

    public final arf b() {
        arf arfVar = this.u;
        if (arfVar != null) {
            return arfVar;
        }
        long n = bef.n(this.j);
        long j = this.r;
        long j2 = this.s;
        if (j2 != 9205357640488583168L) {
            n = j2;
        }
        float b = aqk.b(j);
        float c = aqk.c(j);
        ard ardVar = new ard(new aql(b, c, aqn.b(n) + b, aqn.a(n) + c));
        this.u = ardVar;
        return ardVar;
    }

    public final void c() {
        if (this.q && !this.l) {
            if (!w()) {
                this.a.v(null);
            } else {
                Outline y = y();
                long n = bef.n(this.j);
                long j = this.r;
                long j2 = this.s;
                if (j2 != 9205357640488583168L) {
                    n = j2;
                }
                y.setRoundRect(Math.round(aqk.b(j)), Math.round(aqk.c(j)), Math.round(aqk.b(j) + aqn.b(n)), Math.round(aqk.c(j) + aqn.a(n)), 0.0f);
                y.setAlpha(a());
                this.a.v(y);
            }
            this.q = false;
        }
    }

    public final void d() {
        if (this.h && this.g == 0) {
            this.o.c(this);
        }
    }

    public final void e() {
        this.g--;
        d();
    }

    public final void f() {
        int i;
        mbd mbdVar = this.n;
        mbdVar.e = mbdVar.d;
        Object obj = mbdVar.b;
        if (obj != null) {
            sy syVar = (sy) obj;
            if (syVar.c()) {
                Object obj2 = mbdVar.c;
                if (obj2 == null) {
                    obj2 = new sy((byte[]) null);
                    mbdVar.c = obj2;
                }
                ((sy) obj2).e(syVar);
                syVar.d();
            }
        }
        mbdVar.a = true;
        this.a.p(this.b, this.c, this, this.d);
        mbdVar.a = false;
        Object obj3 = mbdVar.e;
        if (obj3 != null) {
            ((asq) obj3).e();
        }
        Object obj4 = mbdVar.c;
        if (obj4 != null) {
            sy syVar2 = (sy) obj4;
            if (syVar2.c()) {
                Object[] objArr = syVar2.b;
                long[] jArr = syVar2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = i2 - length;
                            int i4 = 0;
                            while (true) {
                                i = 8 - ((~i3) >>> 31);
                                if (i4 >= i) {
                                    break;
                                }
                                if ((255 & j) < 128) {
                                    ((asq) objArr[(i2 << 3) + i4]).e();
                                }
                                j >>= 8;
                                i4++;
                            }
                            if (i != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                syVar2.d();
            }
        }
    }

    public final void g() {
        if (!this.a.F()) {
            try {
                f();
            } catch (Throwable unused) {
            }
        }
    }

    public final void h(float f) {
        ass assVar = this.a;
        if (assVar.a() == f) {
            return;
        }
        assVar.q(f);
    }

    public final void i(long j) {
        if (!a.n(j, this.a.j())) {
            this.a.r(j);
        }
    }

    public final void j(float f) {
        if (this.a.b() == f) {
            return;
        }
        this.a.s(f);
    }

    public final void k(boolean z) {
        if (this.a.E() != z) {
            this.a.t(z);
            this.q = true;
            c();
        }
    }

    public final void l(int i) {
        ass assVar = this.a;
        if (!a.m(assVar.i(), i)) {
            assVar.u(i);
        }
    }

    public final void m(long j) {
        if (!a.n(this.k, j)) {
            this.k = j;
            this.a.w(j);
        }
    }

    public final void n(long j, long j2) {
        if (a.n(this.r, j) && a.n(this.s, j2)) {
            return;
        }
        z();
        this.r = j;
        this.s = j2;
        this.t = 0.0f;
        c();
    }

    public final void o(float f) {
        ass assVar = this.a;
        if (assVar.c() == f) {
            return;
        }
        assVar.y(f);
    }

    public final void p(float f) {
        ass assVar = this.a;
        if (assVar.d() == f) {
            return;
        }
        assVar.z(f);
    }

    public final void q(float f) {
        ass assVar = this.a;
        if (assVar.e() == f) {
            return;
        }
        assVar.A(f);
    }

    public final void r(long j) {
        if (!a.n(this.j, j)) {
            this.j = j;
            A(this.i, j);
            if (this.s == 9205357640488583168L) {
                this.q = true;
                c();
            }
        }
    }

    public final void s(long j) {
        if (!a.n(j, this.a.k())) {
            this.a.B(j);
        }
    }

    public final void t(long j) {
        if (!a.n(this.i, j)) {
            this.i = j;
            A(j, this.j);
        }
    }

    public final void u(float f) {
        ass assVar = this.a;
        if (assVar.f() == f) {
            return;
        }
        assVar.C(f);
    }

    public final void v(float f) {
        ass assVar = this.a;
        if (assVar.g() == f) {
            return;
        }
        assVar.D(f);
    }

    public final boolean w() {
        return this.a.E();
    }

    public final void x() {
        if (!amr.i(null, null)) {
            this.a.I();
        }
    }
}
