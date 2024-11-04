package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvs implements cvo {
    public final cih a;
    public final cio b;
    private final cio c;

    public cvs(cih cihVar) {
        this.a = cihVar;
        new cvp(cihVar);
        this.c = new cvq(cihVar);
        this.b = new cvr(cihVar);
    }

    @Override // defpackage.cvo
    public final void a(String str) {
        this.a.l();
        cks d = this.c.d();
        d.g(1, str);
        try {
            this.a.m();
            try {
                d.a();
                this.a.p();
            } finally {
                this.a.n();
            }
        } finally {
            this.c.f(d);
        }
    }
}
