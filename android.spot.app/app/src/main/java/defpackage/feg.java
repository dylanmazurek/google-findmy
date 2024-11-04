package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class feg implements fei {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    public feg(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
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
        Bundle bundle = this.b;
        Parcel a = ezwVar.a();
        a.writeString(str);
        duh.c(a, bundle);
        Parcel b = ezwVar.b(2, a);
        Bundle bundle2 = (Bundle) duh.a(b, Bundle.CREATOR);
        b.recycle();
        fej.l(bundle2);
        String string = bundle2.getString("Error");
        if (bundle2.getBoolean("booleanResult")) {
            return null;
        }
        throw new fed(string);
    }
}
