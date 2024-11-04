package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjd extends mnp implements mol {
    int a;
    final /* synthetic */ cih b;
    final /* synthetic */ String[] c;
    final /* synthetic */ moh d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjd(cih cihVar, String[] strArr, moh mohVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = cihVar;
        this.c = strArr;
        this.d = mohVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjd) c((mww) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            cjc cjcVar = new cjc(this.b, (mww) this.e, this.c, this.d, null);
            this.a = 1;
            if (msz.l(cjcVar, this) == mneVar) {
                return mneVar;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        cjd cjdVar = new cjd(this.b, this.c, this.d, mmxVar);
        cjdVar.e = obj;
        return cjdVar;
    }
}
