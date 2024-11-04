package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fvw extends fvr {
    private final fip a;

    public fvw(fip fipVar) {
        this.a = fipVar;
    }

    @Override // defpackage.fvr
    public final void c(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status J = fvz.J(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.k(new fvy(J, parcelFileDescriptor));
    }
}
