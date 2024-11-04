package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class emv extends BroadcastReceiver {
    final /* synthetic */ emx a;

    public emv(emx emxVar) {
        this.a = emxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        if (Objects.equals(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
            emx emxVar = this.a;
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            switch (intExtra) {
                case 10:
                case 13:
                    i = 3;
                    emxVar.k = i;
                    break;
                case 11:
                    i = 4;
                    emxVar.k = i;
                    break;
                case 12:
                    i = 2;
                    emxVar.k = i;
                    break;
                default:
                    ((jni) ((jni) emx.a.c()).j("com/google/android/apps/adm/integrations/spot/bluetooth/BluetoothSettingsImpl", "updateBluetoothSettingState", 278, "BluetoothSettingsImpl.java")).s("Unexpected Bluetooth adapter state %d", intExtra);
                    break;
            }
            emxVar.c.l(null);
        }
    }
}
