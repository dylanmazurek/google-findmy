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
public final class UwbComplexChannelParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(14);
    public int a;
    public int b;
    public int c;

    public UwbComplexChannelParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UwbComplexChannelParams) {
            UwbComplexChannelParams uwbComplexChannelParams = (UwbComplexChannelParams) obj;
            if (amr.g(Integer.valueOf(this.a), Integer.valueOf(uwbComplexChannelParams.a)) && amr.g(Integer.valueOf(this.b), Integer.valueOf(uwbComplexChannelParams.b)) && amr.g(Integer.valueOf(this.c), Integer.valueOf(uwbComplexChannelParams.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.L(parcel, 2, this.b);
        fma.L(parcel, 3, this.c);
        fma.F(parcel, D);
    }

    public UwbComplexChannelParams(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
