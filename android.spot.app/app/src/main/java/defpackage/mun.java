package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
@mkp
/* loaded from: classes.dex */
public class mun implements muf {
    private final mrr a;
    public final mrr d;

    public mun(boolean z) {
        mtn mtnVar;
        if (z) {
            mtnVar = muo.g;
        } else {
            mtnVar = muo.f;
        }
        this.d = new mrr(mtnVar, mrs.a);
        this.a = new mrr(null, mrs.a);
    }

    private final void S(muj mujVar) {
        mus musVar = new mus();
        musVar.f.b(mujVar);
        musVar.e.b(mujVar);
        while (true) {
            if (mujVar.f() != mujVar) {
                break;
            } else if (mujVar.e.d(mujVar, musVar)) {
                musVar.i(mujVar);
                break;
            }
        }
        this.d.d(mujVar, mujVar.g());
    }

    private final boolean T(Object obj, mus musVar, muj mujVar) {
        char c;
        nbd nbdVar = new nbd(mujVar, this, obj);
        do {
            naz h = musVar.h();
            mujVar.f.b(h);
            mujVar.e.b(musVar);
            nbdVar.b = musVar;
            if (!h.e.d(musVar, nbdVar)) {
                c = 0;
            } else if (nbdVar.a(h) == null) {
                c = 1;
            } else {
                c = 2;
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    private final boolean U(Throwable th) {
        if (l()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        msi E = E();
        if (E != null && E != muu.a) {
            if (E.d(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    private static final String V(Object obj) {
        if (obj instanceof mum) {
            mum mumVar = (mum) obj;
            if (mumVar.g()) {
                return "Cancelling";
            }
            if (!mumVar.h()) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof mtz) {
            if (((mtz) obj).dd()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof msm) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final int g(Object obj) {
        if (obj instanceof mtn) {
            if (((mtn) obj).a) {
                return 0;
            }
            if (!this.d.d(obj, muo.g)) {
                return -1;
            }
            J();
            return 1;
        }
        if (!(obj instanceof mty)) {
            return 0;
        }
        if (!this.d.d(obj, ((mty) obj).a)) {
            return -1;
        }
        J();
        return 1;
    }

    private final Object h(Object obj, Object obj2) {
        mum mumVar;
        msm msmVar;
        msj msjVar;
        if (!(obj instanceof mtz)) {
            return muo.a;
        }
        if (((obj instanceof mtn) || (obj instanceof muj)) && !(obj instanceof msj) && !(obj2 instanceof msm)) {
            mtz mtzVar = (mtz) obj;
            boolean z = msy.a;
            if (!this.d.d(mtzVar, muo.a(obj2))) {
                return muo.c;
            }
            dm(obj2);
            o(mtzVar, obj2);
            return obj2;
        }
        mtz mtzVar2 = (mtz) obj;
        mus k = k(mtzVar2);
        if (k == null) {
            return muo.c;
        }
        msj msjVar2 = null;
        if (mtzVar2 instanceof mum) {
            mumVar = (mum) mtzVar2;
        } else {
            mumVar = null;
        }
        if (mumVar == null) {
            mumVar = new mum(k, null);
        }
        mpn mpnVar = new mpn();
        synchronized (mumVar) {
            if (mumVar.h()) {
                return muo.a;
            }
            mumVar.b.c();
            if (mumVar != mtzVar2 && !this.d.d(mtzVar2, mumVar)) {
                return muo.c;
            }
            boolean z2 = msy.a;
            boolean g = mumVar.g();
            if (obj2 instanceof msm) {
                msmVar = (msm) obj2;
            } else {
                msmVar = null;
            }
            if (msmVar != null) {
                mumVar.e(msmVar.b);
            }
            Throwable d = mumVar.d();
            boolean z3 = !g;
            Boolean.valueOf(z3).getClass();
            if (true != z3) {
                d = null;
            }
            mpnVar.a = d;
            Throwable th = (Throwable) mpnVar.a;
            if (th != null) {
                p(k, th);
            }
            if (mtzVar2 instanceof msj) {
                msjVar = (msj) mtzVar2;
            } else {
                msjVar = null;
            }
            if (msjVar == null) {
                mus a = mtzVar2.a();
                if (a != null) {
                    msjVar2 = F(a);
                }
            } else {
                msjVar2 = msjVar;
            }
            if (msjVar2 != null && P(mumVar, msjVar2, obj2)) {
                return muo.b;
            }
            return z(mumVar, obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Throwable] */
    private final Throwable j(Object obj) {
        CancellationException cancellationException;
        CancellationException cancellationException2 = null;
        if (obj != null && !(obj instanceof Throwable)) {
            mun munVar = (mun) obj;
            Object B = munVar.B();
            if (B instanceof mum) {
                cancellationException = ((mum) B).d();
            } else if (B instanceof msm) {
                cancellationException = ((msm) B).b;
            } else if (!(B instanceof mtz)) {
                cancellationException = null;
            } else {
                Objects.toString(B);
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(B)));
            }
            if (cancellationException instanceof CancellationException) {
                cancellationException2 = cancellationException;
            }
            if (cancellationException2 == null) {
                return new mug("Parent job is ".concat(V(B)), cancellationException, munVar);
            }
            return cancellationException2;
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        return new mug(c(), null, this);
    }

    private final mus k(mtz mtzVar) {
        mus a = mtzVar.a();
        if (a == null) {
            if (mtzVar instanceof mtn) {
                return new mus();
            }
            if (mtzVar instanceof muj) {
                S((muj) mtzVar);
                return null;
            }
            Objects.toString(mtzVar);
            throw new IllegalStateException("State should have list: ".concat(String.valueOf(mtzVar)));
        }
        return a;
    }

    private final void o(mtz mtzVar, Object obj) {
        msm msmVar;
        Throwable th;
        msi E = E();
        if (E != null) {
            E.dc();
            K(muu.a);
        }
        mso msoVar = null;
        if (obj instanceof msm) {
            msmVar = (msm) obj;
        } else {
            msmVar = null;
        }
        if (msmVar != null) {
            th = msmVar.b;
        } else {
            th = null;
        }
        if (mtzVar instanceof muj) {
            try {
                ((muj) mtzVar).b(th);
                return;
            } catch (Throwable th2) {
                f(new mso(a.ah(this, mtzVar, "Exception in completion handler ", " for "), th2));
                return;
            }
        }
        mus a = mtzVar.a();
        if (a != null) {
            Object f = a.f();
            f.getClass();
            for (naz nazVar = (naz) f; !amr.i(nazVar, a); nazVar = nazVar.g()) {
                if (nazVar instanceof muj) {
                    muj mujVar = (muj) nazVar;
                    try {
                        mujVar.b(th);
                    } catch (Throwable th3) {
                        if (msoVar != null) {
                            mjo.l(msoVar, th3);
                        } else {
                            msoVar = new mso(a.ah(this, mujVar, "Exception in completion handler ", " for "), th3);
                        }
                    }
                }
            }
            if (msoVar != null) {
                f(msoVar);
            }
        }
    }

    private final void p(mus musVar, Throwable th) {
        Object f = musVar.f();
        f.getClass();
        mso msoVar = null;
        for (naz nazVar = (naz) f; !amr.i(nazVar, musVar); nazVar = nazVar.g()) {
            if (nazVar instanceof muh) {
                muj mujVar = (muj) nazVar;
                try {
                    mujVar.b(th);
                } catch (Throwable th2) {
                    if (msoVar != null) {
                        mjo.l(msoVar, th2);
                    } else {
                        msoVar = new mso(a.ah(this, mujVar, "Exception in completion handler ", " for "), th2);
                    }
                }
            }
        }
        if (msoVar != null) {
            f(msoVar);
        }
        U(th);
    }

    public final Object B() {
        while (true) {
            Object obj = this.d.a;
            if (!(obj instanceof nbd)) {
                return obj;
            }
            ((nbd) obj).a(this);
        }
    }

    public final Object C(Object obj) {
        Object h;
        msm msmVar;
        do {
            h = h(B(), obj);
            if (h == muo.a) {
                String ah = a.ah(obj, this, "Job ", " is already complete or completing, but is being completed with ");
                Throwable th = null;
                if (obj instanceof msm) {
                    msmVar = (msm) obj;
                } else {
                    msmVar = null;
                }
                if (msmVar != null) {
                    th = msmVar.b;
                }
                throw new IllegalStateException(ah, th);
            }
        } while (h == muo.c);
        return h;
    }

    public final CancellationException D(Throwable th, String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = c();
            }
            cancellationException = new mug(str, th, this);
        }
        return cancellationException;
    }

    public final msi E() {
        return (msi) this.a.a;
    }

    public final msj F(naz nazVar) {
        while (nazVar.df()) {
            nazVar = nazVar.h();
        }
        while (true) {
            nazVar = nazVar.g();
            if (!nazVar.df()) {
                if (nazVar instanceof msj) {
                    return (msj) nazVar;
                }
                if (nazVar instanceof mus) {
                    return null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:            return r1;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [mty] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mtl G(boolean r9, boolean r10, defpackage.muc r11) {
        /*
            Method dump skipped, instructions count: 193
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mun.G(boolean, boolean, muc):mtl");
    }

    public void H(Throwable th) {
        L(th);
    }

    public final void I(muf mufVar) {
        boolean z = msy.a;
        if (mufVar == null) {
            K(muu.a);
            return;
        }
        mufVar.dr();
        msi v = mufVar.v(this);
        K(v);
        if (O()) {
            v.dc();
            K(muu.a);
        }
    }

    public final void K(msi msiVar) {
        this.a.c(msiVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:            r0 = defpackage.muo.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:            r1 = r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:            if (r1 == defpackage.muo.b) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:            r0 = h(r0, new defpackage.msm(j(r8)));     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:            if (r0 == defpackage.muo.c) goto L183;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:            if (r1 != defpackage.muo.a) goto L167;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:            r0 = null;        r1 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:            r3 = B();     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:            if ((r3 instanceof defpackage.mum) == false) goto L148;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:            if ((r3 instanceof defpackage.mtz) == false) goto L186;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:            if (r1 != null) goto L152;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008b, code lost:            r1 = j(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:            r4 = (defpackage.mtz) r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0007, code lost:            if (r0 != false) goto L103;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:            if (r4.dd() == false) goto L184;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:            r4 = h(r3, new defpackage.msm(r1));     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:            if (r4 == defpackage.muo.a) goto L191;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:            if (r4 == defpackage.muo.c) goto L193;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:            r1 = r4;     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0009, code lost:            r0 = B();     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:            java.util.Objects.toString(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:            throw new java.lang.IllegalStateException("Cannot happen in ".concat(java.lang.String.valueOf(r3)));     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:            r3 = defpackage.msy.a;        r3 = k(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:            if (r3 == null) goto L194;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:            if (r7.d.d(r4, new defpackage.mum(r3, r1)) == false) goto L195;     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:            if ((r0 instanceof defpackage.mtz) == false) goto L182;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:            p(r3, r1);        r1 = defpackage.muo.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:            r1 = defpackage.muo.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0048, code lost:            monitor-enter(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0049, code lost:            r4 = (defpackage.mum) r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0052, code lost:            if (r4.c() != defpackage.muo.e) goto L129;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0054, code lost:            r1 = defpackage.muo.d;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0056, code lost:            monitor-exit(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0059, code lost:            r5 = r4.g();     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x005d, code lost:            if (r8 != null) goto L134;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x005f, code lost:            if (r5 != false) goto L137;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0061, code lost:            if (r1 != null) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0066, code lost:            r1 = j(r8);     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x006a, code lost:            r4.e(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:            r8 = r4.d();     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:            if ((r0 instanceof defpackage.mum) == false) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0071, code lost:            if (true != r5) goto L140;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:            r0 = r8;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0075, code lost:            monitor-exit(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0076, code lost:            if (r0 == null) goto L144;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0078, code lost:            p(((defpackage.mum) r3).a, r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x007f, code lost:            r1 = defpackage.muo.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0064, code lost:            if (r1 != null) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00dd, code lost:            if (r1 != defpackage.muo.a) goto L170;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e2, code lost:            if (r1 != defpackage.muo.b) goto L173;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00e7, code lost:            if (r1 != defpackage.muo.d) goto L177;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00e9, code lost:            return false;     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00eb, code lost:            a(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00ee, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:            if (((defpackage.mum) r0).h() == false) goto L110;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mun.L(java.lang.Object):boolean");
    }

    public boolean M(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (L(th) && da()) {
            return true;
        }
        return false;
    }

    protected boolean N(Throwable th) {
        return false;
    }

    public final boolean O() {
        if (!(B() instanceof mtz)) {
            return true;
        }
        return false;
    }

    public final boolean P(mum mumVar, msj msjVar, Object obj) {
        while (mkm.aF(msjVar.a, false, new mul(this, mumVar, msjVar, obj), 1) == muu.a) {
            msjVar = F(msjVar);
            if (msjVar == null) {
                return false;
            }
        }
        return true;
    }

    public final void R(Object obj) {
        Object h;
        do {
            h = h(B(), obj);
            if (h == muo.a || h == muo.b) {
                return;
            }
        } while (h == muo.c);
        a(h);
    }

    public String c() {
        return "Job was cancelled";
    }

    public boolean da() {
        return true;
    }

    public boolean db() {
        return false;
    }

    public String dj() {
        return msz.a(this);
    }

    /* renamed from: do */
    public final Object m160do() {
        Object B = B();
        if (!(B instanceof mtz)) {
            if (!(B instanceof msm)) {
                return muo.b(B);
            }
            throw ((msm) B).b;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // defpackage.muf
    public final muf dp() {
        msi E = E();
        if (E != null) {
            return E.c();
        }
        return null;
    }

    @Override // defpackage.muf
    public final boolean dq() {
        Object B = B();
        if (B instanceof msm) {
            return true;
        }
        if ((B instanceof mum) && ((mum) B).g()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.muf
    public final void dr() {
        int g;
        do {
            g = g(B());
            if (g == 0) {
                return;
            }
        } while (g != 1);
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return mjo.x(this, obj, molVar);
    }

    @Override // defpackage.mmz, defpackage.mnb
    public final mmz get(mna mnaVar) {
        return mjo.y(this, mnaVar);
    }

    @Override // defpackage.mmz
    public final mna getKey() {
        return muf.c;
    }

    protected boolean l() {
        return false;
    }

    @Override // defpackage.muf
    public final Object m(mmx mmxVar) {
        Object B;
        do {
            B = B();
            if (!(B instanceof mtz)) {
                mkm.aB(mmxVar.o());
                return mlh.a;
            }
        } while (g(B) < 0);
        mse mseVar = new mse(mjo.w(mmxVar), 1);
        mseVar.z();
        msz.v(mseVar, mkm.aF(this, false, new mux(mseVar), 3));
        Object j = mseVar.j();
        mne mneVar = mne.a;
        if (j != mneVar) {
            j = mlh.a;
        }
        if (j == mneVar) {
            return j;
        }
        return mlh.a;
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        return mjo.z(this, mnaVar);
    }

    @Override // defpackage.muf
    public final CancellationException n() {
        Object B = B();
        if (B instanceof mum) {
            Throwable d = ((mum) B).d();
            if (d != null) {
                return D(d, String.valueOf(msz.a(this)).concat(" is cancelling"));
            }
            toString();
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        }
        if (!(B instanceof mtz)) {
            if (B instanceof msm) {
                return D(((msm) B).b, null);
            }
            return new mug(String.valueOf(msz.a(this)).concat(" has completed normally"), null, this);
        }
        toString();
        throw new IllegalStateException("Job is still new or active: ".concat(toString()));
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        return mjo.A(this, mnbVar);
    }

    @Override // defpackage.muf
    public final mtl q(boolean z, boolean z2, moh mohVar) {
        return G(z, z2, new mub(mohVar));
    }

    @Override // defpackage.muf
    public void s(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new mug(c(), null, this);
        }
        H(cancellationException);
    }

    @Override // defpackage.muf
    public final boolean t() {
        Object B = B();
        if ((B instanceof mtz) && ((mtz) B).dd()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return (dj() + "{" + V(B()) + "}") + "@" + msz.b(this);
    }

    @Override // defpackage.muf
    public final msi v(mun munVar) {
        return (msi) mkm.aF(this, true, new msj(munVar), 2);
    }

    @Override // defpackage.muf
    public final void w(moh mohVar) {
        G(false, true, new mub(mohVar));
    }

    public final Object y(mmx mmxVar) {
        Object B;
        do {
            B = B();
            if (!(B instanceof mtz)) {
                if (B instanceof msm) {
                    Throwable th = ((msm) B).b;
                    if (msy.b) {
                        if (!(mmxVar instanceof mnm)) {
                            throw th;
                        }
                        throw nbi.a(th, (mnm) mmxVar);
                    }
                    throw th;
                }
                return muo.b(B);
            }
        } while (g(B) < 0);
        muk mukVar = new muk(mjo.w(mmxVar), this);
        mukVar.z();
        msz.v(mukVar, mkm.aF(this, false, new muw(mukVar), 3));
        Object j = mukVar.j();
        if (j == mne.a) {
            mmxVar.getClass();
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6 A[Catch: all -> 0x013a, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:11:0x0037, B:13:0x003e, B:15:0x0043, B:17:0x0049, B:18:0x004c, B:20:0x0057, B:22:0x005d, B:25:0x00ad, B:28:0x00b5, B:31:0x00cc, B:32:0x00d0, B:34:0x00d6, B:36:0x00e0, B:41:0x00e8, B:44:0x00ec, B:47:0x00f2, B:55:0x00c8, B:69:0x0068, B:70:0x006c, B:72:0x0072, B:76:0x007f, B:78:0x0083, B:80:0x008d, B:81:0x0091, B:83:0x0097, B:86:0x00a0, B:90:0x00a5, B:101:0x0023, B:103:0x0027, B:104:0x0031, B:106:0x0035, B:107:0x0127, B:108:0x0139), top: B:7:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[Catch: all -> 0x013a, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:11:0x0037, B:13:0x003e, B:15:0x0043, B:17:0x0049, B:18:0x004c, B:20:0x0057, B:22:0x005d, B:25:0x00ad, B:28:0x00b5, B:31:0x00cc, B:32:0x00d0, B:34:0x00d6, B:36:0x00e0, B:41:0x00e8, B:44:0x00ec, B:47:0x00f2, B:55:0x00c8, B:69:0x0068, B:70:0x006c, B:72:0x0072, B:76:0x007f, B:78:0x0083, B:80:0x008d, B:81:0x0091, B:83:0x0097, B:86:0x00a0, B:90:0x00a5, B:101:0x0023, B:103:0x0027, B:104:0x0031, B:106:0x0035, B:107:0x0127, B:108:0x0139), top: B:7:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(defpackage.mum r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mun.z(mum, java.lang.Object):java.lang.Object");
    }

    protected void J() {
    }

    public void a(Object obj) {
    }

    protected void dm(Object obj) {
    }

    public void f(Throwable th) {
        throw th;
    }
}
