package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnc implements fhi {
    private final Account b;

    public fnc() {
        throw null;
    }

    @Override // defpackage.fhi
    public final Account a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fnc) {
            return this.b.equals(((fnc) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FacsCacheOptions{account=" + this.b.toString() + "}";
    }

    public fnc(Account account) {
        this.b = account;
    }
}
