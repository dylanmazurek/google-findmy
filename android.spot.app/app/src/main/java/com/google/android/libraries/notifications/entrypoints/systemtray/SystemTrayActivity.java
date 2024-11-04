package com.google.android.libraries.notifications.entrypoints.systemtray;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.fbh;
import defpackage.glx;
import defpackage.gqp;
import defpackage.gqq;
import defpackage.jol;
import defpackage.joo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SystemTrayActivity extends Activity {
    private static final joo a = joo.m("GnpSdk");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        gqq gqqVar;
        Context applicationContext = getApplicationContext();
        Intent intent = getIntent();
        if (intent == null) {
            ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", 38, "SystemTrayActivity.java")).r("SystemTrayActivity received null intent");
        } else {
            ((jol) ((jol) a.e()).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", 40, "SystemTrayActivity.java")).y("Intent received for action [%s] package [%s].", intent.getAction(), intent.getPackage());
            try {
                gqqVar = gqp.a(getApplicationContext());
            } catch (IllegalStateException e) {
                ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "onCreate", '0', "SystemTrayActivity.java")).r("Chime component not initialized: Activity stopped.");
                gqqVar = null;
            }
            if (gqqVar != null) {
                gqqVar.g().a(applicationContext);
                gqqVar.n();
                super.onCreate(bundle);
                joo jooVar = glx.a;
                if (intent.getBooleanExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", false)) {
                    gqp.a(applicationContext).f().b(new fbh((Object) applicationContext, (Object) intent, 20, (byte[]) null));
                } else {
                    Intent intent2 = new Intent(intent);
                    intent2.setFlags(268435456);
                    ((jol) ((jol) a.e()).j("com/google/android/libraries/notifications/entrypoints/systemtray/SystemTrayActivity", "forwardIntent", 104, "SystemTrayActivity.java")).u("Forwarding Intent from Activity to %s", SystemTrayBroadcastReceiver.class);
                    intent2.setClass(this, SystemTrayBroadcastReceiver.class);
                    sendBroadcast(intent2);
                }
            }
        }
        finish();
    }
}
