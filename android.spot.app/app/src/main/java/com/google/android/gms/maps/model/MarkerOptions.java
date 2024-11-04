package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.bym;
import defpackage.fma;
import defpackage.fml;
import defpackage.fmm;
import defpackage.fmn;
import defpackage.fsb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsb();
    public LatLng a;
    public String b;
    public String c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public int o;
    public String p;
    public float q;
    public bym r;
    private View s;

    public MarkerOptions() {
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [fmn, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        int D = fma.D(parcel);
        fma.W(parcel, 2, this.a, i);
        fma.X(parcel, 3, this.b);
        fma.X(parcel, 4, this.c);
        bym bymVar = this.r;
        if (bymVar == null) {
            asBinder = null;
        } else {
            asBinder = bymVar.a.asBinder();
        }
        fma.R(parcel, 5, asBinder);
        fma.K(parcel, 6, this.d);
        fma.K(parcel, 7, this.e);
        fma.G(parcel, 8, this.f);
        fma.G(parcel, 9, this.g);
        fma.G(parcel, 10, this.h);
        fma.K(parcel, 11, this.i);
        fma.K(parcel, 12, this.j);
        fma.K(parcel, 13, this.k);
        fma.K(parcel, 14, this.l);
        fma.K(parcel, 15, this.m);
        fma.L(parcel, 17, this.n);
        fma.R(parcel, 18, new fmm(this.s));
        fma.L(parcel, 19, this.o);
        fma.X(parcel, 20, this.p);
        fma.K(parcel, 21, this.q);
        fma.F(parcel, D);
    }

    public MarkerOptions(LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6, float f7, int i, IBinder iBinder2, int i2, String str3, float f8) {
        fmn fmlVar;
        fmn fmlVar2;
        this.d = 0.5f;
        this.e = 1.0f;
        this.g = true;
        this.h = false;
        this.i = 0.0f;
        this.j = 0.5f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.n = 0;
        this.a = latLng;
        this.b = str;
        this.c = str2;
        if (iBinder == null) {
            this.r = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof fmn) {
                fmlVar = (fmn) queryLocalInterface;
            } else {
                fmlVar = new fml(iBinder);
            }
            this.r = new bym(fmlVar);
        }
        this.d = f;
        this.e = f2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = f3;
        this.j = f4;
        this.k = f5;
        this.l = f6;
        this.m = f7;
        this.o = i2;
        this.n = i;
        if (iBinder2 == null) {
            fmlVar2 = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            fmlVar2 = queryLocalInterface2 instanceof fmn ? (fmn) queryLocalInterface2 : new fml(iBinder2);
        }
        this.s = fmlVar2 != null ? (View) fmm.b(fmlVar2) : null;
        this.p = str3;
        this.q = f8;
    }
}
