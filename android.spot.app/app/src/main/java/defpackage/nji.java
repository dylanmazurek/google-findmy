package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nji implements Closeable {
    private static final Logger b = Logger.getLogger(nik.class.getName());
    public int a;
    private final nkq c;
    private final nkp d;
    private boolean e;
    private final nii f;

    public nji(nkq nkqVar) {
        nkqVar.getClass();
        this.c = nkqVar;
        nkp nkpVar = new nkp();
        this.d = nkpVar;
        this.a = 16384;
        this.f = new nii(nkpVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:            r0 = r3.f;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(defpackage.njm r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r4.getClass()     // Catch: java.lang.Throwable -> L62
            boolean r0 = r3.e     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L5a
            int r0 = r3.a     // Catch: java.lang.Throwable -> L62
            int r1 = r4.a     // Catch: java.lang.Throwable -> L62
            r1 = r1 & 32
            if (r1 == 0) goto L17
            java.lang.Object r0 = r4.b     // Catch: java.lang.Throwable -> L62
            int[] r0 = (int[]) r0     // Catch: java.lang.Throwable -> L62
            r1 = 5
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L62
        L17:
            r3.a = r0     // Catch: java.lang.Throwable -> L62
            int r0 = r4.b()     // Catch: java.lang.Throwable -> L62
            r1 = -1
            r2 = 1
            if (r0 == r1) goto L4e
            nii r0 = r3.f     // Catch: java.lang.Throwable -> L62
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L62
            r1 = 16384(0x4000, float:2.2959E-41)
            int r4 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L62
            int r1 = r0.d     // Catch: java.lang.Throwable -> L62
            if (r1 != r4) goto L32
            goto L4e
        L32:
            if (r4 >= r1) goto L3c
            int r1 = r0.b     // Catch: java.lang.Throwable -> L62
            int r1 = java.lang.Math.min(r1, r4)     // Catch: java.lang.Throwable -> L62
            r0.b = r1     // Catch: java.lang.Throwable -> L62
        L3c:
            r0.c = r2     // Catch: java.lang.Throwable -> L62
            r0.d = r4     // Catch: java.lang.Throwable -> L62
            int r1 = r0.h     // Catch: java.lang.Throwable -> L62
            if (r4 >= r1) goto L4e
            if (r4 != 0) goto L4a
            r0.a()     // Catch: java.lang.Throwable -> L62
            goto L4e
        L4a:
            int r1 = r1 - r4
            r0.e(r1)     // Catch: java.lang.Throwable -> L62
        L4e:
            r4 = 4
            r0 = 0
            r3.e(r0, r0, r4, r2)     // Catch: java.lang.Throwable -> L62
            nkq r4 = r3.c     // Catch: java.lang.Throwable -> L62
            r4.flush()     // Catch: java.lang.Throwable -> L62
            monitor-exit(r3)
            return
        L5a:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = "closed"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L62
            throw r4     // Catch: java.lang.Throwable -> L62
        L62:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nji.a(njm):void");
    }

    public final synchronized void b() {
        if (!this.e) {
            Logger logger = b;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(ngt.j(">> CONNECTION ".concat(nik.a.c()), new Object[0]));
            }
            nkq nkqVar = this.c;
            nks nksVar = nik.a;
            nksVar.getClass();
            if (!((nld) nkqVar).c) {
                ((nld) nkqVar).b.A(nksVar);
                ((nld) nkqVar).c();
                this.c.flush();
            } else {
                throw new IllegalStateException("closed");
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void c(boolean z, int i, nkp nkpVar, int i2) {
        if (!this.e) {
            e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                nkq nkqVar = this.c;
                nkpVar.getClass();
                nkqVar.dw(nkpVar, i2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.e = true;
        this.c.close();
    }

    public final synchronized void d() {
        if (!this.e) {
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        Logger logger = b;
        if (logger.isLoggable(Level.FINE)) {
            nks nksVar = nik.a;
            logger.fine(nik.b(false, i, i2, i3, i4));
        }
        int i5 = this.a;
        if (i2 <= i5) {
            if ((Integer.MIN_VALUE & i) == 0) {
                nkq nkqVar = this.c;
                byte[] bArr = ngt.a;
                nkqVar.E((i2 >>> 16) & 255);
                nkqVar.E((i2 >>> 8) & 255);
                nkqVar.E(i2 & 255);
                this.c.E(i3);
                this.c.E(i4);
                this.c.G(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(a.ae(i, "reserved bit set: "));
        }
        throw new IllegalArgumentException(a.ad(i2, i5, "FRAME_SIZE_ERROR length > ", ": "));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[Catch: all -> 0x0156, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0010, B:10:0x001a, B:11:0x001d, B:12:0x0029, B:15:0x0031, B:17:0x004e, B:21:0x005b, B:25:0x0081, B:27:0x0089, B:29:0x0098, B:37:0x00a7, B:32:0x00b2, B:34:0x00bb, B:42:0x00c1, B:44:0x0100, B:47:0x00cd, B:49:0x00dc, B:51:0x00e4, B:53:0x00ec, B:55:0x00f5, B:57:0x0069, B:59:0x0075, B:64:0x0104, B:68:0x0119, B:69:0x011b, B:71:0x0128, B:74:0x012f, B:78:0x013f, B:86:0x014e, B:87:0x0155), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[Catch: all -> 0x0156, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0010, B:10:0x001a, B:11:0x001d, B:12:0x0029, B:15:0x0031, B:17:0x004e, B:21:0x005b, B:25:0x0081, B:27:0x0089, B:29:0x0098, B:37:0x00a7, B:32:0x00b2, B:34:0x00bb, B:42:0x00c1, B:44:0x0100, B:47:0x00cd, B:49:0x00dc, B:51:0x00e4, B:53:0x00ec, B:55:0x00f5, B:57:0x0069, B:59:0x0075, B:64:0x0104, B:68:0x0119, B:69:0x011b, B:71:0x0128, B:74:0x012f, B:78:0x013f, B:86:0x014e, B:87:0x0155), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(boolean r17, int r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nji.f(boolean, int, java.util.List):void");
    }

    public final synchronized void g(boolean z, int i, int i2) {
        if (!this.e) {
            e(0, 8, 6, z ? 1 : 0);
            this.c.G(i);
            this.c.G(i2);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void h(njm njmVar) {
        int i;
        if (!this.e) {
            e(0, Integer.bitCount(njmVar.a) * 6, 4, 0);
            for (int i2 = 0; i2 < 10; i2++) {
                if (njmVar.f(i2)) {
                    if (i2 != 4) {
                        if (i2 != 7) {
                            i = i2;
                        } else {
                            i = 4;
                        }
                    } else {
                        i = 3;
                    }
                    nkq nkqVar = this.c;
                    if (!((nld) nkqVar).c) {
                        nkp nkpVar = ((nld) nkqVar).b;
                        nlg p = nkpVar.p(2);
                        byte[] bArr = p.a;
                        int i3 = p.c;
                        bArr[i3] = (byte) ((i >>> 8) & 255);
                        bArr[i3 + 1] = (byte) (i & 255);
                        p.c = i3 + 2;
                        nkpVar.b += 2;
                        ((nld) nkqVar).c();
                        this.c.G(njmVar.a(i2));
                    } else {
                        throw new IllegalStateException("closed");
                    }
                }
            }
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void i(int i, long j) {
        if (!this.e) {
            if (j != 0 && j <= 2147483647L) {
                e(i, 4, 8, 0);
                this.c.G((int) j);
                this.c.flush();
            } else {
                throw new IllegalArgumentException(a.ap(j, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void j(int i, int i2) {
        if (!this.e) {
            e(i, 4, 3, 0);
            this.c.G(i2 - 1);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(int i, int i2) {
        if (!this.e) {
            e(0, 8, 7, 0);
            this.c.G(i);
            this.c.G(i2 - 1);
            this.c.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
