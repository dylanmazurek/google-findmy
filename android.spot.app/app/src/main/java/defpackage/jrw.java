package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrw extends jru {
    public static final jsb a = new jrw();

    private static long e(long j, long j2, long j3) {
        long j4 = (j ^ j2) * j3;
        long j5 = ((j4 ^ (j4 >>> 47)) ^ j2) * j3;
        return (j5 ^ (j5 >>> 47)) * j3;
    }

    private static long f(long j) {
        return j ^ (j >>> 47);
    }

    private static void g(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long b = j + jsj.b(bArr, i);
        long b2 = jsj.b(bArr, i + 8);
        long b3 = jsj.b(bArr, i + 16);
        long b4 = jsj.b(bArr, i + 24);
        long j3 = b2 + b + b3;
        long rotateRight = Long.rotateRight(j2 + b + b4, 21) + Long.rotateRight(j3, 44);
        jArr[0] = j3 + b4;
        jArr[1] = rotateRight + b;
    }

    @Override // defpackage.jrq
    public final jsa c(byte[] bArr, int i) {
        int i2;
        int i3;
        long j;
        long rotateRight;
        long[] jArr;
        long[] jArr2;
        long j2;
        hwx.T(0, i, bArr.length);
        long j3 = -7286425919675154353L;
        if (i <= 32) {
            if (i <= 16) {
                if (i >= 8) {
                    long j4 = i;
                    long j5 = (j4 + j4) - 7286425919675154353L;
                    long b = jsj.b(bArr, 0) - 7286425919675154353L;
                    long b2 = jsj.b(bArr, i - 8);
                    j3 = e(b + (Long.rotateRight(b2, 37) * j5), (Long.rotateRight(b, 25) + b2) * j5, j5);
                } else if (i >= 4) {
                    j3 = e(((jsj.a(bArr, 0) & 4294967295L) << 3) + i, jsj.a(bArr, i - 4) & 4294967295L, (i + i) - 7286425919675154353L);
                } else if (i > 0) {
                    j3 = (-7286425919675154353L) * f((((bArr[0] & 255) + ((bArr[i >> 1] & 255) << 8)) * (-7286425919675154353L)) ^ ((((bArr[i - 1] & 255) << 2) + i) * (-4348849565147123417L)));
                }
            } else {
                long b3 = jsj.b(bArr, 0) * (-5435081209227447693L);
                long b4 = jsj.b(bArr, 8);
                long j6 = i;
                long j7 = (j6 + j6) - 7286425919675154353L;
                long b5 = jsj.b(bArr, i - 8) * j7;
                j3 = e(Long.rotateRight(b3 + b4, 43) + Long.rotateRight(b5, 30) + (jsj.b(bArr, i - 16) * (-7286425919675154353L)), b3 + Long.rotateRight(b4 - 7286425919675154353L, 18) + b5, j7);
            }
        } else if (i <= 64) {
            long b6 = jsj.b(bArr, 0) * (-7286425919675154353L);
            long b7 = jsj.b(bArr, 8);
            long j8 = i;
            long j9 = (j8 + j8) - 7286425919675154353L;
            long b8 = jsj.b(bArr, i - 8) * j9;
            long b9 = jsj.b(bArr, i - 16) * (-7286425919675154353L);
            long rotateRight2 = Long.rotateRight(b6 + b7, 43) + Long.rotateRight(b8, 30);
            long rotateRight3 = Long.rotateRight(b7 - 7286425919675154353L, 18) + b6;
            long b10 = jsj.b(bArr, 16) * j9;
            long b11 = jsj.b(bArr, 24);
            long j10 = rotateRight2 + b9;
            long b12 = j10 + jsj.b(bArr, i - 32);
            long e = e(j10, rotateRight3 + b8, j9) + jsj.b(bArr, i - 24);
            long j11 = b12 * j9;
            j3 = e(Long.rotateRight(b10 + b11, 43) + Long.rotateRight(j11, 30) + (e * j9), b10 + Long.rotateRight(b11 + b6, 18) + j11, j9);
        } else {
            long[] jArr3 = new long[2];
            long[] jArr4 = new long[2];
            long b13 = jsj.b(bArr, 0) + 95310865018149119L;
            long f = f(-7956866745689871395L) * (-7286425919675154353L);
            long j12 = 2480279821605975764L;
            int i4 = 0;
            while (true) {
                i2 = i - 1;
                i3 = (i2 >> 6) * 64;
                long rotateRight4 = Long.rotateRight(b13 + j12 + jArr3[0] + jsj.b(bArr, i4 + 8), 37) * (-5435081209227447693L);
                long rotateRight5 = Long.rotateRight(j12 + jArr3[1] + jsj.b(bArr, i4 + 48), 42) * (-5435081209227447693L);
                j = rotateRight4 ^ jArr4[1];
                long b14 = jArr3[0] + jsj.b(bArr, i4 + 40);
                rotateRight = Long.rotateRight(f + jArr4[0], 33) * (-5435081209227447693L);
                jArr = jArr4;
                jArr2 = jArr3;
                g(bArr, i4, jArr3[1] * (-5435081209227447693L), j + jArr4[0], jArr3);
                j2 = rotateRight5 + b14;
                g(bArr, i4 + 32, rotateRight + jArr[1], jsj.b(bArr, i4 + 16) + j2, jArr);
                int i5 = i4 + 64;
                if (i5 == i3) {
                    break;
                }
                i4 = i5;
                b13 = rotateRight;
                f = j;
                jArr4 = jArr;
                jArr3 = jArr2;
                j12 = j2;
            }
            int i6 = i2 & 63;
            int i7 = i3 + i6;
            long j13 = j & 255;
            long j14 = (-5435081209227447693L) + j13 + j13;
            long j15 = jArr[0] + i6;
            long j16 = jArr2[0] + j15;
            jArr2[0] = j16;
            jArr[0] = j15 + j16;
            long rotateRight6 = Long.rotateRight(rotateRight + j2 + j16 + jsj.b(bArr, i7 - 55), 37) * j14;
            long rotateRight7 = Long.rotateRight(j2 + jArr2[1] + jsj.b(bArr, i7 - 15), 42) * j14;
            long j17 = jArr[1] * 9;
            long b15 = (jArr2[0] * 9) + jsj.b(bArr, i7 - 23);
            long rotateRight8 = Long.rotateRight(j + jArr[0], 33) * j14;
            long j18 = rotateRight6 ^ j17;
            g(bArr, i7 - 63, jArr2[1] * j14, j18 + jArr[0], jArr2);
            long j19 = rotateRight7 + b15;
            g(bArr, i7 - 31, jArr[1] + rotateRight8, jsj.b(bArr, i7 - 47) + j19, jArr);
            j3 = e(e(jArr2[0], jArr[0], j14) + (f(j19) * (-4348849565147123417L)) + j18, e(jArr2[1], jArr[1], j14) + rotateRight8, j14);
        }
        long j20 = j3;
        int i8 = jsa.b;
        return new jrz(j20);
    }

    public final String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
