package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ov implements nv {
    final /* synthetic */ ox a;
    private final op b;

    public ov(ox oxVar, op opVar) {
        this.a = oxVar;
        this.b = opVar;
    }

    @Override // defpackage.nv
    public final void b() {
        this.a.a.remove(this.b);
        if (amr.i(this.a.b, this.b)) {
            this.b.a();
            this.a.b = null;
        }
        this.b.g(this);
        mnw mnwVar = this.b.c;
        if (mnwVar != null) {
            mnwVar.a();
        }
        this.b.c = null;
    }
}
