package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class drw extends BroadcastReceiver {
    final /* synthetic */ dry a;

    public drw(dry dryVar) {
        this.a = dryVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dry.a.execute(new col(this.a, 14));
    }
}
