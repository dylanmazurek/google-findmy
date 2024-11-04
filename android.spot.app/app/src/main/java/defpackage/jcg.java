package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcg implements ArCoreApk.ICheckAvailabilityCallback {
    final /* synthetic */ jci a;

    public jcg(jci jciVar) {
        this.a = jciVar;
    }

    @Override // com.google.ar.core.ArCoreApk.ICheckAvailabilityCallback
    public final void onResult(ArCoreApk.Availability availability) {
        synchronized (this.a) {
            jci jciVar = this.a;
            jciVar.f = availability;
            jciVar.g = false;
        }
    }
}
