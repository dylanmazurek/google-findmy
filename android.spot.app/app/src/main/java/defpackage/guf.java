package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guf implements gnb, gug {
    private final Throwable a;
    private final gwf b;

    public guf(Throwable th, gwf gwfVar) {
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
        if (!(obj instanceof guf)) {
            return false;
        }
        guf gufVar = (guf) obj;
        if (amr.i(this.a, gufVar.a) && amr.i(this.b, gufVar.b)) {
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
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.gug
    public final gwf i() {
        return this.b;
    }

    public final String toString() {
        return "AuthPermanentFailure(exception=" + this.a + ", account=" + this.b + ")";
    }
}
