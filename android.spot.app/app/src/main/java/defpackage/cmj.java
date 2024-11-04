package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmj extends cme {
    final cmk a;

    public cmj(cmk cmkVar) {
        this.a = cmkVar;
    }

    @Override // defpackage.cme, defpackage.cma
    public final void b(cmd cmdVar) {
        cmk cmkVar = this.a;
        int i = cmkVar.x - 1;
        cmkVar.x = i;
        if (i == 0) {
            cmkVar.y = false;
            cmkVar.p();
        }
        cmdVar.B(this);
    }

    @Override // defpackage.cme, defpackage.cma
    public final void g() {
        cmk cmkVar = this.a;
        if (!cmkVar.y) {
            cmkVar.v();
            this.a.y = true;
        }
    }
}
