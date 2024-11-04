package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mah {
    public final List a;
    public final lyp b;
    private final Object[][] c;

    public mah(List list, lyp lypVar, Object[][] objArr) {
        list.getClass();
        this.a = list;
        lypVar.getClass();
        this.b = lypVar;
        objArr.getClass();
        this.c = objArr;
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("addrs", this.a);
        q.b("attrs", this.b);
        q.b("customOptions", Arrays.deepToString(this.c));
        return q.toString();
    }
}
