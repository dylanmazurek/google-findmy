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
public final class RangingCapabilitiesParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(7);
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int[] f;
    public int[] g;
    public float h;
    public int[] i;
    public int[] j;
    public int[] k;
    public boolean l;
    public boolean m;

    private RangingCapabilitiesParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RangingCapabilitiesParams) {
            RangingCapabilitiesParams rangingCapabilitiesParams = (RangingCapabilitiesParams) obj;
            if (amr.g(Boolean.valueOf(this.a), Boolean.valueOf(rangingCapabilitiesParams.a)) && amr.g(Boolean.valueOf(this.b), Boolean.valueOf(rangingCapabilitiesParams.b)) && amr.g(Boolean.valueOf(this.c), Boolean.valueOf(rangingCapabilitiesParams.c)) && amr.g(Integer.valueOf(this.d), Integer.valueOf(rangingCapabilitiesParams.d)) && amr.g(Integer.valueOf(this.e), Integer.valueOf(rangingCapabilitiesParams.e)) && Arrays.equals(this.f, rangingCapabilitiesParams.f) && Arrays.equals(this.g, rangingCapabilitiesParams.g) && amr.g(Float.valueOf(this.h), Float.valueOf(rangingCapabilitiesParams.h)) && Arrays.equals(this.i, rangingCapabilitiesParams.i) && Arrays.equals(this.j, rangingCapabilitiesParams.j) && Arrays.equals(this.k, rangingCapabilitiesParams.k) && amr.g(Boolean.valueOf(this.l), Boolean.valueOf(rangingCapabilitiesParams.l)) && amr.g(Boolean.valueOf(this.m), Boolean.valueOf(rangingCapabilitiesParams.m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Float.valueOf(this.h), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Boolean.valueOf(this.l), Boolean.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.G(parcel, 1, this.a);
        fma.G(parcel, 2, this.b);
        fma.G(parcel, 3, this.c);
        fma.L(parcel, 4, this.d);
        fma.L(parcel, 5, this.e);
        fma.S(parcel, 6, this.f);
        fma.S(parcel, 7, this.g);
        fma.K(parcel, 8, this.h);
        fma.S(parcel, 9, this.i);
        fma.S(parcel, 10, this.j);
        fma.S(parcel, 11, this.k);
        fma.G(parcel, 12, this.l);
        fma.G(parcel, 13, this.m);
        fma.F(parcel, D);
    }

    public RangingCapabilitiesParams(boolean z, boolean z2, boolean z3, int i, int i2, int[] iArr, int[] iArr2, float f, int[] iArr3, int[] iArr4, int[] iArr5, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = i2;
        this.f = iArr;
        this.g = iArr2;
        this.h = f;
        this.i = iArr3;
        this.j = iArr4;
        this.k = iArr5;
        this.l = z4;
        this.m = z5;
    }
}
