package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcj extends fcl {
    public final fcy a;

    public fcj(fcn fcnVar) {
        super(fcnVar);
        this.a = new fcy(fcnVar);
    }

    @Override // defpackage.fcl
    protected final void a() {
        this.a.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b(defpackage.fco r19) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcj.b(fco):long");
    }

    public final void c(fdg fdgVar) {
        H();
        h().c(new fbh(this, fdgVar, 2, (char[]) null));
    }

    public final void d(fdj fdjVar) {
        H();
        s("Hit delivery requested", fdjVar);
        h().c(new fci(this, fdjVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        fbm.b();
        fbm.b();
        fcy fcyVar = this.a;
        fcyVar.G();
        fcyVar.f = System.currentTimeMillis();
    }
}
