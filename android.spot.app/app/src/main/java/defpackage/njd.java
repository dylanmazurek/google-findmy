package defpackage;

import java.io.Closeable;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njd implements Closeable {
    public static final Logger a;
    public final nkr b;
    private final njc c;
    private final nih d;

    static {
        Logger logger = Logger.getLogger(nik.class.getName());
        logger.getClass();
        a = logger;
    }

    public njd(nkr nkrVar) {
        nkrVar.getClass();
        this.b = nkrVar;
        njc njcVar = new njc(nkrVar);
        this.c = njcVar;
        this.d = new nih(njcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:            throw new java.io.IOException(defpackage.a.ae(r3, "Invalid dynamic table size update "));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List b(int r2, int r3, int r4, int r5) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njd.b(int, int, int, int):java.util.List");
    }

    private final void c() {
        this.b.f();
        this.b.d();
        byte[] bArr = ngt.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x04f3, code lost:            if (r18 == 0) goto L272;     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04f5, code lost:            r8.f(defpackage.ngt.b, true);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(boolean r20, defpackage.nis r21) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njd.a(boolean, nis):boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
