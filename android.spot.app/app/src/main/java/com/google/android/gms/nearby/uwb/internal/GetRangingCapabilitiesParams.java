package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.ftz;
import defpackage.fub;
import defpackage.ful;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetRangingCapabilitiesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(1);
    public fub a;

    public GetRangingCapabilitiesParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetRangingCapabilitiesParams) {
            return amr.g(this.a, ((GetRangingCapabilitiesParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.R(parcel, 1, this.a.asBinder());
        fma.F(parcel, D);
    }

    public GetRangingCapabilitiesParams(IBinder iBinder) {
        fub ftzVar;
        if (iBinder == null) {
            ftzVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingCapabilitiesResultListener");
            ftzVar = queryLocalInterface instanceof fub ? (fub) queryLocalInterface : new ftz(iBinder);
        }
        this.a = ftzVar;
    }
}
