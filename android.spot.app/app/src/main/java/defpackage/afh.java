package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class afh extends mnp implements mol {
    int a;
    final /* synthetic */ mom b;
    final /* synthetic */ adk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afh(mom momVar, adk adkVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = momVar;
        this.c = adkVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afh) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            msw mswVar = (msw) this.d;
            mom momVar = this.b;
            adk adkVar = this.c;
            this.a = 1;
            if (momVar.a(mswVar, adkVar, this) == mneVar) {
                return mneVar;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        afh afhVar = new afh(this.b, this.c, mmxVar);
        afhVar.d = obj;
        return afhVar;
    }
}
