package defpackage;

import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class npi extends npm {
    final nnq a;
    final nnw b;
    final nnx c;
    final boolean d;
    final nnx e;
    final nnx f;

    public npi(nnq nnqVar, nnw nnwVar, nnx nnxVar, nnx nnxVar2, nnx nnxVar3) {
        super(nnqVar.r());
        if (nnqVar.w()) {
            this.a = nnqVar;
            this.b = nnwVar;
            this.c = nnxVar;
            this.d = npk.P(nnxVar);
            this.e = nnxVar2;
            this.f = nnxVar3;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int z(long j) {
        int a = this.b.a(j);
        long j2 = a;
        if (((j + j2) ^ j) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return a;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        return this.a.a(this.b.d(j));
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int b(Locale locale) {
        return this.a.b(locale);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.nnq
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long e(long j, int i) {
        if (this.d) {
            long z = z(j);
            return this.a.e(j + z, i) - z;
        }
        return this.b.m(this.a.e(this.b.d(j), i), j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof npi) {
            npi npiVar = (npi) obj;
            if (this.a.equals(npiVar.a) && this.b.equals(npiVar.b) && this.c.equals(npiVar.c) && this.e.equals(npiVar.e)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long f(long j) {
        return this.a.f(this.b.d(j));
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long g(long j) {
        if (this.d) {
            long z = z(j);
            return this.a.g(j + z) - z;
        }
        return this.b.m(this.a.g(this.b.d(j)), j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        long h = this.a.h(this.b.d(j), i);
        long m = this.b.m(h, j);
        if (a(m) == i) {
            return m;
        }
        nob nobVar = new nob(h, this.b.c);
        noa noaVar = new noa(this.a.r(), Integer.valueOf(i), nobVar.getMessage());
        noaVar.initCause(nobVar);
        throw noaVar;
    }

    public final int hashCode() {
        nnw nnwVar = this.b;
        return nnwVar.hashCode() ^ this.a.hashCode();
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long i(long j, String str, Locale locale) {
        return this.b.m(this.a.i(this.b.d(j), str, locale), j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String k(int i, Locale locale) {
        return this.a.k(i, locale);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String l(long j, Locale locale) {
        return this.a.l(this.b.d(j), locale);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String n(int i, Locale locale) {
        return this.a.n(i, locale);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String o(long j, Locale locale) {
        return this.a.o(this.b.d(j), locale);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx s() {
        return this.c;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx t() {
        return this.f;
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return this.e;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        return this.a.v(this.b.d(j));
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
