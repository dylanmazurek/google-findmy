package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kwe extends lyy {
    private final Object a = new Object();
    private long b;
    private long c;
    private final kwd d;

    public kwe(kwd kwdVar) {
        this.d = kwdVar;
    }

    @Override // defpackage.mjo
    public final void T() {
        boolean z;
        synchronized (this.a) {
            kwd kwdVar = this.d;
            long j = this.b;
            boolean z2 = true;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            hwx.K(z, "Cannot record negative request bytes.");
            kwdVar.j.add(Long.valueOf(j));
            kwd kwdVar2 = this.d;
            long j2 = this.c;
            if (j2 < 0) {
                z2 = false;
            }
            hwx.K(z2, "Cannot record negative response bytes.");
            kwdVar2.k.add(Long.valueOf(j2));
        }
    }

    @Override // defpackage.mjo
    public final void c(long j) {
        synchronized (this.a) {
            this.c += j;
        }
    }

    @Override // defpackage.mjo
    public final void d(long j) {
        synchronized (this.a) {
            this.b += j;
        }
    }
}
