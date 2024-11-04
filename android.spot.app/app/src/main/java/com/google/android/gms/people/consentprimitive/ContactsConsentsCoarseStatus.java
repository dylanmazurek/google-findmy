package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.ful;
import defpackage.jis;
import defpackage.jmi;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(17);
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        if (this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && amr.g(this.f, contactsConsentsCoarseStatus.f) && amr.g(this.e, contactsConsentsCoarseStatus.e) && amr.g(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && amr.g(this.g, contactsConsentsCoarseStatus.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jis o;
        jis o2;
        jis o3;
        boolean z = this.a;
        int D = fma.D(parcel);
        fma.G(parcel, 1, z);
        fma.G(parcel, 2, this.b);
        List list = this.e;
        if (list == null) {
            int i2 = jis.d;
            o = jmi.a;
        } else {
            o = jis.o(list);
        }
        fma.ab(parcel, 3, o);
        List list2 = this.f;
        if (list2 == null) {
            o2 = jmi.a;
        } else {
            o2 = jis.o(list2);
        }
        fma.ab(parcel, 4, o2);
        fma.X(parcel, 5, this.c);
        fma.G(parcel, 6, this.d);
        List list3 = this.g;
        if (list3 == null) {
            o3 = jmi.a;
        } else {
            o3 = jis.o(list3);
        }
        fma.ab(parcel, 7, o3);
        fma.F(parcel, D);
    }
}
