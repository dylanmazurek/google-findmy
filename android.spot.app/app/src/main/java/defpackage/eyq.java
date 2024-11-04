package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyq extends pn {
    @Override // defpackage.pn
    public final /* synthetic */ Intent a(Context context, Object obj) {
        Account account = (Account) obj;
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 227);
        if (account != null) {
            putExtra.putExtra("extra.accountName", account.name);
        }
        if (putExtra.resolveActivity(context.getPackageManager()) != null) {
            return putExtra;
        }
        return new Intent("android.intent.action.VIEW", Uri.parse("https://myaccount.google.com/activitycontrols/location")).addFlags(268435456);
    }

    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        return null;
    }
}
