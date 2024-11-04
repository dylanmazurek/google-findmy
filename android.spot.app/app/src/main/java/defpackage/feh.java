package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class feh implements fei {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;

    public feh(String str, Context context) {
        this.a = str;
        this.b = context;
    }

    @Override // defpackage.fei
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) {
        ezw ezwVar;
        if (iBinder == null) {
            ezwVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof ezw) {
                ezwVar = (ezw) queryLocalInterface;
            } else {
                ezwVar = new ezw(iBinder);
            }
        }
        String str = this.a;
        Parcel a = ezwVar.a();
        a.writeString(str);
        Parcel b = ezwVar.b(8, a);
        Bundle bundle = (Bundle) duh.a(b, Bundle.CREATOR);
        b.recycle();
        fej.l(bundle);
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent");
        if (feu.SUCCESS.equals(feu.a(string))) {
            return true;
        }
        fej.h(this.b, "requestGoogleAccountsAccess", string, intent, pendingIntent);
        throw new fed("Invalid state. Shouldn't happen");
    }
}
