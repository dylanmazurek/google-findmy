package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzi extends mnp implements mol {
    int a;
    final /* synthetic */ mww b;
    final /* synthetic */ mzd c;
    private /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzi(mww mwwVar, mzd mzdVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.b = mwwVar;
        this.c = mzdVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((mzi) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((mzi) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        if (this.e != 0) {
            mne mneVar = mne.a;
            int i = this.a;
            mjo.o(obj);
            if (i == 0) {
                msw mswVar = (msw) this.d;
                mww mwwVar = this.b;
                mzd mzdVar = this.c;
                myn mynVar = new myn(mzdVar, (mmx) null, 2);
                int i2 = mzdVar.b;
                int i3 = mzdVar.c;
                mnb mnbVar = mzdVar.a;
                mwi mwiVar = new mwi(mss.b(mswVar, mnbVar), moz.at(i2, i3, 4));
                msz.d(3, mynVar, mwiVar, mwiVar);
                this.a = 1;
                if (moz.an(mwwVar, mwiVar, this) == mneVar) {
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
            msw mswVar2 = (msw) this.d;
            mpn mpnVar = new mpn();
            mzj mzjVar = (mzj) this.c;
            mzh mzhVar = new mzh(mpnVar, mswVar2, mzjVar, this.b);
            this.a = 1;
            if (mzjVar.d.a(mzhVar, this) == mneVar2) {
                return mneVar2;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.e != 0) {
            mzi mziVar = new mzi(this.b, this.c, mmxVar, 1);
            mziVar.d = obj;
            return mziVar;
        }
        mzi mziVar2 = new mzi((mzj) this.c, this.b, mmxVar, 0);
        mziVar2.d = obj;
        return mziVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzi(mzj mzjVar, mww mwwVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.c = mzjVar;
        this.b = mwwVar;
    }
}
