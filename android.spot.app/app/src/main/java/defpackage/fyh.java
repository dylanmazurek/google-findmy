package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fyh extends dug implements IInterface {
    public fyh() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    public void b(Status status, UsageReportingOptInOptions usageReportingOptInOptions) {
        throw new IllegalStateException("Not implemented.");
    }

    public void c(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    public void d(Status status) {
        throw new IllegalStateException("Not implemented.");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                UsageReportingOptInOptions usageReportingOptInOptions = (UsageReportingOptInOptions) duh.a(parcel, UsageReportingOptInOptions.CREATOR);
                duh.b(parcel);
                b(status, usageReportingOptInOptions);
                return true;
            case 3:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 4:
                Status status2 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                c(status2);
                return true;
            case 5:
                Status status3 = (Status) duh.a(parcel, Status.CREATOR);
                duh.b(parcel);
                d(status3);
                return true;
            case 6:
                parcel.createStringArrayList();
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 7:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 8:
                duh.e(parcel);
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 9:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 10:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented");
            case 11:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 12:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 13:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            case 14:
                duh.b(parcel);
                throw new IllegalStateException("Not implemented.");
            default:
                return false;
        }
    }
}
