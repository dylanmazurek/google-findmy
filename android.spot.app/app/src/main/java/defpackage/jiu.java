package defpackage;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jiu {
    public Comparator a;
    Object[] b;
    int c;
    boolean d;
    kpb e;

    public jiu() {
        this(4);
    }

    private final jiy g(boolean z) {
        Object[] objArr;
        kpb kpbVar;
        kpb kpbVar2;
        if (z && (kpbVar2 = this.e) != null) {
            throw kpbVar2.l();
        }
        int i = this.c;
        if (this.a == null) {
            objArr = this.b;
        } else {
            if (this.d) {
                this.b = Arrays.copyOf(this.b, i + i);
            }
            objArr = this.b;
            if (!z) {
                int i2 = this.c;
                HashSet hashSet = new HashSet();
                BitSet bitSet = new BitSet();
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    Object obj = objArr[i3 + i3];
                    obj.getClass();
                    if (!hashSet.add(obj)) {
                        bitSet.set(i3);
                    }
                }
                if (!bitSet.isEmpty()) {
                    int cardinality = i2 - bitSet.cardinality();
                    Object[] objArr2 = new Object[cardinality + cardinality];
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < i2 + i2) {
                        if (bitSet.get(i4 >>> 1)) {
                            i4 += 2;
                        } else {
                            int i6 = i5 + 1;
                            int i7 = i4 + 1;
                            Object obj2 = objArr[i4];
                            obj2.getClass();
                            objArr2[i5] = obj2;
                            i5 += 2;
                            i4 += 2;
                            Object obj3 = objArr[i7];
                            obj3.getClass();
                            objArr2[i6] = obj3;
                        }
                    }
                    objArr = objArr2;
                }
                int length = objArr.length;
                if (length < this.b.length) {
                    i = length >>> 1;
                }
            }
            Comparator comparator = this.a;
            Map.Entry[] entryArr = new Map.Entry[i];
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = i8 + i8;
                Object obj4 = objArr[i9];
                obj4.getClass();
                Object obj5 = objArr[i9 + 1];
                obj5.getClass();
                entryArr[i8] = new AbstractMap.SimpleImmutableEntry(obj4, obj5);
            }
            if (!(comparator instanceof jme)) {
                comparator = new jhe(comparator);
            }
            Arrays.sort(entryArr, 0, i, new jgm(jlj.VALUE, (jme) comparator));
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 + i10;
                objArr[i11] = entryArr[i10].getKey();
                objArr[i11 + 1] = entryArr[i10].getValue();
            }
        }
        this.d = true;
        jmn p = jmn.p(i, objArr, this);
        if (z && (kpbVar = this.e) != null) {
            throw kpbVar.l();
        }
        return p;
    }

    public final jiy a() {
        return g(false);
    }

    public final jiy b() {
        return g(true);
    }

    public final void c(int i) {
        Object[] objArr = this.b;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            this.b = Arrays.copyOf(objArr, jig.a(length, i2));
            this.d = false;
        }
    }

    public final void d(Object obj, Object obj2) {
        c(this.c + 1);
        hwx.B(obj, obj2);
        Object[] objArr = this.b;
        int i = this.c;
        int i2 = i + i;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.c = i + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            c(this.c + iterable.size());
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            d(entry.getKey(), entry.getValue());
        }
    }

    public final void f(Map map) {
        e(map.entrySet());
    }

    public jiu(int i) {
        this.b = new Object[i + i];
        this.c = 0;
        this.d = false;
    }
}
