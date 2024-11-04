package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import defpackage.fma;
import defpackage.fow;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new fow();
    boolean A;
    boolean B;
    int C;
    String D;
    boolean E;
    String F;
    boolean G;
    ND4CSettings H;
    boolean I;
    List J;

    @Deprecated
    String K;
    public int L;
    public int M;
    public List N;
    String O;
    final int a;
    String b;
    public Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    public ThemeSettings s;
    List t;
    boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8) {
        this.v = new ErrorReport();
        if (!TextUtils.isEmpty(str)) {
            this.a = i;
            this.z = i6;
            this.A = z4;
            this.B = z5;
            this.C = i7;
            this.D = str5;
            this.b = str;
            this.c = account;
            this.d = bundle;
            this.e = str2;
            this.f = str3;
            this.g = bitmap;
            this.h = z;
            this.i = z2;
            this.E = z6;
            this.j = list;
            this.y = pendingIntent;
            this.k = bundle2;
            this.l = bitmap2;
            this.m = bArr;
            this.n = i2;
            this.o = i3;
            this.p = str4;
            this.q = uri;
            this.r = list2;
            if (i < 4) {
                ThemeSettings themeSettings2 = new ThemeSettings();
                themeSettings2.a = i4;
                this.s = themeSettings2;
            } else {
                this.s = themeSettings == null ? new ThemeSettings() : themeSettings;
            }
            this.t = list3;
            this.u = z3;
            this.v = errorReport;
            if (errorReport != null) {
                errorReport.X = "GoogleHelp";
            }
            this.w = togglingData;
            this.x = i5;
            this.F = str6;
            this.G = z7;
            this.H = nD4CSettings;
            this.I = z8;
            this.J = list4;
            this.K = str7;
            this.L = i8;
            this.M = i9;
            this.N = list5;
            this.O = str8;
            return;
        }
        throw new IllegalStateException("Help requires a non-empty appContext");
    }

    public final void a(int i, String str, Intent intent) {
        this.r.add(new OverflowMenuItem(i, str, intent));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int D = fma.D(parcel);
        fma.L(parcel, 1, this.a);
        fma.X(parcel, 2, this.b);
        fma.W(parcel, 3, this.c, i);
        fma.O(parcel, 4, this.d);
        fma.G(parcel, 5, this.h);
        fma.G(parcel, 6, this.i);
        fma.Z(parcel, 7, this.j);
        fma.O(parcel, 10, this.k);
        fma.W(parcel, 11, this.l, i);
        fma.X(parcel, 14, this.p);
        fma.W(parcel, 15, this.q, i);
        fma.ab(parcel, 16, this.r);
        fma.L(parcel, 17, 0);
        fma.ab(parcel, 18, this.t);
        fma.I(parcel, 19, this.m, false);
        fma.L(parcel, 20, this.n);
        fma.L(parcel, 21, this.o);
        fma.G(parcel, 22, this.u);
        fma.W(parcel, 23, this.v, i);
        fma.W(parcel, 25, this.s, i);
        fma.X(parcel, 28, this.e);
        fma.W(parcel, 31, this.w, i);
        fma.L(parcel, 32, this.x);
        fma.W(parcel, 33, this.y, i);
        fma.X(parcel, 34, this.f);
        fma.W(parcel, 35, this.g, i);
        fma.L(parcel, 36, this.z);
        fma.G(parcel, 37, this.A);
        fma.G(parcel, 38, this.B);
        fma.L(parcel, 39, this.C);
        fma.X(parcel, 40, this.D);
        fma.G(parcel, 41, this.E);
        fma.X(parcel, 42, this.F);
        fma.G(parcel, 43, this.G);
        fma.W(parcel, 44, this.H, i);
        fma.G(parcel, 45, this.I);
        fma.ab(parcel, 46, this.J);
        fma.X(parcel, 47, this.K);
        fma.L(parcel, 48, this.L);
        fma.L(parcel, 49, this.M);
        fma.ab(parcel, 50, this.N);
        fma.X(parcel, 51, this.O);
        fma.F(parcel, D);
    }
}
