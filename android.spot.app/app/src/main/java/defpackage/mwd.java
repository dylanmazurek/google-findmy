package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwd extends nai {
    private final mvu c;
    private final ktf d;

    public mwd(long j, mwd mwdVar, mvu mvuVar, int i) {
        super(j, mwdVar, i);
        this.c = mvuVar;
        int i2 = mvw.b;
        this.d = new ktf(i2 + i2, (byte[]) null);
    }

    @Override // defpackage.nai
    public final int a() {
        return mvw.b;
    }

    public final Object b(int i, Object obj) {
        return this.d.u(i + i + 1).a(obj);
    }

    public final Object c(int i) {
        return this.d.u(i + i).a;
    }

    public final Object d(int i) {
        return this.d.u(i + i + 1).a;
    }

    public final Object e(int i) {
        Object c = c(i);
        g(i);
        return c;
    }

    public final mvu f() {
        mvu mvuVar = this.c;
        mvuVar.getClass();
        return mvuVar;
    }

    public final void g(int i) {
        i(i, null);
    }

    public final void h(int i, boolean z) {
        if (z) {
            f().t((this.b * mvw.b) + i);
        }
        s();
    }

    public final void i(int i, Object obj) {
        this.d.u(i + i).b(obj);
    }

    public final void j(int i, Object obj) {
        this.d.u(i + i + 1).c(obj);
    }

    public final boolean k(int i, Object obj, Object obj2) {
        return this.d.u(i + i + 1).d(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x004d, code lost:            g(r4);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0050, code lost:            if (r0 == false) goto L59;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0052, code lost:            f();     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0055, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:            return;     */
    @Override // defpackage.nai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r4) {
        /*
            r3 = this;
            int r0 = defpackage.mvw.b
            if (r4 < r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto Lc
            int r1 = defpackage.mvw.b
            int r4 = r4 - r1
        Lc:
            r3.c(r4)
        Lf:
            java.lang.Object r1 = r3.d(r4)
            boolean r2 = r1 instanceof defpackage.mvj
            if (r2 != 0) goto L56
            boolean r2 = r1 instanceof defpackage.mwm
            if (r2 == 0) goto L1c
            goto L56
        L1c:
            nbj r2 = defpackage.mvw.j
            if (r1 == r2) goto L4d
            nbj r2 = defpackage.mvw.k
            if (r1 != r2) goto L25
            goto L4d
        L25:
            nbj r2 = defpackage.mvw.g
            if (r1 == r2) goto Lf
            nbj r2 = defpackage.mvw.f
            if (r1 == r2) goto Lf
            nbj r4 = defpackage.mvw.i
            if (r1 == r4) goto L70
            nbj r4 = defpackage.mvw.d
            if (r1 == r4) goto L70
            nbj r4 = defpackage.mvw.l
            if (r1 != r4) goto L3a
            goto L70
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Objects.toString(r1)
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "unexpected state: "
            java.lang.String r0 = r1.concat(r0)
            r4.<init>(r0)
            throw r4
        L4d:
            r3.g(r4)
            if (r0 == 0) goto L70
            r3.f()
            return
        L56:
            if (r0 == 0) goto L5b
            nbj r2 = defpackage.mvw.j
            goto L5d
        L5b:
            nbj r2 = defpackage.mvw.k
        L5d:
            boolean r1 = r3.k(r4, r1, r2)
            if (r1 == 0) goto Lf
            r3.g(r4)
            r1 = r0 ^ 1
            r3.h(r4, r1)
            if (r0 == 0) goto L70
            r3.f()
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwd.l(int):void");
    }
}
