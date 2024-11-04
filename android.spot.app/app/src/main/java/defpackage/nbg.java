package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nbg extends mrt implements mnm {
    public final mmx e;

    public nbg(mnb mnbVar, mmx mmxVar) {
        super(mnbVar, true);
        this.e = mmxVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mun
    public void a(Object obj) {
        mmx mmxVar = this.e;
        nao.a(mjo.w(mmxVar), msz.s(obj, mmxVar));
    }

    @Override // defpackage.mnm
    public final mnm bO() {
        mmx mmxVar = this.e;
        if (mmxVar instanceof mnm) {
            return (mnm) mmxVar;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.mrt
    public void dk(Object obj) {
        mmx mmxVar = this.e;
        mmxVar.p(msz.s(obj, mmxVar));
    }

    @Override // defpackage.mun
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.mnm
    public final void bP() {
    }
}
