package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fvr extends dug implements IInterface {
    public fvr() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 12) {
            if (i != 15) {
                if (i != 16) {
                    if (i != 18) {
                        if (i != 19) {
                            switch (i) {
                                case 1:
                                    int readInt = parcel.readInt();
                                    Bundle bundle = (Bundle) duh.a(parcel, Bundle.CREATOR);
                                    duh.b(parcel);
                                    d(readInt, bundle);
                                    return true;
                                case 2:
                                    int readInt2 = parcel.readInt();
                                    Bundle bundle2 = (Bundle) duh.a(parcel, Bundle.CREATOR);
                                    DataHolder dataHolder = (DataHolder) duh.a(parcel, DataHolder.CREATOR);
                                    duh.b(parcel);
                                    b(readInt2, bundle2, dataHolder);
                                    return true;
                                case 3:
                                    parcel.readInt();
                                    duh.b(parcel);
                                    throw new RuntimeException("Shouldn't be called");
                                case 4:
                                    parcel.readInt();
                                    duh.b(parcel);
                                    return true;
                                case 5:
                                    int readInt3 = parcel.readInt();
                                    Bundle bundle3 = (Bundle) duh.a(parcel, Bundle.CREATOR);
                                    ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) duh.a(parcel, ParcelFileDescriptor.CREATOR);
                                    Bundle bundle4 = (Bundle) duh.a(parcel, Bundle.CREATOR);
                                    duh.b(parcel);
                                    c(readInt3, bundle3, parcelFileDescriptor, bundle4);
                                    return true;
                                case 6:
                                    parcel.readInt();
                                    duh.b(parcel);
                                    return true;
                                case 7:
                                    parcel.readInt();
                                    duh.b(parcel);
                                    return true;
                                case 8:
                                    parcel.readInt();
                                    duh.b(parcel);
                                    return true;
                                default:
                                    return false;
                            }
                        }
                        duh.b(parcel);
                        return true;
                    }
                    parcel.readInt();
                    duh.b(parcel);
                    return true;
                }
                parcel.readInt();
                duh.b(parcel);
                return true;
            }
            parcel.readInt();
            parcel.readString();
            duh.b(parcel);
            return true;
        }
        parcel.readInt();
        duh.b(parcel);
        return true;
    }

    public void d(int i, Bundle bundle) {
    }

    public void b(int i, Bundle bundle, DataHolder dataHolder) {
    }

    public void c(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
    }
}
