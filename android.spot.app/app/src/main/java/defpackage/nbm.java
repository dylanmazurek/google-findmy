package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nbm {
    private final mrp a = new mrp(0, mrs.a);
    public nbn[] b;

    private final void h(int i, int i2) {
        nbn[] nbnVarArr = this.b;
        nbnVarArr.getClass();
        nbn nbnVar = nbnVarArr[i2];
        nbnVar.getClass();
        nbn nbnVar2 = nbnVarArr[i];
        nbnVar2.getClass();
        nbnVarArr[i] = nbnVar;
        nbnVarArr[i2] = nbnVar2;
        nbnVar.e(i);
        nbnVar2.e(i2);
    }

    public final int a() {
        return this.a.b;
    }

    public final nbn b() {
        nbn[] nbnVarArr = this.b;
        if (nbnVarArr != null) {
            return nbnVarArr[0];
        }
        return null;
    }

    public final nbn c() {
        nbn b;
        synchronized (this) {
            b = b();
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:            if (((java.lang.Comparable) r5).compareTo(r6) < 0) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nbn d(int r8) {
        /*
            r7 = this;
            boolean r0 = defpackage.msy.a
            nbn[] r0 = r7.b
            r0.getClass()
            int r1 = r7.a()
            r2 = -1
            int r1 = r1 + r2
            r7.e(r1)
            int r1 = r7.a()
            if (r8 >= r1) goto L7e
            int r1 = r7.a()
            r7.h(r8, r1)
            int r1 = r8 + (-1)
            if (r8 <= 0) goto L3c
            int r1 = r1 / 2
            r3 = r0[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3c
            r7.h(r8, r1)
            r7.f(r1)
            goto L7e
        L3c:
            int r1 = r8 + r8
            int r3 = r1 + 1
            int r4 = r7.a()
            if (r3 >= r4) goto L7e
            nbn[] r4 = r7.b
            r4.getClass()
            int r1 = r1 + 2
            int r5 = r7.a()
            if (r1 >= r5) goto L66
            r5 = r4[r1]
            r5.getClass()
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            r6 = r4[r3]
            r6.getClass()
            int r5 = r5.compareTo(r6)
            if (r5 >= 0) goto L66
            goto L67
        L66:
            r1 = r3
        L67:
            r3 = r4[r8]
            r3.getClass()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r4[r1]
            r4.getClass()
            int r3 = r3.compareTo(r4)
            if (r3 <= 0) goto L7e
            r7.h(r8, r1)
            r8 = r1
            goto L3c
        L7e:
            int r8 = r7.a()
            r8 = r0[r8]
            r8.getClass()
            r1 = 0
            r8.d(r1)
            r8.e(r2)
            int r2 = r7.a()
            r0[r2] = r1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbm.d(int):nbn");
    }

    public final void e(int i) {
        this.a.b = i;
    }

    public final void f(int i) {
        while (i > 0) {
            nbn[] nbnVarArr = this.b;
            nbnVarArr.getClass();
            int i2 = (i - 1) >> 1;
            nbn nbnVar = nbnVarArr[i2];
            nbnVar.getClass();
            nbn nbnVar2 = nbnVarArr[i];
            nbnVar2.getClass();
            if (((Comparable) nbnVar).compareTo(nbnVar2) > 0) {
                h(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final boolean g() {
        if (a() == 0) {
            return true;
        }
        return false;
    }
}
