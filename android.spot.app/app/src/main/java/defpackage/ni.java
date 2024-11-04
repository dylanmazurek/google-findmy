package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ni extends bxb {
    final /* synthetic */ int a;
    final /* synthetic */ nj b;
    private boolean c = false;

    public ni(nj njVar, int i) {
        this.b = njVar;
        this.a = i;
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void a() {
        if (!this.c) {
            nj njVar = this.b;
            njVar.a.setVisibility(this.a);
        }
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.bxb, defpackage.bxa
    public final void c() {
        this.c = true;
    }
}
