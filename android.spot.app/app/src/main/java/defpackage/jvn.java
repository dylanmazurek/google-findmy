package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jvn extends jhw {
    final List a;

    public jvn(List list) {
        list.getClass();
        this.a = list;
    }

    @Override // defpackage.jhw, defpackage.jhu
    protected final /* synthetic */ Collection a() {
        return this.a;
    }

    @Override // defpackage.jhw, java.util.List
    public final void add(int i, Object obj) {
        obj.getClass();
        this.a.add(i, obj);
    }

    @Override // defpackage.jhw, java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.a.addAll(i, iqh.t(collection));
    }

    @Override // defpackage.jhw
    protected final List b() {
        return this.a;
    }

    @Override // defpackage.jhu, defpackage.jic
    protected final /* synthetic */ Object g() {
        return this.a;
    }

    @Override // defpackage.jhw, java.util.List
    public final ListIterator listIterator() {
        return new jvo(this.a.listIterator());
    }

    @Override // defpackage.jhw, java.util.List
    public final Object set(int i, Object obj) {
        obj.getClass();
        return this.a.set(i, obj);
    }

    @Override // defpackage.jhw, java.util.List
    public final List subList(int i, int i2) {
        return new jvn(this.a.subList(i, i2));
    }

    @Override // defpackage.jhw, java.util.List
    public final ListIterator listIterator(int i) {
        return new jvo(this.a.listIterator(i));
    }

    @Override // defpackage.jhu, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        return this.a.add(obj);
    }

    @Override // defpackage.jhu, java.util.Collection
    public final boolean addAll(Collection collection) {
        return this.a.addAll(iqh.t(collection));
    }
}
