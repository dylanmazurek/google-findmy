package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkb extends jht {
    final /* synthetic */ Iterable a;

    public jkb(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        hwx.K(true, "limit is negative");
        return new jqo(it, 1);
    }
}
