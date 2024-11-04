package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cto implements mwv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cto(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, mwv] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object, mwv] */
    @Override // defpackage.mwv
    public final Object a(mww mwwVar, mmx mmxVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object a = this.a.a(new cbb(mwwVar, 3), mmxVar);
                if (a == mne.a) {
                    return a;
                }
                return mlh.a;
            }
            Object a2 = this.a.a(new cbb(mwwVar, 0), mmxVar);
            if (a2 == mne.a) {
                return a2;
            }
            return mlh.a;
        }
        Object obj = this.a;
        mzo mzoVar = new mzo((mwv[]) obj, new ctm(obj, 0), new ctn(null), mwwVar, null);
        mzq mzqVar = new mzq(mmxVar.o(), mmxVar);
        Object u = mpp.u(mzqVar, mzqVar, mzoVar);
        mne mneVar = mne.a;
        if (u != mneVar) {
            u = mlh.a;
        }
        if (u == mneVar) {
            return u;
        }
        return mlh.a;
    }
}
