package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jnu {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    protected abstract Object a();

    public final Object b(jnt jntVar, jpa jpaVar) {
        Object obj = this.a.get(jntVar);
        if (obj != null) {
            return obj;
        }
        Object a = a();
        Object putIfAbsent = this.a.putIfAbsent(jntVar, a);
        if (putIfAbsent == null) {
            int i = ((jno) jpaVar).b;
            hka hkaVar = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (jnn.f.equals(jpaVar.c(i2))) {
                    Object e = jpaVar.e(i2);
                    if (e instanceof jny) {
                        if (hkaVar == null) {
                            hkaVar = new hka(this, jntVar, 18, (char[]) null);
                        }
                        ((jny) e).a();
                    }
                }
            }
            return a;
        }
        return putIfAbsent;
    }
}
