package defpackage;

import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
final class cfp implements cfa {
    private final Object a;
    private final ceh b;

    public cfp(Object obj) {
        this.a = obj;
        this.b = cej.a.b(obj.getClass());
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        ceh cehVar = this.b;
        List list = (List) cehVar.a.get(cevVar);
        Object obj = this.a;
        ceh.a(list, cfcVar, cevVar, obj);
        ceh.a((List) cehVar.a.get(cev.ON_ANY), cfcVar, cevVar, obj);
    }
}
