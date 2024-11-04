package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcu extends iys {
    final /* synthetic */ hlt a;

    public jcu(hlt hltVar) {
        this.a = hltVar;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.ar.core.ArCoreApk$ICheckAvailabilityCallback, java.lang.Object] */
    @Override // defpackage.iyt
    public final void b(Bundle bundle) {
        int i = bundle.getInt("error.code", -100);
        if (i != -5) {
            if (i != -3) {
                if (i != 0) {
                    Log.e("ARCore-InstallService", a.ae(i, "requestInfo returned: "));
                    this.a.b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
                    return;
                } else {
                    this.a.b.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
                    return;
                }
            }
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            this.a.b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
            return;
        }
        Log.e("ARCore-InstallService", "The device is not supported.");
        this.a.b.onResult(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
    }

    @Override // defpackage.iyt
    public final void c(Bundle bundle) {
    }
}
