package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrj implements cgn {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public lrj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.cgn
    public final /* synthetic */ cgk a(Class cls) {
        if (this.b != 0) {
            return btx.c();
        }
        return btx.c();
    }

    @Override // defpackage.cgn
    public final cgk b(Class cls, cgu cguVar) {
        cgk cgkVar;
        if (this.b != 0) {
            lrg lrgVar = new lrg();
            cfz a = cge.a(cguVar);
            dvy dvyVar = (dvy) this.a;
            dvyVar.a = a;
            dvyVar.b = lrgVar;
            iqg.z(dvyVar.a, cfz.class);
            iqg.z(dvyVar.b, lra.class);
            dwk dwkVar = new dwk(dvyVar.c, dvyVar.a, dvyVar.b);
            mko mkoVar = (mko) ((lre) hzc.ai(dwkVar, lre.class)).b().get(cls);
            moh mohVar = (moh) cguVar.a(lrf.a);
            Object obj = ((lre) hzc.ai(dwkVar, lre.class)).a().get(cls);
            if (obj == null) {
                if (mohVar == null) {
                    if (mkoVar != null) {
                        cgkVar = (cgk) mkoVar.a();
                    } else {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                } else {
                    throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                }
            } else if (mkoVar == null) {
                if (mohVar != null) {
                    cgkVar = (cgk) mohVar.a(obj);
                } else {
                    throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                }
            } else {
                throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
            }
            ibc ibcVar = new ibc(lrgVar, 4);
            cgy cgyVar = cgkVar.y;
            if (cgyVar.c) {
                cgy.a(ibcVar);
            } else {
                synchronized (cgyVar.d) {
                    cgyVar.b.add(ibcVar);
                }
            }
            return cgkVar;
        }
        lrs lrsVar = new lrs(cguVar);
        frk o = ((lrk) hzc.ah((Context) this.a, lrk.class)).o();
        o.b = lrsVar;
        iqg.z(o.b, lrs.class);
        return new lrl(new dwg((dwj) o.a), lrsVar);
    }

    @Override // defpackage.cgn
    public final /* synthetic */ cgk c(mql mqlVar, cgu cguVar) {
        if (this.b != 0) {
            return btx.b(this, mqlVar, cguVar);
        }
        return btx.b(this, mqlVar, cguVar);
    }
}
