package com.google.android.gms.people.contactssync.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fvq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ExtendedSyncStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fvq(4);
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public ExtendedSyncStatus(int i, String str, long j, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    public final String toString() {
        return String.format(Locale.US, "ExtendedSyncStatus{code=%d, message=%s, lastSyncTimeMillis=%d, numOfItems=%d, syncStage=%d, dataType=%d, cycleStatus=%d}", Integer.valueOf(this.a), this.b, Long.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int D = fma.D(parcel);
        fma.L(parcel, 2, i2);
        fma.X(parcel, 3, this.b);
        fma.M(parcel, 4, this.c);
        fma.L(parcel, 5, this.d);
        fma.L(parcel, 6, this.e);
        fma.L(parcel, 7, this.f);
        fma.L(parcel, 8, this.g);
        fma.F(parcel, D);
    }
}
