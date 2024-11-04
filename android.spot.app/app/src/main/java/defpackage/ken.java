package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ken implements keu {
    @Override // defpackage.keu
    public final int a() {
        return 32;
    }

    @Override // defpackage.keu
    public final byte[] b() {
        return kfa.k;
    }

    @Override // defpackage.keu
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int i;
        if (bArr.length == 32) {
            byte b = 1;
            if (iuu.C()) {
                if (iuu.y(1)) {
                    if (iuu.C()) {
                        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "ChaCha20");
                        if (bArr3 != null) {
                            if (bArr2.length == 12) {
                                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
                                Cipher a = kcq.a();
                                a.init(1, secretKeySpec, ivParameterSpec);
                                return a.doFinal(bArr3);
                            }
                            throw new GeneralSecurityException("nonce length must be 12 bytes.");
                        }
                        throw new NullPointerException("plaintext is null");
                    }
                    throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
                }
                throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
            }
            kcv kcvVar = new kcv(bArr);
            int length = bArr3.length;
            if (length <= 2147483631) {
                int i2 = length + 16;
                ByteBuffer allocate = ByteBuffer.allocate(i2);
                if (allocate.remaining() >= i2) {
                    int position = allocate.position();
                    kcu kcuVar = kcvVar.a;
                    if (allocate.remaining() >= length) {
                        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
                        if (bArr2.length == kcuVar.a()) {
                            int remaining = wrap.remaining();
                            int i3 = remaining / 64;
                            int i4 = i3 + 1;
                            for (int i5 = 0; i5 < i4; i5++) {
                                ByteBuffer c = kcuVar.c(bArr2, kcuVar.b + i5);
                                if (i5 == i3) {
                                    jql.H(allocate, wrap, c, remaining % 64);
                                } else {
                                    jql.H(allocate, wrap, c, 64);
                                }
                            }
                            allocate.position(position);
                            allocate.limit(allocate.limit() - 16);
                            byte[] bArr5 = new byte[32];
                            kcvVar.b.c(bArr2, 0).get(bArr5);
                            int remaining2 = allocate.remaining();
                            int i6 = remaining2 % 16;
                            if (i6 == 0) {
                                i = remaining2;
                            } else {
                                i = (remaining2 + 16) - i6;
                            }
                            ByteBuffer order = ByteBuffer.allocate(i + 16).order(ByteOrder.LITTLE_ENDIAN);
                            order.put(bArr4);
                            order.position(0);
                            order.put(allocate);
                            order.position(i);
                            order.putLong(0L);
                            order.putLong(remaining2);
                            byte[] array = order.array();
                            long z = iuu.z(bArr5, 0, 0);
                            int i7 = 3;
                            long z2 = iuu.z(bArr5, 3, 2) & 67108611;
                            long z3 = iuu.z(bArr5, 6, 4) & 67092735;
                            long z4 = iuu.z(bArr5, 9, 6) & 66076671;
                            long z5 = iuu.z(bArr5, 12, 8) & 1048575;
                            int i8 = 17;
                            byte[] bArr6 = new byte[17];
                            int i9 = 0;
                            long j = 0;
                            long j2 = 0;
                            long j3 = 0;
                            long j4 = 0;
                            long j5 = 0;
                            while (true) {
                                int length2 = array.length;
                                if (i9 < length2) {
                                    int min = Math.min(16, length2 - i9);
                                    System.arraycopy(array, i9, bArr6, 0, min);
                                    bArr6[min] = b;
                                    if (min != 16) {
                                        Arrays.fill(bArr6, min + 1, i8, (byte) 0);
                                    }
                                    long j6 = z5 * 5;
                                    long j7 = z4 * 5;
                                    long j8 = z3 * 5;
                                    long z6 = j5 + iuu.z(bArr6, 0, 0);
                                    long z7 = j2 + iuu.z(bArr6, i7, 2);
                                    long z8 = j + iuu.z(bArr6, 6, 4);
                                    long z9 = j3 + iuu.z(bArr6, 9, 6);
                                    long z10 = j4 + (iuu.z(bArr6, 12, 8) | (bArr6[16] << 24));
                                    long j9 = z7 * z;
                                    long j10 = z7 * z2;
                                    long j11 = z7 * z3;
                                    long j12 = z9 * z;
                                    long j13 = z7 * z4;
                                    long j14 = z10 * z;
                                    long j15 = (z6 * z) + (z7 * j6) + (z8 * j7) + (z9 * j8) + (z2 * 5 * z10);
                                    long j16 = (z6 * z2) + j9 + (z8 * j6) + (z9 * j7) + (j8 * z10) + (j15 >> 26);
                                    long j17 = (z6 * z3) + j10 + (z8 * z) + (z9 * j6) + (j7 * z10) + (j16 >> 26);
                                    long j18 = (z6 * z4) + j11 + (z8 * z2) + j12 + (z10 * j6) + (j17 >> 26);
                                    long j19 = (z6 * z5) + j13 + (z8 * z3) + (z9 * z2) + j14 + (j18 >> 26);
                                    long j20 = (j15 & 67108863) + ((j19 >> 26) * 5);
                                    j2 = (j16 & 67108863) + (j20 >> 26);
                                    i9 += 16;
                                    j = j17 & 67108863;
                                    j3 = j18 & 67108863;
                                    j4 = j19 & 67108863;
                                    i8 = 17;
                                    b = 1;
                                    j5 = j20 & 67108863;
                                    i7 = 3;
                                    allocate = allocate;
                                } else {
                                    ByteBuffer byteBuffer = allocate;
                                    long j21 = j + (j2 >> 26);
                                    long j22 = j21 & 67108863;
                                    long j23 = j3 + (j21 >> 26);
                                    long j24 = j23 & 67108863;
                                    long j25 = j4 + (j23 >> 26);
                                    long j26 = j25 & 67108863;
                                    long j27 = j5 + ((j25 >> 26) * 5);
                                    long j28 = j27 & 67108863;
                                    long j29 = j28 + 5;
                                    long j30 = (j2 & 67108863) + (j27 >> 26);
                                    long j31 = j30 + (j29 >> 26);
                                    long j32 = (j31 >> 26) + j22;
                                    long j33 = j24 + (j32 >> 26);
                                    long j34 = (j26 + (j33 >> 26)) - 67108864;
                                    long j35 = j34 >> 63;
                                    long j36 = ~j35;
                                    long j37 = (j30 & j35) | (j31 & 67108863 & j36);
                                    long j38 = (j32 & 67108863 & j36) | (j22 & j35);
                                    long j39 = j38 >> 12;
                                    long j40 = (j24 & j35) | (j33 & 67108863 & j36);
                                    long j41 = (j26 & j35) | (j34 & j36);
                                    long A = (((j29 & 67108863 & j36) | (j28 & j35) | (j37 << 26)) & 4294967295L) + iuu.A(bArr5, 16);
                                    long A2 = (((j38 << 20) | (j37 >> 6)) & 4294967295L) + iuu.A(bArr5, 20) + (A >> 32);
                                    long A3 = ((j39 | (j40 << 14)) & 4294967295L) + iuu.A(bArr5, 24) + (A2 >> 32);
                                    byte[] bArr7 = new byte[16];
                                    iuu.B(bArr7, A & 4294967295L, 0);
                                    iuu.B(bArr7, A2 & 4294967295L, 4);
                                    iuu.B(bArr7, A3 & 4294967295L, 8);
                                    iuu.B(bArr7, ((((j40 >> 18) | (j41 << 8)) & 4294967295L) + iuu.A(bArr5, 28) + (A3 >> 32)) & 4294967295L, 12);
                                    byteBuffer.limit(byteBuffer.limit() + 16);
                                    byteBuffer.put(bArr7);
                                    return byteBuffer.array();
                                }
                            }
                        } else {
                            throw new GeneralSecurityException("The nonce length (in bytes) must be " + kcuVar.a());
                        }
                    } else {
                        throw new IllegalArgumentException("Given ByteBuffer output is too small");
                    }
                } else {
                    throw new IllegalArgumentException("Given ByteBuffer output is too small");
                }
            } else {
                throw new GeneralSecurityException("plaintext too long");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
    }
}
