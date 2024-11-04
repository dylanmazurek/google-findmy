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
public final class OnPeerDisconnectedParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(2);
    public UwbDeviceParams a;
    public int b;

    private OnPeerDisconnectedParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPeerDisconnectedParams) {
            OnPeerDisconnectedParams onPeerDisconnectedParams = (OnPeerDisconnectedParams) obj;
            if (amr.g(this.a, onPeerDisconnectedParams.a) && amr.g(Integer.valueOf(this.b), Integer.valueOf(onPeerDisconnectedParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.L(parcel, 2, this.b);
        fma.F(parcel, D);
    }

    public OnPeerDisconnectedParams(UwbDeviceParams uwbDeviceParams, int i) {
        this.a = uwbDeviceParams;
        this.b = i;
    }
}
