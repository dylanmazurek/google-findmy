package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fwv extends dug implements IInterface {
    public fwv() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    public void b(Status status, PseudonymousIdToken pseudonymousIdToken) {
        throw null;
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
                    parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
                    duh.b(parcel);
                    throw new UnsupportedOperationException();
                }
                parcel.readLong();
                duh.b(parcel);
                throw new UnsupportedOperationException();
            }
            duh.b(parcel);
            throw new UnsupportedOperationException();
        }
        Status status = (Status) duh.a(parcel, Status.CREATOR);
        PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) duh.a(parcel, PseudonymousIdToken.CREATOR);
        duh.b(parcel);
        b(status, pseudonymousIdToken);
        return true;
    }
}
