package com.google.android.gms.maps;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import defpackage.fma;
import defpackage.frl;
import defpackage.frx;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new frl();
    public static final Integer a = Integer.valueOf(Color.argb(255, 236, 233, 225));
    public Boolean b;
    public Boolean c;
    public int d;
    public CameraPosition e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Float o;
    public Float p;
    public LatLngBounds q;
    public Boolean r;
    public Integer s;
    public String t;
    public int u;

    public GoogleMapOptions() {
        this.d = -1;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
        this.t = null;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        fma.aV("MapType", Integer.valueOf(this.d), arrayList);
        fma.aV("LiteMode", this.l, arrayList);
        fma.aV("Camera", this.e, arrayList);
        fma.aV("CompassEnabled", this.g, arrayList);
        fma.aV("ZoomControlsEnabled", this.f, arrayList);
        fma.aV("ScrollGesturesEnabled", this.h, arrayList);
        fma.aV("ZoomGesturesEnabled", this.i, arrayList);
        fma.aV("TiltGesturesEnabled", this.j, arrayList);
        fma.aV("RotateGesturesEnabled", this.k, arrayList);
        fma.aV("ScrollGesturesEnabledDuringRotateOrZoom", this.r, arrayList);
        fma.aV("MapToolbarEnabled", this.m, arrayList);
        fma.aV("AmbientEnabled", this.n, arrayList);
        fma.aV("MinZoomPreference", this.o, arrayList);
        fma.aV("MaxZoomPreference", this.p, arrayList);
        fma.aV("BackgroundColor", this.s, arrayList);
        fma.aV("LatLngBoundsForCameraTarget", this.q, arrayList);
        fma.aV("ZOrderOnTop", this.b, arrayList);
        fma.aV("UseViewLifecycleInFragment", this.c, arrayList);
        fma.aV("mapColorScheme", Integer.valueOf(this.u), arrayList);
        return fma.aU(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.H(parcel, 2, frx.j(this.b));
        fma.H(parcel, 3, frx.j(this.c));
        fma.L(parcel, 4, this.d);
        fma.W(parcel, 5, this.e, i);
        fma.H(parcel, 6, frx.j(this.f));
        fma.H(parcel, 7, frx.j(this.g));
        fma.H(parcel, 8, frx.j(this.h));
        fma.H(parcel, 9, frx.j(this.i));
        fma.H(parcel, 10, frx.j(this.j));
        fma.H(parcel, 11, frx.j(this.k));
        fma.H(parcel, 12, frx.j(this.l));
        fma.H(parcel, 14, frx.j(this.m));
        fma.H(parcel, 15, frx.j(this.n));
        fma.Q(parcel, 16, this.o);
        fma.Q(parcel, 17, this.p);
        fma.W(parcel, 18, this.q, i);
        fma.H(parcel, 19, frx.j(this.r));
        fma.T(parcel, 20, this.s);
        fma.X(parcel, 21, this.t);
        fma.L(parcel, 23, this.u);
        fma.F(parcel, D);
    }

    public GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds, byte b12, Integer num, String str, int i2) {
        this.d = -1;
        this.o = null;
        this.p = null;
        this.q = null;
        this.s = null;
        this.t = null;
        this.b = frx.k(b);
        this.c = frx.k(b2);
        this.d = i;
        this.e = cameraPosition;
        this.f = frx.k(b3);
        this.g = frx.k(b4);
        this.h = frx.k(b5);
        this.i = frx.k(b6);
        this.j = frx.k(b7);
        this.k = frx.k(b8);
        this.l = frx.k(b9);
        this.m = frx.k(b10);
        this.n = frx.k(b11);
        this.o = f;
        this.p = f2;
        this.q = latLngBounds;
        this.r = frx.k(b12);
        this.s = num;
        this.t = str;
        this.u = i2;
    }
}
