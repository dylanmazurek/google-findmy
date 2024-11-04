package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guo implements gul {
    public final Set a;
    private final Throwable b;

    public guo(Throwable th, Set set) {
        set.getClass();
        this.b = th;
        this.a = set;
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
        if (!(obj instanceof guo)) {
            return false;
        }
        guo guoVar = (guo) obj;
        if (amr.i(this.b, guoVar.b) && amr.i(this.a, guoVar.a)) {
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
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "RpcBackendFailure(exception=" + this.b + ", accountsFailed=" + this.a + ")";
    }
}
