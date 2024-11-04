package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jlp extends jhu {
    private final Collection a;

    public jlp(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.jhu
    protected final Collection a() {
        return this.a;
    }

    @Override // defpackage.jhu, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jhu, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new jli(this.a.iterator());
    }

    @Override // defpackage.jhu, java.util.Collection
    public final Object[] toArray() {
        return d();
    }

    @Override // defpackage.jhu, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return hzc.v(this, objArr);
    }
}
