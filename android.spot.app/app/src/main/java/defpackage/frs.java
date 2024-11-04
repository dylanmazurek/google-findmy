package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frs extends duf implements IInterface {
    public frs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    public final void e(fen fenVar) {
        Parcel a = a();
        duh.d(a, fenVar);
        c(32, a);
    }

    public final void f(fen fenVar) {
        Parcel a = a();
        duh.d(a, fenVar);
        c(30, a);
    }
}
