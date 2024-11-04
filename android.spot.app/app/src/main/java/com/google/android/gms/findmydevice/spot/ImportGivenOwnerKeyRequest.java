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
public final class ImportGivenOwnerKeyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(16);
    public Account a;
    public int b;

    public ImportGivenOwnerKeyRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImportGivenOwnerKeyRequest) {
            ImportGivenOwnerKeyRequest importGivenOwnerKeyRequest = (ImportGivenOwnerKeyRequest) obj;
            if (amr.g(this.a, importGivenOwnerKeyRequest.a) && amr.g(Integer.valueOf(this.b), Integer.valueOf(importGivenOwnerKeyRequest.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.L(parcel, 2, this.b);
        fma.F(parcel, D);
    }

    public ImportGivenOwnerKeyRequest(Account account, int i) {
        this.a = account;
        this.b = i;
    }
}
