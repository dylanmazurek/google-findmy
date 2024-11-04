package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsh implements fhi {
    private final Account b;

    public fsh() {
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
        if (obj instanceof fsh) {
            return this.b.equals(((fsh) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MdiSyncClientOptions{account=" + this.b.toString() + "}";
    }

    public fsh(Account account) {
        if (account == null) {
            throw new NullPointerException("Null account");
        }
        this.b = account;
    }
}
