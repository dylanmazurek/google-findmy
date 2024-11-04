package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjx extends jht {
    final /* synthetic */ Iterable a;
    final /* synthetic */ jet b;

    public jjx(Iterable iterable, jet jetVar) {
        this.a = iterable;
        this.b = jetVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        return new jkd(it, this.b);
    }
}
