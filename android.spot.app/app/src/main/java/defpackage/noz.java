package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class noz extends npw {
    private final nor b;

    public noz(nor norVar, nnx nnxVar) {
        super(nns.m, nnxVar);
        this.b = norVar;
    }

    @Override // defpackage.npm
    protected final int A(String str, Locale locale) {
        Integer num = (Integer) npb.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new noa(nns.m, str);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        return this.b.P(j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int b(Locale locale) {
        return npb.a(locale).k;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return 7;
    }

    @Override // defpackage.npw, defpackage.nnq
    public final int d() {
        return 1;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String k(int i, Locale locale) {
        return npb.a(locale).c[i];
    }

    @Override // defpackage.npm, defpackage.nnq
    public final String n(int i, Locale locale) {
        return npb.a(locale).b[i];
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return this.b.d;
    }
}
