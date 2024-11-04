package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ewd;
import defpackage.fma;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DataCollectionIdentifierParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ewd(12);
    public final int a;
    public final int b;
    public final int c;

    public DataCollectionIdentifierParcelable(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int D = fma.D(parcel);
        fma.L(parcel, 1, i2);
        fma.L(parcel, 2, this.b);
        fma.L(parcel, 3, this.c);
        fma.F(parcel, D);
    }
}
