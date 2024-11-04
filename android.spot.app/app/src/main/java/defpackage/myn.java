package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class myn extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myn(mol molVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = molVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return ((myn) c((mwi) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((myn) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((myn) c((mww) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, mol] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                mne mneVar = mne.a;
                int i2 = this.a;
                mjo.o(obj);
                if (i2 == 0) {
                    mwi mwiVar = (mwi) this.c;
                    Object obj2 = this.b;
                    this.a = 1;
                    if (((mzd) obj2).b(mwiVar, this) == mneVar) {
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
                msw mswVar = (msw) this.c;
                ?? r2 = this.b;
                this.a = 1;
                obj = r2.a(mswVar, this);
                if (obj == mneVar2) {
                    return mneVar2;
                }
            }
            return obj;
        }
        mne mneVar3 = mne.a;
        if (this.a == 0) {
            mjo.o(obj);
            mww mwwVar = (mww) this.c;
            mpk mpkVar = new mpk();
            Object obj3 = this.b;
            mym mymVar = new mym(mpkVar, mwwVar);
            this.a = 1;
            if (mye.f((mye) obj3, mymVar, this) == mneVar3) {
                return mneVar3;
            }
        } else {
            mjo.o(obj);
        }
        throw new mks();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [mys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mol] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                myn mynVar = new myn((mzd) this.b, mmxVar, 2);
                mynVar.c = obj;
                return mynVar;
            }
            myn mynVar2 = new myn((mol) this.b, mmxVar, 1);
            mynVar2.c = obj;
            return mynVar2;
        }
        myn mynVar3 = new myn((mys) this.b, mmxVar, 0);
        mynVar3.c = obj;
        return mynVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myn(mys mysVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = mysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myn(mzd mzdVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = mzdVar;
    }
}
