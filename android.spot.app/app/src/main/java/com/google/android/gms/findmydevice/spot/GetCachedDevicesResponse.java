package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetCachedDevicesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(7);
    public CachedSpotDevice[] a;

    private GetCachedDevicesResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCachedDevicesResponse) {
            return Arrays.equals(this.a, ((GetCachedDevicesResponse) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.aa(parcel, 1, this.a, i);
        fma.F(parcel, D);
    }

    public GetCachedDevicesResponse(CachedSpotDevice[] cachedSpotDeviceArr) {
        this.a = cachedSpotDeviceArr;
    }
}
