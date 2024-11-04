package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.google.vr.dynamite.client.INativeLibraryLoader;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnt extends duf implements INativeLibraryLoader {
    public lnt(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel b = b(2, a);
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) {
        Parcel a = a();
        a.writeString(str);
        Parcel b = b(1, a);
        long readLong = b.readLong();
        b.recycle();
        return readLong;
    }
}
