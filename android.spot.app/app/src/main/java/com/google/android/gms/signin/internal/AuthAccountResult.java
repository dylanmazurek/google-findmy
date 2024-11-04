package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fhz;
import defpackage.fma;
import defpackage.fwf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements fhz {
    public static final Parcelable.Creator CREATOR = new fwf(12);
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.fhz
    public final Status b() {
        if (this.b == 0) {
            return Status.b;
        }
        return Status.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.L(parcel, 2, this.b);
        fma.W(parcel, 3, this.c, i);
        fma.F(parcel, D);
    }

    public AuthAccountResult() {
        this(2, 0, null);
    }
}
