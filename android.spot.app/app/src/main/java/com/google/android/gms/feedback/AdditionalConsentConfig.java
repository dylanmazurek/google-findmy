package com.google.android.gms.feedback;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnk;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AdditionalConsentConfig extends AbstractSafeParcelable {
    public static final fnk CREATOR = new fnk(0);
    final String a;
    final String b;
    final String c;
    final String d;
    final String e;
    final Bundle f;

    public AdditionalConsentConfig(String str, String str2, String str3, String str4, String str5, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 2, this.a);
        fma.X(parcel, 3, this.b);
        fma.X(parcel, 4, this.c);
        fma.X(parcel, 5, this.d);
        fma.X(parcel, 6, this.e);
        fma.O(parcel, 7, this.f);
        fma.F(parcel, D);
    }
}
