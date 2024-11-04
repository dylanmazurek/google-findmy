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
public final class OnRangingResultParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(4);
    public UwbDeviceParams a;
    public RangingPositionParams b;

    private OnRangingResultParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnRangingResultParams) {
            OnRangingResultParams onRangingResultParams = (OnRangingResultParams) obj;
            if (amr.g(this.a, onRangingResultParams.a) && amr.g(this.b, onRangingResultParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.W(parcel, 2, this.b, i);
        fma.F(parcel, D);
    }

    public OnRangingResultParams(UwbDeviceParams uwbDeviceParams, RangingPositionParams rangingPositionParams) {
        this.a = uwbDeviceParams;
        this.b = rangingPositionParams;
    }
}
