package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyi extends duf implements IInterface {
    public fyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    public final void e(fwo fwoVar, fyh fyhVar) {
        Parcel a = a();
        duh.d(a, fwoVar);
        duh.d(a, fyhVar);
        c(4, a);
    }
}
