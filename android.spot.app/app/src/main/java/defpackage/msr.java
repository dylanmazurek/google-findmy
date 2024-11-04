package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class msr extends mpe implements mol {
    final /* synthetic */ mpn a;
    final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msr(mpn mpnVar, boolean z) {
        super(2);
        this.a = mpnVar;
        this.b = z;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        msp mspVar;
        mnb mnbVar = (mnb) obj;
        mmz mmzVar = (mmz) obj2;
        if (!(mmzVar instanceof msp)) {
            return mnbVar.plus(mmzVar);
        }
        if (((mnb) this.a.a).get(mmzVar.getKey()) == null) {
            if (this.b) {
                mspVar = ((msp) mmzVar).a();
            } else {
                mspVar = (msp) mmzVar;
            }
            return mnbVar.plus(mspVar);
        }
        mpn mpnVar = this.a;
        mpnVar.a = ((mnb) mpnVar.a).minusKey(mmzVar.getKey());
        return mnbVar.plus(((msp) mmzVar).b());
    }
}
