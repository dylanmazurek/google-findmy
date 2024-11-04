package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hke extends BroadcastReceiver {
    final /* synthetic */ hjt a;
    public final /* synthetic */ hkf b;

    public hke(hkf hkfVar, hjt hjtVar) {
        this.a = hjtVar;
        this.b = hkfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        iuu.q(this.a.a(), new dup(this, 10), jxv.a);
    }
}
