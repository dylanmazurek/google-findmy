package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myq extends mnp implements mol {
    /* synthetic */ Object a;

    public myq(mmx mmxVar) {
        super(2, mmxVar);
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((myq) c((myh) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        boolean z;
        mjo.o(obj);
        if (((myh) this.a) != myh.a) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        myq myqVar = new myq(mmxVar);
        myqVar.a = obj;
        return myqVar;
    }
}
