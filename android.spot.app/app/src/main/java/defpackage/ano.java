package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ano extends aoe {
    public ajc a;
    public int b;
    public int c;

    public ano(ajc ajcVar) {
        this.a = ajcVar;
    }

    @Override // defpackage.aoe
    public final aoe a() {
        return new ano(this.a);
    }

    @Override // defpackage.aoe
    public final void b(aoe aoeVar) {
        synchronized (ans.a) {
            aoeVar.getClass();
            ano anoVar = (ano) aoeVar;
            this.a = anoVar.a;
            this.b = anoVar.b;
            this.c = anoVar.c;
        }
    }
}
