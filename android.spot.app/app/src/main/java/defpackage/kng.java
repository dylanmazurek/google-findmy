package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kng extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public kng(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (knh.a) {
            Iterator it = knh.b.values().iterator();
            while (it.hasNext()) {
                ((knh) it.next()).i();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
