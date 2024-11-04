package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.amr;
import defpackage.fgz;
import defpackage.fhz;
import defpackage.fma;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, fhz {
    public final int g;
    public final String h;
    public final PendingIntent i;
    public final ConnectionResult j;
    public static final Status a = new Status(-1);
    public static final Status b = new Status(0);
    public static final Status c = new Status(14);
    public static final Status d = new Status(8);
    public static final Status e = new Status(15);
    public static final Status f = new Status(16);
    public static final Parcelable.Creator CREATOR = new fgz(3);

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.g = i;
        this.h = str;
        this.i = pendingIntent;
        this.j = connectionResult;
    }

    public final boolean a() {
        if (this.g <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.g != status.g || !amr.g(this.h, status.h) || !amr.g(this.i, status.i) || !amr.g(this.j, status.j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.g), this.h, this.i, this.j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.h;
        if (str == null) {
            str = fma.bc(this.g);
        }
        fma.aV("statusCode", str, arrayList);
        fma.aV("resolution", this.i, arrayList);
        return fma.aU(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.g;
        int D = fma.D(parcel);
        fma.L(parcel, 1, i2);
        fma.X(parcel, 2, this.h);
        fma.W(parcel, 3, this.i, i);
        fma.W(parcel, 4, this.j, i);
        fma.F(parcel, D);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }

    @Override // defpackage.fhz
    public final Status b() {
        return this;
    }
}
