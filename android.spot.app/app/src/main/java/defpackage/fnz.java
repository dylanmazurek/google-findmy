package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.OwnersLocationReportResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fnz extends dug implements IInterface {
    public fnz() {
        super("com.google.android.gms.findmydevice.spot.internal.ISpotLocationReportCallbacks");
    }

    public void b(Status status, OwnersLocationReportResponse ownersLocationReportResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 3) {
            if (i != 5) {
                if (i != 7) {
                    return false;
                }
                duh.b(parcel);
                throw new UnsupportedOperationException();
            }
            Status status = (Status) duh.a(parcel, Status.CREATOR);
            OwnersLocationReportResponse ownersLocationReportResponse = (OwnersLocationReportResponse) duh.a(parcel, OwnersLocationReportResponse.CREATOR);
            duh.b(parcel);
            b(status, ownersLocationReportResponse);
            return true;
        }
        duh.b(parcel);
        throw new UnsupportedOperationException();
    }
}
