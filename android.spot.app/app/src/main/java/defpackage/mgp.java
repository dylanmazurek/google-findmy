package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgp extends mek {
    final lzi c;
    final mbg d;
    final lys e;
    public final /* synthetic */ mgq f;
    private final long g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mgp(defpackage.mgq r3, defpackage.lzi r4, defpackage.mbg r5, defpackage.lys r6) {
        /*
            r2 = this;
            r2.f = r3
            mgu r3 = r3.c
            java.util.concurrent.Executor r0 = r3.d(r6)
            mgr r3 = r3.j
            lzj r1 = r6.b
            r2.<init>(r0, r3, r1)
            r2.c = r4
            r2.d = r5
            r2.e = r6
            long r3 = java.lang.System.nanoTime()
            r2.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mgp.<init>(mgq, lzi, mbg, lys):void");
    }

    @Override // defpackage.mek
    protected final void b() {
        this.f.c.m.execute(new mgs(this, 1));
    }

    public final void j() {
        mee meeVar;
        lzi a = this.c.a();
        try {
            lyv c = this.f.c(this.d, this.e.d(lyy.f, Long.valueOf(System.nanoTime() - this.g)));
            synchronized (this) {
                if (this.b != null) {
                    meeVar = null;
                } else {
                    super.i(c);
                    meeVar = new mee(this, this.a);
                }
            }
            if (meeVar == null) {
                mgq mgqVar = this.f;
                mgqVar.c.m.execute(new mgs(this, 1));
            } else {
                mgq mgqVar2 = this.f;
                mgqVar2.c.d(this.e).execute(new kvz(this, meeVar, 20));
            }
        } finally {
            this.c.c(a);
        }
    }
}
