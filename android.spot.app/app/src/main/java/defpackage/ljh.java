package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ljh extends lhv implements lkr, lpu {
    public final ljn a;
    public ljn b;

    public ljh() {
        throw null;
    }

    private static void an(Object obj, Object obj2) {
        lkz.a.b(obj).h(obj, obj2);
    }

    public final void A(String str) {
        if (!this.b.y()) {
            t();
        }
        hwt hwtVar = (hwt) this.b;
        hwt hwtVar2 = hwt.d;
        str.getClass();
        ljv ljvVar = hwtVar.b;
        if (!ljvVar.c()) {
            hwtVar.b = ljn.p(ljvVar);
        }
        hwtVar.b.add(str);
    }

    public final void B(String str, hwt hwtVar) {
        str.getClass();
        hwtVar.getClass();
        if (!this.b.y()) {
            t();
        }
        hwv hwvVar = (hwv) this.b;
        hwv hwvVar2 = hwv.b;
        lkl lklVar = hwvVar.a;
        if (!lklVar.b) {
            hwvVar.a = lklVar.a();
        }
        hwvVar.a.put(str, hwtVar);
    }

    public final void C(jul julVar) {
        if (!this.b.y()) {
            t();
        }
        jum jumVar = (jum) this.b;
        jum jumVar2 = jum.b;
        julVar.getClass();
        jumVar.b();
        jumVar.a.add(julVar);
    }

    public final void D(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        kwy kwyVar = (kwy) this.b;
        kwy kwyVar2 = kwy.b;
        ljr ljrVar = kwyVar.a;
        if (!ljrVar.c()) {
            kwyVar.a = ljn.n(ljrVar);
        }
        lhv.g(iterable, kwyVar.a);
    }

    public final void E(Map map) {
        if (!this.b.y()) {
            t();
        }
        kxk kxkVar = (kxk) this.b;
        kxk kxkVar2 = kxk.d;
        kxkVar.b().putAll(map);
    }

    public final void F(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        lcc lccVar = (lcc) this.b;
        lcc lccVar2 = lcc.l;
        ljv ljvVar = lccVar.b;
        if (!ljvVar.c()) {
            lccVar.b = ljn.p(ljvVar);
        }
        lhv.g(iterable, lccVar.b);
    }

    public final void G(lbx lbxVar) {
        if (!this.b.y()) {
            t();
        }
        lcx lcxVar = (lcx) this.b;
        lcx lcxVar2 = lcx.q;
        lbxVar.getClass();
        ljv ljvVar = lcxVar.l;
        if (!ljvVar.c()) {
            lcxVar.l = ljn.p(ljvVar);
        }
        lcxVar.l.add(lbxVar);
    }

    public final void H(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        lgj lgjVar = (lgj) this.b;
        lgj lgjVar2 = lgj.b;
        lgjVar.b();
        lhv.g(iterable, lgjVar.a);
    }

    public final void I(int i) {
        if (!this.b.y()) {
            t();
        }
        lgy lgyVar = (lgy) this.b;
        lgy lgyVar2 = lgy.b;
        ljr ljrVar = lgyVar.a;
        if (!ljrVar.c()) {
            lgyVar.a = ljn.n(ljrVar);
        }
        lgyVar.a.g(i - 1);
    }

    public final void J(String str) {
        if (!this.b.y()) {
            t();
        }
        ljc ljcVar = (ljc) this.b;
        ljc ljcVar2 = ljc.b;
        ljv ljvVar = ljcVar.a;
        if (!ljvVar.c()) {
            ljcVar.a = ljn.p(ljvVar);
        }
        ljcVar.a.add(str);
    }

    public final void K(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        lqc lqcVar = (lqc) this.b;
        lqc lqcVar2 = lqc.j;
        lqcVar.c();
        lhv.g(iterable, lqcVar.e);
    }

    public final void L(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndk ndkVar = (ndk) this.b;
        ndk ndkVar2 = ndk.e;
        ljv ljvVar = ndkVar.b;
        if (!ljvVar.c()) {
            ndkVar.b = ljn.p(ljvVar);
        }
        lhv.g(iterable, ndkVar.b);
    }

    public final void M(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndk ndkVar = (ndk) this.b;
        ndk ndkVar2 = ndk.e;
        ljv ljvVar = ndkVar.c;
        if (!ljvVar.c()) {
            ndkVar.c = ljn.p(ljvVar);
        }
        lhv.g(iterable, ndkVar.c);
    }

    public final ndo N(int i) {
        return (ndo) ((ndp) this.b).g.get(i);
    }

    public final ndo O(int i) {
        return (ndo) ((ndp) this.b).h.get(i);
    }

    public final ndo P(int i) {
        return (ndo) ((ndp) this.b).i.get(i);
    }

    public final ndo Q(int i) {
        return (ndo) ((ndp) this.b).j.get(i);
    }

    public final ndo R(int i) {
        return (ndo) ((ndp) this.b).k.get(i);
    }

    public final ndo S(int i) {
        return (ndo) ((ndp) this.b).l.get(i);
    }

    public final ndo T(int i) {
        return (ndo) ((ndp) this.b).n.get(i);
    }

    public final void U(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndpVar.F();
        lhv.g(iterable, ndpVar.l);
    }

    public final void V(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndpVar.G();
        lhv.g(iterable, ndpVar.n);
    }

    public final void W(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ljv ljvVar = ndpVar.q;
        if (!ljvVar.c()) {
            ndpVar.q = ljn.p(ljvVar);
        }
        lhv.g(iterable, ndpVar.q);
    }

    public final void X(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ljv ljvVar = ndpVar.p;
        if (!ljvVar.c()) {
            ndpVar.p = ljn.p(ljvVar);
        }
        lhv.g(iterable, ndpVar.p);
    }

    public final void Y(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndpVar.E();
        lhv.g(iterable, ndpVar.k);
    }

    public final void Z(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndpVar.D();
        lhv.g(iterable, ndpVar.j);
    }

    public final void aa(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndpVar.c();
        lhv.g(iterable, ndpVar.g);
    }

    public final void ab(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndpVar.h();
        lhv.g(iterable, ndpVar.h);
    }

    public final void ac(Iterable iterable) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndpVar.C();
        lhv.g(iterable, ndpVar.i);
    }

    public final void ad(int i, ndo ndoVar) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndoVar.getClass();
        ndpVar.F();
        ndpVar.l.set(i, ndoVar);
    }

    public final void ae(int i, ndo ndoVar) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndoVar.getClass();
        ndpVar.G();
        ndpVar.n.set(i, ndoVar);
    }

    public final void af(int i, ndo ndoVar) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndoVar.getClass();
        ndpVar.E();
        ndpVar.k.set(i, ndoVar);
    }

    public final void ag(int i, ndo ndoVar) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndoVar.getClass();
        ndpVar.D();
        ndpVar.j.set(i, ndoVar);
    }

    public final void ah(int i, ndo ndoVar) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndoVar.getClass();
        ndpVar.c();
        ndpVar.g.set(i, ndoVar);
    }

    public final void ai(int i, ndo ndoVar) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndoVar.getClass();
        ndpVar.h();
        ndpVar.h.set(i, ndoVar);
    }

    public final void aj(int i, ndo ndoVar) {
        if (!this.b.y()) {
            t();
        }
        ndp ndpVar = (ndp) this.b;
        ndp ndpVar2 = ndp.ar;
        ndoVar.getClass();
        ndpVar.C();
        ndpVar.i.set(i, ndoVar);
    }

    public final void ak(int i) {
        if (!this.b.y()) {
            t();
        }
        nfa nfaVar = (nfa) this.b;
        nfa nfaVar2 = nfa.c;
        ljr ljrVar = nfaVar.b;
        if (!ljrVar.c()) {
            nfaVar.b = ljn.n(ljrVar);
        }
        nfaVar.b.g(i);
    }

    public final void al(int i) {
        if (!this.b.y()) {
            t();
        }
        nfa nfaVar = (nfa) this.b;
        nfa nfaVar2 = nfa.c;
        ljr ljrVar = nfaVar.a;
        if (!ljrVar.c()) {
            nfaVar.a = ljn.n(ljrVar);
        }
        nfaVar.a.g(i);
    }

    public final void am(ljh ljhVar) {
        if (!this.b.y()) {
            t();
        }
        lqc lqcVar = (lqc) this.b;
        lqi lqiVar = (lqi) ljhVar.q();
        lqc lqcVar2 = lqc.j;
        lqiVar.getClass();
        lqcVar.c();
        lqcVar.e.add(lqiVar);
    }

    @Override // defpackage.lhv
    protected final /* synthetic */ lhv b(lhw lhwVar) {
        w((ljn) lhwVar);
        return this;
    }

    @Override // defpackage.lhv
    public final /* bridge */ /* synthetic */ lhv j(byte[] bArr, int i) {
        lja ljaVar = lja.a;
        lkz lkzVar = lkz.a;
        x(bArr, i, lja.a);
        return this;
    }

    @Override // defpackage.lhv
    public final /* bridge */ /* synthetic */ lhv k(byte[] bArr, int i, lja ljaVar) {
        x(bArr, i, ljaVar);
        return this;
    }

    @Override // defpackage.lhv
    /* renamed from: m, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final ljh clone() {
        ljh ljhVar = (ljh) this.a.z(5);
        ljhVar.b = r();
        return ljhVar;
    }

    @Override // defpackage.lkp
    /* renamed from: n */
    public final ljn q() {
        ljn r = r();
        if (r.u()) {
            return r;
        }
        throw new llo();
    }

    @Override // defpackage.lkp
    /* renamed from: o */
    public ljn r() {
        if (!this.b.y()) {
            return this.b;
        }
        this.b.t();
        return this.b;
    }

    public final ljn p() {
        return this.a.l();
    }

    @Override // defpackage.lkr
    public final /* synthetic */ lkq s() {
        return this.a;
    }

    public void t() {
        ljn p = p();
        an(p, this.b);
        this.b = p;
    }

    @Override // defpackage.lkr
    public final boolean u() {
        return ljn.x(this.b, false);
    }

    @Override // defpackage.lhv, defpackage.lkp
    /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void i(liq liqVar, lja ljaVar) {
        if (!this.b.y()) {
            t();
        }
        try {
            lkz.a.b(this.b).l(this.b, lir.p(liqVar), ljaVar);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public final void w(ljn ljnVar) {
        if (!this.a.equals(ljnVar)) {
            if (!this.b.y()) {
                t();
            }
            an(this.b, ljnVar);
        }
    }

    public final void x(byte[] bArr, int i, lja ljaVar) {
        if (!this.b.y()) {
            t();
        }
        try {
            lkz.a.b(this.b).i(this.b, bArr, 0, i, new lib(ljaVar));
        } catch (IndexOutOfBoundsException unused) {
            throw new ljy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (ljy e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    public final void y(lia liaVar) {
        if (!this.b.y()) {
            t();
        }
        gxg gxgVar = (gxg) this.b;
        gxg gxgVar2 = gxg.b;
        liaVar.getClass();
        ljv ljvVar = gxgVar.a;
        if (!ljvVar.c()) {
            gxgVar.a = ljn.p(ljvVar);
        }
        gxgVar.a.add(liaVar);
    }

    public final void z(String str) {
        if (!this.b.y()) {
            t();
        }
        gxh gxhVar = (gxh) this.b;
        gxh gxhVar2 = gxh.b;
        str.getClass();
        gxhVar.b();
        gxhVar.a.add(str);
    }

    public ljh(ljn ljnVar) {
        this.a = ljnVar;
        if (!ljnVar.y()) {
            this.b = p();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }
}
