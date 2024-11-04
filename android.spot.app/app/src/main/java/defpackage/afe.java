package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afe extends mnp implements mol {
    /* synthetic */ Object a;

    public afe(mmx mmxVar) {
        super(2, mmxVar);
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afe) c((afa) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        boolean z;
        mjo.o(obj);
        if (((afa) this.a) == afa.ShutDown) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        afe afeVar = new afe(mmxVar);
        afeVar.a = obj;
        return afeVar;
    }
}
