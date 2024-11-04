package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.uwb.internal.ClientDisconnectingParams;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fum extends fku {
    private final ftt t;

    public fum(Context context, Looper looper, fiv fivVar, fjr fjrVar, fkp fkpVar, ftt fttVar) {
        super(context, looper, 298, fkpVar, fivVar, fjrVar);
        this.t = fttVar;
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 211600000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
        if (queryLocalInterface instanceof fty) {
            return (fty) queryLocalInterface;
        }
        return new fty(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.nearby.uwb.internal.INearbyUwbService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.nearby.uwb.service.START";
    }

    @Override // defpackage.fkn
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return new Feature[]{ftb.i, ftb.j, ftb.k, ftb.l, ftb.m, ftb.o, ftb.n, ftb.p};
    }

    @Override // defpackage.fkn, defpackage.fhm
    public final boolean o() {
        return fma.v(this.b);
    }

    @Override // defpackage.fkn
    protected final Bundle u() {
        Bundle bundle = new Bundle();
        if (this.t != null) {
            bundle.putLong("clientId", r1.hashCode());
            bundle.putInt("deviceType", this.t.b);
            bundle.putBoolean("isTestOnly", false);
        }
        return bundle;
    }

    @Override // defpackage.fkn
    public final void y() {
        if (m()) {
            try {
                fty ftyVar = (fty) v();
                ClientDisconnectingParams clientDisconnectingParams = new ClientDisconnectingParams();
                Parcel a = ftyVar.a();
                duh.c(a, clientDisconnectingParams);
                ftyVar.d(1007, a);
            } catch (RemoteException e) {
                Log.w("NearbyUwbClient", "Failed to notify client disconnect.", e);
            }
        }
        super.y();
    }
}
