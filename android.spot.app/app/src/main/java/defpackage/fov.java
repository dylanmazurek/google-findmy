package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fov extends fku {
    public fov(Context context, Looper looper, fkp fkpVar, fiv fivVar, fjr fjrVar) {
        super(context, looper, 284, fkpVar, fivVar, fjrVar);
    }

    @Override // defpackage.fku, defpackage.fkn, defpackage.fhm
    public final int a() {
        return 17895000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.findmydevice.spot.internal.ISpotWearableCompanionService");
        if (queryLocalInterface instanceof foe) {
            return (foe) queryLocalInterface;
        }
        return new foe(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.fkn
    public final String c() {
        return "com.google.android.gms.findmydevice.spot.internal.ISpotWearableCompanionService";
    }

    @Override // defpackage.fkn
    protected final String d() {
        return "com.google.android.gms.findmydevice.spot.service.wearables.START";
    }

    @Override // defpackage.fkn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.fkn
    protected final boolean g() {
        return true;
    }

    @Override // defpackage.fkn
    public final Feature[] h() {
        return new Feature[]{fnv.c};
    }
}
