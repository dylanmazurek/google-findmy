package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ewd;
import defpackage.fma;
import defpackage.fml;
import defpackage.fmm;
import defpackage.fmn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ewd(20);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final Context f;

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        fmn fmlVar;
        this.a = str;
        this.b = z;
        this.c = z2;
        if (iBinder == null) {
            fmlVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof fmn) {
                fmlVar = (fmn) queryLocalInterface;
            } else {
                fmlVar = new fml(iBinder);
            }
        }
        this.f = (Context) fmm.b(fmlVar);
        this.d = z3;
        this.e = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 1, str);
        fma.G(parcel, 2, this.b);
        fma.G(parcel, 3, this.c);
        fma.R(parcel, 4, new fmm(this.f));
        fma.G(parcel, 5, this.d);
        fma.G(parcel, 6, this.e);
        fma.F(parcel, D);
    }
}
