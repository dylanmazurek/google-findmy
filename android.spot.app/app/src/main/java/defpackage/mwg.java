package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwg extends mvu {
    private final int f;
    private final int g;

    public mwg(int i, int i2) {
        super(i);
        this.f = i;
        this.g = i2;
        if (i2 != 1) {
            if (i > 0) {
                return;
            } else {
                throw new IllegalArgumentException(a.am(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
        }
        int i3 = mpo.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new mox(mvu.class).c() + " instead");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:            return defpackage.mlh.a;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object D(java.lang.Object r15) {
        /*
            r14 = this;
            nbj r8 = defpackage.mvw.d
            mrr r0 = r14.c
            java.lang.Object r0 = r0.a
            mwd r0 = (defpackage.mwd) r0
        L8:
            mrq r1 = r14.a
            long r1 = r1.b()
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = super.y(r1)
            int r1 = defpackage.mvw.b
            long r1 = (long) r1
            long r3 = r9 / r1
            long r1 = r9 % r1
            int r12 = (int) r1
            long r1 = r0.b
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L3c
            mwd r1 = super.p(r3, r0)
            if (r1 != 0) goto L3a
            if (r11 == 0) goto L8
            java.lang.Throwable r15 = r14.n()
            mwa r0 = new mwa
            r0.<init>(r15)
            goto L9b
        L3a:
            r13 = r1
            goto L3d
        L3c:
            r13 = r0
        L3d:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = super.a(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L96
            r1 = 1
            if (r0 == r1) goto L93
            r1 = 2
            if (r0 == r1) goto L78
            r1 = 3
            if (r0 == r1) goto L70
            r1 = 4
            if (r0 == r1) goto L5b
            r13.p()
            r0 = r13
            goto L8
        L5b:
            long r0 = r14.b()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L66
            r13.p()
        L66:
            java.lang.Throwable r15 = r14.n()
            mwa r0 = new mwa
            r0.<init>(r15)
            goto L9b
        L70:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L78:
            if (r11 == 0) goto L87
            r13.s()
            java.lang.Throwable r15 = r14.n()
            mwa r0 = new mwa
            r0.<init>(r15)
            goto L9b
        L87:
            long r0 = r13.b
            int r15 = defpackage.mvw.b
            long r2 = (long) r15
            long r0 = r0 * r2
            long r2 = (long) r12
            long r0 = r0 + r2
            r14.q(r0)
        L93:
            mlh r0 = defpackage.mlh.a
            goto L9b
        L96:
            r13.p()
            mlh r0 = defpackage.mlh.a
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwg.D(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mvu, defpackage.mwl
    public final Object h(Object obj, mmx mmxVar) {
        Object D = D(obj);
        if (!(D instanceof mwa)) {
            return mlh.a;
        }
        mwc.b(D);
        throw n();
    }

    @Override // defpackage.mvu, defpackage.mwl
    public final Object j(Object obj) {
        return D(obj);
    }

    @Override // defpackage.mvu
    protected final boolean z() {
        if (this.g == 2) {
            return true;
        }
        return false;
    }
}
