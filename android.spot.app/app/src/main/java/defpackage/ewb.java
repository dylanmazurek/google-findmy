package defpackage;

import android.accounts.Account;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ewb implements Parcelable {
    public final String a;
    public final lqd b;

    public ewb() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ewb a(Account account, lqd lqdVar) {
        return new ewe(account.name, lqdVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ewb) {
            ewb ewbVar = (ewb) obj;
            if (this.a.equals(ewbVar.a) && this.b.equals(ewbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        lqd lqdVar = this.b;
        if (lqdVar.y()) {
            i = lqdVar.i();
        } else {
            int i2 = lqdVar.y;
            if (i2 == 0) {
                i2 = lqdVar.i();
                lqdVar.y = i2;
            }
            i = i2;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "DeviceStateKey{currentAccount=" + this.a + ", deviceIdentifier=" + this.b.toString() + "}";
    }

    public ewb(String str, lqd lqdVar) {
        if (str == null) {
            throw new NullPointerException("Null currentAccount");
        }
        this.a = str;
        if (lqdVar != null) {
            this.b = lqdVar;
            return;
        }
        throw new NullPointerException("Null deviceIdentifier");
    }
}
