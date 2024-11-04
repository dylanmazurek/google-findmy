package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kqw extends BroadcastReceiver {
    public kqx a;

    public kqw(kqx kqxVar) {
        this.a = kqxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        kqx kqxVar = this.a;
        if (kqxVar != null && kqxVar.b()) {
            kpb kpbVar = FirebaseInstanceId.g;
            kqx kqxVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = kqxVar2.a;
            FirebaseInstanceId.p(kqxVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
