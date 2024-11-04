package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxa extends mnp implements mol {
    int a;
    final /* synthetic */ mwv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxa(mwv mwvVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = mwvVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mxa) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            mwv mwvVar = this.b;
            this.a = 1;
            if (moz.am(mwvVar, this) == mneVar) {
                return mneVar;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new mxa(this.b, mmxVar);
    }
}
