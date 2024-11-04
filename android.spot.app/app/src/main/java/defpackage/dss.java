package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class dss implements dsw {
    private dsi a;

    public dss() {
        if (dtq.l(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
        } else {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
    }

    @Override // defpackage.dsw
    public final dsi c() {
        return this.a;
    }

    @Override // defpackage.dsw
    public final void d(dsi dsiVar) {
        this.a = dsiVar;
    }

    @Override // defpackage.dsw
    public final void e(dso dsoVar) {
        dsoVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.drk
    public final void h() {
    }

    @Override // defpackage.drk
    public final void i() {
    }

    @Override // defpackage.drk
    public final void j() {
    }

    @Override // defpackage.dsw
    public final void l() {
    }

    @Override // defpackage.dsw
    public final void m() {
    }

    @Override // defpackage.dsw
    public final void f(dso dsoVar) {
    }
}
