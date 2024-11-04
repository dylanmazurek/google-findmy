package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnq;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(3);
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        fma.aS(latLng, "southwest must not be null.");
        fma.aS(latLng2, "northeast must not be null.");
        double d = latLng2.a;
        double d2 = latLng.a;
        fma.aH(d >= d2, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.a));
        this.a = latLng;
        this.b = latLng2;
    }

    public final boolean a(LatLng latLng) {
        fma.aS(latLng, "point must not be null.");
        LatLng latLng2 = this.a;
        double d = latLng2.a;
        double d2 = latLng.a;
        if (d <= d2) {
            LatLng latLng3 = this.b;
            if (d2 <= latLng3.a) {
                double d3 = latLng.b;
                double d4 = latLng2.b;
                double d5 = latLng3.b;
                if (d4 <= d5) {
                    if (d4 <= d3 && d3 <= d5) {
                        return true;
                    }
                    return false;
                }
                if (d4 <= d3 || d3 <= d5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fma.aV("southwest", this.a, arrayList);
        fma.aV("northeast", this.b, arrayList);
        return fma.aU(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 2, this.a, i);
        fma.W(parcel, 3, this.b, i);
        fma.F(parcel, D);
    }
}
