package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkp implements bky {
    private final long a;

    public bkp(long j) {
        this.a = j;
        if (j != 16) {
        } else {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }

    @Override // defpackage.bky
    public final float a() {
        return aqx.a(this.a);
    }

    @Override // defpackage.bky
    public final long b() {
        return this.a;
    }

    @Override // defpackage.bky
    public final /* synthetic */ bky c(bky bkyVar) {
        return arj.e(this, bkyVar);
    }

    @Override // defpackage.bky
    public final /* synthetic */ bky d(mnw mnwVar) {
        return arj.f(this, mnwVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bkp) && a.n(this.a, ((bkp) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) aqx.g(this.a)) + ')';
    }

    @Override // defpackage.bky
    public final void e() {
    }
}
