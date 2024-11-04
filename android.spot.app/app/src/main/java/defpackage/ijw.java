package defpackage;

import android.accounts.Account;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijw {
    public static final Account a = new Account("shared", "mobstore");

    public static String a(Account account) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (account.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        hrb.l(z, "Account type contains ':'.", new Object[0]);
        if (account.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        hrb.l(z2, "Account type contains '/'.", new Object[0]);
        if (account.name.indexOf(47) != -1) {
            z3 = false;
        }
        hrb.l(z3, "Account name contains '/'.", new Object[0]);
        if (b(account)) {
            return "shared";
        }
        return account.type + ":" + account.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Account account) {
        return a.equals(account);
    }
}
