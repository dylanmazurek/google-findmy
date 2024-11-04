package defpackage;

import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llf extends lim {
    public static final int[] a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    public final int d;
    public final lim e;
    public final lim f;
    public final int g;
    private final int h;

    public llf(lim limVar, lim limVar2) {
        this.e = limVar;
        this.f = limVar2;
        int d = limVar.d();
        this.h = d;
        this.d = d + limVar2.d();
        this.g = Math.max(limVar.f(), limVar2.f()) + 1;
    }

    public static int c(int i) {
        int[] iArr = a;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static lim g(lim limVar, lim limVar2) {
        int d = limVar.d();
        int d2 = limVar2.d();
        byte[] bArr = new byte[d + d2];
        limVar.y(bArr, 0, 0, d);
        limVar2.y(bArr, 0, d, d2);
        return new lik(bArr);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.lim
    public final byte a(int i) {
        x(i, this.d);
        return b(i);
    }

    @Override // defpackage.lim
    public final byte b(int i) {
        int i2 = this.h;
        if (i < i2) {
            return this.e.b(i);
        }
        return this.f.b(i - i2);
    }

    @Override // defpackage.lim
    public final int d() {
        return this.d;
    }

    @Override // defpackage.lim
    public final void e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            this.e.e(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.f.e(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.e.e(bArr, i, i2, i6);
            this.f.e(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // defpackage.lim
    public final boolean equals(Object obj) {
        boolean g;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lim)) {
            return false;
        }
        lim limVar = (lim) obj;
        if (this.d != limVar.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        int i = this.c;
        int i2 = limVar.c;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        lld lldVar = new lld(this);
        lij next = lldVar.next();
        lld lldVar2 = new lld(limVar);
        lij next2 = lldVar2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int d = next.d() - i3;
            int d2 = next2.d() - i4;
            int min = Math.min(d, d2);
            if (i3 == 0) {
                g = next.g(next2, i4, min);
            } else {
                g = next2.g(next, i3, min);
            }
            if (!g) {
                return false;
            }
            i5 += min;
            int i6 = this.d;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == d) {
                i3 = 0;
                next = lldVar.next();
            } else {
                i3 += min;
                next = next;
            }
            if (min == d2) {
                next2 = lldVar2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    @Override // defpackage.lim
    public final int f() {
        return this.g;
    }

    @Override // defpackage.lim
    public final boolean h() {
        if (this.d >= c(this.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lim
    public final int i(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.h;
        if (i4 <= i5) {
            return this.e.i(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f.i(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f.i(this.e.i(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.lim, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new llc(this);
    }

    @Override // defpackage.lim
    public final lim j(int i, int i2) {
        int p = p(i, i2, this.d);
        if (p == 0) {
            return lim.b;
        }
        if (p == this.d) {
            return this;
        }
        int i3 = this.h;
        if (i2 <= i3) {
            return this.e.j(i, i2);
        }
        int i4 = i2 - i3;
        if (i >= i3) {
            return this.f.j(i - i3, i4);
        }
        return new llf(this.e.w(i), this.f.j(0, i4));
    }

    @Override // defpackage.lim
    public final liq k() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        lld lldVar = new lld(this);
        while (lldVar.hasNext()) {
            arrayList.add(lldVar.next().m());
        }
        int i = liq.e;
        int i2 = 0;
        int i3 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i3 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i2 |= 1;
            } else if (byteBuffer.isDirect()) {
                i2 |= 2;
            } else {
                i2 |= 4;
            }
        }
        if (i2 == 2) {
            return new lio(arrayList, i3);
        }
        return liq.J(new ljz(arrayList));
    }

    @Override // defpackage.lim
    public final InputStream l() {
        return new lle(this);
    }

    @Override // defpackage.lim
    public final ByteBuffer m() {
        return ByteBuffer.wrap(A()).asReadOnlyBuffer();
    }

    @Override // defpackage.lim
    public final void n(lie lieVar) {
        this.e.n(lieVar);
        this.f.n(lieVar);
    }

    @Override // defpackage.lim
    public final void o(OutputStream outputStream) {
        this.e.o(outputStream);
        this.f.o(outputStream);
    }

    @Override // defpackage.lim
    /* renamed from: q */
    public final lii iterator() {
        return new llc(this);
    }

    Object writeReplace() {
        return new lik(A());
    }
}
