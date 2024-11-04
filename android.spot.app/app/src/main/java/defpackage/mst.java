package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mst extends mmt implements mmy {
    public static final mmu l = new mmu(mmy.k, cka.q);

    public mst() {
        super(mmy.k);
    }

    public abstract void a(mnb mnbVar, Runnable runnable);

    public boolean cp(mnb mnbVar) {
        return true;
    }

    @Override // defpackage.mmy
    public final void d(mmx mmxVar) {
        mse mseVar;
        nan nanVar = (nan) mmxVar;
        do {
        } while (nanVar.f.a == nao.b);
        Object obj = nanVar.f.a;
        if (obj instanceof mse) {
            mseVar = (mse) obj;
        } else {
            mseVar = null;
        }
        if (mseVar != null) {
            mseVar.x();
        }
    }

    @Override // defpackage.mmy
    public final mmx de(mmx mmxVar) {
        return new nan(this, mmxVar);
    }

    public void f(mnb mnbVar, Runnable runnable) {
        a(mnbVar, runnable);
    }

    @Override // defpackage.mmt, defpackage.mmz, defpackage.mnb
    public final mmz get(mna mnaVar) {
        mnaVar.getClass();
        if (mnaVar instanceof mmu) {
            mmu mmuVar = (mmu) mnaVar;
            if (mmuVar.b(getKey())) {
                mmz a = mmuVar.a(this);
                if (a instanceof mmz) {
                    return a;
                }
                return null;
            }
            return null;
        }
        if (mmy.k == mnaVar) {
            return this;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001c, code lost:            if (defpackage.mmy.k == r2) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:            if (r2.a(r1) != null) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:            return defpackage.mnc.a;     */
    @Override // defpackage.mmt, defpackage.mnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mnb minusKey(defpackage.mna r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.mmu
            if (r0 == 0) goto L1a
            mmu r2 = (defpackage.mmu) r2
            mna r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            mmz r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            bcr r0 = defpackage.mmy.k
            if (r0 != r2) goto L21
        L1e:
            mnc r2 = defpackage.mnc.a
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mst.minusKey(mna):mnb");
    }

    public String toString() {
        return msz.a(this) + "@" + msz.b(this);
    }
}
