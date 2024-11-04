package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guh implements gmx, gug {
    private final Throwable a;
    private final gwf b;

    public guh(Throwable th, gwf gwfVar) {
        gwfVar.getClass();
        this.a = th;
        this.b = gwfVar;
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
        if (!(obj instanceof guh)) {
            return false;
        }
        guh guhVar = (guh) obj;
        if (amr.i(this.a, guhVar.a) && amr.i(this.b, guhVar.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean h() {
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.gug
    public final gwf i() {
        return this.b;
    }

    public final String toString() {
        return "AuthTransientFailure(exception=" + this.a + ", account=" + this.b + ")";
    }
}
