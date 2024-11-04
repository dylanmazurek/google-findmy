package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhk implements Closeable {
    public final Charset a;
    public int b;
    private final InputStream c;
    private byte[] d;
    private int e;

    public dhk(InputStream inputStream, Charset charset) {
        charset.getClass();
        if (charset.equals(dhl.a)) {
            this.c = inputStream;
            this.a = charset;
            this.d = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }

    private final void b() {
        byte[] bArr = this.d;
        int length = bArr.length;
        int read = this.c.read(bArr, 0, 8192);
        if (read != -1) {
            this.e = 0;
            this.b = read;
            return;
        }
        throw new EOFException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:            if (r2[r4] != 13) goto L18;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.c
            monitor-enter(r0)
            byte[] r1 = r7.d     // Catch: java.lang.Throwable -> L86
            if (r1 == 0) goto L7e
            int r1 = r7.e     // Catch: java.lang.Throwable -> L86
            int r2 = r7.b     // Catch: java.lang.Throwable -> L86
            if (r1 < r2) goto L10
            r7.b()     // Catch: java.lang.Throwable -> L86
        L10:
            int r1 = r7.e     // Catch: java.lang.Throwable -> L86
        L12:
            int r2 = r7.b     // Catch: java.lang.Throwable -> L86
            r3 = 10
            if (r1 == r2) goto L40
            byte[] r2 = r7.d     // Catch: java.lang.Throwable -> L86
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L86
            if (r4 != r3) goto L3d
            int r3 = r7.e     // Catch: java.lang.Throwable -> L86
            if (r1 == r3) goto L2a
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L86
            r6 = 13
            if (r5 == r6) goto L2b
        L2a:
            r4 = r1
        L2b:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L86
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.a     // Catch: java.lang.Throwable -> L86
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L86
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L86
            int r1 = r1 + 1
            r7.e = r1     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return r5
        L3d:
            int r1 = r1 + 1
            goto L12
        L40:
            dhj r1 = new dhj     // Catch: java.lang.Throwable -> L86
            int r2 = r7.b     // Catch: java.lang.Throwable -> L86
            int r4 = r7.e     // Catch: java.lang.Throwable -> L86
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L86
        L4c:
            byte[] r2 = r7.d     // Catch: java.lang.Throwable -> L86
            int r4 = r7.e     // Catch: java.lang.Throwable -> L86
            int r5 = r7.b     // Catch: java.lang.Throwable -> L86
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L86
            r2 = -1
            r7.b = r2     // Catch: java.lang.Throwable -> L86
            r7.b()     // Catch: java.lang.Throwable -> L86
            int r2 = r7.e     // Catch: java.lang.Throwable -> L86
        L5e:
            int r4 = r7.b     // Catch: java.lang.Throwable -> L86
            if (r2 == r4) goto L4c
            byte[] r4 = r7.d     // Catch: java.lang.Throwable -> L86
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L86
            if (r5 != r3) goto L7b
            int r3 = r7.e     // Catch: java.lang.Throwable -> L86
            if (r2 == r3) goto L71
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L86
        L71:
            int r2 = r2 + 1
            r7.e = r2     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L86
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            return r1
        L7b:
            int r2 = r2 + 1
            goto L5e
        L7e:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L86
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L86
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L86
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhk.a():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }
}
