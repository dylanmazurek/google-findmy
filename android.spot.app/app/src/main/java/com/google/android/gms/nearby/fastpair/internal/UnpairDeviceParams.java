package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnq;
import defpackage.ftg;
import defpackage.fti;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UnpairDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(17);
    public byte[] a;
    public fti b;

    public UnpairDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnpairDeviceParams) {
            UnpairDeviceParams unpairDeviceParams = (UnpairDeviceParams) obj;
            if (Arrays.equals(this.a, unpairDeviceParams.a) && amr.g(this.b, unpairDeviceParams.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.I(parcel, 1, this.a, false);
        fma.R(parcel, 2, this.b.asBinder());
        fma.F(parcel, D);
    }

    public UnpairDeviceParams(byte[] bArr, IBinder iBinder) {
        fti ftgVar;
        if (iBinder == null) {
            ftgVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            ftgVar = queryLocalInterface instanceof fti ? (fti) queryLocalInterface : new ftg(iBinder);
        }
        this.a = bArr;
        this.b = ftgVar;
    }
}
