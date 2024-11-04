package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fni extends dug implements IInterface {
    public fni() {
        super("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
    }

    public void b(Status status, ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, GetActivityControlsSettingsResult getActivityControlsSettingsResult) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        duh.b(parcel);
                        throw new UnsupportedOperationException();
                    }
                    duh.b(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status = (Status) duh.a(parcel, Status.CREATOR);
                GetActivityControlsSettingsResult getActivityControlsSettingsResult = (GetActivityControlsSettingsResult) duh.a(parcel, GetActivityControlsSettingsResult.CREATOR);
                duh.b(parcel);
                c(status, getActivityControlsSettingsResult);
            } else {
                duh.b(parcel);
                throw new UnsupportedOperationException();
            }
        } else {
            Status status2 = (Status) duh.a(parcel, Status.CREATOR);
            ForceSettingsCacheRefreshResult forceSettingsCacheRefreshResult = (ForceSettingsCacheRefreshResult) duh.a(parcel, ForceSettingsCacheRefreshResult.CREATOR);
            duh.b(parcel);
            b(status2, forceSettingsCacheRefreshResult);
        }
        return true;
    }
}
