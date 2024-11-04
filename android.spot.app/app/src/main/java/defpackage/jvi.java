package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jvi extends jie {
    private final Set a;

    public jvi(Set set) {
        this.a = set;
    }

    @Override // defpackage.jie, defpackage.jhu
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.jie
    protected final Set b() {
        return this.a;
    }

    @Override // defpackage.jhu, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jhu, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new jke(this.a.iterator(), new ihq(8));
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
