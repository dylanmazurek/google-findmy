package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nan extends mth implements mnm, mmx {
    public final mst a;
    public final mmx b;
    public Object c;
    public final Object d;
    public final mrr f;

    public nan(mst mstVar, mmx mmxVar) {
        super(-1);
        this.a = mstVar;
        this.b = mmxVar;
        this.c = nao.a;
        this.d = nbl.a(o());
        this.f = new mrr(null, mrs.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mmx, mnm] */
    @Override // defpackage.mnm
    public final mnm bO() {
        return this.b;
    }

    public final void c(mnb mnbVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.f(mnbVar, this);
    }

    @Override // defpackage.mth
    public final Object m() {
        Object obj = this.c;
        boolean z = msy.a;
        this.c = nao.a;
        return obj;
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return this.b.o();
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        mmx mmxVar = this.b;
        mst mstVar = this.a;
        mnb o = mmxVar.o();
        Object t = msz.t(obj);
        if (mstVar.cp(o)) {
            this.c = t;
            this.e = 0;
            this.a.a(o, this);
            return;
        }
        boolean z = msy.a;
        ThreadLocal threadLocal = mvc.a;
        mto a = mvc.a();
        if (a.o()) {
            this.c = t;
            this.e = 0;
            a.m(this);
            return;
        }
        a.n(true);
        try {
            mnb o2 = o();
            Object b = nbl.b(o2, this.d);
            try {
                this.b.p(obj);
                do {
                } while (a.q());
            } finally {
                nbl.c(o2, b);
            }
        } catch (Throwable th) {
            try {
                G(th, null);
            } finally {
                a.l(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + msz.c(this.b) + "]";
    }

    @Override // defpackage.mth
    public final void w(Object obj, Throwable th) {
        if (!(obj instanceof msn)) {
            return;
        }
        moh mohVar = ((msn) obj).a;
        throw null;
    }

    @Override // defpackage.mnm
    public final void bP() {
    }

    @Override // defpackage.mth
    public final mmx s() {
        return this;
    }
}
