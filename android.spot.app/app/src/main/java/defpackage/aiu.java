package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiu implements RandomAccess {
    public Object[] a;
    public int b = 0;
    private List c;

    public aiu(Object[] objArr) {
        this.a = objArr;
    }

    public final int a(Object obj) {
        int i = this.b;
        if (i > 0) {
            Object[] objArr = this.a;
            int i2 = 0;
            while (!amr.i(obj, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final Object b(int i) {
        Object[] objArr = this.a;
        Object obj = objArr[i];
        int i2 = this.b;
        if (i != i2 - 1) {
            mkm.q(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final Object c(int i, Object obj) {
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final List d() {
        List list = this.c;
        if (list == null) {
            air airVar = new air(this);
            this.c = airVar;
            return airVar;
        }
        return list;
    }

    public final void e(int i, Object obj) {
        g(this.b + 1);
        Object[] objArr = this.a;
        int i2 = this.b;
        if (i != i2) {
            mkm.q(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = obj;
        this.b++;
    }

    public final void f() {
        Object[] objArr = this.a;
        int i = this.b;
        while (true) {
            i--;
            if (i >= 0) {
                objArr[i] = null;
            } else {
                this.b = 0;
                return;
            }
        }
    }

    public final void g(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, length + length));
            copyOf.getClass();
            this.a = copyOf;
        }
    }

    public final void h(int i, int i2) {
        if (i2 > i) {
            int i3 = this.b;
            if (i2 < i3) {
                Object[] objArr = this.a;
                mkm.q(objArr, objArr, i, i2, i3);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.a[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.b = i5;
        }
    }

    public final void i(Comparator comparator) {
        Object[] objArr = this.a;
        int i = this.b;
        objArr.getClass();
        Arrays.sort(objArr, 0, i, comparator);
    }

    public final boolean j(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        g(this.b + collection.size());
        Object[] objArr = this.a;
        if (i != this.b) {
            mkm.q(objArr, objArr, collection.size() + i, i, this.b);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                mkm.S();
            }
            objArr[i2 + i] = obj;
            i2 = i3;
        }
        this.b += collection.size();
        return true;
    }

    public final boolean k(Object obj) {
        int i = this.b - 1;
        if (i >= 0) {
            for (int i2 = 0; !amr.i(this.a[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean n(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            b(a);
            return true;
        }
        return false;
    }

    public final void o(Object obj) {
        g(this.b + 1);
        Object[] objArr = this.a;
        int i = this.b;
        objArr[i] = obj;
        this.b = i + 1;
    }

    public final void p(int i, aiu aiuVar) {
        if (aiuVar.l()) {
            return;
        }
        g(this.b + aiuVar.b);
        Object[] objArr = this.a;
        int i2 = this.b;
        if (i != i2) {
            mkm.q(objArr, objArr, aiuVar.b + i, i, i2);
        }
        mkm.q(aiuVar.a, objArr, i, 0, aiuVar.b);
        this.b += aiuVar.b;
    }

    public final void q(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        g(this.b + list.size());
        Object[] objArr = this.a;
        if (i != this.b) {
            mkm.q(objArr, objArr, list.size() + i, i, this.b);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = list.get(i2);
        }
        this.b += list.size();
    }
}
