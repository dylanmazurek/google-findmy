package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuf extends BroadcastReceiver {
    final /* synthetic */ cug a;

    public cuf(cug cugVar) {
        this.a = cugVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.a.c(intent);
    }
}
