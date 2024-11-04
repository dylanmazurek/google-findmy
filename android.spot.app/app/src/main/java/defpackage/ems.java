package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ems implements jyj {
    private final /* synthetic */ int a;

    public ems(int i) {
        this.a = i;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5 && !(th instanceof hkm)) {
                                Log.w("OneGoogle", "Failed to load owner avatar", th);
                                return;
                            }
                            return;
                        }
                        Log.w("OneGoogle", "Failed to grant account access to app", th);
                        return;
                    }
                    ((jol) ((jol) ((jol) gdx.a.f()).i(th)).j("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "lambda$provideEventResultHandler$1", 24, "FloggerResultDaggerModule.java")).q();
                    return;
                }
                throw null;
            }
            ((jni) ((jni) ((jni) emk.a.e()).i(th)).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothHandlerImpl$1", "onFailure", (char) 239, "BluetoothHandlerImpl.java")).r("Start advertising request failure");
            return;
        }
        ((jni) ((jni) ((jni) emt.a.e()).i(th)).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl$2", "onFailure", (char) 231, "BluetoothProximityImpl.java")).r("Failed to upload owner's sighting");
    }

    @Override // defpackage.jyj
    public final /* synthetic */ void b(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                ((jck) obj).d();
                                return;
                            } else {
                                return;
                            }
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            Log.e("OneGoogle", "Failed to grant account access to app");
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (((jer) obj).g()) {
                    throw null;
                }
                throw null;
            }
            ((jni) ((jni) emk.a.e()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothHandlerImpl$1", "onSuccess", 233, "BluetoothHandlerImpl.java")).r("Start advertising request success");
            return;
        }
        ((jni) ((jni) emt.a.e()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothProximityImpl$2", "onSuccess", 226, "BluetoothProximityImpl.java")).r("Uploaded owner's sighting");
    }
}
