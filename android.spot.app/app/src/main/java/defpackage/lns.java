package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.vr.dynamite.client.ILoadedInstanceCreator;
import com.google.vr.dynamite.client.INativeLibraryLoader;
import com.google.vr.dynamite.client.IObjectWrapper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lns extends duf implements ILoadedInstanceCreator {
    public lns(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        INativeLibraryLoader lntVar;
        Parcel a = a();
        duh.d(a, iObjectWrapper);
        duh.d(a, iObjectWrapper2);
        Parcel b = b(1, a);
        IBinder readStrongBinder = b.readStrongBinder();
        if (readStrongBinder == null) {
            lntVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            if (queryLocalInterface instanceof INativeLibraryLoader) {
                lntVar = (INativeLibraryLoader) queryLocalInterface;
            } else {
                lntVar = new lnt(readStrongBinder);
            }
        }
        b.recycle();
        return lntVar;
    }
}
