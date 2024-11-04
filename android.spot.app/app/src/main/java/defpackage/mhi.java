package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhi implements Closeable {
    public mhg a;
    public int b;
    public lzk c;
    public long e;
    private final mjt g;
    private final mjz h;
    private boolean j;
    private mea k;
    private int n;
    private int p = 1;
    private int i = 5;
    public mea d = new mea();
    private boolean l = false;
    private int m = -1;
    public boolean f = false;
    private volatile boolean o = false;

    public mhi(mhg mhgVar, lzk lzkVar, int i, mjt mjtVar, mjz mjzVar) {
        this.a = mhgVar;
        this.c = lzkVar;
        this.b = i;
        this.g = mjtVar;
        this.h = mjzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x01ad, code lost:            if (r8.f == false) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01b3, code lost:            if (c() == false) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01b5, code lost:            close();     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01ba, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:            if (r3 <= 0) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005b, code lost:            r8.a.j(r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0062, code lost:            if (r8.p != 2) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:            r8.g.a(r3);        r8.n += r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:            r3 = r8.p;        r4 = r3 - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:            if (r3 == 0) goto L104;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:            if (r4 == 0) goto L105;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fe, code lost:            r3 = r8.k.e();     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:            if ((r3 & 254) != 0) goto L107;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:            if (1 == (r3 & 1)) goto L63;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:            r3 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010f, code lost:            r8.j = r3;        r3 = r8.k;        r3.a(4);        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));        r8.i = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0132, code lost:            if (r3 < 0) goto L108;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0136, code lost:            if (r3 > r8.b) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0138, code lost:            r8.m++;        r3 = r8.g.b;        r4 = r3.length;        r5 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0143, code lost:            if (r5 >= r4) goto L115;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0145, code lost:            r6 = r3[r5];        r5 = r5 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:            r3 = r8.h;        r3.d.a();        r3.e = r3.a.a();        r8.p = 2;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0182, code lost:            throw new defpackage.mcc(defpackage.mca.f.d(java.lang.String.format(java.util.Locale.US, "gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(r8.b), java.lang.Integer.valueOf(r8.i))));     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:            r3 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0190, code lost:            throw new defpackage.mcc(defpackage.mca.h.d("gRPC frame header malformed: reserved bits not zero"));     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0078, code lost:            if (r4 == 1) goto L42;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x008d, code lost:            r2 = r8.g.b;        r3 = r2.length;        r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0093, code lost:            if (r4 >= r3) goto L116;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0095, code lost:            r6 = r2[r4];        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x009a, code lost:            r8.n = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x009e, code lost:            if (r8.j == false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00a0, code lost:            r2 = r8.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00a4, code lost:            if (r2 == defpackage.lyz.a) goto L102;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a6, code lost:            r3 = r8.k;        r4 = defpackage.mij.a;        r3 = new defpackage.mhh(r2.a(new defpackage.mig(r3)), r8.b, r8.g);     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00e4, code lost:            r8.k = null;        r8.a.f(new defpackage.lrs(r3));        r8.p = 1;        r8.i = 5;        r8.e--;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00bd, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c3, code lost:            throw new java.lang.RuntimeException(r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d1, code lost:            throw new defpackage.mcc(defpackage.mca.h.d("Can't decode compressed gRPC message as compression not configured"));     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d2, code lost:            r2 = r8.g;        r3 = r8.k.a;        defpackage.mjt.b(r2);        r2 = r8.k;        r3 = defpackage.mij.a;        r3 = new defpackage.mig(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x007c, code lost:            if (r3 == 1) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x007e, code lost:            r0 = "BODY";     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x008c, code lost:            throw new java.lang.AssertionError(defpackage.a.ao(r0, "Invalid state: "));     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0081, code lost:            r0 = "HEADER";     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0191, code lost:            throw null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhi.a():void");
    }

    public final boolean b() {
        if (this.d == null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.d.a == 0) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (b()) {
            return;
        }
        mea meaVar = this.k;
        boolean z = false;
        if (meaVar != null && meaVar.a > 0) {
            z = true;
        }
        try {
            mea meaVar2 = this.d;
            if (meaVar2 != null) {
                meaVar2.close();
            }
            mea meaVar3 = this.k;
            if (meaVar3 != null) {
                meaVar3.close();
            }
            this.d = null;
            this.k = null;
            this.a.d(z);
        } catch (Throwable th) {
            this.d = null;
            this.k = null;
            throw th;
        }
    }
}
