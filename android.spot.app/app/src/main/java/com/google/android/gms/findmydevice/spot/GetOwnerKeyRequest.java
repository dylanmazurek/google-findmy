package com.google.android.gms.findmydevice.spot;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetOwnerKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(13);
    public Account a;

    public GetOwnerKeyRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOwnerKeyRequest) {
            return amr.g(this.a, ((GetOwnerKeyRequest) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.F(parcel, D);
    }

    public GetOwnerKeyRequest(Account account) {
        this.a = account;
    }
}
