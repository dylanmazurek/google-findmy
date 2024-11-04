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
public final class RenameDeviceParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(16);
    public byte[] a;
    public String b;
    public fti c;

    public RenameDeviceParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RenameDeviceParams) {
            RenameDeviceParams renameDeviceParams = (RenameDeviceParams) obj;
            if (Arrays.equals(this.a, renameDeviceParams.a) && amr.g(this.b, renameDeviceParams.b) && amr.g(this.c, renameDeviceParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.I(parcel, 1, this.a, false);
        fma.X(parcel, 2, this.b);
        fma.R(parcel, 3, this.c.asBinder());
        fma.F(parcel, D);
    }

    public RenameDeviceParams(byte[] bArr, String str, IBinder iBinder) {
        fti ftgVar;
        if (iBinder == null) {
            ftgVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            ftgVar = queryLocalInterface instanceof fti ? (fti) queryLocalInterface : new ftg(iBinder);
        }
        this.a = bArr;
        this.b = str;
        this.c = ftgVar;
    }
}
