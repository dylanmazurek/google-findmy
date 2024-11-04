package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class axx extends aow {
    public final int c = azr.b(this);
    public aow d;

    @Override // defpackage.aow
    public final void l() {
        super.l();
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.o) {
            aowVar.s(this.q);
            if (!aowVar.t) {
                aowVar.l();
            }
        }
    }

    @Override // defpackage.aow
    public final void m() {
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.o) {
            aowVar.m();
        }
        super.m();
    }

    @Override // defpackage.aow
    public final void o() {
        super.o();
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.o) {
            aowVar.o();
        }
    }

    @Override // defpackage.aow
    public final void p() {
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.o) {
            aowVar.p();
        }
        super.p();
    }

    @Override // defpackage.aow
    public final void q() {
        super.q();
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.o) {
            aowVar.q();
        }
    }

    @Override // defpackage.aow
    public final void r(aow aowVar) {
        this.k = aowVar;
        for (aow aowVar2 = this.d; aowVar2 != null; aowVar2 = aowVar2.o) {
            aowVar2.r(aowVar);
        }
    }

    @Override // defpackage.aow
    public final void s(azq azqVar) {
        this.q = azqVar;
        for (aow aowVar = this.d; aowVar != null; aowVar = aowVar.o) {
            aowVar.s(azqVar);
        }
    }
}
