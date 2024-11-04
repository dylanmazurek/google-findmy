package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CachedSpotDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(3);
    public String a;
    public String b;

    private CachedSpotDevice() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedSpotDevice) {
            CachedSpotDevice cachedSpotDevice = (CachedSpotDevice) obj;
            if (amr.g(this.a, cachedSpotDevice.a) && amr.g(this.b, cachedSpotDevice.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 1, this.a);
        fma.X(parcel, 2, this.b);
        fma.F(parcel, D);
    }

    public CachedSpotDevice(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
