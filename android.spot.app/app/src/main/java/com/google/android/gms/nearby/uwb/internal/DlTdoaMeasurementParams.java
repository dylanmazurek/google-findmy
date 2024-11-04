package com.google.android.gms.nearby.uwb.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DlTdoaMeasurementParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(19);
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public long g;
    public float h;
    public float i;
    public long j;
    public long k;
    public int l;
    public byte[] m;
    public byte[] n;

    private DlTdoaMeasurementParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DlTdoaMeasurementParams) {
            DlTdoaMeasurementParams dlTdoaMeasurementParams = (DlTdoaMeasurementParams) obj;
            if (amr.g(Integer.valueOf(this.a), Integer.valueOf(dlTdoaMeasurementParams.a)) && amr.g(Integer.valueOf(this.b), Integer.valueOf(dlTdoaMeasurementParams.b)) && amr.g(Integer.valueOf(this.c), Integer.valueOf(dlTdoaMeasurementParams.c)) && amr.g(Integer.valueOf(this.d), Integer.valueOf(dlTdoaMeasurementParams.d)) && amr.g(Integer.valueOf(this.e), Integer.valueOf(dlTdoaMeasurementParams.e)) && amr.g(Long.valueOf(this.f), Long.valueOf(dlTdoaMeasurementParams.f)) && amr.g(Long.valueOf(this.g), Long.valueOf(dlTdoaMeasurementParams.g)) && amr.g(Float.valueOf(this.h), Float.valueOf(dlTdoaMeasurementParams.h)) && amr.g(Float.valueOf(this.i), Float.valueOf(dlTdoaMeasurementParams.i)) && amr.g(Long.valueOf(this.j), Long.valueOf(dlTdoaMeasurementParams.j)) && amr.g(Long.valueOf(this.k), Long.valueOf(dlTdoaMeasurementParams.k)) && amr.g(Integer.valueOf(this.l), Integer.valueOf(dlTdoaMeasurementParams.l)) && Arrays.equals(this.m, dlTdoaMeasurementParams.m) && Arrays.equals(this.n, dlTdoaMeasurementParams.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Float.valueOf(this.h), Float.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(Arrays.hashCode(this.m)), Integer.valueOf(Arrays.hashCode(this.n))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.L(parcel, 2, this.b);
        fma.L(parcel, 3, this.c);
        fma.L(parcel, 4, this.d);
        fma.L(parcel, 5, this.e);
        fma.M(parcel, 6, this.f);
        fma.M(parcel, 7, this.g);
        fma.K(parcel, 8, this.h);
        fma.K(parcel, 9, this.i);
        fma.M(parcel, 10, this.j);
        fma.M(parcel, 11, this.k);
        fma.L(parcel, 12, this.l);
        fma.I(parcel, 13, this.m, false);
        fma.I(parcel, 14, this.n, false);
        fma.F(parcel, D);
    }

    public DlTdoaMeasurementParams(int i, int i2, int i3, int i4, int i5, long j, long j2, float f, float f2, long j3, long j4, int i6, byte[] bArr, byte[] bArr2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j;
        this.g = j2;
        this.h = f;
        this.i = f2;
        this.j = j3;
        this.k = j4;
        this.l = i6;
        this.m = bArr;
        this.n = bArr2;
    }
}
