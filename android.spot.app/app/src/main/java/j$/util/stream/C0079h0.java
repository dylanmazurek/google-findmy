package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0079h0 extends AbstractC0070d implements H, C, Consumer, Iterable, j$.lang.b {
    protected Object[] d;
    protected Object[][] e;

    @Override // j$.util.stream.H
    public final H a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(double d) {
        D.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.H
    public final void f(Object[] objArr, int i) {
        long j = i;
        long k = k() + j;
        if (k <= objArr.length && k >= j) {
            if (this.b == 0) {
                System.arraycopy(this.d, 0, objArr, i, this.a);
                return;
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                Object[] objArr2 = this.e[i2];
                System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
                i += this.e[i2].length;
            }
            int i3 = this.a;
            if (i3 > 0) {
                System.arraycopy(this.d, 0, objArr, i, i3);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("does not fit");
    }

    @Override // j$.util.stream.H
    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.b; i++) {
            for (Object obj : this.e[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            consumer.accept(this.d[i2]);
        }
    }

    @Override // j$.util.stream.C
    public final H g() {
        return this;
    }

    @Override // j$.util.stream.F0
    public final void h() {
    }

    @Override // j$.util.stream.F0
    public final void i(long j) {
        Object[][] objArr = this.e;
        if (objArr != null) {
            this.d = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.d;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.e = null;
            this.c = null;
        } else {
            for (int i2 = 0; i2 < this.a; i2++) {
                this.d[i2] = null;
            }
        }
        this.a = 0;
        this.b = 0;
        s(j);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.H
    public final Object[] j(C0074f c0074f) {
        long k = k();
        if (k < 2147483639) {
            Object[] objArr = (Object[]) c0074f.apply((int) k);
            f(objArr, 0);
            return objArr;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ int q() {
        return 0;
    }

    protected final void s(long j) {
        long length;
        int i;
        int i2 = this.b;
        if (i2 == 0) {
            length = this.d.length;
        } else {
            length = this.c[i2] + this.e[i2].length;
        }
        if (j > length) {
            if (this.e == null) {
                Object[][] objArr = new Object[8];
                this.e = objArr;
                this.c = new long[8];
                objArr[0] = this.d;
            }
            int i3 = i2 + 1;
            while (j > length) {
                Object[][] objArr2 = this.e;
                if (i3 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.e = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.c = Arrays.copyOf(this.c, length2);
                }
                if (i3 != 0 && i3 != 1) {
                    i = Math.min(i3 + 3, 30);
                } else {
                    i = 4;
                }
                int i4 = 1 << i;
                this.e[i3] = new Object[i4];
                long[] jArr = this.c;
                jArr[i3] = jArr[i3 - 1] + r5[r7].length;
                length += i4;
                i3++;
            }
        }
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return new K0(this, 0, this.b, 0, this.a);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C0078h(4, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }

    @Override // j$.util.stream.F0
    public final /* synthetic */ void accept(int i) {
        D.h();
        throw null;
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i = this.a;
        Object[] objArr = this.d;
        if (i == objArr.length) {
            if (this.e == null) {
                Object[][] objArr2 = new Object[8];
                this.e = objArr2;
                this.c = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.b;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.e;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i2].length + this.c[i2];
                }
                s(length + 1);
            }
            this.a = 0;
            int i4 = this.b + 1;
            this.b = i4;
            this.d = this.e[i4];
        }
        Object[] objArr4 = this.d;
        int i5 = this.a;
        this.a = i5 + 1;
        objArr4[i5] = obj;
    }
}
