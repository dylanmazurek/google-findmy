package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gui implements gul {
    private final Throwable a;

    public gui(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.gmx
    public final Throwable a() {
        return this.a;
    }

    @Override // defpackage.gna
    public final /* synthetic */ Object b() {
        return frx.H(this);
    }

    @Override // defpackage.gna
    public final /* synthetic */ Object c() {
        return frx.I(this);
    }

    @Override // defpackage.gna
    public final /* synthetic */ Throwable d() {
        return frx.J(this);
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gui) && amr.i(this.a, ((gui) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean f() {
        return true;
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericHttpPermanentFailure(exception=" + this.a + ")";
    }
}