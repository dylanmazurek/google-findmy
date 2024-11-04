package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flh extends duf implements IInterface {
    public flh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final GoogleCertificatesLookupResponse e(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
        Parcel a = a();
        duh.c(a, googleCertificatesLookupQuery);
        Parcel b = b(6, a);
        GoogleCertificatesLookupResponse googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) duh.a(b, GoogleCertificatesLookupResponse.CREATOR);
        b.recycle();
        return googleCertificatesLookupResponse;
    }

    public final boolean f() {
        Parcel b = b(7, a());
        boolean e = duh.e(b);
        b.recycle();
        return e;
    }
}
