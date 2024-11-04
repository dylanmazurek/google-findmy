package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fuf;
import defpackage.fuh;
import defpackage.ful;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StopRangingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(12);
    public fuh a;

    public StopRangingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StopRangingParams) {
            return amr.g(this.a, ((StopRangingParams) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int D = fma.D(parcel);
        fuh fuhVar = this.a;
        if (fuhVar == null) {
            asBinder = null;
        } else {
            asBinder = fuhVar.asBinder();
        }
        fma.R(parcel, 1, asBinder);
        fma.F(parcel, D);
    }

    public StopRangingParams(IBinder iBinder) {
        fuh fufVar;
        if (iBinder == null) {
            fufVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            fufVar = queryLocalInterface instanceof fuh ? (fuh) queryLocalInterface : new fuf(iBinder);
        }
        this.a = fufVar;
    }
}
