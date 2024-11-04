package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class caz extends mnp implements mol {
    /* synthetic */ Object a;

    public caz(mmx mmxVar) {
        super(2, mmxVar);
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caz) c((ccd) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mjo.o(obj);
        return Boolean.valueOf(!(((ccd) this.a) instanceof cbv));
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        caz cazVar = new caz(mmxVar);
        cazVar.a = obj;
        return cazVar;
    }
}
