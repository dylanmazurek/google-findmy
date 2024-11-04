package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdg {
    private final mjx a;
    private final mfz b = mjo.q();
    private final mfz c = mjo.q();
    private final mfz d = mjo.q();
    private volatile long e;

    public mdg(mjx mjxVar) {
        this.a = mjxVar;
    }

    public final void a(boolean z) {
        if (z) {
            this.c.a();
        } else {
            this.d.a();
        }
    }

    public final void b() {
        this.b.a();
        this.e = this.a.a();
    }
}
