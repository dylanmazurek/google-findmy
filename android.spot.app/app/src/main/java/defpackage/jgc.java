package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jgc extends jga implements List {
    final /* synthetic */ jge f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jgc(jge jgeVar, Object obj, List list, jga jgaVar) {
        super(jgeVar, obj, list, jgaVar);
        this.f = jgeVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean isEmpty = this.b.isEmpty();
        d().add(i, obj);
        this.f.b++;
        if (isEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = d().addAll(i, collection);
        if (addAll) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    public final List d() {
        return (List) this.b;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return d().get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return d().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return d().lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new jgb(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object remove = d().remove(i);
        jge jgeVar = this.f;
        jgeVar.b--;
        c();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return d().set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List subList = d().subList(i, i2);
        jga jgaVar = this.c;
        if (jgaVar == null) {
            jgaVar = this;
        }
        return this.f.i(this.a, subList, jgaVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new jgb(this, i);
    }
}
