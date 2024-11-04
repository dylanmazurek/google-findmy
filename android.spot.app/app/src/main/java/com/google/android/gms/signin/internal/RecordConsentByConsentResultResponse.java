package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fhz;
import defpackage.fma;
import defpackage.fwf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements fhz {
    public static final Parcelable.Creator CREATOR = new fwf(13);
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.fhz
    public final Status b() {
        if (this.b != null) {
            return Status.b;
        }
        return Status.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int D = fma.D(parcel);
        fma.Z(parcel, 1, list);
        fma.X(parcel, 2, this.b);
        fma.F(parcel, D);
    }
}
