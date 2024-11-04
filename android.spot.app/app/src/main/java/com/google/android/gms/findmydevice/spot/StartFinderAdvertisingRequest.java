package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class StartFinderAdvertisingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnp(5);
    public String a;

    public StartFinderAdvertisingRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartFinderAdvertisingRequest) {
            return amr.g(this.a, ((StartFinderAdvertisingRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 1, this.a);
        fma.F(parcel, D);
    }

    public StartFinderAdvertisingRequest(String str) {
        this.a = str;
    }
}
