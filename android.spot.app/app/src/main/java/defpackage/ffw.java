package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ffw extends dug implements IInterface {
    public ffw() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public void b(Status status) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                c(status);
                return true;
            case 2:
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                parcel.readLong();
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 5:
                parcel.readLong();
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 6:
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 7:
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 8:
                Status status2 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                b(status2);
                return true;
            default:
                return false;
        }
    }
}
