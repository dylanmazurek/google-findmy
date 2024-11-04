package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(1);
    final String a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final ServiceDumpRequest[] f;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4, ServiceDumpRequest[] serviceDumpRequestArr) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = serviceDumpRequestArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 2, this.a);
        fma.G(parcel, 3, this.b);
        fma.G(parcel, 4, this.c);
        fma.G(parcel, 5, this.d);
        fma.G(parcel, 6, this.e);
        fma.aa(parcel, 7, this.f, i);
        fma.F(parcel, D);
    }
}
