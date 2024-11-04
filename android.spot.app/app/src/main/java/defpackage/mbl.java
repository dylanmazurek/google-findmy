package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbl {
    public final List a;
    public final lyp b;
    public final mbi c;

    public mbl(List list, lyp lypVar, mbi mbiVar) {
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        lypVar.getClass();
        this.b = lypVar;
        this.c = mbiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mbl)) {
            return false;
        }
        mbl mblVar = (mbl) obj;
        if (!amr.g(this.a, mblVar.a) || !amr.g(this.b, mblVar.b) || !amr.g(this.c, mblVar.c)) {
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
        q.b("serviceConfig", this.c);
        return q.toString();
    }
}
