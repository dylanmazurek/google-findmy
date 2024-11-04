package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fvq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class BackupSyncContactInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fvq(2);
    public final int a;
    public final int b;

    public BackupSyncContactInfo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int D = fma.D(parcel);
        fma.L(parcel, 1, i2);
        fma.L(parcel, 2, this.b);
        fma.F(parcel, D);
    }
}
