package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtl extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtl(dgq dgqVar, dhb dhbVar, dhd dhdVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.c = dgqVar;
        this.d = dhbVar;
        this.b = dhdVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((gtl) c((mwi) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((gtl) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        if (this.f != 0) {
            mne mneVar = mne.a;
            int i = this.a;
            mjo.o(obj);
            if (i == 0) {
                mwi mwiVar = (mwi) this.e;
                dib dibVar = new dib(mwiVar, (dgq) this.c);
                Object obj2 = this.d;
                ((dhb) obj2).j(dibVar, dibVar, (dsf) obj2, new pt(2));
                aqg aqgVar = new aqg(this.b, dibVar, 11, null);
                this.a = 1;
                if (moz.ar(mwiVar, aqgVar, this) == mneVar) {
                    return mneVar;
                }
            }
            return mlh.a;
        }
        mne mneVar2 = mne.a;
        if (this.a != 0) {
            mjo.o(obj);
        } else {
            mjo.o(obj);
            msw mswVar = (msw) this.e;
            Object obj3 = this.b;
            Object obj4 = this.c;
            Object obj5 = this.d;
            this.a = 1;
            gny gnyVar = (gny) obj5;
            obj = gtm.e((gtm) obj3, mswVar, (lgp) obj4, true, gnyVar, this);
            if (obj == mneVar2) {
                return mneVar2;
            }
        }
        return obj;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.f != 0) {
            Object obj2 = this.c;
            dgq dgqVar = (dgq) obj2;
            gtl gtlVar = new gtl(dgqVar, (dhb) this.d, (dhd) this.b, mmxVar, 1);
            gtlVar.e = obj;
            return gtlVar;
        }
        Object obj3 = this.b;
        gtm gtmVar = (gtm) obj3;
        gtl gtlVar2 = new gtl(gtmVar, (lgp) this.c, (gny) this.d, mmxVar, 0);
        gtlVar2.e = obj;
        return gtlVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtl(gtm gtmVar, lgp lgpVar, gny gnyVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.f = i;
        this.b = gtmVar;
        this.c = lgpVar;
        this.d = gnyVar;
    }
}
