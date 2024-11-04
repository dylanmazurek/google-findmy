package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.fvq;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupContactOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fvq(9);
    public final String a;
    public final List b;
    public final long c;

    public GroupContactOrder(String str, List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GroupContactOrder groupContactOrder = (GroupContactOrder) obj;
            if (amr.g(this.a, groupContactOrder.a) && amr.g(this.b, groupContactOrder.b) && this.c == groupContactOrder.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 1, str);
        fma.U(parcel, 2, this.b);
        fma.M(parcel, 3, this.c);
        fma.F(parcel, D);
    }
}
