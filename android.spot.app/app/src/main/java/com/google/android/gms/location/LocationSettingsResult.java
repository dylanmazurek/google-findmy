package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fhz;
import defpackage.fma;
import defpackage.fnp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable implements fhz {
    public static final Parcelable.Creator CREATOR = new fnp(19);
    public final Status a;
    public final LocationSettingsStates b;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.a = status;
        this.b = locationSettingsStates;
    }

    @Override // defpackage.fhz
    public final Status b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int D = fma.D(parcel);
        fma.W(parcel, 1, status, i);
        fma.W(parcel, 2, this.b, i);
        fma.F(parcel, D);
    }
}
