package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpm implements hpg {
    public final jzd a;
    public final lqz b;

    public hpm(hpe hpeVar, Context context, jzd jzdVar, lqz lqzVar, mko mkoVar, mko mkoVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        hpeVar.a(jzdVar, lqzVar, mkoVar);
        this.a = jzdVar;
        this.b = lqzVar;
        hwx.H(new hiy(this, context, 3));
        hwx.H(new hnn(mkoVar2, 4));
    }

    @Override // defpackage.hpg
    public final void Y() {
        ivc.H(new hep(this, 18), this.a);
    }

    public final synchronized void a() {
    }
}
