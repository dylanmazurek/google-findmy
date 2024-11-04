package defpackage;

import android.os.SystemClock;
import j$.util.concurrent.ThreadLocalRandom;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnk extends nmg {
    private final AtomicInteger a;
    private final nnn b;

    public nnk() {
        nnn nnnVar = new nnn();
        this.a = new AtomicInteger();
        this.b = nnnVar;
    }

    @Override // defpackage.nmg
    public final long a() {
        long nextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        if (nextLong >= -1) {
            return nextLong + 2;
        }
        return nextLong;
    }

    @Override // defpackage.nmg
    public final void b(nmc nmcVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j = nmcVar.a;
        int i6 = nmcVar.h;
        int i7 = i6 - 1;
        if (i6 != 0) {
            int i8 = 2;
            if (i7 != 0) {
                if (i7 != 1) {
                    i = 0;
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
            int i9 = nmcVar.b;
            int ordinal = nmcVar.c.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    i8 = 3;
                    if (ordinal != 3) {
                        i8 = 4;
                        if (ordinal != 4) {
                            i8 = 0;
                        }
                    }
                }
            } else {
                i8 = 1;
            }
            int aC = moz.aC(moz.aD(nmcVar.d));
            nmf nmfVar = nmcVar.e;
            int i10 = nmfVar.a;
            int i11 = nmfVar.b;
            int i12 = nmfVar.c;
            int i13 = nmfVar.d;
            nmf nmfVar2 = nmcVar.f;
            if (nmfVar2 == null) {
                i2 = -1;
            } else {
                i2 = nmfVar2.a;
            }
            if (nmfVar2 == null) {
                i3 = -1;
            } else {
                i3 = nmfVar2.b;
            }
            if (nmfVar2 == null) {
                i4 = -1;
            } else {
                i4 = nmfVar2.c;
            }
            if (nmfVar2 == null) {
                i5 = -1;
            } else {
                i5 = nmfVar2.d;
            }
            moz.aE(j, i, i9, i8, aC, i10, i11, i12, i13, i2, i3, i4, i5, nmcVar.g);
            return;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[Catch: Exception -> 0x026b, TryCatch #1 {Exception -> 0x026b, blocks: (B:4:0x000e, B:11:0x0034, B:16:0x004c, B:18:0x006e, B:20:0x007d, B:22:0x0097, B:24:0x009a, B:27:0x00a3, B:29:0x00b4, B:30:0x00b8, B:32:0x00c3, B:34:0x00cb, B:35:0x00d5, B:38:0x0243, B:43:0x0239), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004a  */
    @Override // defpackage.nmg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r47, defpackage.nmb r49, defpackage.nmf r50, defpackage.nmd r51) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnk.c(long, nmb, nmf, nmd):void");
    }

    @Override // defpackage.nmg
    public final void d(long j, nme nmeVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        nnn nnnVar = this.b;
        synchronized (nnnVar.a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (nnnVar.c + 1000 <= elapsedRealtime) {
                nnnVar.b = 1;
                nnnVar.c = elapsedRealtime;
            } else if (nnnVar.b <= 0) {
                nnnVar.b = 1;
            } else {
                this.a.incrementAndGet();
                return;
            }
            int andSet = this.a.getAndSet(0);
            try {
                long j2 = nmeVar.a;
                moz.aA(j2, "Request header size is negative");
                double d = j2 / 1024.0d;
                if (moz.aB(d, 0, 1)) {
                    i = 1;
                } else if (moz.aB(d, 1, 10)) {
                    i = 2;
                } else if (moz.aB(d, 10, 25)) {
                    i = 3;
                } else if (moz.aB(d, 25, 50)) {
                    i = 4;
                } else if (moz.aB(d, 50, 100)) {
                    i = 5;
                } else {
                    i = 6;
                }
                moz.aA(-1L, "Request body size is negative");
                if (moz.aB(-9.765625E-4d, 10, 50)) {
                    i2 = 3;
                } else if (moz.aB(-9.765625E-4d, 50, 200)) {
                    i2 = 4;
                } else if (moz.aB(-9.765625E-4d, 200, 500)) {
                    i2 = 5;
                } else if (moz.aB(-9.765625E-4d, 500, 1000)) {
                    i2 = 6;
                } else if (moz.aB(-9.765625E-4d, 1000, 5000)) {
                    i2 = 7;
                } else {
                    i2 = 8;
                }
                long j3 = nmeVar.b;
                moz.aA(j3, "Response header size is negative");
                double d2 = j3 / 1024.0d;
                if (moz.aB(d2, 0, 1)) {
                    i3 = 1;
                } else if (moz.aB(d2, 1, 10)) {
                    i3 = 2;
                } else if (moz.aB(d2, 10, 25)) {
                    i3 = 3;
                } else if (moz.aB(d2, 25, 50)) {
                    i3 = 4;
                } else if (moz.aB(d2, 50, 100)) {
                    i3 = 5;
                } else {
                    i3 = 6;
                }
                long j4 = nmeVar.c;
                moz.aA(j4, "Response body size is negative");
                double d3 = j4 / 1024.0d;
                if (d3 == 0.0d) {
                    i4 = 1;
                } else if (d3 > 0.0d && d3 < 10.0d) {
                    i4 = 2;
                } else if (moz.aB(d3, 10, 50)) {
                    i4 = 3;
                } else if (moz.aB(d3, 50, 200)) {
                    i4 = 4;
                } else if (moz.aB(d3, 200, 500)) {
                    i4 = 5;
                } else if (moz.aB(d3, 500, 1000)) {
                    i4 = 6;
                } else if (moz.aB(d3, 1000, 5000)) {
                    i4 = 7;
                } else {
                    i4 = 8;
                }
                int i6 = nmeVar.d;
                String str = nmeVar.g;
                long j5 = 0;
                if (nnm.a != null && str != null && !str.isEmpty()) {
                    byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                    MessageDigest messageDigest = nnm.a;
                    if (messageDigest != null && bytes != null && bytes.length != 0) {
                        j5 = ByteBuffer.wrap(messageDigest.digest(bytes)).getLong();
                    }
                }
                int millis = (int) nmeVar.e.toMillis();
                int millis2 = (int) nmeVar.f.toMillis();
                int i7 = nmeVar.l - 1;
                if (i7 != 0) {
                    if (i7 != 1) {
                        i5 = 3;
                    } else {
                        i5 = 2;
                    }
                } else {
                    i5 = 1;
                }
                moz.aF(j, i, i2, i3, i4, i6, j5, millis, millis2, andSet, i5, nmeVar.h, nmeVar.i, nmeVar.j, moz.aC(moz.aD(false)), moz.aC(moz.aD(Boolean.valueOf(nmeVar.k))));
            } catch (Exception unused) {
                this.a.addAndGet(andSet);
            }
        }
    }
}
