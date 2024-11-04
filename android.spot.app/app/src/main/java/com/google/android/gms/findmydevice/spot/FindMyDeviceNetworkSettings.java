package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FindMyDeviceNetworkSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(6);
    public int a;

    public FindMyDeviceNetworkSettings() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FindMyDeviceNetworkSettings) {
            return amr.g(Integer.valueOf(this.a), Integer.valueOf(((FindMyDeviceNetworkSettings) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.F(parcel, D);
    }

    public FindMyDeviceNetworkSettings(int i) {
        this.a = i;
    }
}
