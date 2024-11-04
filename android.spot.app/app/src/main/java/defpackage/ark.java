package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ark implements ble {
    public int a;
    public float e;
    public float f;
    public float i;
    public boolean m;
    public arf r;
    public float b = 1.0f;
    public float c = 1.0f;
    public float d = 1.0f;
    public long g = ara.a;
    public long h = ara.a;
    public float j = 8.0f;
    public long k = aro.a;
    public arm l = ari.a;
    public int n = 0;
    public long o = 9205357640488583168L;
    public ble p = new blf();
    public bln q = bln.Ltr;

    @Override // defpackage.ble
    public final float a() {
        return this.p.a();
    }

    @Override // defpackage.blj
    public final float b() {
        return this.p.b();
    }

    @Override // defpackage.blj
    public final /* synthetic */ float cc(long j) {
        return bbp.e(this, j);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cf(float f) {
        return bbc.b(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cg(int i) {
        return bbc.c(this, i);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ch(long j) {
        return bbc.d(this, j);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ci(float f) {
        return bbc.e(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ int cj(float f) {
        throw null;
    }

    @Override // defpackage.ble
    public final /* synthetic */ long ck(long j) {
        return bbc.g(this, j);
    }

    @Override // defpackage.blj
    public final /* synthetic */ long cl(float f) {
        return bbp.f(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ long cm(float f) {
        return bbc.h(this, f);
    }

    public final void l(float f) {
        if (this.d == f) {
            return;
        }
        this.a |= 4;
        this.d = f;
    }

    public final void m(long j) {
        if (!a.n(this.g, j)) {
            this.a |= 64;
            this.g = j;
        }
    }

    public final void n(float f) {
        if (this.j == f) {
            return;
        }
        this.a |= 2048;
        this.j = f;
    }

    public final void o(boolean z) {
        if (this.m != z) {
            this.a |= 16384;
            this.m = z;
        }
    }

    public final void p(float f) {
        if (this.i == f) {
            return;
        }
        this.a |= 1024;
        this.i = f;
    }

    public final void q(float f) {
        if (this.b == f) {
            return;
        }
        this.a |= 1;
        this.b = f;
    }

    public final void r(float f) {
        if (this.c == f) {
            return;
        }
        this.a |= 2;
        this.c = f;
    }

    public final void s(arm armVar) {
        if (!amr.i(this.l, armVar)) {
            this.a |= 8192;
            this.l = armVar;
        }
    }

    public final void t(long j) {
        if (!a.n(this.h, j)) {
            this.a |= 128;
            this.h = j;
        }
    }

    public final void u(long j) {
        if (!a.n(this.k, j)) {
            this.a |= 4096;
            this.k = j;
        }
    }

    public final void v(float f) {
        if (this.e == f) {
            return;
        }
        this.a |= 8;
        this.e = f;
    }

    public final void w(float f) {
        if (this.f == f) {
            return;
        }
        this.a |= 16;
        this.f = f;
    }

    public final void x() {
        if (!amr.i(null, null)) {
            this.a |= 131072;
        }
    }

    public final void y() {
        if (!a.m(0, 0)) {
            this.a |= 32768;
            this.n = 0;
        }
    }
}
