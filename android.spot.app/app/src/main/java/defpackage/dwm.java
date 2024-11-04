package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwm extends BroadcastReceiver {
    public final /* synthetic */ dwn a;

    public dwm(dwn dwnVar) {
        this.a = dwnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 237052814) {
                if (hashCode != 873418152) {
                    if (hashCode == 1194009787 && action.equals("com.google.android.gms.findmydevice.spot.DEVICE_CHANGES")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (action.equals("com.google.android.gms.findmydevice.spot.OPT_IN_STATE_CHANGES")) {
                        c = 2;
                    }
                    c = 65535;
                }
            } else {
                if (action.equals("com.google.android.gms.findmydevice.spot.DEVICES_CONNECTION_CHANGE")) {
                    c = 1;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        return;
                    }
                    ((jni) ((jni) dwn.a.c()).j("com/google/android/apps/adm/app/SpotChangesHandler$1", "onReceive", 107, "SpotChangesHandler.java")).r("Received a SPOT opt in state changes broadcast.");
                    dwn dwnVar = this.a;
                    dwnVar.d.execute(new col(this, 20, null));
                    return;
                }
                ((jni) ((jni) dwn.a.c()).j("com/google/android/apps/adm/app/SpotChangesHandler$1", "onReceive", 103, "SpotChangesHandler.java")).r("Received a SPOT devices connection change broadcast.");
                return;
            }
            ((jni) ((jni) dwn.a.c()).j("com/google/android/apps/adm/app/SpotChangesHandler$1", "onReceive", 99, "SpotChangesHandler.java")).r("Received a SPOT device changes broadcast.");
            dwn dwnVar2 = this.a;
            ewc ewcVar = dwnVar2.b;
            ewcVar.getClass();
            dwnVar2.d.execute(new col(ewcVar, 19, null));
        }
    }
}
