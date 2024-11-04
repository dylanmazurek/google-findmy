package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqa extends nnq implements Serializable {
    private static HashMap a = null;
    private static final long serialVersionUID = -1934618396111902255L;
    private final nns b;
    private final nnx c;

    private nqa(nns nnsVar, nnx nnxVar) {
        if (nnxVar != null) {
            this.b = nnsVar;
            this.c = nnxVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private Object readResolve() {
        return y(this.b, this.c);
    }

    public static synchronized nqa y(nns nnsVar, nnx nnxVar) {
        synchronized (nqa.class) {
            HashMap hashMap = a;
            nqa nqaVar = null;
            if (hashMap == null) {
                a = new HashMap(7);
            } else {
                nqa nqaVar2 = (nqa) hashMap.get(nnsVar);
                if (nqaVar2 == null || nqaVar2.c == nnxVar) {
                    nqaVar = nqaVar2;
                }
            }
            if (nqaVar == null) {
                nqa nqaVar3 = new nqa(nnsVar, nnxVar);
                a.put(nnsVar, nqaVar3);
                return nqaVar3;
            }
            return nqaVar;
        }
    }

    private final UnsupportedOperationException z() {
        return new UnsupportedOperationException(this.b.y.concat(" field is unsupported"));
    }

    @Override // defpackage.nnq
    public final int a(long j) {
        throw z();
    }

    @Override // defpackage.nnq
    public final int b(Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final int c() {
        throw z();
    }

    @Override // defpackage.nnq
    public final int d() {
        throw z();
    }

    @Override // defpackage.nnq
    public final long e(long j, int i) {
        return this.c.a(j, i);
    }

    @Override // defpackage.nnq
    public final long f(long j) {
        throw z();
    }

    @Override // defpackage.nnq
    public final long g(long j) {
        throw z();
    }

    @Override // defpackage.nnq
    public final long h(long j, int i) {
        throw z();
    }

    @Override // defpackage.nnq
    public final long i(long j, String str, Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final String k(int i, Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final String l(long j, Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final String m(noh nohVar, Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final String n(int i, Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final String o(long j, Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final String p(noh nohVar, Locale locale) {
        throw z();
    }

    @Override // defpackage.nnq
    public final String q() {
        return this.b.y;
    }

    @Override // defpackage.nnq
    public final nns r() {
        return this.b;
    }

    @Override // defpackage.nnq
    public final nnx s() {
        return this.c;
    }

    @Override // defpackage.nnq
    public final nnx t() {
        return null;
    }

    public final String toString() {
        return "UnsupportedDateTimeField";
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return null;
    }

    @Override // defpackage.nnq
    public final boolean v(long j) {
        throw z();
    }

    @Override // defpackage.nnq
    public final boolean w() {
        return false;
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
