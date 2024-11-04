package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flc extends duf implements fle {
    public flc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.fle
    public final int e() {
        Parcel b = b(2, a());
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    @Override // defpackage.fle
    public final fmn f() {
        fmn fmlVar;
        Parcel b = b(1, a());
        IBinder readStrongBinder = b.readStrongBinder();
        if (readStrongBinder == null) {
            fmlVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof fmn) {
                fmlVar = (fmn) queryLocalInterface;
            } else {
                fmlVar = new fml(readStrongBinder);
            }
        }
        b.recycle();
        return fmlVar;
    }
}
