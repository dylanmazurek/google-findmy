package defpackage;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nks implements Serializable, Comparable {
    public static final nks a = new nks(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public nks(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        objectInputStream.getClass();
        if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            nks nksVar = new nks(bArr);
            Field declaredField = nks.class.getDeclaredField("b");
            declaredField.setAccessible(true);
            declaredField.set(this, nksVar.b);
            return;
        }
        throw new IllegalArgumentException(a.ae(readInt, "byteCount < 0: "));
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int b() {
        return this.b.length;
    }

    public String c() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            cArr[i] = nlp.a[(b >> 4) & 15];
            cArr[i + 1] = nlp.a[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        nks nksVar = (nks) obj;
        nksVar.getClass();
        int b = b();
        int b2 = nksVar.b();
        int min = Math.min(b, b2);
        int i = 0;
        while (true) {
            if (i < min) {
                int a2 = a(i) & 255;
                int a3 = nksVar.a(i) & 255;
                if (a2 == a3) {
                    i++;
                } else if (a2 < a3) {
                    return -1;
                }
            } else {
                if (b == b2) {
                    return 0;
                }
                if (b < b2) {
                    return -1;
                }
            }
        }
        return 1;
    }

    public final String d() {
        String str = this.d;
        if (str == null) {
            String aK = moz.aK(h());
            this.d = aK;
            return aK;
        }
        return str;
    }

    public nks e() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i < length) {
                int i2 = i + 1;
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, length);
                    copyOf.getClass();
                    copyOf[i] = (byte) (b + 32);
                    while (i2 < copyOf.length) {
                        int i3 = i2 + 1;
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                        i2 = i3;
                    }
                    return new nks(copyOf);
                }
                i = i2;
            } else {
                return this;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nks) {
            nks nksVar = (nks) obj;
            int b = nksVar.b();
            byte[] bArr = this.b;
            int length = bArr.length;
            if (b == length && nksVar.f(0, bArr, 0, length)) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && mkm.aN(bArr2, i, bArr, i2, i3)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g(nks nksVar) {
        nksVar.getClass();
        return i(nksVar, nksVar.b());
    }

    public byte[] h() {
        return this.b;
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.b);
        this.c = hashCode;
        return hashCode;
    }

    public boolean i(nks nksVar, int i) {
        return nksVar.f(0, this.b, 0, i);
    }

    public void j(nkp nkpVar, int i) {
        char[] cArr = nlp.a;
        nkpVar.B(this.b, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00d1, code lost:            if (r3 < 65536) goto L231;     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00ba, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00d4, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00d7, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x009b, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0118, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x011e, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x010d, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x012c, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0130, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0134, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00e2, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0138, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x004f, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0086, code lost:            if (r9 < 65536) goto L231;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0088, code lost:            r14 = 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008a, code lost:            r14 = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0075, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x008d, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0063, code lost:            if (r5 != 64) goto L215;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00c4, code lost:            if (r5 != 64) goto L215;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nks.toString():java.lang.String");
    }
}
