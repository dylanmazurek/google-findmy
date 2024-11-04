package defpackage;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lim implements Iterable, Serializable {
    public static final lim b = new lik(ljw.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    public static void B(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i + i;
                bArr[i] = (byte) (c(str, i2 + 1) | (c(str, i2) << 4));
            }
            new lik(bArr);
            return;
        }
        throw new NumberFormatException("Invalid hexString " + str + " of length " + str.length() + " must be even.");
    }

    private static int c(String str, int i) {
        int i2;
        char charAt = str.charAt(i);
        if (charAt >= '0' && charAt <= '9') {
            i2 = charAt - '0';
        } else if (charAt >= 'A' && charAt <= 'F') {
            i2 = charAt - '7';
        } else if (charAt >= 'a' && charAt <= 'f') {
            i2 = charAt - 'W';
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            return i2;
        }
        throw new NumberFormatException("Invalid hexString " + str + " must only contain [0-9a-fA-F] but contained " + str.charAt(i) + " at index " + i);
    }

    private static lim g(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (lim) it.next();
            }
            int i2 = i >>> 1;
            return g(it, i2).r(g(it, i - i2));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int p(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(a.ad(i2, i, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(a.ad(i3, i2, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(a.am(i, "Beginning index: ", " < 0"));
        }
        return i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static lim s(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return b;
        }
        return g(iterable.iterator(), size);
    }

    public static lim t(byte[] bArr) {
        return u(bArr, 0, bArr.length);
    }

    public static lim u(byte[] bArr, int i, int i2) {
        p(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new lik(bArr2);
    }

    public static lim v(String str) {
        return new lik(str.getBytes(ljw.a));
    }

    public static void x(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(a.ae(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(a.ad(i2, i, "Index > length: ", ", "));
        }
    }

    public final byte[] A() {
        int d = d();
        if (d == 0) {
            return ljw.b;
        }
        byte[] bArr = new byte[d];
        e(bArr, 0, 0, d);
        return bArr;
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int d();

    public abstract void e(byte[] bArr, int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i = this.c;
        if (i == 0) {
            int d = d();
            i = i(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.c = i;
        }
        return i;
    }

    public abstract int i(int i, int i2, int i3);

    public abstract lim j(int i, int i2);

    public abstract liq k();

    public abstract InputStream l();

    public abstract ByteBuffer m();

    public abstract void n(lie lieVar);

    public abstract void o(OutputStream outputStream);

    @Override // java.lang.Iterable
    /* renamed from: q */
    public lii iterator() {
        return new lif(this);
    }

    public final lim r(lim limVar) {
        llf llfVar;
        if (Integer.MAX_VALUE - d() >= limVar.d()) {
            int[] iArr = llf.a;
            if (limVar.d() != 0) {
                if (d() != 0) {
                    int d = d() + limVar.d();
                    if (d < 128) {
                        return llf.g(this, limVar);
                    }
                    if (this instanceof llf) {
                        llf llfVar2 = (llf) this;
                        if (llfVar2.f.d() + limVar.d() < 128) {
                            llfVar = new llf(llfVar2.e, llf.g(llfVar2.f, limVar));
                            return llfVar;
                        }
                        if (llfVar2.e.f() > llfVar2.f.f() && llfVar2.g > limVar.f()) {
                            return new llf(llfVar2.e, new llf(llfVar2.f, limVar));
                        }
                    }
                    if (d >= llf.c(Math.max(f(), limVar.f()) + 1)) {
                        llfVar = new llf(this, limVar);
                        return llfVar;
                    }
                    ArrayDeque arrayDeque = new ArrayDeque();
                    kzy.H(this, arrayDeque);
                    kzy.H(limVar, arrayDeque);
                    lim limVar2 = (lim) arrayDeque.pop();
                    while (!arrayDeque.isEmpty()) {
                        limVar2 = new llf((lim) arrayDeque.pop(), limVar2);
                    }
                    return limVar2;
                }
                return limVar;
            }
            return this;
        }
        throw new IllegalArgumentException("ByteString would be too long: " + d() + "+" + limVar.d());
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        Integer valueOf = Integer.valueOf(d());
        if (d() <= 50) {
            concat = kzy.G(this);
        } else {
            concat = kzy.G(j(0, 47)).concat("...");
        }
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", hexString, valueOf, concat);
    }

    public final lim w(int i) {
        return j(i, d());
    }

    @Deprecated
    public final void y(byte[] bArr, int i, int i2, int i3) {
        p(i, i + i3, d());
        p(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            e(bArr, i, i2, i3);
        }
    }

    public final boolean z() {
        if (d() == 0) {
            return true;
        }
        return false;
    }
}
