package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class miz implements mds {
    final mja a;
    public final /* synthetic */ mjc b;

    public miz(mjc mjcVar, mja mjaVar) {
        this.b = mjcVar;
        this.a = mjaVar;
    }

    private static final Integer b(mbc mbcVar) {
        String str = (String) mbcVar.b(mjc.b);
        if (str != null) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0262  */
    @Override // defpackage.mds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.mca r21, defpackage.mdr r22, defpackage.mbc r23) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.miz.a(mca, mdr, mbc):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:            if (r0.d.compareAndSet(r1, java.lang.Math.min(r0.c + r1, r2)) == false) goto L38;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:            r0 = r5.b;        r0.g.execute(new defpackage.miy(r5, r6, 0));     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002d, code lost:            if (r0 != null) goto L29;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:            r1 = r0.d.get();        r2 = r0.a;     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:            if (r1 != r2) goto L32;     */
    @Override // defpackage.mds
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.mbc r6) {
        /*
            r5 = this;
            mja r0 = r5.a
            int r0 = r0.d
            if (r0 <= 0) goto L18
            maz r0 = defpackage.mjc.a
            r6.c(r0)
            mja r0 = r5.a
            maz r1 = defpackage.mjc.a
            int r0 = r0.d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r6.e(r1, r0)
        L18:
            mjc r0 = r5.b
            mja r1 = r5.a
            r0.d(r1)
            mjc r0 = r5.b
            mix r0 = r0.q
            mja r0 = r0.f
            mja r1 = r5.a
            if (r0 != r1) goto L56
            mjc r0 = r5.b
            mjb r0 = r0.o
            if (r0 == 0) goto L49
        L2f:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.d
            int r1 = r1.get()
            int r2 = r0.a
            if (r1 != r2) goto L3a
            goto L49
        L3a:
            int r3 = r0.c
            java.util.concurrent.atomic.AtomicInteger r4 = r0.d
            int r3 = r3 + r1
            int r2 = java.lang.Math.min(r3, r2)
            boolean r1 = r4.compareAndSet(r1, r2)
            if (r1 == 0) goto L2f
        L49:
            mjc r0 = r5.b
            miy r1 = new miy
            r2 = 0
            r1.<init>(r5, r6, r2)
            java.util.concurrent.Executor r6 = r0.g
            r6.execute(r1)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.miz.c(mbc):void");
    }

    @Override // defpackage.mjv
    public final void d() {
        if (!this.b.o()) {
            return;
        }
        mjc mjcVar = this.b;
        mjcVar.g.execute(new mgs(this, 11));
    }

    @Override // defpackage.mjv
    public final void e(lrs lrsVar) {
        boolean z;
        mix mixVar = this.b.q;
        if (mixVar.f != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Headers should be received prior to messages.");
        if (mixVar.f != this.a) {
            mfh.j(lrsVar);
            return;
        }
        mjc mjcVar = this.b;
        mjcVar.g.execute(new miy(this, lrsVar, 3));
    }
}
