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
public final class ChangeFindMyDeviceSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnk(4);
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public FindMyDeviceNetworkSettings d;
    public boolean e;

    public ChangeFindMyDeviceSettingsRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeFindMyDeviceSettingsRequest) {
            ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest = (ChangeFindMyDeviceSettingsRequest) obj;
            if (amr.g(this.a, changeFindMyDeviceSettingsRequest.a) && amr.g(this.b, changeFindMyDeviceSettingsRequest.b) && amr.g(this.c, changeFindMyDeviceSettingsRequest.c) && amr.g(this.d, changeFindMyDeviceSettingsRequest.d) && amr.g(Boolean.valueOf(this.e), Boolean.valueOf(changeFindMyDeviceSettingsRequest.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.N(parcel, 1, this.a);
        fma.N(parcel, 2, this.c);
        fma.G(parcel, 3, this.e);
        fma.N(parcel, 4, this.b);
        fma.W(parcel, 5, this.d, i);
        fma.F(parcel, D);
    }

    public ChangeFindMyDeviceSettingsRequest(Boolean bool, Boolean bool2, Boolean bool3, FindMyDeviceNetworkSettings findMyDeviceNetworkSettings, boolean z) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = findMyDeviceNetworkSettings;
        this.e = z;
    }
}
