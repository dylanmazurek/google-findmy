package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mxu extends mnp implements mol {
    /* synthetic */ int a;

    public mxu(mmx mmxVar) {
        super(2, mmxVar);
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((mxu) c(Integer.valueOf(((Number) obj).intValue()), (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        boolean z;
        mjo.o(obj);
        if (this.a > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        mxu mxuVar = new mxu(mmxVar);
        mxuVar.a = ((Number) obj).intValue();
        return mxuVar;
    }
}
