package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fvq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ActionPreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fvq(7);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;

    public ActionPreference(String str, int i, int i2, String str2, String str3, int i3, long j) {
        this.b = i;
        this.a = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionPreference)) {
            return false;
        }
        ActionPreference actionPreference = (ActionPreference) obj;
        if (this.b == actionPreference.b && this.c == actionPreference.c && amr.g(this.d, actionPreference.d) && amr.g(this.a, actionPreference.a) && amr.g(this.e, actionPreference.e) && this.f == actionPreference.f && this.g == actionPreference.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 1, str);
        fma.L(parcel, 2, this.b);
        fma.L(parcel, 3, this.c);
        fma.X(parcel, 4, this.d);
        fma.X(parcel, 5, this.e);
        fma.L(parcel, 6, this.f);
        fma.M(parcel, 7, this.g);
        fma.F(parcel, D);
    }
}
