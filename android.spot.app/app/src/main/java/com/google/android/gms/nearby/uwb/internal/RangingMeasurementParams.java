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
public final class RangingMeasurementParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(8);
    public int a;
    public float b;

    private RangingMeasurementParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingMeasurementParams) {
            RangingMeasurementParams rangingMeasurementParams = (RangingMeasurementParams) obj;
            if (amr.g(Integer.valueOf(this.a), Integer.valueOf(rangingMeasurementParams.a)) && amr.g(Float.valueOf(this.b), Float.valueOf(rangingMeasurementParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Float.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.K(parcel, 2, this.b);
        fma.F(parcel, D);
    }

    public RangingMeasurementParams(int i, float f) {
        this.a = i;
        this.b = f;
    }
}
