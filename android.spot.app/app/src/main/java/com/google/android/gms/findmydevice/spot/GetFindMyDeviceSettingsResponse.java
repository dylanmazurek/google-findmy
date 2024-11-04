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
public final class GetFindMyDeviceSettingsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(9);
    public boolean a;
    public boolean b;
    public FindMyDeviceNetworkSettings c;
    public boolean d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public Account i;
    public boolean j;

    private GetFindMyDeviceSettingsResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetFindMyDeviceSettingsResponse) {
            GetFindMyDeviceSettingsResponse getFindMyDeviceSettingsResponse = (GetFindMyDeviceSettingsResponse) obj;
            if (amr.g(Boolean.valueOf(this.a), Boolean.valueOf(getFindMyDeviceSettingsResponse.a)) && amr.g(Boolean.valueOf(this.b), Boolean.valueOf(getFindMyDeviceSettingsResponse.b)) && amr.g(this.c, getFindMyDeviceSettingsResponse.c) && amr.g(Boolean.valueOf(this.d), Boolean.valueOf(getFindMyDeviceSettingsResponse.d)) && amr.g(Long.valueOf(this.e), Long.valueOf(getFindMyDeviceSettingsResponse.e)) && amr.g(Long.valueOf(this.f), Long.valueOf(getFindMyDeviceSettingsResponse.f)) && amr.g(Boolean.valueOf(this.g), Boolean.valueOf(getFindMyDeviceSettingsResponse.g)) && amr.g(Boolean.valueOf(this.h), Boolean.valueOf(getFindMyDeviceSettingsResponse.h)) && amr.g(this.i, getFindMyDeviceSettingsResponse.i) && amr.g(Boolean.valueOf(this.j), Boolean.valueOf(getFindMyDeviceSettingsResponse.j))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Boolean.valueOf(this.g), Boolean.valueOf(this.h), this.i, Boolean.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.G(parcel, 3, this.d);
        fma.M(parcel, 5, this.e);
        fma.G(parcel, 6, this.a);
        fma.G(parcel, 7, this.b);
        fma.G(parcel, 8, this.g);
        fma.G(parcel, 9, this.h);
        fma.W(parcel, 10, this.c, i);
        fma.M(parcel, 11, this.f);
        fma.W(parcel, 12, this.i, i);
        fma.G(parcel, 13, this.j);
        fma.F(parcel, D);
    }

    public GetFindMyDeviceSettingsResponse(boolean z, boolean z2, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings, boolean z3, long j, long j2, boolean z4, boolean z5, Account account, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = findMyDeviceNetworkSettings;
        this.d = z3;
        this.e = j;
        this.f = j2;
        this.g = z4;
        this.h = z5;
        this.i = account;
        this.j = z6;
    }
}
