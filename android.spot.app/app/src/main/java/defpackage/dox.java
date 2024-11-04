package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dox implements dil {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:            r2 = (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(r1).order(java.nio.ByteOrder.BIG_ENDIAN).limit(r2);        r3 = defpackage.bqa.g(6, r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:            if (r3 == 18761) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:            if (r3 == 19789) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:            r3 = java.nio.ByteOrder.BIG_ENDIAN;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008d, code lost:            r2.order(r3);        r3 = defpackage.bqa.f(10, r2);        r4 = defpackage.bqa.g(r3 + 6, r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009c, code lost:            if (r9 >= r4) goto L86;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:            r5 = (r3 + 8) + (r9 * 12);     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:            if (defpackage.bqa.g(r5, r2) == 274) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:            r9 = r9 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:            r6 = defpackage.bqa.g(r5 + 2, r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b2, code lost:            if (r6 <= 0) goto L88;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:            if (r6 > 12) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:            r7 = defpackage.bqa.f(r5 + 4, r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:            if (r7 < 0) goto L90;     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:            r7 = r7 + defpackage.dox.b[r6];     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c6, code lost:            if (r7 > 4) goto L91;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c8, code lost:            r5 = r5 + 8;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ca, code lost:            if (r5 < 0) goto L92;     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d0, code lost:            if (r5 > r2.remaining()) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d2, code lost:            if (r7 < 0) goto L94;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d9, code lost:            if ((r7 + r5) > r2.remaining()) goto L95;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00db, code lost:            r9 = defpackage.bqa.g(r5, r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0088, code lost:            r3 = java.nio.ByteOrder.BIG_ENDIAN;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x008b, code lost:            r3 = java.nio.ByteOrder.LITTLE_ENDIAN;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int e(defpackage.dov r9, defpackage.dlu r10) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dox.e(dov, dlu):int");
    }

    private static final ImageHeaderParser$ImageType f(dov dovVar) {
        boolean z;
        boolean z2;
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        try {
            int a2 = dovVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int d = (a2 << 8) | dovVar.d();
            if (d == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int d2 = (d << 8) | dovVar.d();
            if (d2 == -1991225785) {
                dovVar.c(21L);
                try {
                    if (dovVar.d() >= 3) {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG_A;
                    } else {
                        imageHeaderParser$ImageType = ImageHeaderParser$ImageType.PNG;
                    }
                    return imageHeaderParser$ImageType;
                } catch (dou unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (d2 == 1380533830) {
                dovVar.c(4L);
                if (((dovVar.a() << 16) | dovVar.a()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int a3 = (dovVar.a() << 16) | dovVar.a();
                if ((a3 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = a3 & 255;
                if (i == 88) {
                    dovVar.c(4L);
                    short d3 = dovVar.d();
                    if ((d3 & 2) != 0) {
                        return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                    }
                    if ((d3 & 16) != 0) {
                        return ImageHeaderParser$ImageType.WEBP_A;
                    }
                    return ImageHeaderParser$ImageType.WEBP;
                }
                if (i == 76) {
                    dovVar.c(4L);
                    if ((dovVar.d() & 8) != 0) {
                        return ImageHeaderParser$ImageType.WEBP_A;
                    }
                    return ImageHeaderParser$ImageType.WEBP;
                }
                return ImageHeaderParser$ImageType.WEBP;
            }
            if (((dovVar.a() << 16) | dovVar.a()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int a4 = (dovVar.a() << 16) | dovVar.a();
            if (a4 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            if (a4 == 1635150182) {
                z = true;
            } else {
                z = false;
            }
            dovVar.c(4L);
            int i2 = d2 - 16;
            if (i2 % 4 == 0) {
                for (int i3 = 0; i3 < 5 && i2 > 0; i3++) {
                    int a5 = (dovVar.a() << 16) | dovVar.a();
                    if (a5 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (a5 == 1635150182) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z |= !z2;
                    i2 -= 4;
                }
            }
            if (z) {
                return ImageHeaderParser$ImageType.AVIF;
            }
            return ImageHeaderParser$ImageType.UNKNOWN;
        } catch (dou unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    @Override // defpackage.dil
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        bsc.q(inputStream);
        return f(new dow(inputStream, 0));
    }

    @Override // defpackage.dil
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        bsc.q(byteBuffer);
        return f(new dow(byteBuffer, 1));
    }

    @Override // defpackage.dil
    public final int c(InputStream inputStream, dlu dluVar) {
        bsc.q(inputStream);
        dow dowVar = new dow(inputStream, 0);
        bsc.q(dluVar);
        return e(dowVar, dluVar);
    }

    @Override // defpackage.dil
    public final int d(ByteBuffer byteBuffer, dlu dluVar) {
        bsc.q(byteBuffer);
        dow dowVar = new dow(byteBuffer, 1);
        bsc.q(dluVar);
        return e(dowVar, dluVar);
    }
}
