package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcw extends BroadcastReceiver {
    final /* synthetic */ jcq a;

    public jcw(jcq jcqVar) {
        this.a = jcqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle extras = intent.getExtras();
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && extras != null && extras.containsKey("install.status")) {
            int i = extras.getInt("install.status");
            if (i != 1 && i != 2 && i != 3) {
                if (i != 4) {
                    if (i == 6) {
                        this.a.a(jcr.CANCELLED);
                        return;
                    }
                    return;
                }
                this.a.a(jcr.COMPLETED);
                return;
            }
            this.a.a(jcr.ACCEPTED);
        }
    }
}
