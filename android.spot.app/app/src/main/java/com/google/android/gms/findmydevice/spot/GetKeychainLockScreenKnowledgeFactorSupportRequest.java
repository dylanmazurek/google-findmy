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
public final class GetKeychainLockScreenKnowledgeFactorSupportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(10);
    public Account a;
    public boolean b;

    public GetKeychainLockScreenKnowledgeFactorSupportRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetKeychainLockScreenKnowledgeFactorSupportRequest) {
            GetKeychainLockScreenKnowledgeFactorSupportRequest getKeychainLockScreenKnowledgeFactorSupportRequest = (GetKeychainLockScreenKnowledgeFactorSupportRequest) obj;
            if (amr.g(this.a, getKeychainLockScreenKnowledgeFactorSupportRequest.a) && amr.g(Boolean.valueOf(this.b), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportRequest.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.G(parcel, 2, this.b);
        fma.F(parcel, D);
    }

    public GetKeychainLockScreenKnowledgeFactorSupportRequest(Account account, boolean z) {
        this.a = account;
        this.b = z;
    }
}
