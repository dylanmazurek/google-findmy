package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnp;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SetOwnerKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnp(4);

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof SetOwnerKeyResponse)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fma.F(parcel, fma.D(parcel));
    }
}
