package com.google.android.gms.mdisync;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SyncOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(9);

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fma.F(parcel, fma.D(parcel));
    }
}
