package j$.time.chrono;

import j$.time.temporal.Temporal;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class A implements o, Serializable {
    public static final A d;
    private static final A[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient j$.time.g b;
    private final transient String c;

    static {
        A a = new A(-1, j$.time.g.f0(1868, 1, 1), "Meiji");
        d = a;
        A a2 = new A(0, j$.time.g.f0(1912, 7, 30), "Taisho");
        A a3 = new A(1, j$.time.g.f0(1926, 12, 25), "Showa");
        A a4 = new A(2, j$.time.g.f0(1989, 1, 8), "Heisei");
        A a5 = new A(3, j$.time.g.f0(2019, 5, 1), "Reiwa");
        e = r8;
        A[] aArr = {a, a2, a3, a4, a5};
    }

    private A(int i, j$.time.g gVar, String str) {
        this.a = i;
        this.b = gVar;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A l(j$.time.g gVar) {
        if (!gVar.b0(z.d)) {
            A[] aArr = e;
            for (int length = aArr.length - 1; length >= 0; length--) {
                A a = aArr[length];
                if (gVar.compareTo(a.b) >= 0) {
                    return a;
                }
            }
            return null;
        }
        throw new RuntimeException("JapaneseDate before Meiji 6 are not supported");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A m() {
        return e[r0.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static A t(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            A[] aArr = e;
            if (i2 < aArr.length) {
                return aArr[i2];
            }
        }
        throw new RuntimeException("Invalid era: " + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long v() {
        int i;
        long f = j$.time.temporal.a.DAY_OF_YEAR.k().f();
        for (A a : e) {
            if (a.b.c0()) {
                i = 366;
            } else {
                i = 365;
            }
            f = Math.min(f, (i - a.b.X()) + 1);
            if (a.p() != null) {
                f = Math.min(f, a.p().b.X() - 1);
            }
        }
        return f;
    }

    private Object writeReplace() {
        return new G((byte) 5, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long y() {
        int a0 = 1000000000 - m().b.a0();
        A[] aArr = e;
        int a02 = aArr[0].b.a0();
        for (int i = 1; i < aArr.length; i++) {
            A a = aArr[i];
            a0 = Math.min(a0, (a.b.a0() - a02) + 1);
            a02 = a.b.a0();
        }
        return a0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void A(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object B(j$.time.temporal.q qVar) {
        return AbstractC0040i.m(this, qVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal F(Temporal temporal) {
        return temporal.d(getValue(), j$.time.temporal.a.ERA);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean g(j$.time.temporal.o oVar) {
        return AbstractC0040i.i(this, oVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int n(j$.time.temporal.o oVar) {
        return AbstractC0040i.f(this, (j$.time.temporal.a) oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.g o() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A p() {
        if (this == m()) {
            return null;
        }
        return t(this.a + 1);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s r(j$.time.temporal.o oVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (oVar == aVar) {
            return x.d.K(aVar);
        }
        return j$.time.temporal.k.d(this, oVar);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long w(j$.time.temporal.o oVar) {
        return AbstractC0040i.g(this, oVar);
    }
}
