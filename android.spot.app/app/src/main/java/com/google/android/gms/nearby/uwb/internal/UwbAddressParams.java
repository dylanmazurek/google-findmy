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
public final class UwbAddressParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(13);
    public byte[] a;
    public int b;

    public UwbAddressParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbAddressParams) {
            UwbAddressParams uwbAddressParams = (UwbAddressParams) obj;
            if (Arrays.equals(this.a, uwbAddressParams.a) && amr.g(Integer.valueOf(this.b), Integer.valueOf(uwbAddressParams.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.I(parcel, 1, this.a, false);
        fma.L(parcel, 2, this.b);
        fma.F(parcel, D);
    }

    public UwbAddressParams(byte[] bArr, int i) {
        this.a = bArr;
        this.b = i;
    }
}
