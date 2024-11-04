package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kso extends BroadcastReceiver {
    public ksp a;

    public kso(ksp kspVar) {
        this.a = kspVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ksp kspVar = this.a;
        if (kspVar != null && kspVar.b()) {
            ksp kspVar2 = this.a;
            FirebaseMessaging firebaseMessaging = kspVar2.a;
            FirebaseMessaging.k(kspVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
