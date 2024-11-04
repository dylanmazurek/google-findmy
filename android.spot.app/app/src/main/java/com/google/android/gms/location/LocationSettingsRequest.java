package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnp;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnp(18);
    public final boolean a;
    public final boolean b;
    private final List c;

    public LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.c = list;
        this.a = z;
        this.b = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.c;
        int D = fma.D(parcel);
        fma.ab(parcel, 1, DesugarCollections.unmodifiableList(list));
        fma.G(parcel, 2, this.a);
        fma.G(parcel, 3, this.b);
        fma.F(parcel, D);
    }
}
