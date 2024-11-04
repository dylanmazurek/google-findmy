package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class npm extends nnq {
    public final nns g;

    /* JADX INFO: Access modifiers changed from: protected */
    public npm(nns nnsVar) {
        if (nnsVar != null) {
            this.g = nnsVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    protected int A(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new noa(this.g, str);
        }
    }

    @Override // defpackage.nnq
    public abstract int a(long j);

    @Override // defpackage.nnq
    public int b(Locale locale) {
        int c = c();
        if (c >= 0) {
            if (c < 10) {
                return 1;
            }
            if (c < 100) {
                return 2;
            }
            if (c < 1000) {
                return 3;
            }
        }
        return Integer.toString(c).length();
    }

    @Override // defpackage.nnq
    public abstract int c();

    @Override // defpackage.nnq
    public long e(long j, int i) {
        return s().a(j, i);
    }

    @Override // defpackage.nnq
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.nnq
    public abstract long g(long j);

    @Override // defpackage.nnq
    public abstract long h(long j, int i);

    @Override // defpackage.nnq
    public long i(long j, String str, Locale locale) {
        return h(j, A(str, locale));
    }

    @Override // defpackage.nnq
    public String k(int i, Locale locale) {
        return n(i, locale);
    }

    @Override // defpackage.nnq
    public String l(long j, Locale locale) {
        return k(a(j), locale);
    }

    @Override // defpackage.nnq
    public final String m(noh nohVar, Locale locale) {
        return k(nohVar.b(this.g), locale);
    }

    @Override // defpackage.nnq
    public String n(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.nnq
    public String o(long j, Locale locale) {
        return n(a(j), locale);
    }

    @Override // defpackage.nnq
    public final String p(noh nohVar, Locale locale) {
        return n(nohVar.b(this.g), locale);
    }

    @Override // defpackage.nnq
    public final String q() {
        return this.g.y;
    }

    @Override // defpackage.nnq
    public final nns r() {
        return this.g;
    }

    @Override // defpackage.nnq
    public abstract nnx s();

    @Override // defpackage.nnq
    public nnx t() {
        return null;
    }

    public final String toString() {
        return "DateTimeField[" + q() + "]";
    }

    @Override // defpackage.nnq
    public boolean v(long j) {
        return false;
    }

    @Override // defpackage.nnq
    public final boolean w() {
        return true;
    }

    public int y(long j) {
        return c();
    }
}
