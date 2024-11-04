package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.a;
import defpackage.fma;
import defpackage.fnq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(10);
    public final byte[] a;
    public final SyncOptions b;
    public final int c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        int D = a.D(i);
        this.c = D == 0 ? 1 : D;
        this.a = bArr;
        this.b = syncOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.c - 1;
        int D = fma.D(parcel);
        fma.L(parcel, 1, i2);
        fma.I(parcel, 2, this.a, false);
        fma.W(parcel, 3, this.b, i);
        fma.F(parcel, D);
    }
}
