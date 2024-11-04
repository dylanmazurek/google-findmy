package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npa extends npm {
    private final nor a;

    public npa(nor norVar) {
        super(nns.b);
        this.a = norVar;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        if (this.a.Z(j) <= 0) {
            return 0;
        }
        return 1;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int b(Locale locale) {
        return npb.a(locale).j;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return 1;
    }

    @Override // defpackage.nnq
    public final int d() {
        return 0;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.af(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        moz.ay(this, i, 0, 1);
        if (a(j) != i) {
            return this.a.af(j, -this.a.Z(j));
        }
        return j;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) npb.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new noa(nns.b, str);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String n(int i, Locale locale) {
        return npb.a(locale).a[i];
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx s() {
        return nqb.h(nnz.a);
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return null;
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
