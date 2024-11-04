package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqt {
    private final ArrayList a = new ArrayList();
    private Object b;

    private final Object G() {
        Object obj = this.b;
        if (obj == null) {
            if (this.a.size() == 2) {
                ArrayList arrayList = this.a;
                Object obj2 = arrayList.get(0);
                Object obj3 = arrayList.get(1);
                if (obj2 != null) {
                    if (obj2 == obj3 || obj3 == null) {
                        obj = obj2;
                    }
                } else {
                    obj = obj3;
                }
            }
            if (obj == null) {
                obj = new nqg(this.a);
            }
            this.b = obj;
        }
        return obj;
    }

    private static final void H(nrb nrbVar) {
        if (nrbVar != null) {
        } else {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    private static final boolean I(Object obj) {
        if (!(obj instanceof nra)) {
            return false;
        }
        if ((obj instanceof nqg) && ((nqg) obj).b == null) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Appendable appendable, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                appendable.append((char) 65533);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(CharSequence charSequence, int i, String str) {
        int length = str.length();
        if (charSequence.length() - i < length) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i + i2) != str.charAt(i2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(CharSequence charSequence, int i, String str) {
        char upperCase;
        char upperCase2;
        int length = charSequence.length() - i;
        int length2 = str.length();
        if (length < length2) {
            return false;
        }
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = charSequence.charAt(i + i2);
            char charAt2 = str.charAt(i2);
            if (charAt != charAt2 && (upperCase = Character.toUpperCase(charAt)) != (upperCase2 = Character.toUpperCase(charAt2)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)) {
                return false;
            }
        }
        return true;
    }

    public final void A(int i) {
        n(nns.t, i, 2);
    }

    public final void B(int i) {
        n(nns.h, i, 2);
    }

    public final void C(int i) {
        n(nns.v, i, 2);
    }

    public final void D(int i) {
        n(nns.l, i, 2);
    }

    public final void E(int i, int i2) {
        t(nns.k, i, i2);
    }

    public final void F(int i, int i2) {
        t(nns.f, i, i2);
    }

    public final nqe a() {
        nrc nrcVar;
        Object G = G();
        nra nraVar = null;
        if ((G instanceof nrc) && (!(G instanceof nqg) || ((nqg) G).a != null)) {
            nrcVar = (nrc) G;
        } else {
            nrcVar = null;
        }
        if (I(G)) {
            nraVar = (nra) G;
        }
        if (nrcVar == null && nraVar == null) {
            throw new UnsupportedOperationException("Both printing and parsing not supported");
        }
        return new nqe(nrcVar, nraVar);
    }

    public final nrb e() {
        Object G = G();
        if (I(G)) {
            return nrb.b((nra) G);
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    public final void f(Object obj) {
        this.b = null;
        this.a.add(obj);
        this.a.add(obj);
    }

    public final void g(nrc nrcVar, nra nraVar) {
        this.b = null;
        this.a.add(nrcVar);
        this.a.add(nraVar);
    }

    public final void h(nns nnsVar) {
        f(new nqn(nnsVar, true));
    }

    public final void i(nns nnsVar) {
        f(new nqn(nnsVar, false));
    }

    public final void j(boolean z) {
        f(new nqq(null, "Z", z, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nrc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, nra] */
    public final void k(nqe nqeVar) {
        if (nqeVar != null) {
            g(nqeVar.a, nqeVar.b);
            return;
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    public final void l(nrb nrbVar) {
        H(nrbVar);
        g(null, nqx.b(nrbVar));
    }

    public final void m(nrb[] nrbVarArr) {
        int length = nrbVarArr.length;
        nra[] nraVarArr = new nra[length];
        int i = 0;
        while (i < length - 1) {
            nra b = nqx.b(nrbVarArr[i]);
            nraVarArr[i] = b;
            if (b != null) {
                i++;
            } else {
                throw new IllegalArgumentException("Incomplete parser array");
            }
        }
        nraVarArr[i] = nqx.b(nrbVarArr[i]);
        g(null, new nqj(nraVarArr));
    }

    public final void n(nns nnsVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new nqs(nnsVar, i2, false));
                    return;
                } else {
                    f(new nql(nnsVar, i2, false, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void o(nns nnsVar, int i) {
        f(new nqh(nnsVar, i));
    }

    public final void p(nns nnsVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                f(new nqi(nnsVar, i, i2));
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    public final void q(char c) {
        f(new nqf(c));
    }

    public final void r(String str) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                f(new nqm(str));
            } else {
                f(new nqf(str.charAt(0)));
            }
        }
    }

    public final void s(nrb nrbVar) {
        H(nrbVar);
        g(null, new nqj(new nra[]{nqx.b(nrbVar), null}));
    }

    public final void t(nns nnsVar, int i, int i2) {
        if (i >= 0) {
            if (i2 < i) {
                i2 = i;
            }
            if (i2 > 0) {
                if (i <= 1) {
                    f(new nqs(nnsVar, i2, true));
                    return;
                } else {
                    f(new nql(nnsVar, i2, true, i));
                    return;
                }
            }
        }
        throw new IllegalArgumentException();
    }

    public final void u(String str, boolean z, int i) {
        f(new nqq(str, str, z, i));
    }

    public final void v(int i) {
        n(nns.i, i, 2);
    }

    public final void w(int i) {
        n(nns.m, i, 1);
    }

    public final void x(int i) {
        n(nns.g, i, 3);
    }

    public final void y(int i, int i2) {
        p(nns.u, i, i2);
    }

    public final void z(int i) {
        n(nns.r, i, 2);
    }
}
