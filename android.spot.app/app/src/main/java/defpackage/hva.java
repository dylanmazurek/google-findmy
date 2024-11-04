package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hva extends BroadcastReceiver {
    public final ktn a;
    private final huy b;

    public hva(huy huyVar, ktn ktnVar) {
        this.b = huyVar;
        this.a = ktnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        jyz a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!"com.google.android.gms.udc.action.FACS_CACHE_UPDATED".equals(intent.getAction())) {
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        huy huyVar = this.b;
        synchronized (huyVar.a) {
            a = huyVar.a(new eli(huyVar, 11));
        }
        ivc.N(a, new huz(this, elapsedRealtime, goAsync), jxv.a);
    }
}
