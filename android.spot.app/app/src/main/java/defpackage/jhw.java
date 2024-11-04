package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jhw extends jhu implements List {
    @Override // defpackage.jhu
    protected /* bridge */ /* synthetic */ Collection a() {
        throw null;
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        b().add(i, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        return b().addAll(i, collection);
    }

    protected abstract List b();

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this && !b().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return b().get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return b().indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return b().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return b().listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        return b().remove(i);
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        return b().set(i, obj);
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        return b().subList(i, i2);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        return b().listIterator(i);
    }
}
