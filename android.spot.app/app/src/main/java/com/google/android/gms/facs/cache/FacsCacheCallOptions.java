package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fgz;
import defpackage.fma;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FacsCacheCallOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fgz(14);
    public final String a;
    public final long b;

    public FacsCacheCallOptions(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 1, str);
        fma.M(parcel, 2, this.b);
        fma.F(parcel, D);
    }
}
