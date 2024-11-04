package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fnp;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScanResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnp(3);
    public final Set a;
    public byte[] b;
    public int c;

    public ScanResult(Set set, byte[] bArr, int i) {
        this.a = set;
        this.b = bArr;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScanResult) {
            ScanResult scanResult = (ScanResult) obj;
            if (Arrays.equals(this.b, scanResult.b) && amr.g(Integer.valueOf(this.c), Integer.valueOf(scanResult.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int D = fma.D(parcel);
        if (set.contains(1)) {
            fma.I(parcel, 1, this.b, true);
        }
        if (set.contains(2)) {
            fma.L(parcel, 2, this.c);
        }
        fma.F(parcel, D);
    }

    public ScanResult() {
        this.a = new HashSet();
    }
}
