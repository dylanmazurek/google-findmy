package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class naz {
    public final mrr e = new mrr(this, mrs.a);
    public final mrr f;
    public final mrr g;

    public naz() {
        mrs mrsVar = mrs.a;
        this.f = new mrr(this, mrsVar);
        this.g = new mrr(null, mrsVar);
    }

    public boolean df() {
        return f() instanceof nbe;
    }

    public final Object f() {
        while (true) {
            Object obj = this.e.a;
            if (!(obj instanceof nbd)) {
                return obj;
            }
            ((nbd) obj).a(this);
        }
    }

    public final naz g() {
        nbe nbeVar;
        Object f = f();
        if (f instanceof nbe) {
            nbeVar = (nbe) f;
        } else {
            nbeVar = null;
        }
        if (nbeVar != null) {
            return nbeVar.a;
        }
        f.getClass();
        return (naz) f;
    }

    public final naz h() {
        naz j = j();
        if (j == null) {
            Object obj = this.f.a;
            while (true) {
                naz nazVar = (naz) obj;
                if (!nazVar.df()) {
                    return nazVar;
                }
                obj = nazVar.f.a;
            }
        } else {
            return j;
        }
    }

    public final void i(naz nazVar) {
        naz nazVar2;
        do {
            nazVar2 = (naz) nazVar.f.a;
            if (f() != nazVar) {
                return;
            }
        } while (!nazVar.f.d(nazVar2, this));
        if (df()) {
            nazVar.j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:            if (r3.e.d(r2, ((defpackage.nbe) r4).a) == false) goto L34;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.naz j() {
        /*
            r7 = this;
        L0:
            mrr r0 = r7.f
            java.lang.Object r0 = r0.a
            naz r0 = (defpackage.naz) r0
            r1 = 0
            r2 = r0
        L8:
            r3 = r1
        L9:
            mrr r4 = r2.e
            java.lang.Object r4 = r4.a
            if (r4 != r7) goto L1b
            if (r0 != r2) goto L12
            return r2
        L12:
            mrr r1 = r7.f
            boolean r0 = r1.d(r0, r2)
            if (r0 == 0) goto L0
            return r2
        L1b:
            boolean r5 = r7.df()
            if (r5 == 0) goto L22
            return r1
        L22:
            if (r4 != 0) goto L25
            return r2
        L25:
            boolean r5 = r4 instanceof defpackage.nbd
            if (r5 == 0) goto L2f
            nbd r4 = (defpackage.nbd) r4
            r4.a(r2)
            goto L0
        L2f:
            boolean r5 = r4 instanceof defpackage.nbe
            if (r5 == 0) goto L4a
            if (r3 == 0) goto L43
            nbe r4 = (defpackage.nbe) r4
            naz r4 = r4.a
            mrr r5 = r3.e
            boolean r2 = r5.d(r2, r4)
            if (r2 == 0) goto L0
            r2 = r3
            goto L8
        L43:
            mrr r2 = r2.f
            java.lang.Object r2 = r2.a
            naz r2 = (defpackage.naz) r2
            goto L9
        L4a:
            r3 = r4
            naz r3 = (defpackage.naz) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.naz.j():naz");
    }

    public String toString() {
        return new mpi(this) { // from class: nay
            @Override // defpackage.mpi
            public final Object b() {
                return msz.a(this.c);
            }
        } + "@" + msz.b(this);
    }
}
