package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxv extends mnp implements mol {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ mwv c;
    final /* synthetic */ mxy d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxv(mwv mwvVar, mxy mxyVar, Object obj, mmx mmxVar) {
        super(2, mmxVar);
        this.c = mwvVar;
        this.d = mxyVar;
        this.e = obj;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mxv) c((myh) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            int ordinal = ((myh) this.b).ordinal();
            if (ordinal != 0) {
                if (ordinal == 2) {
                    Object obj2 = this.e;
                    if (obj2 == myf.a) {
                        this.d.du();
                    } else {
                        this.d.d(obj2);
                    }
                }
            } else {
                mwv mwvVar = this.c;
                mxy mxyVar = this.d;
                this.a = 1;
                if (mwvVar.a(mxyVar, this) == mneVar) {
                    return mneVar;
                }
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        mxv mxvVar = new mxv(this.c, this.d, this.e, mmxVar);
        mxvVar.b = obj;
        return mxvVar;
    }
}
