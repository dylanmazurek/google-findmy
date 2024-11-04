package defpackage;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmg implements kai {
    private final byte[] a;
    private final byte[] b;
    private final /* synthetic */ int c;
    private final Object d;

    public kmg(kai kaiVar, byte[] bArr, byte[] bArr2, int i) {
        this.c = i;
        this.d = kaiVar;
        this.a = bArr;
        this.b = bArr2;
    }

    public static byte[] b(kgk kgkVar) {
        if (kgkVar.e.equals(kjr.LEGACY)) {
            return new byte[]{0};
        }
        return new byte[0];
    }

    public static byte[] c(kgk kgkVar) {
        int ordinal = kgkVar.e.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                } else {
                    return kgb.a.c();
                }
            }
            return kgb.a(kgkVar.f.intValue()).c();
        }
        return kgb.b(kgkVar.f.intValue()).c();
    }

    private final void d(byte[] bArr, byte[] bArr2) {
        char c;
        byte b;
        int i;
        byte b2;
        byte[] bArr3 = bArr;
        int i2 = 0;
        char c2 = 1;
        if (bArr3.length == 64) {
            byte[] c3 = ((knb) this.d).c();
            byte[] copyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i3 = 31;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                int i4 = copyOfRange[i3] & 255;
                int i5 = kfh.a[i3] & 255;
                if (i4 != i5) {
                    if (i4 < i5) {
                        MessageDigest messageDigest = (MessageDigest) kmn.d.a("SHA-512");
                        messageDigest.update(bArr3, i2, 32);
                        messageDigest.update(c3);
                        messageDigest.update(bArr2);
                        byte[] digest = messageDigest.digest();
                        long b3 = kfh.b(digest, i2) & 2097151;
                        long c4 = kfh.c(digest, 2) >> 5;
                        long b4 = kfh.b(digest, 5) >> 2;
                        long c5 = kfh.c(digest, 7) >> 7;
                        long c6 = kfh.c(digest, 10) >> 4;
                        long b5 = kfh.b(digest, 13) >> c2;
                        long c7 = kfh.c(digest, 15) >> 6;
                        long b6 = kfh.b(digest, 18) >> 3;
                        long b7 = kfh.b(digest, 21) & 2097151;
                        long c8 = kfh.c(digest, 23) >> 5;
                        long b8 = kfh.b(digest, 26) >> 2;
                        long c9 = kfh.c(digest, 28) >> 7;
                        long c10 = kfh.c(digest, 31) >> 4;
                        long b9 = kfh.b(digest, 34) >> c2;
                        long c11 = kfh.c(digest, 36) >> 6;
                        long b10 = kfh.b(digest, 39) >> 3;
                        long b11 = kfh.b(digest, 42) & 2097151;
                        long c12 = kfh.c(digest, 44) >> 5;
                        long b12 = (kfh.b(digest, 47) >> 2) & 2097151;
                        long c13 = (kfh.c(digest, 49) >> 7) & 2097151;
                        long c14 = (kfh.c(digest, 52) >> 4) & 2097151;
                        long b13 = (kfh.b(digest, 55) >> c2) & 2097151;
                        long c15 = (kfh.c(digest, 57) >> 6) & 2097151;
                        long c16 = kfh.c(digest, 60) >> 3;
                        long j = (c7 & 2097151) + (b12 * 666643);
                        long j2 = (j + 1048576) >> 21;
                        long j3 = j2 << 21;
                        long j4 = b7 + (c14 * 666643) + (c13 * 470296) + (b12 * 654183);
                        long j5 = (j4 + 1048576) >> 21;
                        long j6 = j5 << 21;
                        long j7 = (((((b8 & 2097151) + (c15 * 666643)) + (b13 * 470296)) + (c14 * 654183)) - (c13 * 997805)) + (b12 * 136657);
                        long j8 = (j7 + 1048576) >> 21;
                        long j9 = j8 << 21;
                        long j10 = (((((c10 & 2097151) + (c16 * 470296)) + (c15 * 654183)) - (b13 * 997805)) + (c14 * 136657)) - (c13 * 683901);
                        long j11 = (j10 + 1048576) >> 21;
                        long j12 = (((c11 & 2097151) - (c16 * 997805)) + (c15 * 136657)) - (b13 * 683901);
                        long j13 = (j12 + 1048576) >> 21;
                        long j14 = b11 - (c16 * 683901);
                        long j15 = (j14 + 1048576) >> 21;
                        long j16 = b6 + (c13 * 666643) + (b12 * 470296) + j2;
                        long j17 = (j16 + 1048576) >> 21;
                        long j18 = j17 << 21;
                        long j19 = (((((c8 & 2097151) + (b13 * 666643)) + (c14 * 470296)) + (c13 * 654183)) - (b12 * 997805)) + j5;
                        long j20 = (j19 + 1048576) >> 21;
                        long j21 = j20 << 21;
                        long j22 = (((((((c9 & 2097151) + (c16 * 666643)) + (c15 * 470296)) + (b13 * 654183)) - (c14 * 997805)) + (c13 * 136657)) - (b12 * 683901)) + j8;
                        long j23 = (j22 + 1048576) >> 21;
                        long j24 = j23 << 21;
                        long j25 = (((((b9 & 2097151) + (c16 * 654183)) - (c15 * 997805)) + (b13 * 136657)) - (c14 * 683901)) + j11;
                        long j26 = (j25 + 1048576) >> 21;
                        long j27 = ((b10 + (c16 * 136657)) - (c15 * 683901)) + j13;
                        long j28 = (j27 + 1048576) >> 21;
                        long j29 = (j10 - (j11 << 21)) + j23;
                        long j30 = b3 + (j29 * 666643);
                        long j31 = (j30 + 1048576) >> 21;
                        long j32 = j31 << 21;
                        long j33 = (j12 - (j13 << 21)) + j26;
                        long j34 = j25 - (j26 << 21);
                        long j35 = (b4 & 2097151) + (j33 * 666643) + (j34 * 470296) + (j29 * 654183);
                        long j36 = (j35 + 1048576) >> 21;
                        long j37 = j36 << 21;
                        long j38 = (j14 - (j15 << 21)) + j28;
                        long j39 = j27 - (j28 << 21);
                        long j40 = (((((c6 & 2097151) + (j38 * 666643)) + (j39 * 470296)) + (j33 * 654183)) - (j34 * 997805)) + (j29 * 136657);
                        long j41 = (j40 + 1048576) >> 21;
                        long j42 = j41 << 21;
                        long j43 = (c12 & 2097151) + j15;
                        long j44 = (((((j - j3) + (j43 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j33 * 136657)) - (j34 * 683901);
                        long j45 = (j44 + 1048576) >> 21;
                        long j46 = j45 << 21;
                        long j47 = ((((j4 - j6) + j17) - (j43 * 997805)) + (j38 * 136657)) - (j39 * 683901);
                        long j48 = (j47 + 1048576) >> 21;
                        long j49 = j48 << 21;
                        long j50 = ((j7 - j9) + j20) - (j43 * 683901);
                        long j51 = (j50 + 1048576) >> 21;
                        long j52 = (c4 & 2097151) + (j34 * 666643) + (j29 * 470296) + j31;
                        long j53 = (j52 + 1048576) >> 21;
                        long j54 = (((((c5 & 2097151) + (j39 * 666643)) + (j33 * 470296)) + (j34 * 654183)) - (j29 * 997805)) + j36;
                        long j55 = (j54 + 1048576) >> 21;
                        long j56 = (((((((b5 & 2097151) + (j43 * 666643)) + (j38 * 470296)) + (j39 * 654183)) - (j33 * 997805)) + (j34 * 136657)) - (j29 * 683901)) + j41;
                        long j57 = (j56 + 1048576) >> 21;
                        long j58 = (((((j16 - j18) + (j43 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j33 * 683901)) + j45;
                        long j59 = (j58 + 1048576) >> 21;
                        long j60 = (((j19 - j21) + (j43 * 136657)) - (j38 * 683901)) + j48;
                        long j61 = (j60 + 1048576) >> 21;
                        long j62 = (j22 - j24) + j51;
                        long j63 = (j62 + 1048576) >> 21;
                        long j64 = j63 << 21;
                        long j65 = (j30 - j32) + (j63 * 666643);
                        long j66 = j65 >> 21;
                        long j67 = j66 << 21;
                        long j68 = (j52 - (j53 << 21)) + (j63 * 470296) + j66;
                        long j69 = j68 >> 21;
                        long j70 = j69 << 21;
                        long j71 = (j35 - j37) + j53 + (j63 * 654183) + j69;
                        long j72 = j71 >> 21;
                        long j73 = j72 << 21;
                        long j74 = ((j54 - (j55 << 21)) - (j63 * 997805)) + j72;
                        long j75 = j74 >> 21;
                        long j76 = j75 << 21;
                        long j77 = (j40 - j42) + j55 + (j63 * 136657) + j75;
                        long j78 = j77 >> 21;
                        long j79 = j78 << 21;
                        long j80 = ((j56 - (j57 << 21)) - (j63 * 683901)) + j78;
                        long j81 = j80 >> 21;
                        long j82 = j81 << 21;
                        long j83 = (j44 - j46) + j57 + j81;
                        long j84 = j83 >> 21;
                        long j85 = j84 << 21;
                        long j86 = (j58 - (j59 << 21)) + j84;
                        long j87 = j86 >> 21;
                        long j88 = j87 << 21;
                        long j89 = (j47 - j49) + j59 + j87;
                        long j90 = j89 >> 21;
                        long j91 = j90 << 21;
                        long j92 = (j60 - (j61 << 21)) + j90;
                        long j93 = j92 >> 21;
                        long j94 = j93 << 21;
                        long j95 = (j50 - (j51 << 21)) + j61 + j93;
                        long j96 = j95 >> 21;
                        long j97 = j96 << 21;
                        long j98 = (j62 - j64) + j96;
                        long j99 = j98 >> 21;
                        long j100 = j99 << 21;
                        long j101 = (j65 - j67) + (666643 * j99);
                        long j102 = j101 >> 21;
                        long j103 = j102 << 21;
                        long j104 = (j68 - j70) + (470296 * j99) + j102;
                        long j105 = j104 >> 21;
                        long j106 = j105 << 21;
                        long j107 = (j71 - j73) + (654183 * j99) + j105;
                        long j108 = j107 >> 21;
                        long j109 = j108 << 21;
                        long j110 = ((j74 - j76) - (997805 * j99)) + j108;
                        long j111 = j110 >> 21;
                        long j112 = j111 << 21;
                        long j113 = (j77 - j79) + (136657 * j99) + j111;
                        long j114 = j113 >> 21;
                        long j115 = ((j80 - j82) - (j99 * 683901)) + j114;
                        long j116 = j115 >> 21;
                        long j117 = j116 << 21;
                        long j118 = (j83 - j85) + j116;
                        long j119 = j118 >> 21;
                        long j120 = j119 << 21;
                        long j121 = (j86 - j88) + j119;
                        long j122 = j121 >> 21;
                        long j123 = j122 << 21;
                        long j124 = (j89 - j91) + j122;
                        long j125 = j124 >> 21;
                        long j126 = j125 << 21;
                        long j127 = (j92 - j94) + j125;
                        long j128 = j127 >> 21;
                        long j129 = j128 << 21;
                        long j130 = (j95 - j97) + j128;
                        long j131 = j130 >> 21;
                        digest[0] = (byte) (j101 - j103);
                        long j132 = j121 - j123;
                        long j133 = j118 - j120;
                        long j134 = j115 - j117;
                        long j135 = j113 - (j114 << 21);
                        long j136 = j110 - j112;
                        long j137 = j107 - j109;
                        long j138 = j104 - j106;
                        digest[c2] = (byte) (r10 >> 8);
                        digest[2] = (byte) ((r10 >> 16) | (j138 << 5));
                        digest[3] = (byte) (j138 >> 3);
                        digest[4] = (byte) (j138 >> 11);
                        digest[5] = (byte) ((j138 >> 19) | (j137 << 2));
                        digest[6] = (byte) (j137 >> 6);
                        digest[7] = (byte) ((j137 >> 14) | (j136 << 7));
                        digest[8] = (byte) (j136 >> c2);
                        digest[9] = (byte) (j136 >> 9);
                        digest[10] = (byte) ((j136 >> 17) | (j135 << 4));
                        digest[11] = (byte) (j135 >> 4);
                        digest[12] = (byte) (j135 >> 12);
                        digest[13] = (byte) ((j135 >> 20) | (j134 + j134));
                        digest[14] = (byte) (j134 >> 7);
                        digest[15] = (byte) ((j134 >> 15) | (j133 << 6));
                        digest[16] = (byte) (j133 >> 2);
                        digest[17] = (byte) (j133 >> 10);
                        digest[18] = (byte) ((j133 >> 18) | (j132 << 3));
                        long j139 = j130 - (j131 << 21);
                        long j140 = (j98 - j100) + j131;
                        long j141 = j127 - j129;
                        digest[19] = (byte) (j132 >> 5);
                        digest[20] = (byte) (j132 >> 13);
                        digest[21] = (byte) (j124 - j126);
                        digest[22] = (byte) (r8 >> 8);
                        digest[23] = (byte) ((r8 >> 16) | (j141 << 5));
                        digest[24] = (byte) (j141 >> 3);
                        digest[25] = (byte) (j141 >> 11);
                        digest[26] = (byte) ((j141 >> 19) | (j139 << 2));
                        digest[27] = (byte) (j139 >> 6);
                        digest[28] = (byte) ((j139 >> 14) | (j140 << 7));
                        digest[29] = (byte) (j140 >> c2);
                        digest[30] = (byte) (j140 >> 9);
                        digest[31] = (byte) (j140 >> 17);
                        long[] jArr = new long[10];
                        long[] l = kfl.l(c3);
                        long[] jArr2 = new long[10];
                        jArr2[0] = 1;
                        long[] jArr3 = new long[10];
                        long[] jArr4 = new long[10];
                        long[] jArr5 = new long[10];
                        long[] jArr6 = new long[10];
                        long[] jArr7 = new long[10];
                        kfl.h(jArr4, l);
                        kfl.b(jArr5, jArr4, kfi.a);
                        kfl.i(jArr4, jArr4, jArr2);
                        kfl.j(jArr5, jArr5, jArr2);
                        long[] jArr8 = new long[10];
                        kfl.h(jArr8, jArr5);
                        kfl.b(jArr8, jArr8, jArr5);
                        kfl.h(jArr, jArr8);
                        kfl.b(jArr, jArr, jArr5);
                        kfl.b(jArr, jArr, jArr4);
                        long[] jArr9 = new long[10];
                        long[] jArr10 = new long[10];
                        long[] jArr11 = new long[10];
                        kfl.h(jArr9, jArr);
                        kfl.h(jArr10, jArr9);
                        kfl.h(jArr10, jArr10);
                        kfl.b(jArr10, jArr, jArr10);
                        kfl.b(jArr9, jArr9, jArr10);
                        kfl.h(jArr9, jArr9);
                        kfl.b(jArr9, jArr10, jArr9);
                        kfl.h(jArr10, jArr9);
                        for (int i6 = 1; i6 < 5; i6++) {
                            kfl.h(jArr10, jArr10);
                        }
                        kfl.b(jArr9, jArr10, jArr9);
                        kfl.h(jArr10, jArr9);
                        for (int i7 = 1; i7 < 10; i7++) {
                            kfl.h(jArr10, jArr10);
                        }
                        kfl.b(jArr10, jArr10, jArr9);
                        kfl.h(jArr11, jArr10);
                        for (int i8 = 1; i8 < 20; i8++) {
                            kfl.h(jArr11, jArr11);
                        }
                        kfl.b(jArr10, jArr11, jArr10);
                        kfl.h(jArr10, jArr10);
                        for (int i9 = 1; i9 < 10; i9++) {
                            kfl.h(jArr10, jArr10);
                        }
                        kfl.b(jArr9, jArr10, jArr9);
                        kfl.h(jArr10, jArr9);
                        for (int i10 = 1; i10 < 50; i10++) {
                            kfl.h(jArr10, jArr10);
                        }
                        kfl.b(jArr10, jArr10, jArr9);
                        kfl.h(jArr11, jArr10);
                        for (int i11 = 1; i11 < 100; i11++) {
                            kfl.h(jArr11, jArr11);
                        }
                        kfl.b(jArr10, jArr11, jArr10);
                        kfl.h(jArr10, jArr10);
                        for (int i12 = 1; i12 < 50; i12++) {
                            kfl.h(jArr10, jArr10);
                        }
                        kfl.b(jArr9, jArr10, jArr9);
                        kfl.h(jArr9, jArr9);
                        kfl.h(jArr9, jArr9);
                        kfl.b(jArr, jArr9, jArr);
                        kfl.b(jArr, jArr, jArr8);
                        kfl.b(jArr, jArr, jArr4);
                        kfl.h(jArr6, jArr);
                        kfl.b(jArr6, jArr6, jArr5);
                        kfl.i(jArr7, jArr6, jArr4);
                        if (kfh.e(jArr7)) {
                            kfl.j(jArr7, jArr6, jArr4);
                            if (!kfh.e(jArr7)) {
                                kfl.b(jArr, jArr, kfi.c);
                            } else {
                                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                            }
                        }
                        if (!kfh.e(jArr)) {
                            c = 31;
                            b = 255;
                            i = 7;
                            if (((c3[31] & 255) >> 7) != 0) {
                                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                            }
                        } else {
                            c = 31;
                            b = 255;
                            i = 7;
                        }
                        if (kfh.a(jArr) == ((c3[c] & b) >> i)) {
                            kfh.d(jArr, jArr);
                        }
                        kfl.b(jArr3, jArr, l);
                        kuv kuvVar = new kuv(new kpb(jArr, l, jArr2), jArr3, (byte[]) null);
                        kfg[] kfgVarArr = new kfg[8];
                        kfgVarArr[0] = new kfg(kuvVar);
                        kuv kuvVar2 = new kuv(new kpb((byte[]) null), new long[10]);
                        kfh.i(kuvVar2, (kpb) kuvVar.a);
                        kuv kuvVar3 = new kuv(kuvVar2, (byte[]) null, (byte[]) null);
                        for (int i13 = 1; i13 < 8; i13++) {
                            kfh.j(kuvVar2, kuvVar3, kfgVarArr[i13 - 1]);
                            kfgVarArr[i13] = new kfg(new kuv(kuvVar2, (byte[]) null, (byte[]) null));
                        }
                        byte[] h = kfh.h(digest);
                        byte[] h2 = kfh.h(copyOfRange);
                        kuv kuvVar4 = new kuv(kfh.b, (byte[]) null, (byte[]) null, (byte[]) null);
                        kuv kuvVar5 = new kuv((byte[]) null, (byte[]) null);
                        int i14 = 255;
                        while (i14 >= 0 && h[i14] == 0 && h2[i14] == 0) {
                            i14--;
                        }
                        while (i14 >= 0) {
                            kfh.i(kuvVar4, new kpb(kuvVar4));
                            byte b14 = h[i14];
                            if (b14 > 0) {
                                kuv.q(kuvVar5, kuvVar4);
                                b2 = 2;
                                kfh.j(kuvVar4, kuvVar5, kfgVarArr[h[i14] / 2]);
                            } else {
                                b2 = 2;
                                if (b14 < 0) {
                                    kuv.q(kuvVar5, kuvVar4);
                                    kfh.k(kuvVar4, kuvVar5, kfgVarArr[(-h[i14]) / 2]);
                                }
                            }
                            byte b15 = h2[i14];
                            if (b15 > 0) {
                                kuv.q(kuvVar5, kuvVar4);
                                kfh.j(kuvVar4, kuvVar5, kfi.e[h2[i14] / b2]);
                            } else if (b15 < 0) {
                                kuv.q(kuvVar5, kuvVar4);
                                kfh.k(kuvVar4, kuvVar5, kfi.e[(-h2[i14]) / b2]);
                            }
                            i14--;
                        }
                        byte[] k = new kpb(kuvVar4).k();
                        for (int i15 = 0; i15 < 32; i15++) {
                            if (k[i15] == bArr[i15]) {
                            }
                        }
                        return;
                    }
                } else {
                    i3--;
                    bArr3 = bArr;
                    i2 = 0;
                    c2 = 1;
                }
            }
            throw new GeneralSecurityException("Signature check failed.");
        }
        throw new GeneralSecurityException(String.format("The length of the signature is not %s.", 64));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [kai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [kai, java.lang.Object] */
    @Override // defpackage.kai
    public final void a(byte[] bArr, byte[] bArr2) {
        if (this.c != 0) {
            byte[] bArr3 = this.a;
            if (bArr3.length == 0 && this.b.length == 0) {
                this.d.a(bArr, bArr2);
                return;
            }
            if (kgt.c(bArr3, bArr)) {
                byte[] bArr4 = this.b;
                if (bArr4.length != 0) {
                    bArr2 = jql.I(bArr2, bArr4);
                }
                this.d.a(Arrays.copyOfRange(bArr, this.a.length, bArr.length), bArr2);
                return;
            }
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr5 = this.a;
        if (bArr5.length == 0 && this.b.length == 0) {
            d(bArr, bArr2);
            return;
        }
        if (kgt.c(bArr5, bArr)) {
            byte[] bArr6 = this.b;
            if (bArr6.length != 0) {
                bArr2 = jql.I(bArr2, bArr6);
            }
            d(Arrays.copyOfRange(bArr, this.a.length, bArr.length), bArr2);
            return;
        }
        throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
    }

    public kmg(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.c = i;
        if (iuu.y(1)) {
            if (bArr.length == 32) {
                this.d = knb.b(bArr);
                this.a = bArr2;
                this.b = bArr3;
                byte[] bArr4 = kfh.a;
                if (kfi.a == null) {
                    throw new IllegalStateException("Could not initialize Ed25519.");
                }
                return;
            }
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", 32));
        }
        throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
    }
}
