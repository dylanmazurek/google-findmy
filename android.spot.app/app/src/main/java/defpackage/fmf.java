package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmf implements fmj {
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ fmk d;

    public fmf(fmk fmkVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.a = activity;
        this.b = bundle;
        this.c = bundle2;
        this.d = fmkVar;
    }

    @Override // defpackage.fmj
    public final int a() {
        return 0;
    }

    @Override // defpackage.fmj
    public final void b() {
        gok gokVar = this.d.d;
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) this.b.getParcelable("MapOptions");
        Activity activity = this.a;
        Bundle bundle = this.c;
        try {
            Bundle bundle2 = new Bundle();
            frx.h(bundle, bundle2);
            Object obj = gokVar.a;
            fmm fmmVar = new fmm(activity);
            Parcel a = ((duf) obj).a();
            duh.d(a, fmmVar);
            duh.c(a, googleMapOptions);
            duh.c(a, bundle2);
            ((duf) obj).c(2, a);
            frx.h(bundle2, bundle);
        } catch (RemoteException e) {
            throw new fsc(e);
        }
    }
}
