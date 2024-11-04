package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fp extends bxb {
    final /* synthetic */ fq a;
    private boolean b = false;
    private int c = 0;

    public fp(fq fqVar) {
        this.a = fqVar;
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            bxa bxaVar = this.a.b;
            if (bxaVar != null) {
                bxaVar.a();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void b() {
        if (!this.b) {
            this.b = true;
            bxa bxaVar = this.a.b;
            if (bxaVar != null) {
                bxaVar.b();
            }
        }
    }
}
