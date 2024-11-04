package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nia extends nhy {
    final /* synthetic */ nie c;
    private final ngd d;
    private long e;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nia(nie nieVar, ngd ngdVar) {
        super(nieVar);
        this.c = nieVar;
        this.d = ngdVar;
        this.e = -1L;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x013a, code lost:            r0.b -= r3;        r22.e = r5;        r0 = defpackage.moz.k(r22.c.c.k()).toString();     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0158, code lost:            if (r22.e < 0) goto L86;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015e, code lost:            if (r0.length() <= 0) goto L73;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0166, code lost:            if (defpackage.moz.I(r0, ";") == false) goto L86;     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016e, code lost:            if (r22.e != 0) goto L76;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0170, code lost:            r22.f = false;        r0 = r22.c;        r0.g = r0.f.b();        r0 = r22.c;        r2 = r0.a;        r2.getClass();        r3 = r22.d;        r0 = r0.g;        r0.getClass();        defpackage.nhs.a(r2.g, r3, r0);        c();     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:            if (r22.f == false) goto L84;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:            return -1;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e6, code lost:            throw new java.net.ProtocolException("expected chunk size and optional extensions but was \"" + r22.e + r0 + "\"");     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[Catch: NumberFormatException -> 0x01ed, LOOP:2: B:43:0x009c->B:51:0x00c6, LOOP_END, TryCatch #0 {NumberFormatException -> 0x01ed, blocks: (B:21:0x0026, B:22:0x0033, B:25:0x004d, B:97:0x006d, B:98:0x0082, B:39:0x0083, B:42:0x0093, B:44:0x009e, B:47:0x00a6, B:49:0x00bc, B:51:0x00c6, B:53:0x00d7, B:54:0x00f1, B:57:0x00af, B:61:0x00b8, B:91:0x00f6, B:92:0x011a, B:67:0x011d, B:69:0x012b, B:74:0x013a, B:76:0x015a, B:78:0x0160, B:86:0x01c6, B:87:0x01e6, B:89:0x0127, B:95:0x01e7, B:96:0x01ec), top: B:20:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d A[Catch: NumberFormatException -> 0x01ed, TryCatch #0 {NumberFormatException -> 0x01ed, blocks: (B:21:0x0026, B:22:0x0033, B:25:0x004d, B:97:0x006d, B:98:0x0082, B:39:0x0083, B:42:0x0093, B:44:0x009e, B:47:0x00a6, B:49:0x00bc, B:51:0x00c6, B:53:0x00d7, B:54:0x00f1, B:57:0x00af, B:61:0x00b8, B:91:0x00f6, B:92:0x011a, B:67:0x011d, B:69:0x012b, B:74:0x013a, B:76:0x015a, B:78:0x0160, B:86:0x01c6, B:87:0x01e6, B:89:0x0127, B:95:0x01e7, B:96:0x01ec), top: B:20:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127 A[Catch: NumberFormatException -> 0x01ed, TryCatch #0 {NumberFormatException -> 0x01ed, blocks: (B:21:0x0026, B:22:0x0033, B:25:0x004d, B:97:0x006d, B:98:0x0082, B:39:0x0083, B:42:0x0093, B:44:0x009e, B:47:0x00a6, B:49:0x00bc, B:51:0x00c6, B:53:0x00d7, B:54:0x00f1, B:57:0x00af, B:61:0x00b8, B:91:0x00f6, B:92:0x011a, B:67:0x011d, B:69:0x012b, B:74:0x013a, B:76:0x015a, B:78:0x0160, B:86:0x01c6, B:87:0x01e6, B:89:0x0127, B:95:0x01e7, B:96:0x01ec), top: B:20:0x0026 }] */
    @Override // defpackage.nhy, defpackage.nll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.nkp r23, long r24) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nia.a(nkp, long):long");
    }

    @Override // defpackage.nll, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a) {
            return;
        }
        if (this.f && !ngt.A(this, TimeUnit.MILLISECONDS)) {
            this.c.b.e();
            c();
        }
        d();
    }
}
