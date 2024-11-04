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
public final class GetKeychainLockScreenKnowledgeFactorSupportResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(11);
    public boolean a;
    public boolean b;
    public Boolean c;
    public Boolean d;

    private GetKeychainLockScreenKnowledgeFactorSupportResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetKeychainLockScreenKnowledgeFactorSupportResponse) {
            GetKeychainLockScreenKnowledgeFactorSupportResponse getKeychainLockScreenKnowledgeFactorSupportResponse = (GetKeychainLockScreenKnowledgeFactorSupportResponse) obj;
            if (amr.g(Boolean.valueOf(this.a), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportResponse.a)) && amr.g(Boolean.valueOf(this.b), Boolean.valueOf(getKeychainLockScreenKnowledgeFactorSupportResponse.b)) && amr.g(this.c, getKeychainLockScreenKnowledgeFactorSupportResponse.c) && amr.g(this.d, getKeychainLockScreenKnowledgeFactorSupportResponse.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.G(parcel, 1, this.a);
        fma.G(parcel, 2, this.b);
        fma.N(parcel, 3, this.c);
        fma.N(parcel, 4, this.d);
        fma.F(parcel, D);
    }

    public GetKeychainLockScreenKnowledgeFactorSupportResponse(boolean z, boolean z2, Boolean bool, Boolean bool2) {
        this.a = z;
        this.b = z2;
        this.c = bool;
        this.d = bool2;
    }
}
