package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hb implements bxa {
    int a;
    final /* synthetic */ hc b;
    private boolean c = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public hb(hc hcVar) {
        this.b = hcVar;
    }

    @Override // defpackage.bxa
    public final void a() {
        if (this.c) {
            return;
        }
        hc hcVar = this.b;
        hcVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.bxa
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.bxa
    public final void c() {
        this.c = true;
    }

    public final void d(bet betVar, int i) {
        this.b.f = betVar;
        this.a = i;
    }
}
