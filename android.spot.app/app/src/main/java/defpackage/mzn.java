package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzn extends mnp implements mol {
    int a;
    final /* synthetic */ mwv[] b;
    final /* synthetic */ int c;
    final /* synthetic */ AtomicInteger d;
    final /* synthetic */ mvy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzn(mwv[] mwvVarArr, int i, AtomicInteger atomicInteger, mvy mvyVar, mmx mmxVar) {
        super(2, mmxVar);
        this.b = mwvVarArr;
        this.c = i;
        this.d = atomicInteger;
        this.e = mvyVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mzn) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        AtomicInteger atomicInteger;
        mne mneVar = mne.a;
        try {
            if (this.a != 0) {
                mjo.o(obj);
            } else {
                mjo.o(obj);
                mwv[] mwvVarArr = this.b;
                int i = this.c;
                mwv mwvVar = mwvVarArr[i];
                mzm mzmVar = new mzm(this.e, i);
                this.a = 1;
                if (mwvVar.a(mzmVar, this) == mneVar) {
                    return mneVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.e.u(null);
            }
            return mlh.a;
        } finally {
            if (this.d.decrementAndGet() == 0) {
                this.e.u(null);
            }
        }
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new mzn(this.b, this.c, this.d, this.e, mmxVar);
    }
}
