package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnc implements gna {
    public final Object a;

    public gnc(Object obj) {
        this.a = obj;
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
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gnc) && amr.i(this.a, ((gnc) obj).a)) {
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
        return true;
    }

    @Override // defpackage.gna
    public final /* synthetic */ boolean h() {
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(value=" + this.a + ")";
    }
}
