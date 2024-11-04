package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfi extends cfj implements cfa {
    final cfc a;
    final /* synthetic */ cfk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfi(cfk cfkVar, cfc cfcVar, cfo cfoVar) {
        super(cfkVar, cfoVar);
        this.b = cfkVar;
        this.a = cfcVar;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        cew cewVar = this.a.N().b;
        if (cewVar != cew.DESTROYED) {
            cew cewVar2 = null;
            while (cewVar2 != cewVar) {
                d(cq());
                cewVar2 = cewVar;
                cewVar = this.a.N().b;
            }
            return;
        }
        this.b.j(this.c);
    }

    @Override // defpackage.cfj
    public final void b() {
        this.a.N().c(this);
    }

    @Override // defpackage.cfj
    public final boolean c(cfc cfcVar) {
        if (this.a == cfcVar) {
            return true;
        }
        return false;
    }

    @Override // defpackage.cfj
    public final boolean cq() {
        return this.a.N().b.a(cew.STARTED);
    }
}
