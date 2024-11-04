package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fss extends dug implements IInterface {
    public fss() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, OpenFileDescriptorResponse openFileDescriptorResponse) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                d(status);
            } else {
                Status status2 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                b(status2);
            }
        } else {
            Status status3 = (Status) duh.a(parcel, Status.CREATOR);
            OpenFileDescriptorResponse openFileDescriptorResponse = (OpenFileDescriptorResponse) duh.a(parcel, OpenFileDescriptorResponse.CREATOR);
            duh.b(parcel);
            c(status3, openFileDescriptorResponse);
        }
        return true;
    }
}
