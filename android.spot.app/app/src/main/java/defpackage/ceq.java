package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceq extends mnp implements mol {
    int a;
    final /* synthetic */ Object b;
    private /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceq(List list, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = list;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return ((ceq) c((msw) obj, (mmx) obj2)).b(mlh.a);
            }
            return ((ceq) c((cat) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((ceq) c((elo) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mwv] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, mol] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                mne mneVar = mne.a;
                int i2 = this.a;
                mjo.o(obj);
                if (i2 == 0) {
                    msw mswVar = (msw) this.c;
                    ?? r2 = this.b;
                    this.a = 1;
                    if (r2.a(mswVar, this) == mneVar) {
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
                cat catVar = (cat) this.c;
                ?? r22 = this.b;
                brp brpVar = caq.a;
                this.a = 1;
                if (brpVar.b(r22, catVar, this) == mneVar2) {
                    return mneVar2;
                }
            }
            return mlh.a;
        }
        mne mneVar3 = mne.a;
        if (this.a != 0) {
            mjo.o(obj);
        } else {
            mjo.o(obj);
            elo eloVar = (elo) this.c;
            ?? r23 = this.b;
            cbb cbbVar = new cbb(eloVar, 2);
            this.a = 1;
            if (r23.a(cbbVar, this) == mneVar3) {
                return mneVar3;
            }
        }
        return mlh.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, mwv] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                ceq ceqVar = new ceq((mol) this.b, mmxVar, 2);
                ceqVar.c = obj;
                return ceqVar;
            }
            ceq ceqVar2 = new ceq((List) this.b, mmxVar, 1);
            ceqVar2.c = obj;
            return ceqVar2;
        }
        ceq ceqVar3 = new ceq((mwv) this.b, mmxVar, 0);
        ceqVar3.c = obj;
        return ceqVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceq(mol molVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = molVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceq(mwv mwvVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = mwvVar;
    }
}
