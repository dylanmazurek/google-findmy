package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ail implements aew {
    final /* synthetic */ ach a;
    final /* synthetic */ ado b;

    public ail(ach achVar, ado adoVar) {
        this.a = achVar;
        this.b = adoVar;
    }

    @Override // defpackage.aew
    public final ada a(aeu aeuVar, Object obj) {
        aew aewVar;
        ada adaVar;
        ach achVar = this.a;
        if (achVar instanceof aew) {
            aewVar = (aew) achVar;
        } else {
            aewVar = null;
        }
        if (aewVar == null || (adaVar = aewVar.a(aeuVar, obj)) == null) {
            adaVar = ada.IGNORED;
        }
        if (adaVar == ada.IGNORED) {
            ado adoVar = this.b;
            adoVar.f = mkm.ad(adoVar.f, new mkw(aeuVar, obj));
            return ada.SCHEDULED;
        }
        return adaVar;
    }

    @Override // defpackage.aew
    public final void t() {
    }

    @Override // defpackage.aew
    public final void n(Object obj) {
    }
}
