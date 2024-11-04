package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mth extends nbv {
    public int e;

    public mth(int i) {
        super(0L, nby.f);
        this.e = i;
    }

    public final void G(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            mjo.l(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        msz.r(s().o(), new msx(a.af(this, "Fatal exception in coroutines machinery for ", ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"), th));
    }

    public abstract Object m();

    public Throwable r(Object obj) {
        msm msmVar;
        if (obj instanceof msm) {
            msmVar = (msm) obj;
        } else {
            msmVar = null;
        }
        if (msmVar == null) {
            return null;
        }
        return msmVar.b;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [mmx, mnm] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        Object n;
        mvh mvhVar;
        muf mufVar;
        boolean z = msy.a;
        try {
            nan nanVar = (nan) s();
            ?? r1 = nanVar.b;
            Object obj = nanVar.d;
            mnb o = r1.o();
            Object b = nbl.b(o, obj);
            th = null;
            if (b != nbl.a) {
                mvhVar = mss.c(r1, o, b);
            } else {
                mvhVar = null;
            }
            try {
                mnb o2 = r1.o();
                Object m = m();
                Throwable r = r(m);
                if (r == null && msz.g(this.e)) {
                    mufVar = (muf) o2.get(muf.c);
                } else {
                    mufVar = null;
                }
                if (mufVar != null && !mufVar.t()) {
                    Throwable n2 = mufVar.n();
                    w(m, n2);
                    if (msy.b) {
                        n2 = nbi.a(n2, r1);
                    }
                    r1.p(mjo.n(n2));
                } else if (r != null) {
                    r1.p(mjo.n(r));
                } else {
                    r1.p(l(m));
                }
                if (mvhVar == null || mvhVar.T()) {
                    nbl.c(o, b);
                }
            } catch (Throwable th2) {
                if (mvhVar == null || mvhVar.T()) {
                    nbl.c(o, b);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            n = mlh.a;
        } catch (Throwable th4) {
            n = mjo.n(th4);
        }
        G(th, mky.a(n));
    }

    public abstract mmx s();

    public void w(Object obj, Throwable th) {
        throw null;
    }

    public Object l(Object obj) {
        return obj;
    }
}
