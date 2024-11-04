package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jha extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public jha() {
        p(3);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            p(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(a.ae(readInt, "Invalid size: "));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator k = k();
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private final int y(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object y = hwx.y(i2);
        if (i4 != 0) {
            hwx.A(y, i3 & i5, i4 + 1);
        }
        Object i6 = i();
        int[] v = v();
        for (int i7 = 0; i7 <= i; i7++) {
            int w = hwx.w(i6, i7);
            while (w != 0) {
                int i8 = w - 1;
                int i9 = v[i8];
                int s = hwx.s(i9, i) | i7;
                int i10 = s & i5;
                int w2 = hwx.w(y, i10);
                hwx.A(y, i10, w);
                v[i8] = hwx.t(s, w2, i5);
                w = i9 & i;
            }
        }
        this.g = y;
        z(i5);
        return i5;
    }

    private final void z(int i) {
        this.e = hwx.t(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public int b() {
        hwx.V(u(), "Arrays already allocated");
        int i = this.e;
        int x = hwx.x(i);
        this.g = hwx.y(x);
        z(x - 1);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    public int c() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (u()) {
            return;
        }
        o();
        Map n = n();
        if (n != null) {
            this.e = iqh.r(size(), 3);
            n.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(w(), 0, this.f, (Object) null);
        Arrays.fill(x(), 0, this.f, (Object) null);
        hwx.z(i());
        Arrays.fill(v(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map n = n();
        if (n != null) {
            return n.containsKey(obj);
        }
        if (f(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map n = n();
        if (n == null) {
            for (int i = 0; i < this.f; i++) {
                if (amr.g(obj, j(i))) {
                    return true;
                }
            }
            return false;
        }
        return n.containsValue(obj);
    }

    public int d(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int e() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set == null) {
            jgv jgvVar = new jgv(this);
            this.i = jgvVar;
            return jgvVar;
        }
        return set;
    }

    public final int f(Object obj) {
        if (u()) {
            return -1;
        }
        int r = hwx.r(obj);
        int e = e();
        int w = hwx.w(i(), r & e);
        if (w == 0) {
            return -1;
        }
        int s = hwx.s(r, e);
        do {
            int i = w - 1;
            int i2 = v()[i];
            if (hwx.s(i2, e) == s && amr.g(obj, g(i))) {
                return i;
            }
            w = i2 & e;
        } while (w != 0);
        return -1;
    }

    public final Object g(int i) {
        return w()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map n = n();
        if (n != null) {
            return n.get(obj);
        }
        int f = f(obj);
        if (f == -1) {
            return null;
        }
        return j(f);
    }

    public final Object h(Object obj) {
        if (!u()) {
            int e = e();
            int v = hwx.v(obj, null, e, i(), v(), w(), null);
            if (v != -1) {
                Object j = j(v);
                r(v, e);
                this.f--;
                o();
                return j;
            }
        }
        return a;
    }

    public final Object i() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object j(int i) {
        return x()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator k() {
        Map n = n();
        if (n != null) {
            return n.entrySet().iterator();
        }
        return new jgt(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set == null) {
            jgx jgxVar = new jgx(this);
            this.h = jgxVar;
            return jgxVar;
        }
        return set;
    }

    public Map l() {
        Map m = m(e() + 1);
        int c = c();
        while (c >= 0) {
            m.put(g(c), j(c));
            c = d(c);
        }
        this.g = m;
        this.b = null;
        this.c = null;
        this.d = null;
        o();
        return m;
    }

    public Map m(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map n() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o() {
        this.e += 32;
    }

    public void p(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.K(z, "Expected size must be >= 0");
        this.e = iqh.r(i, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int y;
        int min;
        if (u()) {
            b();
        }
        Map n = n();
        if (n != null) {
            return n.put(obj, obj2);
        }
        int[] v = v();
        Object[] w = w();
        Object[] x = x();
        int i = this.f;
        int i2 = i + 1;
        int r = hwx.r(obj);
        int e = e();
        int i3 = r & e;
        int w2 = hwx.w(i(), i3);
        if (w2 == 0) {
            if (i2 > e) {
                y = y(e, hwx.u(e), r, i);
            } else {
                hwx.A(i(), i3, i2);
                y = e;
            }
        } else {
            int s = hwx.s(r, e);
            int i4 = 0;
            while (true) {
                int i5 = w2 - 1;
                int i6 = v[i5];
                if (hwx.s(i6, e) == s && amr.g(obj, w[i5])) {
                    Object obj3 = x[i5];
                    x[i5] = obj2;
                    return obj3;
                }
                int i7 = i6 & e;
                i4++;
                if (i7 == 0) {
                    if (i4 >= 9) {
                        return l().put(obj, obj2);
                    }
                    if (i2 > e) {
                        y = y(e, hwx.u(e), r, i);
                    } else {
                        v[i5] = hwx.t(i6, i2, e);
                    }
                } else {
                    w2 = i7;
                }
            }
            y = e;
        }
        int length = v().length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            s(min);
        }
        q(i, obj, obj2, r, y);
        this.f = i2;
        o();
        return null;
    }

    public void q(int i, Object obj, Object obj2, int i2, int i3) {
        v()[i] = hwx.t(i2, 0, i3);
        w()[i] = obj;
        t(i, obj2);
    }

    public void r(int i, int i2) {
        Object i3 = i();
        int[] v = v();
        Object[] w = w();
        Object[] x = x();
        int size = size();
        int i4 = size - 1;
        if (i < i4) {
            int i5 = i + 1;
            Object obj = w[i4];
            w[i] = obj;
            x[i] = x[i4];
            w[i4] = null;
            x[i4] = null;
            v[i] = v[i4];
            v[i4] = 0;
            int r = hwx.r(obj) & i2;
            int w2 = hwx.w(i3, r);
            if (w2 == size) {
                hwx.A(i3, r, i5);
                return;
            }
            while (true) {
                int i6 = w2 - 1;
                int i7 = v[i6];
                int i8 = i7 & i2;
                if (i8 != size) {
                    w2 = i8;
                } else {
                    v[i6] = hwx.t(i7, i5, i2);
                    return;
                }
            }
        } else {
            w[i] = null;
            x[i] = null;
            v[i] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map n = n();
        if (n != null) {
            return n.remove(obj);
        }
        Object h = h(obj);
        if (h == a) {
            return null;
        }
        return h;
    }

    public void s(int i) {
        this.b = Arrays.copyOf(v(), i);
        this.c = Arrays.copyOf(w(), i);
        this.d = Arrays.copyOf(x(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map n = n();
        if (n != null) {
            return n.size();
        }
        return this.f;
    }

    public final void t(int i, Object obj) {
        x()[i] = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u() {
        if (this.g == null) {
            return true;
        }
        return false;
    }

    public final int[] v() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection == null) {
            jgz jgzVar = new jgz(this);
            this.j = jgzVar;
            return jgzVar;
        }
        return collection;
    }

    public final Object[] w() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    public final Object[] x() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    public jha(int i) {
        p(i);
    }
}
