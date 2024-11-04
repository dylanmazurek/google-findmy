package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmg implements fmj {
    final /* synthetic */ Bundle a;
    final /* synthetic */ fmk b;

    public fmg(fmk fmkVar, Bundle bundle) {
        this.a = bundle;
        this.b = fmkVar;
    }

    @Override // defpackage.fmj
    public final int a() {
        return 1;
    }

    @Override // defpackage.fmj
    public final void b() {
        gok gokVar = this.b.d;
        Bundle bundle = this.a;
        try {
            Bundle bundle2 = new Bundle();
            frx.h(bundle, bundle2);
            Bundle bundle3 = ((ag) gokVar.b).m;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                frx.i(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            Object obj = gokVar.a;
            Parcel a = ((duf) obj).a();
            duh.c(a, bundle2);
            ((duf) obj).c(3, a);
            frx.h(bundle2, bundle);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }
}
