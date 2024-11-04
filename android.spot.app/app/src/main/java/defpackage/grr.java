package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class grr implements gnb {
    public final UserRecoverableAuthException a;

    public grr(UserRecoverableAuthException userRecoverableAuthException) {
        this.a = userRecoverableAuthException;
    }

    @Override // defpackage.gmx
    public final /* synthetic */ Throwable a() {
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
        if ((obj instanceof grr) && amr.i(this.a, ((grr) obj).a)) {
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
        return "AuthTokenRecoverableFailure(exception=" + this.a + ")";
    }
}
