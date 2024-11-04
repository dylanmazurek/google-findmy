package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fgz;
import defpackage.fma;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fgz(1);
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2) {
        this.a = z;
        this.b = str;
        this.c = fma.bd(i) - 1;
        this.d = fma.be(i2) - 1;
    }

    public final int a() {
        return fma.bd(this.c);
    }

    public final void b() {
        fma.be(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int D = fma.D(parcel);
        fma.G(parcel, 1, z);
        fma.X(parcel, 2, this.b);
        fma.L(parcel, 3, this.c);
        fma.L(parcel, 4, this.d);
        fma.F(parcel, D);
    }
}
