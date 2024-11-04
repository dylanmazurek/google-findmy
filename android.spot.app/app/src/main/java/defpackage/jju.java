package defpackage;

import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jju extends jjr implements NavigableSet, SortedSet, jmt {
    private static final long serialVersionUID = 912559;
    final transient Comparator a;
    transient jju b;

    public jju(Comparator comparator) {
        this.a = comparator;
    }

    public static jmp A(Comparator comparator) {
        if (jmb.a.equals(comparator)) {
            return jmp.c;
        }
        int i = jis.d;
        return new jmp(jmi.a, comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.NavigableSet
    /* renamed from: B */
    public abstract jmw descendingIterator();

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        return hzc.ad(tailSet(obj, true));
    }

    @Override // java.util.SortedSet, defpackage.jmt
    public final Comparator comparator() {
        return this.a;
    }

    @Override // java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        jju jjuVar = this.b;
        if (jjuVar == null) {
            jju t = t();
            this.b = t;
            t.b = this;
            return t;
        }
        return jjuVar;
    }

    @Override // defpackage.jjr, defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e */
    public abstract jmw listIterator();

    @Override // java.util.SortedSet
    public Object first() {
        return listIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        return hzc.T(headSet(obj, true).descendingIterator());
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    public final int h(Object obj, Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        return hzc.ad(tailSet(obj, false));
    }

    @Override // java.util.SortedSet
    public Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        return hzc.T(headSet(obj, false).descendingIterator());
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public abstract jju t();

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* bridge */ /* synthetic */ java.util.SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* renamed from: u */
    public final jju headSet(Object obj, boolean z) {
        obj.getClass();
        return v(obj, z);
    }

    public abstract jju v(Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* renamed from: w */
    public final jju subSet(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        obj.getClass();
        obj2.getClass();
        if (this.a.compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        hwx.J(z3);
        return x(obj, z, obj2, z2);
    }

    @Override // defpackage.jjr, defpackage.jih
    public Object writeReplace() {
        return new jjt(this.a, toArray());
    }

    public abstract jju x(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* renamed from: y */
    public final jju tailSet(Object obj, boolean z) {
        obj.getClass();
        return z(obj, z);
    }

    public abstract jju z(Object obj, boolean z);
}
