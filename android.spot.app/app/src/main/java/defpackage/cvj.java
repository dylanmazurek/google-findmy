package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvj implements cvf {
    public final cih a;
    public final cio b;
    public final cio c;
    private final chl d;

    public cvj(cih cihVar) {
        this.a = cihVar;
        this.d = new cvg(cihVar);
        this.b = new cvh(cihVar);
        this.c = new cvi(cihVar);
    }

    @Override // defpackage.cvf
    public final void a(cve cveVar) {
        this.a.l();
        this.a.m();
        try {
            this.d.b(cveVar);
            this.a.p();
        } finally {
            this.a.n();
        }
    }
}
