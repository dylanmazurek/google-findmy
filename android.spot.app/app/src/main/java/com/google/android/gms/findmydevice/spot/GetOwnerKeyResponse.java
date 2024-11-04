package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GetOwnerKeyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(14);
    public int a;
    public byte[] b;

    private GetOwnerKeyResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetOwnerKeyResponse) {
            GetOwnerKeyResponse getOwnerKeyResponse = (GetOwnerKeyResponse) obj;
            if (amr.g(Integer.valueOf(this.a), Integer.valueOf(getOwnerKeyResponse.a)) && Arrays.equals(this.b, getOwnerKeyResponse.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.I(parcel, 2, this.b, false);
        fma.F(parcel, D);
    }

    public GetOwnerKeyResponse(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }
}
