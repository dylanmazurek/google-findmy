package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfh {
    private static final kff c = new kff(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final kuv b = new kuv(new kpb(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] a = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static int a(long[] jArr) {
        return kfl.k(jArr)[0] & 1;
    }

    public static long b(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static long c(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | b(bArr, i);
    }

    public static void d(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static boolean e(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        kfl.e(jArr2);
        byte[] k = kfl.k(jArr2);
        for (int i = 0; i < 32; i++) {
            if (k[i] != 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] f(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) kmn.d.a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] digest = messageDigest.digest();
        digest[0] = (byte) (digest[0] & 248);
        int i = digest[31] & Byte.MAX_VALUE;
        digest[31] = (byte) i;
        digest[31] = (byte) (i | 64);
        return digest;
    }

    public static byte[] g(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i2 = 0;
        while (true) {
            if (i2 >= 32) {
                break;
            }
            int i3 = i2 + i2;
            bArr2[i3] = (byte) (bArr[i2] & 15);
            bArr2[i3 + 1] = (byte) ((bArr[i2] & 255) >> 4);
            i2++;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < 63) {
            byte b2 = (byte) (bArr2[i4] + i5);
            bArr2[i4] = b2;
            int i6 = (b2 + 8) >> 4;
            bArr2[i4] = (byte) (b2 - (i6 << 4));
            i4++;
            i5 = i6;
        }
        bArr2[63] = (byte) (bArr2[63] + i5);
        kuv kuvVar = new kuv(b, (byte[]) null, (byte[]) null, (byte[]) null);
        kuv kuvVar2 = new kuv((byte[]) null, (byte[]) null);
        for (i = 1; i < 64; i += 2) {
            kff kffVar = new kff(c);
            m(kffVar, i / 2, bArr2[i]);
            kuv.q(kuvVar2, kuvVar);
            j(kuvVar, kuvVar2, kffVar);
        }
        kpb kpbVar = new kpb((byte[]) null);
        kpb.u(kpbVar, kuvVar);
        i(kuvVar, kpbVar);
        kpb.u(kpbVar, kuvVar);
        i(kuvVar, kpbVar);
        kpb.u(kpbVar, kuvVar);
        i(kuvVar, kpbVar);
        kpb.u(kpbVar, kuvVar);
        i(kuvVar, kpbVar);
        for (int i7 = 0; i7 < 64; i7 += 2) {
            kff kffVar2 = new kff(c);
            m(kffVar2, i7 / 2, bArr2[i7]);
            kuv.q(kuvVar2, kuvVar);
            j(kuvVar, kuvVar2, kffVar2);
        }
        kpb kpbVar2 = new kpb(kuvVar);
        long[] jArr = new long[10];
        kfl.h(jArr, (long[]) kpbVar2.b);
        long[] jArr2 = new long[10];
        kfl.h(jArr2, (long[]) kpbVar2.c);
        long[] jArr3 = new long[10];
        kfl.h(jArr3, (long[]) kpbVar2.a);
        long[] jArr4 = new long[10];
        kfl.h(jArr4, jArr3);
        long[] jArr5 = new long[10];
        kfl.i(jArr5, jArr2, jArr);
        kfl.b(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        kfl.b(jArr6, jArr, jArr2);
        kfl.b(jArr6, jArr6, kfi.a);
        kfl.j(jArr6, jArr6, jArr4);
        kfl.d(jArr6, jArr6);
        if (MessageDigest.isEqual(kfl.k(jArr5), kfl.k(jArr6))) {
            return kpbVar2.k();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    public static byte[] h(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        int i5 = b2 << i4;
                        int i6 = b3 + i5;
                        if (i6 <= 15) {
                            bArr2[i3] = (byte) i6;
                            bArr2[i] = 0;
                        } else {
                            int i7 = b3 - i5;
                            if (i7 >= -15) {
                                bArr2[i3] = (byte) i7;
                                while (true) {
                                    if (i >= 256) {
                                        break;
                                    }
                                    if (bArr2[i] == 0) {
                                        bArr2[i] = 1;
                                        break;
                                    }
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void i(kuv kuvVar, kpb kpbVar) {
        long[] jArr = new long[10];
        kfl.h((long[]) ((kpb) kuvVar.b).b, (long[]) kpbVar.b);
        kfl.h((long[]) ((kpb) kuvVar.b).a, (long[]) kpbVar.c);
        kfl.h((long[]) kuvVar.a, (long[]) kpbVar.a);
        long[] jArr2 = (long[]) kuvVar.a;
        kfl.j(jArr2, jArr2, jArr2);
        Object obj = ((kpb) kuvVar.b).c;
        long[] jArr3 = (long[]) obj;
        kfl.j(jArr3, (long[]) kpbVar.b, (long[]) kpbVar.c);
        kfl.h(jArr, (long[]) ((kpb) kuvVar.b).c);
        kpb kpbVar2 = (kpb) kuvVar.b;
        Object obj2 = kpbVar2.c;
        long[] jArr4 = (long[]) obj2;
        kfl.j(jArr4, (long[]) kpbVar2.a, (long[]) kpbVar2.b);
        kpb kpbVar3 = (kpb) kuvVar.b;
        long[] jArr5 = (long[]) kpbVar3.a;
        kfl.i(jArr5, jArr5, (long[]) kpbVar3.b);
        kpb kpbVar4 = (kpb) kuvVar.b;
        kfl.i((long[]) kpbVar4.b, jArr, (long[]) kpbVar4.c);
        long[] jArr6 = (long[]) ((kpb) kuvVar.b).a;
        long[] jArr7 = (long[]) kuvVar.a;
        kfl.i(jArr7, jArr7, jArr6);
    }

    public static void j(kuv kuvVar, kuv kuvVar2, kff kffVar) {
        long[] jArr = new long[10];
        Object obj = ((kpb) kuvVar.b).b;
        kpb kpbVar = (kpb) kuvVar2.a;
        long[] jArr2 = (long[]) obj;
        kfl.j(jArr2, (long[]) kpbVar.c, (long[]) kpbVar.b);
        Object obj2 = ((kpb) kuvVar.b).c;
        kpb kpbVar2 = (kpb) kuvVar2.a;
        long[] jArr3 = (long[]) obj2;
        kfl.i(jArr3, (long[]) kpbVar2.c, (long[]) kpbVar2.b);
        long[] jArr4 = (long[]) ((kpb) kuvVar.b).c;
        kfl.b(jArr4, jArr4, kffVar.b);
        kpb kpbVar3 = (kpb) kuvVar.b;
        Object obj3 = kpbVar3.a;
        long[] jArr5 = (long[]) obj3;
        kfl.b(jArr5, (long[]) kpbVar3.b, kffVar.a);
        long[] jArr6 = kffVar.c;
        kfl.b((long[]) kuvVar.a, (long[]) kuvVar2.b, jArr6);
        kffVar.b((long[]) ((kpb) kuvVar.b).b, (long[]) ((kpb) kuvVar2.a).a);
        long[] jArr7 = (long[]) ((kpb) kuvVar.b).b;
        kfl.j(jArr, jArr7, jArr7);
        kpb kpbVar4 = (kpb) kuvVar.b;
        Object obj4 = kpbVar4.b;
        long[] jArr8 = (long[]) obj4;
        kfl.i(jArr8, (long[]) kpbVar4.a, (long[]) kpbVar4.c);
        kpb kpbVar5 = (kpb) kuvVar.b;
        Object obj5 = kpbVar5.a;
        long[] jArr9 = (long[]) kpbVar5.c;
        kfl.j(jArr9, (long[]) obj5, jArr9);
        kfl.j((long[]) ((kpb) kuvVar.b).a, jArr, (long[]) kuvVar.a);
        long[] jArr10 = (long[]) kuvVar.a;
        kfl.i(jArr10, jArr, jArr10);
    }

    public static void k(kuv kuvVar, kuv kuvVar2, kff kffVar) {
        long[] jArr = new long[10];
        Object obj = ((kpb) kuvVar.b).b;
        kpb kpbVar = (kpb) kuvVar2.a;
        long[] jArr2 = (long[]) obj;
        kfl.j(jArr2, (long[]) kpbVar.c, (long[]) kpbVar.b);
        Object obj2 = ((kpb) kuvVar.b).c;
        kpb kpbVar2 = (kpb) kuvVar2.a;
        long[] jArr3 = (long[]) obj2;
        kfl.i(jArr3, (long[]) kpbVar2.c, (long[]) kpbVar2.b);
        long[] jArr4 = (long[]) ((kpb) kuvVar.b).c;
        kfl.b(jArr4, jArr4, kffVar.a);
        kpb kpbVar3 = (kpb) kuvVar.b;
        Object obj3 = kpbVar3.a;
        long[] jArr5 = (long[]) obj3;
        kfl.b(jArr5, (long[]) kpbVar3.b, kffVar.b);
        long[] jArr6 = kffVar.c;
        kfl.b((long[]) kuvVar.a, (long[]) kuvVar2.b, jArr6);
        kffVar.b((long[]) ((kpb) kuvVar.b).b, (long[]) ((kpb) kuvVar2.a).a);
        long[] jArr7 = (long[]) ((kpb) kuvVar.b).b;
        kfl.j(jArr, jArr7, jArr7);
        kpb kpbVar4 = (kpb) kuvVar.b;
        Object obj4 = kpbVar4.b;
        long[] jArr8 = (long[]) obj4;
        kfl.i(jArr8, (long[]) kpbVar4.a, (long[]) kpbVar4.c);
        kpb kpbVar5 = (kpb) kuvVar.b;
        Object obj5 = kpbVar5.a;
        long[] jArr9 = (long[]) kpbVar5.c;
        kfl.j(jArr9, (long[]) obj5, jArr9);
        kfl.i((long[]) ((kpb) kuvVar.b).a, jArr, (long[]) kuvVar.a);
        long[] jArr10 = (long[]) kuvVar.a;
        kfl.j(jArr10, jArr, jArr10);
    }

    private static int l(int i, int i2) {
        int i3 = (~(i ^ i2)) & 255;
        int i4 = i3 & (i3 << 4);
        int i5 = i4 & (i4 << 2);
        return (i5 & (i5 + i5)) >> 7;
    }

    private static void m(kff kffVar, int i, byte b2) {
        int i2 = (b2 & 255) >> 7;
        int i3 = (-i2) & b2;
        int i4 = b2 - (i3 + i3);
        kffVar.a(kfi.d[i][0], l(i4, 1));
        kffVar.a(kfi.d[i][1], l(i4, 2));
        kffVar.a(kfi.d[i][2], l(i4, 3));
        kffVar.a(kfi.d[i][3], l(i4, 4));
        kffVar.a(kfi.d[i][4], l(i4, 5));
        kffVar.a(kfi.d[i][5], l(i4, 6));
        kffVar.a(kfi.d[i][6], l(i4, 7));
        kffVar.a(kfi.d[i][7], l(i4, 8));
        long[] jArr = kffVar.c;
        long[] jArr2 = kffVar.a;
        long[] copyOf = Arrays.copyOf(kffVar.b, 10);
        long[] copyOf2 = Arrays.copyOf(jArr2, 10);
        long[] copyOf3 = Arrays.copyOf(jArr, 10);
        d(copyOf3, copyOf3);
        kffVar.a(new kff(copyOf, copyOf2, copyOf3), i2);
    }
}
