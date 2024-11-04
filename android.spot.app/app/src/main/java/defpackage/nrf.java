package defpackage;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrf extends nnw {
    private static final long serialVersionUID = 6941492635554961361L;
    final int e;
    final nri f;
    final nri g;

    public nrf(String str, int i, nri nriVar, nri nriVar2) {
        super(str);
        this.e = i;
        this.f = nriVar;
        this.g = nriVar2;
    }

    private final nri n(long j) {
        long j2;
        int i = this.e;
        nri nriVar = this.f;
        nri nriVar2 = this.g;
        try {
            j2 = nriVar.a(j, i, nriVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            j2 = j;
        }
        try {
            j = nriVar2.a(j, i, nriVar.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        if (j2 > j) {
            return nriVar;
        }
        return nriVar2;
    }

    @Override // defpackage.nnw
    public final int a(long j) {
        return this.e + n(j).c;
    }

    @Override // defpackage.nnw
    public final int c(long j) {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:            if (r5 < 0) goto L8;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[RETURN] */
    @Override // defpackage.nnw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(long r9) {
        /*
            r8 = this;
            int r0 = r8.e
            nri r1 = r8.f
            nri r2 = r8.g
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L16
            long r5 = r1.a(r9, r0, r5)     // Catch: java.lang.Throwable -> L16
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L17
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L17
        L16:
            r5 = r9
        L17:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L28
            long r0 = r2.a(r9, r0, r1)     // Catch: java.lang.Throwable -> L28
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L26
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L26
            goto L29
        L26:
            r9 = r0
            goto L29
        L28:
        L29:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L2e
            return r9
        L2e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrf.e(long):long");
    }

    @Override // defpackage.nnw
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nrf) {
            nrf nrfVar = (nrf) obj;
            if (this.c.equals(nrfVar.c) && this.e == nrfVar.e && this.f.equals(nrfVar.f) && this.g.equals(nrfVar.g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:            if (r5 > 0) goto L8;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    @Override // defpackage.nnw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(long r9) {
        /*
            r8 = this;
            int r0 = r8.e
            nri r1 = r8.f
            nri r2 = r8.g
            r3 = 1
            long r9 = r9 + r3
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L19
            long r5 = r1.b(r9, r0, r5)     // Catch: java.lang.Throwable -> L19
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L1a
        L19:
            r5 = r9
        L1a:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L2b
            long r0 = r2.b(r9, r0, r1)     // Catch: java.lang.Throwable -> L2b
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L29
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L29
            goto L2c
        L29:
            r9 = r0
            goto L2c
        L2b:
        L2c:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 > 0) goto L31
            r5 = r9
        L31:
            r9 = -1
            long r5 = r5 + r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nrf.f(long):long");
    }

    @Override // defpackage.nnw
    public final String g(long j) {
        return n(j).b;
    }

    @Override // defpackage.nnw
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.f, this.g});
    }

    @Override // defpackage.nnw
    public final boolean k() {
        return false;
    }
}
