package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cft extends mnp implements mol {
    int a;
    final /* synthetic */ cex b;
    final /* synthetic */ cew c;
    final /* synthetic */ mol d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cft(cex cexVar, cew cewVar, mol molVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = cexVar;
        this.c = cewVar;
        this.d = molVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cft) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            msw mswVar = (msw) this.e;
            mst mstVar = mtj.a;
            mur h = nbc.a.h();
            cfs cfsVar = new cfs(this.b, this.c, mswVar, this.d, null);
            this.a = 1;
            if (mpp.l(h, cfsVar, this) == mneVar) {
                return mneVar;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        cft cftVar = new cft(this.b, this.c, this.d, mmxVar);
        cftVar.e = obj;
        return cftVar;
    }
}
