package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atp extends atq {
    private final long a;
    private float b = 1.0f;
    private ji c;

    public atp(long j) {
        this.a = j;
    }

    @Override // defpackage.atq
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.atq
    protected final void b(asn asnVar) {
        kv.f(asnVar, this.a, this.b, this.c, 86);
    }

    @Override // defpackage.atq
    protected final void d(ji jiVar) {
        this.c = jiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof atp) && a.n(this.a, ((atp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    @Override // defpackage.atq
    protected final void j(float f) {
        this.b = f;
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) aqx.g(this.a)) + ')';
    }
}
