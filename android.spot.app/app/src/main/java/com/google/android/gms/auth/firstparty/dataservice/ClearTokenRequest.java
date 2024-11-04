package com.google.android.gms.auth.firstparty.dataservice;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ewd;
import defpackage.fma;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ClearTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ewd(9);
    final int a;
    public String b;

    public ClearTokenRequest() {
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.X(parcel, 2, this.b);
        fma.F(parcel, D);
    }

    public ClearTokenRequest(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
