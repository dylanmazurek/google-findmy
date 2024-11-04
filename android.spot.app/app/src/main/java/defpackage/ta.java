package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ta {
    private int[] a;
    private Object[] b;
    public int d;

    public ta() {
        this((byte[]) null);
    }

    private final int i(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int a = td.a(this.a, i2, i);
        if (a < 0) {
            return a;
        }
        if (amr.i(obj, this.b[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.a[i3] == i) {
            if (amr.i(obj, this.b[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.a[i4] == i; i4--) {
            if (amr.i(obj, this.b[i4 + i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    private final int j() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        int a = td.a(this.a, i, 0);
        if (a < 0) {
            return a;
        }
        if (this.b[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.a[i2] == 0) {
            if (this.b[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.a[i3] == 0; i3--) {
            if (this.b[i3 + i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final int a(Object obj) {
        int i = this.d;
        int i2 = i + i;
        Object[] objArr = this.b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (amr.i(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int b(Object obj) {
        if (obj == null) {
            return j();
        }
        return i(obj, obj.hashCode());
    }

    public final Object c(int i) {
        if (i >= 0 && i < this.d) {
            return this.b[i + i];
        }
        throw new IllegalArgumentException(a.ae(i, "Expected index to be within 0..size()-1, but was "));
    }

    public void clear() {
        if (this.d > 0) {
            this.a = td.a;
            this.b = td.c;
            this.d = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        if (b(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (a(obj) >= 0) {
            return true;
        }
        return false;
    }

    public Object d(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.d)) {
            Object[] objArr = this.b;
            int i3 = i + i;
            Object obj = objArr[i3 + 1];
            if (i2 <= 1) {
                clear();
            } else {
                int i4 = i2 - 1;
                int[] iArr = this.a;
                int length = iArr.length;
                int i5 = 8;
                if (length > 8 && i2 < length / 3) {
                    if (i2 > 8) {
                        i5 = i2 + (i2 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i5);
                    copyOf.getClass();
                    this.a = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.b, i5 + i5);
                    copyOf2.getClass();
                    this.b = copyOf2;
                    if (i2 == this.d) {
                        if (i > 0) {
                            mkm.p(iArr, this.a, 0, 0, i);
                            mkm.q(objArr, this.b, 0, 0, i3);
                        }
                        if (i < i4) {
                            int i6 = i + 1;
                            mkm.p(iArr, this.a, i, i6, i2);
                            mkm.q(objArr, this.b, i3, i6 + i6, i2 + i2);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i < i4) {
                        int i7 = i + 1;
                        mkm.p(iArr, iArr, i, i7, i2);
                        Object[] objArr2 = this.b;
                        mkm.q(objArr2, objArr2, i3, i7 + i7, i2 + i2);
                    }
                    Object[] objArr3 = this.b;
                    int i8 = i4 + i4;
                    objArr3[i8] = null;
                    objArr3[i8 + 1] = null;
                }
                if (i2 == this.d) {
                    this.d = i4;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return obj;
        }
        throw new IllegalArgumentException(a.ae(i, "Expected index to be within 0..size()-1, but was "));
    }

    public Object e(int i, Object obj) {
        if (i >= 0 && i < this.d) {
            Object[] objArr = this.b;
            int i2 = i + i + 1;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
            return obj2;
        }
        throw new IllegalArgumentException(a.ae(i, "Expected index to be within 0..size()-1, but was "));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ta) {
                int i = this.d;
                ta taVar = (ta) obj;
                if (i != taVar.d) {
                    return false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    Object c = c(i2);
                    Object f = f(i2);
                    Object obj2 = taVar.get(c);
                    if (f == null) {
                        if (obj2 != null || !taVar.containsKey(c)) {
                            return false;
                        }
                    } else if (!amr.i(f, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.d;
            for (int i4 = 0; i4 < i3; i4++) {
                Object c2 = c(i4);
                Object f2 = f(i4);
                Map map = (Map) obj;
                Object obj3 = map.get(c2);
                if (f2 == null) {
                    if (obj3 != null || !map.containsKey(c2)) {
                        return false;
                    }
                } else if (!amr.i(f2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        if (i >= 0 && i < this.d) {
            return this.b[i + i + 1];
        }
        throw new IllegalArgumentException(a.ae(i, "Expected index to be within 0..size()-1, but was "));
    }

    public final void g(int i) {
        int i2 = this.d;
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, i);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i + i);
            copyOf2.getClass();
            this.b = copyOf2;
        }
        if (this.d == i2) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final Object get(Object obj) {
        int b = b(obj);
        if (b >= 0) {
            return this.b[b + b + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int b = b(obj);
        if (b >= 0) {
            return this.b[b + b + 1];
        }
        return obj2;
    }

    public void h(ta taVar) {
        int i = taVar.d;
        g(this.d + i);
        if (this.d == 0) {
            if (i > 0) {
                mkm.p(taVar.a, this.a, 0, 0, i);
                mkm.q(taVar.b, this.b, 0, 0, i + i);
                this.d = i;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            put(taVar.c(i2), taVar.f(i2));
        }
    }

    public int hashCode() {
        int i;
        int[] iArr = this.a;
        Object[] objArr = this.b;
        int i2 = this.d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj != null) {
                i = obj.hashCode();
            } else {
                i = 0;
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public final boolean isEmpty() {
        if (this.d <= 0) {
            return true;
        }
        return false;
    }

    public Object put(Object obj, Object obj2) {
        int i;
        int j;
        int i2 = this.d;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (obj != null) {
            j = i(obj, i);
        } else {
            j = j();
        }
        if (j >= 0) {
            int i3 = j + j + 1;
            Object[] objArr = this.b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~j;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i5);
            copyOf.getClass();
            this.a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.b, i5 + i5);
            copyOf2.getClass();
            this.b = copyOf2;
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.a;
            int i6 = i4 + 1;
            mkm.p(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.b;
            int i7 = this.d;
            mkm.q(objArr2, objArr2, i6 + i6, i4 + i4, i7 + i7);
        }
        int i8 = this.d;
        if (i2 == i8) {
            int[] iArr3 = this.a;
            if (i4 < iArr3.length) {
                iArr3[i4] = i;
                Object[] objArr3 = this.b;
                int i9 = i4 + i4;
                objArr3[i9] = obj;
                objArr3[i9 + 1] = obj2;
                this.d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 == null) {
            return put(obj, obj2);
        }
        return obj3;
    }

    public final Object remove(Object obj) {
        int b = b(obj);
        if (b >= 0) {
            return d(b);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int b = b(obj);
        if (b >= 0) {
            return e(b, obj2);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object c = c(i2);
            if (c != sb) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object f = f(i2);
            if (f != sb) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ta(int i) {
        this.a = i == 0 ? td.a : new int[i];
        this.b = i == 0 ? td.c : new Object[i + i];
    }

    public final boolean remove(Object obj, Object obj2) {
        int b = b(obj);
        if (b < 0 || !amr.i(obj2, f(b))) {
            return false;
        }
        d(b);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int b = b(obj);
        if (b < 0 || !amr.i(obj2, f(b))) {
            return false;
        }
        e(b, obj3);
        return true;
    }

    public /* synthetic */ ta(byte[] bArr) {
        this(0);
    }
}
