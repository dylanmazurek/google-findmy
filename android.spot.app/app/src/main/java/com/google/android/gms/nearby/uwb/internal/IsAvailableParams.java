package com.google.android.gms.nearby.uwb.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.ftv;
import defpackage.ftx;
import defpackage.ful;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class IsAvailableParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(0);
    public ftx a;

    public IsAvailableParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IsAvailableParams) {
            return amr.g(this.a, ((IsAvailableParams) obj).a);
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

    public IsAvailableParams(IBinder iBinder) {
        ftx ftvVar;
        if (iBinder == null) {
            ftvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.IBooleanResultListener");
            ftvVar = queryLocalInterface instanceof ftx ? (ftx) queryLocalInterface : new ftv(iBinder);
        }
        this.a = ftvVar;
    }
}
