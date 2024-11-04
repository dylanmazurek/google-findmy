package j$.util;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Spliterators {
    private static final Spliterator a = new Object();
    private static final F b = new Object();

    private static void a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                } else {
                    throw new ArrayIndexOutOfBoundsException(i3);
                }
            }
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    public static F b() {
        return b;
    }

    public static Spliterator c() {
        return a;
    }

    public static InterfaceC0115v d(C c) {
        return new S(c);
    }

    public static InterfaceC0117x e(F f) {
        return new Q(f);
    }

    public static Iterator f(Spliterator spliterator) {
        return new P(spliterator);
    }

    public static C g(double[] dArr, int i, int i2) {
        dArr.getClass();
        a(dArr.length, i, i2);
        return new U(dArr, i, i2, 1040);
    }

    public static F h(int[] iArr, int i, int i2) {
        iArr.getClass();
        a(iArr.length, i, i2);
        return new Z(iArr, i, i2, 1040);
    }

    public static Spliterator i(Object[] objArr, int i, int i2, int i3) {
        objArr.getClass();
        a(objArr.length, i, i2);
        return new T(objArr, i, i2, i3);
    }

    public static Spliterator j(Iterator it) {
        it.getClass();
        return new a0(it);
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i) {
        collection.getClass();
        return new a0(collection, i);
    }
}
