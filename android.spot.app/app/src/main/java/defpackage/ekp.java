package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekp extends ehw {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/SpotDeviceTypeHandler");
    public final evy d;
    public jer e = jdl.a;
    public final esa f;
    private final ejt g;
    private final fgp h;
    private final fop i;

    public ekp(evy evyVar, ewg ewgVar, ejt ejtVar, fgp fgpVar, fop fopVar, esa esaVar) {
        this.d = evyVar;
        this.g = ejtVar;
        this.h = fgpVar;
        this.i = fopVar;
        this.f = esaVar;
        ewgVar.g(new dym(this, 17, null));
    }

    @Override // defpackage.ehw, defpackage.edc
    public final void b(String str, dfy dfyVar) {
        this.g.b(str, dfyVar);
    }

    @Override // defpackage.ehw, defpackage.edc
    public final void c(String str) {
        this.g.c(str);
    }

    @Override // defpackage.ehw, defpackage.edc
    public final void d(lqy lqyVar) {
        this.g.d(lqyVar);
    }

    @Override // defpackage.ehw
    public final boolean e() {
        hwx.U(this.e.g());
        return ((Boolean) this.e.c()).booleanValue();
    }

    @Override // defpackage.ehw
    public final jyz f() {
        if (this.d.b() == null) {
            this.e = jer.i(false);
            return jyv.a;
        }
        return jwb.g(jwu.g(jys.q(fzo.b(this.h.a(this.i, new fhu[0]))), new dyv(this, 15), jxv.a), Throwable.class, new dyv(this, 16), jxv.a);
    }
}
