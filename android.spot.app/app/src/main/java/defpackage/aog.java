package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aog implements List, mpr {
    public int a;
    private final anr b;
    private final int c;
    private int d;

    public aog(anr anrVar, int i, int i2) {
        this.b = anrVar;
        this.c = i;
        this.d = anrVar.b();
        this.a = i2 - i;
    }

    private final void b() {
        if (this.b.b() == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final Object a(int i) {
        b();
        Object f = this.b.f(this.c + i);
        this.a--;
        this.d = this.b.b();
        return f;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        this.b.add(this.c + i, obj);
        this.a++;
        this.d = this.b.b();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        boolean addAll = this.b.addAll(i + this.c, collection);
        if (addAll) {
            this.a += collection.size();
            this.d = this.b.b();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i;
        ajc ajcVar;
        amz b;
        boolean z;
        if (this.a > 0) {
            b();
            anr anrVar = this.b;
            int i2 = this.c;
            int i3 = this.a + i2;
            do {
                synchronized (ans.a) {
                    aoe aoeVar = anrVar.a;
                    aoeVar.getClass();
                    ano anoVar = (ano) anm.e(aoeVar);
                    i = anoVar.b;
                    ajcVar = anoVar.a;
                }
                ajcVar.getClass();
                ajb b2 = ajcVar.b();
                b2.subList(i2, i3).clear();
                ajc a = b2.a();
                if (amr.i(a, ajcVar)) {
                    break;
                }
                aoe aoeVar2 = anrVar.a;
                aoeVar2.getClass();
                synchronized (anm.c) {
                    b = anm.b();
                    ano anoVar2 = (ano) anm.l(aoeVar2, anrVar, b);
                    synchronized (ans.a) {
                        int i4 = anoVar2.b;
                        if (i4 == i) {
                            anoVar2.a = a;
                            anoVar2.b = i4 + 1;
                            z = true;
                            anoVar2.c++;
                        } else {
                            z = false;
                        }
                    }
                }
                anm.t(b, anrVar);
            } while (!z);
            this.a = 0;
            this.d = this.b.b();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        ans.a(i, this.a);
        return this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.c;
        mmb it = moz.ak(i, this.a + i).iterator();
        while (it.a) {
            int a = it.a();
            if (amr.i(obj, this.b.get(a))) {
                return a - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        for (int i = (this.c + this.a) - 1; i >= this.c; i--) {
            if (amr.i(obj, this.b.get(i))) {
                return i - this.c;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return a(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        ajc ajcVar;
        amz b;
        boolean z;
        b();
        int i2 = this.c;
        int i3 = this.a + i2;
        anr anrVar = this.b;
        int a = anrVar.a();
        do {
            synchronized (ans.a) {
                aoe aoeVar = anrVar.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajb b2 = ajcVar.b();
            b2.subList(i2, i3).retainAll(collection);
            ajc a2 = b2.a();
            if (amr.i(a2, ajcVar)) {
                break;
            }
            aoe aoeVar2 = anrVar.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, anrVar, b);
                synchronized (ans.a) {
                    int i4 = anoVar2.b;
                    if (i4 == i) {
                        anoVar2.a = a2;
                        anoVar2.b = i4 + 1;
                        anoVar2.c++;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            anm.t(b, anrVar);
        } while (!z);
        int a3 = a - anrVar.a();
        if (a3 > 0) {
            this.d = this.b.b();
            this.a -= a3;
        }
        if (a3 <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ans.a(i, this.a);
        b();
        int i2 = this.c;
        anr anrVar = this.b;
        Object obj2 = anrVar.set(i + i2, obj);
        this.d = anrVar.b();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            ael.a("fromIndex or toIndex are out of bounds");
        }
        b();
        anr anrVar = this.b;
        int i3 = this.c;
        return new aog(anrVar, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return moy.a(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        mpl mplVar = new mpl();
        mplVar.a = i - 1;
        return new aof(mplVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        a(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return moy.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        this.b.add(this.c + this.a, obj);
        this.a++;
        this.d = this.b.b();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.a, collection);
    }
}
