package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cug extends cuj {
    private final BroadcastReceiver e;

    public cug(Context context, eld eldVar) {
        super(context, eldVar);
        this.e = new cuf(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.cuj
    public final void d() {
        cqc.b();
        int i = cuh.a;
        getClass().getSimpleName();
        this.a.registerReceiver(this.e, a());
    }

    @Override // defpackage.cuj
    public final void e() {
        cqc.b();
        int i = cuh.a;
        getClass().getSimpleName();
        this.a.unregisterReceiver(this.e);
    }
}
