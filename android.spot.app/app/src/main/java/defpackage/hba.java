package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hba implements cem {
    public static final String a = "hba";
    public final hbd b;
    private final haz c;
    private final hjy d;
    private final njz e;

    public hba(hbd hbdVar, haz hazVar, hjy hjyVar) {
        hbdVar.getClass();
        this.b = hbdVar;
        this.c = hazVar == null ? new haz() { // from class: hax
            @Override // defpackage.haz
            public final jyz a(jis jisVar) {
                return ivc.E(jisVar);
            }
        } : hazVar;
        this.d = hjyVar;
        this.e = new njz(this);
    }

    @Override // defpackage.cem
    public final void cT(cfc cfcVar) {
        this.d.e(this.e);
        h();
    }

    @Override // defpackage.cem
    public final void f() {
        g();
    }

    public final void g() {
        this.d.f(this.e);
    }

    public final void h() {
        ivc.N(jwu.h(jwu.g(jwb.g(jys.q(this.d.a()), Exception.class, new gfa(8), jxv.a), new gfa(9), jxv.a), new eji(this.c, 17), jxv.a), new dup(this, 8), jxv.a);
    }

    @Override // defpackage.cem
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.cem
    public final /* synthetic */ void e() {
    }
}
