package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhs extends jht {
    final /* synthetic */ Iterable[] a;

    public jhs(Iterable[] iterableArr) {
        this.a = iterableArr;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jkg(new jhr(this));
    }
}
