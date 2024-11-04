package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ace {
    public static final aek a(aeq[] aeqVarArr, aek aekVar, aek aekVar2) {
        alj aljVar = new alj(alk.d);
        for (aeq aeqVar : aeqVarArr) {
            aby abyVar = aeqVar.a;
            if (aeqVar.f || !c(aekVar, abyVar)) {
                agy agyVar = (agy) aekVar2.get(abyVar);
                aeqVar.getClass();
                aljVar.put(abyVar, ((aep) abyVar).a(aeqVar, agyVar));
            }
        }
        return aljVar.b();
    }

    public static final Object b(aek aekVar, aby abyVar) {
        abyVar.getClass();
        Object obj = aekVar.get(abyVar);
        if (obj == null) {
            obj = abyVar.a;
        }
        return ((agy) obj).a();
    }

    public static final boolean c(aek aekVar, aby abyVar) {
        return aekVar.containsKey(abyVar);
    }
}
