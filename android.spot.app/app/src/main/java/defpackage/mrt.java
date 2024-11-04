package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mrt extends mun implements muf, mmx, msw, mtc {
    public final mnb a;

    public mrt(mnb mnbVar, boolean z) {
        super(z);
        I((muf) mnbVar.get(muf.c));
        this.a = mnbVar.plus(this);
    }

    @Override // defpackage.msw
    public final mnb b() {
        return this.a;
    }

    @Override // defpackage.mun
    public final String c() {
        return String.valueOf(msz.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.mun
    public String dj() {
        String str = null;
        if (msy.a) {
            mnb mnbVar = this.a;
            msu msuVar = (msu) mnbVar.get(msu.b);
            if (msuVar != null) {
                if (((msv) mnbVar.get(msv.a)) == null) {
                    str = "coroutine#" + msuVar.a;
                } else {
                    throw null;
                }
            }
        }
        if (str == null) {
            return msz.a(this);
        }
        return "\"" + str + "\":" + msz.a(this);
    }

    public void dk(Object obj) {
        a(obj);
    }

    @Override // defpackage.mun
    protected final void dm(Object obj) {
        if (obj instanceof msm) {
            msm msmVar = (msm) obj;
            g(msmVar.b, msmVar.c.b());
        } else {
            dl(obj);
        }
    }

    @Override // defpackage.mtc
    public final Object dn(mmx mmxVar) {
        return y(mmxVar);
    }

    @Override // defpackage.mun
    public final void f(Throwable th) {
        msz.r(this.a, th);
    }

    @Override // defpackage.mtc
    public final Object k() {
        return m160do();
    }

    @Override // defpackage.mmx
    public final mnb o() {
        return this.a;
    }

    @Override // defpackage.mmx
    public final void p(Object obj) {
        Object C = C(msz.t(obj));
        if (C == muo.b) {
            return;
        }
        dk(C);
    }

    protected void dl(Object obj) {
    }

    protected void g(Throwable th, boolean z) {
    }
}
