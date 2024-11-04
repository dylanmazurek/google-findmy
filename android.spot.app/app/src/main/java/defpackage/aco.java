package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aco implements afq {
    private final moh a;
    private acp b;

    public aco(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.afq
    public final void c() {
        this.b = (acp) this.a.a(act.a);
    }

    @Override // defpackage.afq
    public final void i() {
        acp acpVar = this.b;
        if (acpVar != null) {
            acpVar.a();
        }
        this.b = null;
    }

    @Override // defpackage.afq
    public final void h() {
    }
}
