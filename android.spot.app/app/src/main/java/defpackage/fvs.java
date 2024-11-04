package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvs extends duf implements IInterface {
    public fvs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.people.internal.IPeopleService");
    }

    public final void e(fvr fvrVar, boolean z, int i) {
        Parcel a = a();
        duh.d(a, fvrVar);
        a.writeInt(z ? 1 : 0);
        a.writeString(null);
        a.writeString(null);
        a.writeInt(i);
        Parcel b = b(11, a);
        b.recycle();
    }
}
