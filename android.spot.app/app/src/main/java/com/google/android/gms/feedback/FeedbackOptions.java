package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fma;
import defpackage.fno;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FeedbackOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fno();
    public String a;
    public Bundle b;
    public String c;
    final ApplicationErrorReport d;
    public String e;
    public BitmapTeleporter f;
    final String g;
    public List h;
    public boolean i;
    public ThemeSettings j;
    public LogOptions k;
    public boolean l;
    public Bitmap m;
    public String n;
    public boolean o;
    public long p;
    public boolean q;
    public String r;
    public AdditionalConsentConfig s;

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions, boolean z2, Bitmap bitmap, String str5, boolean z3, long j, boolean z4, String str6, AdditionalConsentConfig additionalConsentConfig) {
        this.a = str;
        this.b = bundle == null ? new Bundle() : bundle;
        this.c = str2;
        this.d = applicationErrorReport == null ? new ApplicationErrorReport() : applicationErrorReport;
        this.e = str3;
        this.f = bitmapTeleporter;
        this.g = str4;
        this.h = list == null ? new ArrayList() : list;
        this.i = z;
        this.j = themeSettings;
        this.k = logOptions;
        this.l = z2;
        this.m = bitmap;
        this.n = str5;
        this.o = z3;
        this.p = j;
        this.q = z4;
        this.r = str6;
        this.s = additionalConsentConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.X(parcel, 2, this.a);
        fma.O(parcel, 3, this.b);
        fma.X(parcel, 5, this.c);
        fma.W(parcel, 6, this.d, i);
        fma.X(parcel, 7, this.e);
        fma.W(parcel, 8, this.f, i);
        fma.X(parcel, 9, this.g);
        fma.ab(parcel, 10, this.h);
        fma.G(parcel, 11, this.i);
        fma.W(parcel, 12, this.j, i);
        fma.W(parcel, 13, this.k, i);
        fma.G(parcel, 14, this.l);
        fma.W(parcel, 15, this.m, i);
        fma.X(parcel, 16, this.n);
        fma.G(parcel, 17, this.o);
        fma.M(parcel, 18, this.p);
        fma.G(parcel, 19, this.q);
        fma.X(parcel, 20, this.r);
        fma.W(parcel, 21, this.s, i);
        fma.F(parcel, D);
    }
}
