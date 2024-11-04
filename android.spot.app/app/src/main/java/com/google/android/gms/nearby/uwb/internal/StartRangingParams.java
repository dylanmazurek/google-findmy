package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fuc;
import defpackage.fue;
import defpackage.fuf;
import defpackage.fuh;
import defpackage.ful;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StartRangingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(11);
    public fuh a;
    public RangingParametersParams b;
    public fue c;

    public StartRangingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartRangingParams) {
            StartRangingParams startRangingParams = (StartRangingParams) obj;
            if (amr.g(this.a, startRangingParams.a) && amr.g(this.b, startRangingParams.b) && amr.g(this.c, startRangingParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
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
        fma.W(parcel, 2, this.b, i);
        fma.R(parcel, 3, this.c.asBinder());
        fma.F(parcel, D);
    }

    public StartRangingParams(IBinder iBinder, RangingParametersParams rangingParametersParams, IBinder iBinder2) {
        fuh fufVar;
        fue fueVar = null;
        if (iBinder == null) {
            fufVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IResultListener");
            fufVar = queryLocalInterface instanceof fuh ? (fuh) queryLocalInterface : new fuf(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IRangingSessionCallback");
            fueVar = queryLocalInterface2 instanceof fue ? (fue) queryLocalInterface2 : new fuc(iBinder2);
        }
        this.a = fufVar;
        this.b = rangingParametersParams;
        this.c = fueVar;
    }
}
