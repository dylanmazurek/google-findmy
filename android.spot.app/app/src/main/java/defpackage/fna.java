package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fna extends duf implements IInterface {
    public fna(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int e() {
        Parcel b = b(6, a());
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }
}
