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
public final class GetWearableProvisioningStateResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(15);
    public int a;
    public Account b;
    public boolean c;
    public String d;

    private GetWearableProvisioningStateResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetWearableProvisioningStateResponse) {
            GetWearableProvisioningStateResponse getWearableProvisioningStateResponse = (GetWearableProvisioningStateResponse) obj;
            if (amr.g(Integer.valueOf(this.a), Integer.valueOf(getWearableProvisioningStateResponse.a)) && amr.g(this.b, getWearableProvisioningStateResponse.b) && amr.g(Boolean.valueOf(this.c), Boolean.valueOf(getWearableProvisioningStateResponse.c)) && amr.g(this.d, getWearableProvisioningStateResponse.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.b, i);
        fma.G(parcel, 2, this.c);
        fma.L(parcel, 3, this.a);
        fma.X(parcel, 4, this.d);
        fma.F(parcel, D);
    }

    public GetWearableProvisioningStateResponse(int i, Account account, boolean z, String str) {
        this.a = i;
        this.b = account;
        this.c = z;
        this.d = str;
    }
}
