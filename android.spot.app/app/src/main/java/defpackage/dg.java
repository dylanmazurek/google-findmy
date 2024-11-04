package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dg extends di {
    public final PowerManager a;
    final /* synthetic */ dn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(dn dnVar, Context context) {
        super(dnVar);
        this.b = dnVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.di
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.di
    public final void b() {
        this.b.M();
    }
}
