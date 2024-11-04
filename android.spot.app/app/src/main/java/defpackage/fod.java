package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.StartFinderAdvertisingResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fod extends dug implements IInterface {
    public fod() {
        super("com.google.android.gms.findmydevice.spot.internal.ISpotWearableCompanionCallbacks");
    }

    public void b(Status status, StartFinderAdvertisingResponse startFinderAdvertisingResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    Status status = (Status) duh.a(parcel, Status.CREATOR);
                    StartFinderAdvertisingResponse startFinderAdvertisingResponse = (StartFinderAdvertisingResponse) duh.a(parcel, StartFinderAdvertisingResponse.CREATOR);
                    duh.b(parcel);
                    b(status, startFinderAdvertisingResponse);
                    return true;
                }
                duh.b(parcel);
                throw new UnsupportedOperationException();
            }
            duh.b(parcel);
            throw new UnsupportedOperationException();
        }
        duh.b(parcel);
        throw new UnsupportedOperationException();
    }
}
