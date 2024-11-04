package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvu {
    public static final Charset a;
    private static final Charset b;
    private static final char[] c;
    private static final jeb d;

    static {
        Charset forName = Charset.forName("UTF-8");
        b = forName;
        c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        d = jeb.j("-_.*").e(new jds('0', '9')).e(new jds('A', 'Z')).e(new jds('a', 'z'));
        a = forName;
    }

    public static String a(String str, Charset charset) {
        char[] cArr;
        int i = 32;
        if (charset.equals(a)) {
            jql jqlVar = jvr.a;
            str.getClass();
            int i2 = 0;
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                jvs jvsVar = (jvs) jqlVar;
                boolean[] zArr = jvsVar.d;
                if (charAt < zArr.length && zArr[charAt]) {
                    i2++;
                } else {
                    int length = str.length();
                    char[] cArr2 = (char[]) jna.a.get();
                    cArr2.getClass();
                    int i3 = 0;
                    int i4 = 0;
                    while (i2 < length) {
                        if (i2 < length) {
                            int i5 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            int i6 = charAt2;
                            if (charAt2 >= 55296) {
                                i6 = charAt2;
                                if (charAt2 <= 57343) {
                                    if (charAt2 <= 56319) {
                                        if (i5 == length) {
                                            i6 = -charAt2;
                                        } else {
                                            char charAt3 = str.charAt(i5);
                                            if (Character.isLowSurrogate(charAt3)) {
                                                i6 = Character.toCodePoint(charAt2, charAt3);
                                            } else {
                                                throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt3 + "' with value " + ((int) charAt3) + " at index " + i5 + " in '" + str + "'");
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i2 + " in '" + str + "'");
                                    }
                                }
                            }
                            if (i6 >= 0) {
                                boolean[] zArr2 = jvsVar.d;
                                int i7 = 2;
                                if (i6 < zArr2.length && zArr2[i6]) {
                                    cArr = null;
                                } else if (i6 == i && jvsVar.c) {
                                    cArr = jvs.a;
                                } else if (i6 <= 127) {
                                    char[] cArr3 = jvs.b;
                                    cArr = new char[]{'%', cArr3[i6 >>> 4], cArr3[i6 & 15]};
                                } else if (i6 <= 2047) {
                                    char[] cArr4 = jvs.b;
                                    cArr = new char[]{'%', cArr4[(i6 >>> 10) | 12], cArr4[(i6 >>> 6) & 15], '%', cArr4[(3 & (i6 >>> 4)) | 8], cArr4[i6 & 15]};
                                } else if (i6 <= 65535) {
                                    char[] cArr5 = jvs.b;
                                    cArr = new char[]{'%', 'E', cArr5[i6 >>> 12], '%', cArr5[((i6 >>> 10) & 3) | 8], cArr5[(i6 >>> 6) & 15], '%', cArr5[((i6 >>> 4) & 3) | 8], cArr5[i6 & 15]};
                                } else if (i6 <= 1114111) {
                                    char[] cArr6 = jvs.b;
                                    cArr = new char[]{'%', 'F', cArr6[i6 >>> 18], '%', cArr6[((i6 >>> 16) & 3) | 8], cArr6[(i6 >>> 12) & 15], '%', cArr6[((i6 >>> 10) & 3) | 8], cArr6[(i6 >>> 6) & 15], '%', cArr6[((i6 >>> 4) & 3) | 8], cArr6[i6 & 15]};
                                } else {
                                    throw new IllegalArgumentException(a.ae(i6, "Invalid unicode character value "));
                                }
                                if (true != Character.isSupplementaryCodePoint(i6)) {
                                    i7 = 1;
                                }
                                int i8 = i7 + i2;
                                if (cArr != null) {
                                    int i9 = i2 - i3;
                                    int i10 = i4 + i9;
                                    int length2 = cArr2.length;
                                    int length3 = cArr.length;
                                    int i11 = i10 + length3;
                                    if (length2 < i11) {
                                        cArr2 = jql.i(cArr2, i4, i11 + (length - i2) + 32);
                                    }
                                    if (i9 > 0) {
                                        str.getChars(i3, i2, cArr2, i4);
                                        i4 = i10;
                                    }
                                    System.arraycopy(cArr, 0, cArr2, i4, length3);
                                    i4 += length3;
                                    i3 = i8;
                                }
                                i2 = i8;
                                while (i2 < length) {
                                    char charAt4 = str.charAt(i2);
                                    boolean[] zArr3 = jvsVar.d;
                                    if (charAt4 < zArr3.length && zArr3[charAt4]) {
                                        i2++;
                                    }
                                    i = 32;
                                }
                                i = 32;
                            } else {
                                throw new IllegalArgumentException("Trailing high surrogate at end of input");
                            }
                        } else {
                            throw new IndexOutOfBoundsException("Index exceeds specified range");
                        }
                    }
                    int i12 = length - i3;
                    if (i12 > 0) {
                        int i13 = i12 + i4;
                        if (cArr2.length < i13) {
                            cArr2 = jql.i(cArr2, i4, i13);
                        }
                        str.getChars(i3, length, cArr2, i4);
                        i4 = i13;
                    }
                    return new String(cArr2, 0, i4);
                }
            }
            return str;
        }
        int length4 = str.length();
        StringBuilder sb = new StringBuilder(length4 + length4);
        boolean z = false;
        int i14 = 0;
        for (byte b2 : str.getBytes(charset)) {
            int k = iqh.k(b2);
            char c2 = (char) k;
            if (d.c(c2)) {
                sb.append(c2);
                i14++;
            } else if (k == 32) {
                sb.append('+');
                i14++;
                z = true;
            } else {
                sb.append('%');
                char[] cArr7 = c;
                sb.append(cArr7[k >> 4]);
                sb.append(cArr7[k & 15]);
                i14 += 3;
            }
        }
        if (!z && i14 == str.length()) {
            return str;
        }
        return sb.toString();
    }
}
