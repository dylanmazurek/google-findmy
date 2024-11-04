package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kpk extends dug implements IInterface {
    public kpk() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public void b(Status status, kpn kpnVar) {
        throw new UnsupportedOperationException();
    }

    public void c(Status status, kpc kpcVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            Status status = (Status) duh.a(parcel, Status.CREATOR);
            kpn kpnVar = (kpn) duh.a(parcel, kpn.CREATOR);
            duh.b(parcel);
            b(status, kpnVar);
        } else {
            Status status2 = (Status) duh.a(parcel, Status.CREATOR);
            kpc kpcVar = (kpc) duh.a(parcel, kpc.CREATOR);
            duh.b(parcel);
            c(status2, kpcVar);
        }
        return true;
    }
}
