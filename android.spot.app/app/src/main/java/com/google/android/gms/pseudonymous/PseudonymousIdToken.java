package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fwf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PseudonymousIdToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fwf(10);
    public final String a;

    public PseudonymousIdToken(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PseudonymousIdToken) {
            return amr.g(this.a, ((PseudonymousIdToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PseudonymousIdToken[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 2, str);
        fma.F(parcel, D);
    }
}
