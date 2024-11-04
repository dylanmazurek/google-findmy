package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsm implements gmx {
    public final boolean a;
    private final Throwable b;

    public gsm(Throwable th, boolean z) {
        this.b = th;
        this.a = z;
    }

    @Override // defpackage.gmx
    public final Throwable a() {
        return this.b;
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
        if (!(obj instanceof gsm)) {
            return false;
        }
        gsm gsmVar = (gsm) obj;
        if (amr.i(this.b, gsmVar.b) && this.a == gsmVar.a) {
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
        return (this.b.hashCode() * 31) + a.i(this.a);
    }

    public final String toString() {
        return "TokenRegenerationFailure(exception=" + this.b + ", hasDeletedToken=" + this.a + ")";
    }
}
