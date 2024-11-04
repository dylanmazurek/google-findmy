package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import com.google.android.gms.findmydevice.spot.GetKeychainLockScreenKnowledgeFactorSupportResponse;
import com.google.android.gms.findmydevice.spot.GetOwnerKeyResponse;
import com.google.android.gms.findmydevice.spot.ImportGivenOwnerKeyResponse;
import com.google.android.gms.findmydevice.spot.SyncOwnerKeyResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fob extends dug implements IInterface {
    public fob() {
        super("com.google.android.gms.findmydevice.spot.internal.ISpotManagementCallbacks");
    }

    public void b(Status status, ChangeFindMyDeviceSettingsResponse changeFindMyDeviceSettingsResponse) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status, GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse) {
        throw new UnsupportedOperationException();
    }

    public void e(Status status, GetOwnerKeyResponse getOwnerKeyResponse) {
        throw new UnsupportedOperationException();
    }

    public void f(Status status, ImportGivenOwnerKeyResponse importGivenOwnerKeyResponse) {
        throw new UnsupportedOperationException();
    }

    public void g(Status status, SyncOwnerKeyResponse syncOwnerKeyResponse) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                GetOwnerKeyResponse getOwnerKeyResponse = (GetOwnerKeyResponse) duh.a(parcel, GetOwnerKeyResponse.CREATOR);
                duh.b(parcel);
                e(status, getOwnerKeyResponse);
                return true;
            case 2:
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 3:
                duh.b(parcel);
                throw new UnsupportedOperationException();
            case 4:
                Status status2 = (Status) duh.a(parcel, Status.CREATOR);
                SyncOwnerKeyResponse syncOwnerKeyResponse = (SyncOwnerKeyResponse) duh.a(parcel, SyncOwnerKeyResponse.CREATOR);
                duh.b(parcel);
                g(status2, syncOwnerKeyResponse);
                return true;
            case 5:
                Status status3 = (Status) duh.a(parcel, Status.CREATOR);
                ImportGivenOwnerKeyResponse importGivenOwnerKeyResponse = (ImportGivenOwnerKeyResponse) duh.a(parcel, ImportGivenOwnerKeyResponse.CREATOR);
                duh.b(parcel);
                f(status3, importGivenOwnerKeyResponse);
                return true;
            case 6:
                Status status4 = (Status) duh.a(parcel, Status.CREATOR);
                GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse = (GetFindMyDeviceSettingsResponse) duh.a(parcel, GetFindMyDeviceSettingsResponse.CREATOR);
                duh.b(parcel);
                c(status4, getFindMyDeviceSettingsResponse);
                return true;
            case 7:
                Status status5 = (Status) duh.a(parcel, Status.CREATOR);
                ChangeFindMyDeviceSettingsResponse changeFindMyDeviceSettingsResponse = (ChangeFindMyDeviceSettingsResponse) duh.a(parcel, ChangeFindMyDeviceSettingsResponse.CREATOR);
                duh.b(parcel);
                b(status5, changeFindMyDeviceSettingsResponse);
                return true;
            case 8:
                Status status6 = (Status) duh.a(parcel, Status.CREATOR);
                GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse = (GetKeychainLockScreenKnowledgeFactorSupportResponse) duh.a(parcel, GetKeychainLockScreenKnowledgeFactorSupportResponse.CREATOR);
                duh.b(parcel);
                d(status6, getKeychainLockScreenKnowledgeFactorSupportResponse);
                return true;
            case 9:
                duh.b(parcel);
                throw new UnsupportedOperationException();
            default:
                return false;
        }
    }
}
