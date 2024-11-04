package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mao {
    public final List a;
    public final lyp b;
    public final Object c;

    public mao(List list, lyp lypVar, Object obj) {
        list.getClass();
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        lypVar.getClass();
        this.b = lypVar;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mao)) {
            return false;
        }
        mao maoVar = (mao) obj;
        if (!amr.g(this.a, maoVar.a) || !amr.g(this.b, maoVar.b) || !amr.g(this.c, maoVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("addresses", this.a);
        q.b("attributes", this.b);
        q.b("loadBalancingPolicyConfig", this.c);
        return q.toString();
    }
}
