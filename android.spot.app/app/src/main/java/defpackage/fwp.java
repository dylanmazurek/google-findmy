package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwp extends duf implements IInterface {
    public fwp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.phenotype.internal.IPhenotypeService");
    }

    public final void e(fwo fwoVar, String str) {
        Parcel a = a();
        duh.d(a, fwoVar);
        a.writeString(str);
        c(5, a);
    }
}
