package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjo extends mnp implements mol {
    int a;
    final /* synthetic */ cih b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ moh e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjo(cih cihVar, boolean z, boolean z2, moh mohVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = cihVar;
        this.c = z;
        this.d = z2;
        this.e = mohVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjo) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            cih cihVar = this.b;
            cjn cjnVar = new cjn(this.d, this.c, cihVar, null, this.e);
            this.a = 1;
            obj = cihVar.u(cjnVar, this);
            if (obj == mneVar) {
                return mneVar;
            }
        }
        return obj;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new cjo(this.b, this.c, this.d, this.e, mmxVar);
    }
}
