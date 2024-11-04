package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jjr extends jih implements Set, j$.util.Set {
    private static final long serialVersionUID = 912559;
    private transient jis a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i) {
        boolean z;
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        if (max < 1073741824) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "collection too large");
        return 1073741824;
    }

    public static jjr l(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int j = j(i);
                Object[] objArr2 = new Object[j];
                int i2 = j - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    hzc.w(obj, i5);
                    int hashCode = obj.hashCode();
                    int q = hwx.q(hashCode);
                    while (true) {
                        int i6 = q & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        }
                        if (!obj2.equals(obj)) {
                            q++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new jms(obj3);
                }
                if (j(i4) < j / 2) {
                    return l(i4, objArr);
                }
                int length = objArr.length;
                if (i4 < (length >> 1) + (length >> 2)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new jmo(objArr, i3, objArr2, i2, i4);
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new jms(obj4);
        }
        return jmo.a;
    }

    public static jjr m(Collection collection) {
        if ((collection instanceof jjr) && !(collection instanceof SortedSet)) {
            jjr jjrVar = (jjr) collection;
            if (!jjrVar.f()) {
                return jjrVar;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    public static jjr n(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return l(length, (Object[]) objArr.clone());
            }
            return new jms(objArr[0]);
        }
        return jmo.a;
    }

    public static jjr o(Object obj, Object obj2) {
        return l(2, obj, obj2);
    }

    public static jjr p(Object obj, Object obj2, Object obj3) {
        return l(3, obj, obj2, obj3);
    }

    public static jjr q(Object obj, Object obj2, Object obj3, Object obj4) {
        return l(4, obj, obj2, obj3, obj4);
    }

    public static jjr r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return l(5, obj, obj2, obj3, obj4, obj5);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @SafeVarargs
    public static jjr s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        hwx.K(true, "the total number of elements must fit in an int");
        int length = objArr.length;
        int i = length + 6;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return l(i, objArr2);
    }

    @Override // defpackage.jih
    public jis d() {
        jis jisVar = this.a;
        if (jisVar == null) {
            jis k = k();
            this.a = k;
            return k;
        }
        return jisVar;
    }

    @Override // defpackage.jih, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public abstract jmw listIterator();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jjr) && i() && ((jjr) obj).i() && hashCode() != obj.hashCode()) {
            return false;
        }
        return jql.o(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return jql.k(this);
    }

    public boolean i() {
        return false;
    }

    public jis k() {
        return jis.k(toArray());
    }

    @Override // defpackage.jih
    public Object writeReplace() {
        return new jjq(toArray());
    }
}
