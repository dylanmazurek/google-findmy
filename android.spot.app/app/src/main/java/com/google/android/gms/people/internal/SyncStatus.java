package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fvq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fvq(11);
    public final int a;
    public final String b;
    public final long c;

    public SyncStatus(int i, String str, long j) {
        this.a = i;
        this.b = str;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int D = fma.D(parcel);
        fma.L(parcel, 2, i2);
        fma.X(parcel, 3, this.b);
        fma.M(parcel, 4, this.c);
        fma.F(parcel, D);
    }
}
