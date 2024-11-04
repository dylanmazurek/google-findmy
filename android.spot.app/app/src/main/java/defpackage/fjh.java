package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fjh extends dug implements fji {
    public fjh() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.dug
    protected final boolean y(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) duh.a(parcel, Status.CREATOR);
            duh.b(parcel);
            b(status);
            return true;
        }
        return false;
    }
}
