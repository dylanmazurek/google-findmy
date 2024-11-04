package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fnq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CircleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fnq(2);
    public LatLng a;
    public double b;
    public float c;
    public int d;
    public int e;
    public final float f;
    public final boolean g;
    public final boolean h;
    public final List i;

    public CircleOptions() {
        this.a = null;
        this.b = 0.0d;
        this.c = 10.0f;
        this.d = -16777216;
        this.e = 0;
        this.f = 0.0f;
        this.g = true;
        this.h = false;
        this.i = null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.W(parcel, 2, this.a, i);
        fma.J(parcel, 3, this.b);
        fma.K(parcel, 4, this.c);
        fma.L(parcel, 5, this.d);
        fma.L(parcel, 6, this.e);
        fma.K(parcel, 7, this.f);
        fma.G(parcel, 8, this.g);
        fma.G(parcel, 9, this.h);
        fma.ab(parcel, 10, this.i);
        fma.F(parcel, D);
    }

    public CircleOptions(LatLng latLng, double d, float f, int i, int i2, float f2, boolean z, boolean z2, List list) {
        this.a = latLng;
        this.b = d;
        this.c = f;
        this.d = i;
        this.e = i2;
        this.f = f2;
        this.g = z;
        this.h = z2;
        this.i = list;
    }
}
