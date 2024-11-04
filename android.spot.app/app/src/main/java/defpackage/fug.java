package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fug extends dug implements fuh {
    final /* synthetic */ bym a;

    public fug() {
        super("com.google.android.gms.nearby.uwb.internal.IResultListener");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        String str;
        if (i == 2) {
            int readInt = parcel.readInt();
            duh.b(parcel);
            if (readInt == 42004) {
                this.a.r(new SecurityException("Missing UWB_RANGING permission"));
                return true;
            }
            if (readInt != 0) {
                bym bymVar = this.a;
                switch (readInt) {
                    case 42000:
                        str = "SERVICE_NOT_AVAILABLE";
                        break;
                    case 42001:
                        str = "NULL_RANGING_DEVICE";
                        break;
                    case 42002:
                        str = "INVALID_API_CALL";
                        break;
                    case 42003:
                        str = "RANGING_ALREADY_STARTED";
                        break;
                    case 42004:
                        str = "MISSING_PERMISSION_UWB_RANGING";
                        break;
                    case 42005:
                        str = "UWB_SYSTEM_CALLBACK_FAILURE";
                        break;
                    default:
                        str = fma.bc(readInt);
                        break;
                }
                bymVar.r(new fhn(new Status(readInt, str)));
                return true;
            }
            this.a.s(null);
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fug(bym bymVar) {
        super("com.google.android.gms.nearby.uwb.internal.IResultListener");
        this.a = bymVar;
    }
}
