package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.ful;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OnRangingInitializedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(3);
    public UwbDeviceParams a;

    private OnRangingInitializedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnRangingInitializedParams) {
            return amr.g(this.a, ((OnRangingInitializedParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.F(parcel, D);
    }

    public OnRangingInitializedParams(UwbDeviceParams uwbDeviceParams) {
        this.a = uwbDeviceParams;
    }
}
