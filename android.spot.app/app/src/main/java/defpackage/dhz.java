package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhz implements dsm {
    private final bmf a;

    public dhz(bmf bmfVar) {
        this.a = bmfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:            r2 = r2;     */
    @Override // defpackage.dsm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(defpackage.dlb r2) {
        /*
            r1 = this;
            if (r2 != 0) goto L9
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown error"
            r2.<init>(r0)
        L9:
            bmf r0 = r1.a
            r0.d(r2)
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhz.a(dlb):boolean");
    }

    @Override // defpackage.dsm
    public final boolean b(Object obj) {
        try {
            this.a.c(new ddh(obj));
            return true;
        } catch (Throwable th) {
            this.a.d(th);
            return true;
        }
    }
}
