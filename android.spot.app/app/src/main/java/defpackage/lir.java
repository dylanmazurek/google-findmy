package defpackage;

import android.view.View;
import java.nio.charset.Charset;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lir {
    public int a;
    public int b;
    public final Object c;
    private int d;

    public lir(View view) {
        this.c = view;
    }

    private final void T(Object obj, llg llgVar, lja ljaVar) {
        int i = this.d;
        this.d = llz.c(llz.a(this.a), 4);
        try {
            llgVar.l(obj, this, ljaVar);
            if (this.a == this.d) {
            } else {
                throw new ljy("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void U(Object obj, llg llgVar, lja ljaVar) {
        liq liqVar = (liq) this.c;
        int n = liqVar.n();
        if (liqVar.a < liqVar.b) {
            int e = liqVar.e(n);
            ((liq) this.c).a++;
            llgVar.l(obj, this, ljaVar);
            ((liq) this.c).z(0);
            r5.a--;
            ((liq) this.c).A(e);
            return;
        }
        throw new ljy("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void V(int i) {
        if (((liq) this.c).d() == i) {
        } else {
            throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void W(int i) {
        if ((i & 3) == 0) {
        } else {
            throw new ljy("Failed to parse the message.");
        }
    }

    private static final void X(int i) {
        if ((i & 7) == 0) {
        } else {
            throw new ljy("Failed to parse the message.");
        }
    }

    public static lir p(liq liqVar) {
        lir lirVar = liqVar.d;
        if (lirVar != null) {
            return lirVar;
        }
        return new lir(liqVar);
    }

    public final void A(List list) {
        int m;
        int i;
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        ljoVar.g(((liq) this.c).f());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                ljoVar.g(((liq) this.c).f());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Integer.valueOf(((liq) this.c).f()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Integer.valueOf(((liq) this.c).f()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void B(List list) {
        int m;
        int i;
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            int b = llz.b(this.a);
            if (b != 2) {
                if (b != 5) {
                    throw new ljx();
                }
                do {
                    ljoVar.g(((liq) this.c).g());
                    if (!((liq) this.c).C()) {
                        i = ((liq) this.c).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                int n = ((liq) this.c).n();
                W(n);
                int d = ((liq) this.c).d() + n;
                do {
                    ljoVar.g(((liq) this.c).g());
                } while (((liq) this.c).d() < d);
                return;
            }
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 2) {
                if (b2 != 5) {
                    throw new ljx();
                }
                do {
                    list.add(Integer.valueOf(((liq) this.c).g()));
                    if (!((liq) this.c).C()) {
                        m = ((liq) this.c).m();
                    } else {
                        return;
                    }
                } while (m == this.a);
                i = m;
            } else {
                int n2 = ((liq) this.c).n();
                W(n2);
                int d2 = ((liq) this.c).d() + n2;
                do {
                    list.add(Integer.valueOf(((liq) this.c).g()));
                } while (((liq) this.c).d() < d2);
                return;
            }
        }
        this.b = i;
    }

    public final void C(List list) {
        int m;
        int i;
        if (list instanceof lkh) {
            lkh lkhVar = (lkh) list;
            int b = llz.b(this.a);
            if (b != 1) {
                if (b == 2) {
                    int n = ((liq) this.c).n();
                    X(n);
                    int d = ((liq) this.c).d() + n;
                    do {
                        lkhVar.g(((liq) this.c).o());
                    } while (((liq) this.c).d() < d);
                    return;
                }
                throw new ljx();
            }
            do {
                lkhVar.g(((liq) this.c).o());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 1) {
                if (b2 == 2) {
                    int n2 = ((liq) this.c).n();
                    X(n2);
                    int d2 = ((liq) this.c).d() + n2;
                    do {
                        list.add(Long.valueOf(((liq) this.c).o()));
                    } while (((liq) this.c).d() < d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Long.valueOf(((liq) this.c).o()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void D(List list) {
        int m;
        int i;
        if (list instanceof ljf) {
            ljf ljfVar = (ljf) list;
            int b = llz.b(this.a);
            if (b != 2) {
                if (b != 5) {
                    throw new ljx();
                }
                do {
                    ljfVar.f(((liq) this.c).c());
                    if (!((liq) this.c).C()) {
                        i = ((liq) this.c).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                int n = ((liq) this.c).n();
                W(n);
                int d = ((liq) this.c).d() + n;
                do {
                    ljfVar.f(((liq) this.c).c());
                } while (((liq) this.c).d() < d);
                return;
            }
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 2) {
                if (b2 != 5) {
                    throw new ljx();
                }
                do {
                    list.add(Float.valueOf(((liq) this.c).c()));
                    if (!((liq) this.c).C()) {
                        m = ((liq) this.c).m();
                    } else {
                        return;
                    }
                } while (m == this.a);
                i = m;
            } else {
                int n2 = ((liq) this.c).n();
                W(n2);
                int d2 = ((liq) this.c).d() + n2;
                do {
                    list.add(Float.valueOf(((liq) this.c).c()));
                } while (((liq) this.c).d() < d2);
                return;
            }
        }
        this.b = i;
    }

    public final void E(List list) {
        int m;
        int i;
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        ljoVar.g(((liq) this.c).h());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                ljoVar.g(((liq) this.c).h());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Integer.valueOf(((liq) this.c).h()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Integer.valueOf(((liq) this.c).h()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void F(List list) {
        int m;
        int i;
        if (list instanceof lkh) {
            lkh lkhVar = (lkh) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        lkhVar.g(((liq) this.c).p());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                lkhVar.g(((liq) this.c).p());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Long.valueOf(((liq) this.c).p()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Long.valueOf(((liq) this.c).p()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void G(List list) {
        int m;
        int i;
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            int b = llz.b(this.a);
            if (b != 2) {
                if (b != 5) {
                    throw new ljx();
                }
                do {
                    ljoVar.g(((liq) this.c).k());
                    if (!((liq) this.c).C()) {
                        i = ((liq) this.c).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                int n = ((liq) this.c).n();
                W(n);
                int d = ((liq) this.c).d() + n;
                do {
                    ljoVar.g(((liq) this.c).k());
                } while (((liq) this.c).d() < d);
                return;
            }
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 2) {
                if (b2 != 5) {
                    throw new ljx();
                }
                do {
                    list.add(Integer.valueOf(((liq) this.c).k()));
                    if (!((liq) this.c).C()) {
                        m = ((liq) this.c).m();
                    } else {
                        return;
                    }
                } while (m == this.a);
                i = m;
            } else {
                int n2 = ((liq) this.c).n();
                W(n2);
                int d2 = ((liq) this.c).d() + n2;
                do {
                    list.add(Integer.valueOf(((liq) this.c).k()));
                } while (((liq) this.c).d() < d2);
                return;
            }
        }
        this.b = i;
    }

    public final void H(List list) {
        int m;
        int i;
        if (list instanceof lkh) {
            lkh lkhVar = (lkh) list;
            int b = llz.b(this.a);
            if (b != 1) {
                if (b == 2) {
                    int n = ((liq) this.c).n();
                    X(n);
                    int d = ((liq) this.c).d() + n;
                    do {
                        lkhVar.g(((liq) this.c).t());
                    } while (((liq) this.c).d() < d);
                    return;
                }
                throw new ljx();
            }
            do {
                lkhVar.g(((liq) this.c).t());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 1) {
                if (b2 == 2) {
                    int n2 = ((liq) this.c).n();
                    X(n2);
                    int d2 = ((liq) this.c).d() + n2;
                    do {
                        list.add(Long.valueOf(((liq) this.c).t()));
                    } while (((liq) this.c).d() < d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Long.valueOf(((liq) this.c).t()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void I(List list) {
        int m;
        int i;
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        ljoVar.g(((liq) this.c).l());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                ljoVar.g(((liq) this.c).l());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Integer.valueOf(((liq) this.c).l()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Integer.valueOf(((liq) this.c).l()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void J(List list) {
        int m;
        int i;
        if (list instanceof lkh) {
            lkh lkhVar = (lkh) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        lkhVar.g(((liq) this.c).u());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                lkhVar.g(((liq) this.c).u());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Long.valueOf(((liq) this.c).u()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Long.valueOf(((liq) this.c).u()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void K(List list, boolean z) {
        String u;
        int m;
        int i;
        if (llz.b(this.a) == 2) {
            if ((list instanceof lkf) && !z) {
                lkf lkfVar = (lkf) list;
                do {
                    o();
                    lkfVar.b();
                    if (!((liq) this.c).C()) {
                        i = ((liq) this.c).m();
                    } else {
                        return;
                    }
                } while (i == this.a);
            } else {
                do {
                    if (z) {
                        u = v();
                    } else {
                        u = u();
                    }
                    list.add(u);
                    if (((liq) this.c).C()) {
                        return;
                    } else {
                        m = ((liq) this.c).m();
                    }
                } while (m == this.a);
                i = m;
            }
            this.b = i;
            return;
        }
        throw new ljx();
    }

    public final void L(List list) {
        int m;
        int i;
        if (list instanceof ljo) {
            ljo ljoVar = (ljo) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        ljoVar.g(((liq) this.c).n());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                ljoVar.g(((liq) this.c).n());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Integer.valueOf(((liq) this.c).n()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Integer.valueOf(((liq) this.c).n()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void M(List list) {
        int m;
        int i;
        if (list instanceof lkh) {
            lkh lkhVar = (lkh) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        lkhVar.g(((liq) this.c).v());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                lkhVar.g(((liq) this.c).v());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Long.valueOf(((liq) this.c).v()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Long.valueOf(((liq) this.c).v()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void N(int i) {
        if (llz.b(this.a) == i) {
        } else {
            throw new ljx();
        }
    }

    public final boolean O() {
        N(0);
        return ((liq) this.c).D();
    }

    public final boolean P() {
        int i;
        if (!((liq) this.c).C() && (i = this.a) != this.d) {
            return ((liq) this.c).E(i);
        }
        return false;
    }

    public final void Q() {
        bwn.m((View) this.c, this.a - (((View) this.c).getTop() - this.b));
        bwn.l((View) this.c, -(((View) this.c).getLeft() - this.d));
    }

    public final void R() {
        this.b = ((View) this.c).getTop();
        this.d = ((View) this.c).getLeft();
    }

    public final boolean S(int i) {
        if (this.a != i) {
            this.a = i;
            Q();
            return true;
        }
        return false;
    }

    public final double a() {
        N(1);
        return ((liq) this.c).b();
    }

    public final float b() {
        N(5);
        return ((liq) this.c).c();
    }

    public final int c() {
        int i = this.b;
        if (i != 0) {
            this.a = i;
            this.b = 0;
        } else {
            i = ((liq) this.c).m();
            this.a = i;
        }
        if (i != 0 && i != this.d) {
            return llz.a(i);
        }
        return Integer.MAX_VALUE;
    }

    public final int d() {
        N(0);
        return ((liq) this.c).f();
    }

    public final int e() {
        N(5);
        return ((liq) this.c).g();
    }

    public final int f() {
        N(0);
        return ((liq) this.c).h();
    }

    public final int g() {
        N(5);
        return ((liq) this.c).k();
    }

    public final int h() {
        N(0);
        return ((liq) this.c).l();
    }

    public final int i() {
        N(0);
        return ((liq) this.c).n();
    }

    public final long j() {
        N(1);
        return ((liq) this.c).o();
    }

    public final long k() {
        N(0);
        return ((liq) this.c).p();
    }

    public final long l() {
        N(1);
        return ((liq) this.c).t();
    }

    public final long m() {
        N(0);
        return ((liq) this.c).u();
    }

    public final long n() {
        N(0);
        return ((liq) this.c).v();
    }

    public final lim o() {
        N(2);
        return ((liq) this.c).w();
    }

    public final Object q(llx llxVar, Class cls, lja ljaVar) {
        llx llxVar2 = llx.DOUBLE;
        switch (llxVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(k());
            case UINT64:
                return Long.valueOf(n());
            case INT32:
                return Integer.valueOf(f());
            case FIXED64:
                return Long.valueOf(j());
            case FIXED32:
                return Integer.valueOf(e());
            case BOOL:
                return Boolean.valueOf(O());
            case STRING:
                return v();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return t(cls, ljaVar);
            case BYTES:
                return o();
            case UINT32:
                return Integer.valueOf(i());
            case ENUM:
                return Integer.valueOf(d());
            case SFIXED32:
                return Integer.valueOf(g());
            case SFIXED64:
                return Long.valueOf(l());
            case SINT32:
                return Integer.valueOf(h());
            case SINT64:
                return Long.valueOf(m());
        }
    }

    public final Object r(llg llgVar, lja ljaVar) {
        Object e = llgVar.e();
        T(e, llgVar, ljaVar);
        llgVar.g(e);
        return e;
    }

    public final Object s(llg llgVar, lja ljaVar) {
        Object e = llgVar.e();
        U(e, llgVar, ljaVar);
        llgVar.g(e);
        return e;
    }

    public final Object t(Class cls, lja ljaVar) {
        N(2);
        return s(lkz.a.a(cls), ljaVar);
    }

    public final String u() {
        N(2);
        return ((liq) this.c).x();
    }

    public final String v() {
        N(2);
        return ((liq) this.c).y();
    }

    public final void w(Object obj, llg llgVar, lja ljaVar) {
        N(3);
        T(obj, llgVar, ljaVar);
    }

    public final void x(Object obj, llg llgVar, lja ljaVar) {
        N(2);
        U(obj, llgVar, ljaVar);
    }

    public final void y(List list) {
        int m;
        int i;
        if (list instanceof lid) {
            lid lidVar = (lid) list;
            int b = llz.b(this.a);
            if (b != 0) {
                if (b == 2) {
                    liq liqVar = (liq) this.c;
                    int d = liqVar.d() + liqVar.n();
                    do {
                        lidVar.e(((liq) this.c).D());
                    } while (((liq) this.c).d() < d);
                    V(d);
                    return;
                }
                throw new ljx();
            }
            do {
                lidVar.e(((liq) this.c).D());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 0) {
                if (b2 == 2) {
                    liq liqVar2 = (liq) this.c;
                    int d2 = liqVar2.d() + liqVar2.n();
                    do {
                        list.add(Boolean.valueOf(((liq) this.c).D()));
                    } while (((liq) this.c).d() < d2);
                    V(d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Boolean.valueOf(((liq) this.c).D()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    public final void z(List list) {
        int m;
        int i;
        if (list instanceof liw) {
            liw liwVar = (liw) list;
            int b = llz.b(this.a);
            if (b != 1) {
                if (b == 2) {
                    int n = ((liq) this.c).n();
                    X(n);
                    int d = ((liq) this.c).d() + n;
                    do {
                        liwVar.f(((liq) this.c).b());
                    } while (((liq) this.c).d() < d);
                    return;
                }
                throw new ljx();
            }
            do {
                liwVar.f(((liq) this.c).b());
                if (!((liq) this.c).C()) {
                    i = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (i == this.a);
        } else {
            int b2 = llz.b(this.a);
            if (b2 != 1) {
                if (b2 == 2) {
                    int n2 = ((liq) this.c).n();
                    X(n2);
                    int d2 = ((liq) this.c).d() + n2;
                    do {
                        list.add(Double.valueOf(((liq) this.c).b()));
                    } while (((liq) this.c).d() < d2);
                    return;
                }
                throw new ljx();
            }
            do {
                list.add(Double.valueOf(((liq) this.c).b()));
                if (!((liq) this.c).C()) {
                    m = ((liq) this.c).m();
                } else {
                    return;
                }
            } while (m == this.a);
            i = m;
        }
        this.b = i;
    }

    private lir(liq liqVar) {
        this.b = 0;
        Charset charset = ljw.a;
        this.c = liqVar;
        liqVar.d = this;
    }
}
