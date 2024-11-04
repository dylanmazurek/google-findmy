package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fgz;
import defpackage.fma;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GetActivityControlsSettingsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fgz(16);
    public final byte[] a;

    public GetActivityControlsSettingsResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int D = fma.D(parcel);
        fma.I(parcel, 1, bArr, false);
        fma.F(parcel, D);
    }
}
