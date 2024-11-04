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
public final class RangingPositionParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(10);
    public RangingMeasurementParams a;
    public RangingMeasurementParams b;
    public RangingMeasurementParams c;
    public long d;
    public final int e;
    public DlTdoaMeasurementParams f;

    private RangingPositionParams() {
        this.e = -128;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingPositionParams) {
            RangingPositionParams rangingPositionParams = (RangingPositionParams) obj;
            if (amr.g(this.a, rangingPositionParams.a) && amr.g(this.b, rangingPositionParams.b) && amr.g(this.c, rangingPositionParams.c) && amr.g(Long.valueOf(this.d), Long.valueOf(rangingPositionParams.d)) && amr.g(Integer.valueOf(this.e), Integer.valueOf(rangingPositionParams.e)) && amr.g(this.f, rangingPositionParams.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.W(parcel, 2, this.b, i);
        fma.W(parcel, 3, this.c, i);
        fma.M(parcel, 4, this.d);
        fma.L(parcel, 5, this.e);
        fma.W(parcel, 6, this.f, i);
        fma.F(parcel, D);
    }

    public RangingPositionParams(RangingMeasurementParams rangingMeasurementParams, RangingMeasurementParams rangingMeasurementParams2, RangingMeasurementParams rangingMeasurementParams3, long j, int i, DlTdoaMeasurementParams dlTdoaMeasurementParams) {
        this.a = rangingMeasurementParams;
        this.b = rangingMeasurementParams2;
        this.c = rangingMeasurementParams3;
        this.d = j;
        this.e = i;
        this.f = dlTdoaMeasurementParams;
    }
}
