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
public final class OwnersLocationReportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(20);
    public Account a;
    public ScanResult b;

    public OwnersLocationReportRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OwnersLocationReportRequest) {
            OwnersLocationReportRequest ownersLocationReportRequest = (OwnersLocationReportRequest) obj;
            if (amr.g(this.a, ownersLocationReportRequest.a) && amr.g(this.b, ownersLocationReportRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 1, this.a, i);
        fma.W(parcel, 2, this.b, i);
        fma.F(parcel, D);
    }

    public OwnersLocationReportRequest(Account account, ScanResult scanResult) {
        this.a = account;
        this.b = scanResult;
    }
}
