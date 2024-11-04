package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hno implements hnl {
    final /* synthetic */ jfe a;
    final /* synthetic */ hnq b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public hno(hnq hnqVar, jfe jfeVar, Object obj, int i) {
        this.d = i;
        this.a = jfeVar;
        this.c = obj;
        this.b = hnqVar;
    }

    private final void a() {
        hnj hnjVar = this.b.b;
        if (hnjVar != null) {
            ((hny) this.c).g.remove(hnjVar);
            this.b.b = null;
        }
    }

    private final void b() {
        hnr hnrVar = this.b.a;
        if (hnrVar != null) {
            ((hnu) this.c).b(hnrVar);
            this.b.a = null;
        }
    }

    @Override // defpackage.hnl
    public final void i(hmq hmqVar) {
        if (this.d != 0) {
            if (((Boolean) this.a.a()).booleanValue()) {
                b();
                return;
            } else {
                this.b.c.k(hmqVar);
                return;
            }
        }
        if (((Boolean) this.a.a()).booleanValue()) {
            this.b.c.k(hmqVar);
        } else {
            a();
        }
    }

    @Override // defpackage.hnl
    public final void j(hmq hmqVar) {
        if (this.d != 0) {
            if (((Boolean) this.a.a()).booleanValue()) {
                b();
                return;
            } else {
                this.b.c.l(hmqVar);
                return;
            }
        }
        if (((Boolean) this.a.a()).booleanValue()) {
            this.b.c.l(hmqVar);
        } else {
            a();
        }
    }
}
