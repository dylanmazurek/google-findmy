package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emd {
    public final Account a;
    public final String b;

    public emd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof emd) {
            emd emdVar = (emd) obj;
            if (this.a.equals(emdVar.a) && this.b.equals(emdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountAndScope{account=" + this.a.toString() + ", scope=" + this.b + "}";
    }

    public emd(Account account, String str) {
        this.a = account;
        this.b = str;
    }
}
