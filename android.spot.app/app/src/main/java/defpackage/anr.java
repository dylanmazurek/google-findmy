package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anr implements List, RandomAccess, aoc, mpr {
    public aoe a;

    public anr() {
        ajq ajqVar = ajq.a;
        ano anoVar = new ano(ajqVar);
        if (amy.b()) {
            ano anoVar2 = new ano(ajqVar);
            anoVar2.f = 1;
            anoVar.g = anoVar2;
        }
        this.a = anoVar;
    }

    private final boolean g(moh mohVar) {
        int i;
        ajc ajcVar;
        Object a;
        amz b;
        boolean z;
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajb b2 = ajcVar.b();
            a = mohVar.a(b2);
            ajc a2 = b2.a();
            if (amr.i(a2, ajcVar)) {
                break;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i2 = anoVar2.b;
                    if (i2 == i) {
                        anoVar2.a = a2;
                        anoVar2.b = i2 + 1;
                        z = true;
                        anoVar2.c++;
                    } else {
                        z = false;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
        return ((Boolean) a).booleanValue();
    }

    public final int a() {
        return c().a.size();
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ajc ajcVar;
        amz b;
        boolean z;
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i2 = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajc d = ajcVar.d(i, obj);
            if (amr.i(d, ajcVar)) {
                return;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i3 = anoVar2.b;
                    if (i3 == i2) {
                        anoVar2.a = d;
                        z = true;
                        anoVar2.c++;
                        anoVar2.b = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return g(new anp(i, collection));
    }

    public final int b() {
        aoe aoeVar = this.a;
        aoeVar.getClass();
        return ((ano) anm.e(aoeVar)).c;
    }

    public final ano c() {
        aoe aoeVar = this.a;
        aoeVar.getClass();
        return (ano) anm.j(aoeVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        amz b;
        aoe aoeVar = this.a;
        aoeVar.getClass();
        moh mohVar = anm.a;
        synchronized (anm.c) {
            b = anm.b();
            ano anoVar = (ano) anm.l(aoeVar, this, b);
            synchronized (ans.a) {
                anoVar.a = ajq.a;
                anoVar.b++;
                anoVar.c++;
            }
        }
        anm.t(b, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return c().a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return c().a.containsAll(collection);
    }

    @Override // defpackage.aoc
    public final aoe d() {
        return this.a;
    }

    @Override // defpackage.aoc
    public final void e(aoe aoeVar) {
        aoeVar.g = this.a;
        aoeVar.getClass();
        this.a = (ano) aoeVar;
    }

    public final Object f(int i) {
        int i2;
        ajc ajcVar;
        amz b;
        boolean z;
        Object obj = get(i);
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i2 = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajc i3 = ajcVar.i(i);
            if (amr.i(i3, ajcVar)) {
                break;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i4 = anoVar2.b;
                    if (i4 == i2) {
                        anoVar2.a = i3;
                        z = true;
                        anoVar2.c++;
                        anoVar2.b = i4 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
        return obj;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return c().a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return c().a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return c().a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new aob(this, 0);
    }

    @Override // defpackage.aoc
    public final /* synthetic */ aoe j(aoe aoeVar, aoe aoeVar2, aoe aoeVar3) {
        return null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return c().a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new aob(this, 0);
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i) {
        return f(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        ajc ajcVar;
        boolean z;
        amz b;
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajc g = ajcVar.g(collection);
            z = false;
            if (amr.i(g, ajcVar)) {
                return false;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i2 = anoVar2.b;
                    if (i2 == i) {
                        anoVar2.a = g;
                        anoVar2.c++;
                        anoVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return g(new anq(collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        ajc ajcVar;
        amz b;
        boolean z;
        Object obj2 = get(i);
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i2 = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajc j = ajcVar.j(i, obj);
            if (amr.i(j, ajcVar)) {
                break;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i3 = anoVar2.b;
                    if (i3 == i2) {
                        anoVar2.a = j;
                        anoVar2.b = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            ael.a("fromIndex or toIndex are out of bounds");
        }
        return new aog(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return moy.a(this);
    }

    public final String toString() {
        aoe aoeVar = this.a;
        aoeVar.getClass();
        return "SnapshotStateList(value=" + ((ano) anm.e(aoeVar)).a + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        ajc ajcVar;
        boolean z;
        amz b;
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajc e = ajcVar.e(collection);
            z = false;
            if (amr.i(e, ajcVar)) {
                return false;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i2 = anoVar2.b;
                    if (i2 == i) {
                        anoVar2.a = e;
                        anoVar2.c++;
                        anoVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new aob(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        ajc ajcVar;
        boolean z;
        amz b;
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajc f = ajcVar.f(obj);
            z = false;
            if (amr.i(f, ajcVar)) {
                return false;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i2 = anoVar2.b;
                    if (i2 == i) {
                        anoVar2.a = f;
                        anoVar2.c++;
                        anoVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return moy.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        ajc ajcVar;
        boolean z;
        amz b;
        do {
            synchronized (ans.a) {
                aoe aoeVar = this.a;
                aoeVar.getClass();
                ano anoVar = (ano) anm.e(aoeVar);
                i = anoVar.b;
                ajcVar = anoVar.a;
            }
            ajcVar.getClass();
            ajc c = ajcVar.c(obj);
            z = false;
            if (amr.i(c, ajcVar)) {
                return false;
            }
            aoe aoeVar2 = this.a;
            aoeVar2.getClass();
            synchronized (anm.c) {
                b = anm.b();
                ano anoVar2 = (ano) anm.l(aoeVar2, this, b);
                synchronized (ans.a) {
                    int i2 = anoVar2.b;
                    if (i2 == i) {
                        anoVar2.a = c;
                        anoVar2.c++;
                        anoVar2.b = i2 + 1;
                        z = true;
                    }
                }
            }
            anm.t(b, this);
        } while (!z);
        return true;
    }
}
