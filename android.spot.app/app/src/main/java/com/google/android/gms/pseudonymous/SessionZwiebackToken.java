package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fwf;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SessionZwiebackToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fwf(11);
    private final String a;
    private final String b;

    public SessionZwiebackToken(Parcel parcel) {
        this.a = parcel.readString();
        String readString = parcel.readString();
        fma.aR(readString);
        this.b = readString;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionZwiebackToken)) {
            return false;
        }
        SessionZwiebackToken sessionZwiebackToken = (SessionZwiebackToken) obj;
        if (!amr.g(this.a, sessionZwiebackToken.a) || !amr.g(this.b, sessionZwiebackToken.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
