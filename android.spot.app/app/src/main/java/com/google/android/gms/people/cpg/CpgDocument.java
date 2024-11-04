package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fvq;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CpgDocument extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fvq(8);
    public final int a;
    public final GroupContactOrder b;
    public final ActionPreference c;

    public CpgDocument(int i, GroupContactOrder groupContactOrder, ActionPreference actionPreference) {
        this.a = i;
        this.b = groupContactOrder;
        this.c = actionPreference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocument cpgDocument = (CpgDocument) obj;
            if (this.a == cpgDocument.a && amr.g(this.b, cpgDocument.b) && amr.g(this.c, cpgDocument.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int D = fma.D(parcel);
        fma.L(parcel, 1, i2);
        fma.W(parcel, 2, this.b, i);
        fma.W(parcel, 3, this.c, i);
        fma.F(parcel, D);
    }
}
