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
public final class RangingParametersParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(9);
    public int a;
    public int b;
    public byte[] c;
    public UwbComplexChannelParams d;
    public int e;
    public UwbDeviceParams[] f;
    public int g;
    public byte[] h;
    public UwbDeviceParams i;
    public RangeDataNtfConfigParams j;
    public int k;
    public int l;
    public boolean m;

    public RangingParametersParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingParametersParams) {
            RangingParametersParams rangingParametersParams = (RangingParametersParams) obj;
            if (amr.g(Integer.valueOf(this.a), Integer.valueOf(rangingParametersParams.a)) && amr.g(Integer.valueOf(this.b), Integer.valueOf(rangingParametersParams.b)) && Arrays.equals(this.c, rangingParametersParams.c) && amr.g(this.d, rangingParametersParams.d) && amr.g(Integer.valueOf(this.e), Integer.valueOf(rangingParametersParams.e)) && Arrays.equals(this.f, rangingParametersParams.f) && amr.g(Integer.valueOf(this.g), Integer.valueOf(rangingParametersParams.g)) && Arrays.equals(this.h, rangingParametersParams.h) && amr.g(this.i, rangingParametersParams.i) && amr.g(this.j, rangingParametersParams.j) && amr.g(Integer.valueOf(this.k), Integer.valueOf(rangingParametersParams.k)) && amr.g(Integer.valueOf(this.l), Integer.valueOf(rangingParametersParams.l)) && amr.g(Boolean.valueOf(this.m), Boolean.valueOf(rangingParametersParams.m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(Arrays.hashCode(this.c)), this.d, Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(this.g), Integer.valueOf(Arrays.hashCode(this.h)), this.i, this.j, Integer.valueOf(this.k), Integer.valueOf(this.l), Boolean.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.L(parcel, 2, this.b);
        fma.I(parcel, 3, this.c, false);
        fma.W(parcel, 4, this.d, i);
        fma.L(parcel, 5, this.e);
        fma.aa(parcel, 6, this.f, i);
        fma.L(parcel, 7, this.g);
        fma.I(parcel, 8, this.h, false);
        fma.W(parcel, 9, this.i, i);
        fma.W(parcel, 10, this.j, i);
        fma.L(parcel, 11, this.k);
        fma.L(parcel, 12, this.l);
        fma.G(parcel, 13, this.m);
        fma.F(parcel, D);
    }

    public RangingParametersParams(int i, int i2, byte[] bArr, UwbComplexChannelParams uwbComplexChannelParams, int i3, UwbDeviceParams[] uwbDeviceParamsArr, int i4, byte[] bArr2, UwbDeviceParams uwbDeviceParams, RangeDataNtfConfigParams rangeDataNtfConfigParams, int i5, int i6, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
        this.d = uwbComplexChannelParams;
        this.e = i3;
        this.f = uwbDeviceParamsArr;
        this.g = i4;
        this.h = bArr2;
        this.i = uwbDeviceParams;
        this.j = rangeDataNtfConfigParams;
        this.k = i5;
        this.l = i6;
        this.m = z;
    }
}
