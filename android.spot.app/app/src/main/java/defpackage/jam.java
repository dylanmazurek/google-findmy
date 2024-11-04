package defpackage;

import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jam implements jbe {
    private final jbe a;
    private final UUID b;
    private final String c;

    public jam(String str, UUID uuid) {
        this.c = str;
        this.a = null;
        this.b = uuid;
    }

    @Override // defpackage.jbe
    public final jbe a() {
        return this.a;
    }

    @Override // defpackage.jbe
    public final String b() {
        return this.c;
    }

    @Override // defpackage.jbe
    public final UUID c() {
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jbe] */
    @Override // defpackage.jbf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        miv f = jbu.f();
        ?? r1 = f.c;
        if (r1 != 0) {
            if (this == r1) {
                jbu.e(f, r1.a());
                return;
            }
            throw new jbs("Tried to end span " + b() + ", but that span is not the current span. The current span is " + r1.b() + ".");
        }
        throw new jbr("Tried to end [" + b() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ff, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a4, code lost:            r15 = r1.c.d;        r4 = java.lang.Integer.valueOf(r13);     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b0, code lost:            if (r15.containsKey(r4) != false) goto L117;     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b2, code lost:            r1.c.d.put(r4, new defpackage.jbb(r7, 1073741824));     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00be, code lost:            if (r14 == null) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c0, code lost:            r14.c = r1.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00cd, code lost:            if (r14 == null) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00cf, code lost:            r14.c = r1.c;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00d3, code lost:            r1.d = r7;        r1.e++;        r1.b();     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ce, code lost:            if (r1.c(r12, r13, r14, (r14 + r13) - r12) != false) goto L64;     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jam.toString():java.lang.String");
    }

    public jam(String str, jbe jbeVar) {
        str.getClass();
        this.c = str;
        this.a = jbeVar;
        this.b = jbeVar.c();
    }
}
