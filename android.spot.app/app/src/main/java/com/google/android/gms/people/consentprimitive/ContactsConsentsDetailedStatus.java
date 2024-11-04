package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fma;
import defpackage.ful;
import defpackage.jiu;
import defpackage.jiy;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ful(19);
    public final int a;
    public final Bundle b;

    public ContactsConsentsDetailedStatus(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final jiy a() {
        jiu jiuVar = new jiu();
        for (String str : this.b.keySet()) {
            jiuVar.d(new Account(str, "com.google"), Integer.valueOf(this.b.getInt(str)));
        }
        return jiuVar.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) obj;
        if (this.a == contactsConsentsDetailedStatus.a && amr.g(a(), contactsConsentsDetailedStatus.a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int D = fma.D(parcel);
        fma.L(parcel, 1, i2);
        fma.O(parcel, 2, this.b);
        fma.F(parcel, D);
    }
}
