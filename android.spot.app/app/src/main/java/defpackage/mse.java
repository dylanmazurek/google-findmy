package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mse extends mth implements msd, mnm, mvj {
    public final mmx a;
    public final mnb b;
    public final mrp c;
    public final mrr d;
    private final mrr f;

    public mse(mmx mmxVar, int i) {
        super(i);
        this.a = mmxVar;
        boolean z = msy.a;
        this.b = mmxVar.o();
        this.c = new mrp(536870911, mrs.a);
        this.d = new mrr(mru.a, mrs.a);
        this.f = new mrr(null, mrs.a);
    }

    private final mtl H() {
        muf mufVar = (muf) this.b.get(muf.c);
        if (mufVar == null) {
            return null;
        }
        mtl aF = mkm.aF(mufVar, true, new msh(this), 2);
        this.f.d(null, aF);
        return aF;
    }

    private final void I(int i) {
        int i2;
        boolean z;
        do {
            i2 = this.c.b;
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z2 = msy.a;
                    mmx s = s();
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && (s instanceof nan) && msz.g(i) == msz.g(this.e)) {
                        mst mstVar = ((nan) s).a;
                        mnb o = s.o();
                        if (!mstVar.cp(o)) {
                            ThreadLocal threadLocal = mvc.a;
                            mto a = mvc.a();
                            if (a.o()) {
                                a.m(this);
                                return;
                            }
                            a.n(true);
                            try {
                                msz.f(this, s(), true);
                                do {
                                } while (a.q());
                                return;
                            } catch (Throwable th) {
                                try {
                                    G(th, null);
                                    return;
                                } finally {
                                    a.l(true);
                                }
                            }
                        }
                        mstVar.a(o, this);
                        return;
                    }
                    msz.f(this, s, z);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!this.c.c(i2, (536870911 & i2) + 1073741824));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Object obj, int i, moh mohVar) {
        Object obj2;
        do {
            obj2 = this.d.a;
            if (obj2 instanceof muv) {
            } else {
                if (obj2 instanceof msg) {
                    msg msgVar = (msg) obj2;
                    if (msgVar.a.a(false, true)) {
                        if (mohVar != null) {
                            v(mohVar, msgVar.b);
                            return;
                        }
                        return;
                    }
                }
                Objects.toString(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!this.d.d(obj2, L((muv) obj2, obj, i, mohVar)));
        y();
        I(i);
    }

    private static final void K(Object obj, Object obj2) {
        throw new IllegalStateException(a.ah(obj2, obj, "It's prohibited to register multiple handlers, tried to register ", ", already has "));
    }

    private static final Object L(muv muvVar, Object obj, int i, moh mohVar) {
        moh mohVar2;
        if (obj instanceof msm) {
            boolean z = msy.a;
            return obj;
        }
        if (msz.g(i)) {
            msc mscVar = null;
            if (mohVar == null) {
                if (muvVar instanceof msc) {
                    mohVar2 = null;
                } else {
                    return obj;
                }
            } else {
                mohVar2 = mohVar;
            }
            if (muvVar instanceof msc) {
                mscVar = (msc) muvVar;
            }
            return new msl(obj, mscVar, mohVar2, null, 16);
        }
        return obj;
    }

    private final void M(nai naiVar) {
        int i = this.c.b & 536870911;
        if (i != 536870911) {
            try {
                naiVar.l(i);
                return;
            } catch (Throwable th) {
                mnb mnbVar = this.b;
                toString();
                msz.r(mnbVar, new mso("Exception in invokeOnCancellation handler for ".concat(toString()), th));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final void A(Object obj) {
        boolean z = msy.a;
        while (true) {
            Object obj2 = this.d.a;
            if (obj2 instanceof mru) {
                if (this.d.d(obj2, obj)) {
                    return;
                }
            } else if (!(obj2 instanceof msc) && !(obj2 instanceof nai)) {
                Throwable th = null;
                if (obj2 instanceof msm) {
                    msm msmVar = (msm) obj2;
                    if (!msmVar.a()) {
                        K(obj, obj2);
                    }
                    if (obj2 instanceof msg) {
                        if (msmVar != null) {
                            th = msmVar.b;
                        }
                        if (obj instanceof msc) {
                            u((msc) obj, th);
                            return;
                        } else {
                            obj.getClass();
                            M((nai) obj);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof msl) {
                    msl mslVar = (msl) obj2;
                    if (mslVar.b != null) {
                        K(obj, obj2);
                    }
                    if (!(obj instanceof nai)) {
                        obj.getClass();
                        msc mscVar = (msc) obj;
                        if (mslVar.a()) {
                            u(mscVar, mslVar.e);
                            return;
                        } else {
                            if (this.d.d(obj2, msl.b(mslVar, mscVar, null, 29))) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else if (!(obj instanceof nai)) {
                    obj.getClass();
                    if (this.d.d(obj2, new msl(obj2, (msc) obj, null, null, 28))) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                K(obj, obj2);
            }
        }
    }

    public final void B() {
        nan nanVar;
        mmx mmxVar = this.a;
        Throwable th = null;
        if (mmxVar instanceof nan) {
            nanVar = (nan) mmxVar;
        } else {
            nanVar = null;
        }
        if (nanVar == null) {
            return;
        }
        while (true) {
            Object obj = nanVar.f.a;
            nbj nbjVar = nao.b;
            if (obj == nbjVar) {
                if (nanVar.f.d(nbjVar, this)) {
                    break;
                }
            } else if (obj instanceof Throwable) {
                if (nanVar.f.d(obj, null)) {
                    th = (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            } else {
                Objects.toString(obj);
                throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
            }
        }
        if (th != null) {
            x();
            i(th);
        }
    }

    public final boolean C() {
        if (this.e == 2 && ((nan) this.a).f.a != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mvj
    public final void D(nai naiVar, int i) {
        mrp mrpVar;
        int i2;
        do {
            mrpVar = this.c;
            i2 = mrpVar.b;
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!mrpVar.c(i2, ((i2 >> 29) << 29) + i));
        A(naiVar);
    }

    public final nbj F(Object obj, moh mohVar) {
        Object obj2;
        do {
            obj2 = this.d.a;
            if (obj2 instanceof muv) {
            } else {
                return null;
            }
        } while (!this.d.d(obj2, L((muv) obj2, obj, this.e, mohVar)));
        y();
        return msf.a;
    }

    @Override // defpackage.mnm
    public final mnm bO() {
        mmx mmxVar = this.a;
        if (mmxVar instanceof mnm) {
            return (mnm) mmxVar;
        }
        return null;
    }

    @Override // defpackage.msd
    public final void c(Object obj) {
        boolean z = msy.a;
        I(this.e);
    }

    @Override // defpackage.msd
    public final void d(moh mohVar) {
        A(new msb(mohVar, 0));
    }

    @Override // defpackage.msd
    public final void e(Object obj, moh mohVar) {
        J(obj, this.e, mohVar);
    }

    @Override // defpackage.msd
    public final void f(mst mstVar, Object obj) {
        nan nanVar;
        int i;
        mmx mmxVar = this.a;
        mst mstVar2 = null;
        if (mmxVar instanceof nan) {
            nanVar = (nan) mmxVar;
        } else {
            nanVar = null;
        }
        if (nanVar != null) {
            mstVar2 = nanVar.a;
        }
        if (mstVar2 == mstVar) {
            i = 4;
        } else {
            i = this.e;
        }
        J(obj, i, null);
    }

    @Override // defpackage.msd
    public final boolean g() {
        if (!(k() instanceof muv)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.msd
    public final Object h(Object obj, moh mohVar) {
        return F(obj, mohVar);
    }

    @Override // defpackage.msd
    public final void i(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this.d.a;
            if (!(obj instanceof muv)) {
                return;
            }
            z = true;
            if (!(obj instanceof msc) && !(obj instanceof nai)) {
                z = false;
            }
        } while (!this.d.d(obj, new msg(this, th, z)));
        muv muvVar = (muv) obj;
        if (muvVar instanceof msc) {
            u((msc) obj, th);
        } else if (muvVar instanceof nai) {
            M((nai) obj);
        }
        y();
        I(this.e);
    }

    public final Object j() {
        int i;
        muf mufVar;
        boolean C = C();
        do {
            i = this.c.b;
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    if (C) {
                        B();
                    }
                    Object k = k();
                    if (k instanceof msm) {
                        Throwable th = ((msm) k).b;
                        if (msy.b) {
                            throw nbi.a(th, this);
                        }
                        throw th;
                    }
                    if (msz.g(this.e) && (mufVar = (muf) this.b.get(muf.c)) != null && !mufVar.t()) {
                        CancellationException n = mufVar.n();
                        w(k, n);
                        if (msy.b) {
                            throw nbi.a(n, this);
                        }
                        throw n;
                    }
                    return l(k);
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!this.c.c(i, (536870911 & i) + 536870912));
        if (t() == null) {
            H();
        }
        if (C) {
            B();
        }
        return mne.a;
    }

    public final Object k() {
        return this.d.a;
    }

    @Override // defpackage.mth
    public final Object l(Object obj) {
        if (obj instanceof msl) {
            return ((msl) obj).a;
        }
        return obj;
    }

    @Override // defpackage.mth
    public final Object m() {
        return k();
    }

    protected String n() {
        return "CancellableContinuation";
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return this.b;
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        Throwable a = mky.a(obj);
        if (a != null) {
            if (msy.b) {
                a = nbi.a(a, this);
            }
            obj = new msm(a);
        }
        J(obj, this.e, null);
    }

    public Throwable q(muf mufVar) {
        return mufVar.n();
    }

    @Override // defpackage.mth
    public final Throwable r(Object obj) {
        Throwable r = super.r(obj);
        if (r != null) {
            mmx mmxVar = this.a;
            if (msy.b && (mmxVar instanceof mnm)) {
                return nbi.a(r, (mnm) mmxVar);
            }
            return r;
        }
        return null;
    }

    @Override // defpackage.mth
    public final mmx s() {
        return this.a;
    }

    public final mtl t() {
        return (mtl) this.f.a;
    }

    public final String toString() {
        String str;
        String c = msz.c(this.a);
        Object k = k();
        if (k instanceof muv) {
            str = "Active";
        } else if (k instanceof msg) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        return n() + "(" + c + "){" + str + "}@" + msz.b(this);
    }

    public final void u(msc mscVar, Throwable th) {
        try {
            mscVar.b(th);
        } catch (Throwable th2) {
            mnb mnbVar = this.b;
            toString();
            msz.r(mnbVar, new mso("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    public final void v(moh mohVar, Throwable th) {
        try {
            mohVar.a(th);
        } catch (Throwable th2) {
            mnb mnbVar = this.b;
            toString();
            msz.r(mnbVar, new mso("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    @Override // defpackage.mth
    public final void w(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this.d.a;
            if (!(obj2 instanceof muv)) {
                if (!(obj2 instanceof msm)) {
                    if (obj2 instanceof msl) {
                        msl mslVar = (msl) obj2;
                        if (!mslVar.a()) {
                            if (this.d.d(obj2, msl.b(mslVar, null, th, 15))) {
                                msc mscVar = mslVar.b;
                                if (mscVar != null) {
                                    u(mscVar, th);
                                }
                                moh mohVar = mslVar.c;
                                if (mohVar != null) {
                                    v(mohVar, th);
                                    return;
                                }
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Must be called at most once");
                        }
                    } else if (this.d.d(obj2, new msl(obj2, null, null, th, 14))) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    public final void x() {
        mtl t = t();
        if (t == null) {
            return;
        }
        t.dc();
        this.f.c(muu.a);
    }

    public final void y() {
        if (!C()) {
            x();
        }
    }

    public final void z() {
        mtl H = H();
        if (H != null && g()) {
            H.dc();
            this.f.c(muu.a);
        }
    }

    @Override // defpackage.mnm
    public final void bP() {
    }
}
