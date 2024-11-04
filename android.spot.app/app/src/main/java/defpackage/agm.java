package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agm extends mnp implements mol {
    int a;
    final /* synthetic */ mol b;
    final /* synthetic */ adt c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agm(mol molVar, adt adtVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = molVar;
        this.c = adtVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agm) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            msw mswVar = (msw) this.d;
            mol molVar = this.b;
            aeo aeoVar = new aeo(this.c, mswVar.b());
            this.a = 1;
            if (molVar.a(aeoVar, this) == mneVar) {
                return mneVar;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        agm agmVar = new agm(this.b, this.c, mmxVar);
        agmVar.d = obj;
        return agmVar;
    }
}
