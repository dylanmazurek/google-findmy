package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ksu extends BroadcastReceiver {
    final /* synthetic */ ksv a;
    private ksv b;

    public ksu(ksv ksvVar, ksv ksvVar2) {
        this.a = ksvVar;
        this.b = ksvVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        ksv ksvVar = this.b;
        if (ksvVar != null && ksvVar.a()) {
            ksv ksvVar2 = this.b;
            ksvVar2.b.b(ksvVar2, 0L);
            context.unregisterReceiver(this);
            this.b = null;
        }
    }
}
