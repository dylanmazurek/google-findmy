package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnq;
import defpackage.fui;
import defpackage.fuk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetLocalAddressParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(20);
    public fuk a;

    public GetLocalAddressParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetLocalAddressParams) {
            return amr.g(this.a, ((GetLocalAddressParams) obj).a);
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

    public GetLocalAddressParams(IBinder iBinder) {
        fuk fuiVar;
        if (iBinder == null) {
            fuiVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IUwbAddressResultListener");
            fuiVar = queryLocalInterface instanceof fuk ? (fuk) queryLocalInterface : new fui(iBinder);
        }
        this.a = fuiVar;
    }
}
