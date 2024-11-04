package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fgv;
import defpackage.fgz;
import defpackage.flc;
import defpackage.fld;
import defpackage.fle;
import defpackage.fma;
import defpackage.fmm;
import defpackage.fmn;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleCertificatesQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fgz(0);
    public final String a;
    public final boolean b;
    public final boolean c;
    private final fld d;

    public GoogleCertificatesQuery(String str, fld fldVar, boolean z, boolean z2) {
        this.a = str;
        this.d = fldVar;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int D = fma.D(parcel);
        fma.X(parcel, 1, str);
        fld fldVar = this.d;
        if (fldVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            fldVar = null;
        }
        fma.R(parcel, 2, fldVar);
        fma.G(parcel, 3, this.b);
        fma.G(parcel, 4, this.c);
        fma.F(parcel, D);
    }

    public GoogleCertificatesQuery(String str, IBinder iBinder, boolean z, boolean z2) {
        fle flcVar;
        this.a = str;
        fgv fgvVar = null;
        if (iBinder != null) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof fle) {
                    flcVar = (fle) queryLocalInterface;
                } else {
                    flcVar = new flc(iBinder);
                }
                fmn f = flcVar.f();
                byte[] bArr = f == null ? null : (byte[]) fmm.b(f);
                if (bArr != null) {
                    fgvVar = new fgv(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.d = fgvVar;
        this.b = z;
        this.c = z2;
    }
}
