package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gru {
    public final Account a;
    public final String b;

    public gru(Account account, String str) {
        str.getClass();
        this.a = account;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gru)) {
            return false;
        }
        gru gruVar = (gru) obj;
        if (amr.i(this.a, gruVar.a) && amr.i(this.b, gruVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope(account=" + this.a + ", scope=" + this.b + ")";
    }
}
