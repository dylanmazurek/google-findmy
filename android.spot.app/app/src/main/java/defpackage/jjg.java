package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jjg extends jih {
    public final jiy a;

    public jjg(jiy jiyVar) {
        this.a = jiyVar;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null && hzc.R(new jjd(this), obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jih
    public final jis d() {
        return new jje(this.a.entrySet().d());
    }

    @Override // defpackage.jih
    /* renamed from: e */
    public final jmw listIterator() {
        return new jjd(this);
    }

    @Override // defpackage.jih
    public final boolean f() {
        throw null;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: iterator */
    public final /* synthetic */ Iterator listIterator() {
        return new jjd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.jih
    public Object writeReplace() {
        return new jjf(this.a);
    }
}
