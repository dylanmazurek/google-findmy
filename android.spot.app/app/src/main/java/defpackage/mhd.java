package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhd {
    public final mjb a;
    public final Object b;
    public final Map c;
    private final mhb d;
    private final Map e;
    private final Map f;

    public mhd(mhb mhbVar, Map map, Map map2, mjb mjbVar, Object obj, Map map3) {
        Map map4;
        this.d = mhbVar;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.a = mjbVar;
        this.b = obj;
        if (map3 != null) {
            map4 = DesugarCollections.unmodifiableMap(new HashMap(map3));
        } else {
            map4 = null;
        }
        this.c = map4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final lzx a() {
        if (this.f.isEmpty() && this.e.isEmpty() && this.d == null) {
            return null;
        }
        return new mhc(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final mhb b(mbg mbgVar) {
        mhb mhbVar = (mhb) this.e.get(mbgVar.b);
        if (mhbVar == null) {
            mhbVar = (mhb) this.f.get(mbgVar.c);
        }
        if (mhbVar == null) {
            return this.d;
        }
        return mhbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mhd mhdVar = (mhd) obj;
            if (amr.g(this.d, mhdVar.d) && amr.g(this.e, mhdVar.e) && amr.g(this.f, mhdVar.f) && amr.g(this.a, mhdVar.a) && amr.g(this.b, mhdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.e, this.f, this.a, this.b});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("defaultMethodConfig", this.d);
        q.b("serviceMethodMap", this.e);
        q.b("serviceMap", this.f);
        q.b("retryThrottling", this.a);
        q.b("loadBalancingConfig", this.b);
        return q.toString();
    }
}
