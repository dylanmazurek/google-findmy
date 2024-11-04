package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvh extends nbg {
    private final ThreadLocal b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mvh(defpackage.mnb r2, defpackage.mmx r3) {
        /*
            r1 = this;
            mvi r0 = defpackage.mvi.a
            mmz r0 = r2.get(r0)
            if (r0 != 0) goto Lf
            mvi r0 = defpackage.mvi.a
            mnb r0 = r2.plus(r0)
            goto L10
        Lf:
            r0 = r2
        L10:
            r1.<init>(r0, r3)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.b = r0
            mnb r3 = r3.o()
            bcr r0 = defpackage.mmy.k
            mmz r3 = r3.get(r0)
            boolean r3 = r3 instanceof defpackage.mst
            if (r3 != 0) goto L33
            r3 = 0
            java.lang.Object r3 = defpackage.nbl.b(r2, r3)
            defpackage.nbl.c(r2, r3)
            r1.S(r2, r3)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvh.<init>(mnb, mmx):void");
    }

    public final void S(mnb mnbVar, Object obj) {
        this.threadLocalIsSet = true;
        this.b.set(new mkw(mnbVar, obj));
    }

    public final boolean T() {
        boolean z;
        if (this.threadLocalIsSet && this.b.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.b.remove();
        if (!z) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.nbg, defpackage.mrt
    public final void dk(Object obj) {
        if (this.threadLocalIsSet) {
            mkw mkwVar = (mkw) this.b.get();
            if (mkwVar != null) {
                nbl.c((mnb) mkwVar.a, mkwVar.b);
            }
            this.b.remove();
        }
        Object s = msz.s(obj, this.e);
        mmx mmxVar = this.e;
        mnb o = mmxVar.o();
        mvh mvhVar = null;
        Object b = nbl.b(o, null);
        if (b != nbl.a) {
            mvhVar = mss.c(mmxVar, o, b);
        }
        try {
            this.e.p(s);
            if (mvhVar != null && !mvhVar.T()) {
                return;
            }
            nbl.c(o, b);
        } catch (Throwable th) {
            if (mvhVar == null || mvhVar.T()) {
                nbl.c(o, b);
            }
            throw th;
        }
    }
}
