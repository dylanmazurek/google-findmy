package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frr extends duf implements IInterface {
    public frr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final int e() {
        Parcel b = b(9, a());
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }
}
