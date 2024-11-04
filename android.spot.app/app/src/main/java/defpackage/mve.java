package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mve extends nbg implements Runnable {
    public final long b;

    public mve(long j, mmx mmxVar) {
        super(mmxVar.o(), mmxVar);
        this.b = j;
    }

    @Override // defpackage.mrt, defpackage.mun
    public final String dj() {
        return super.dj() + "(timeMillis=" + this.b + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:            if (r0 == null) goto L10;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            mnb r0 = r5.a
            mtd r0 = defpackage.msz.k(r0)
            boolean r1 = r0 instanceof defpackage.mtf
            if (r1 == 0) goto Ld
            mtf r0 = (defpackage.mtf) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            long r1 = r5.b
            if (r0 == 0) goto L1f
            long r3 = defpackage.mrl.a
            mrn r3 = defpackage.mrn.c
            defpackage.mpd.m(r1, r3)
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L32
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Timed out waiting for "
            r0.<init>(r3)
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L32:
            mvd r1 = new mvd
            r1.<init>(r0, r5)
            r5.L(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mve.run():void");
    }
}
