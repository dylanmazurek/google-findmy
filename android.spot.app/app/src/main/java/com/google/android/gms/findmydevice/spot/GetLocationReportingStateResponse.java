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
public final class GetLocationReportingStateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(12);
    public boolean a;

    private GetLocationReportingStateResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetLocationReportingStateResponse) {
            return amr.g(Boolean.valueOf(this.a), Boolean.valueOf(((GetLocationReportingStateResponse) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.G(parcel, 1, this.a);
        fma.F(parcel, D);
    }

    public GetLocationReportingStateResponse(boolean z) {
        this.a = z;
    }
}
