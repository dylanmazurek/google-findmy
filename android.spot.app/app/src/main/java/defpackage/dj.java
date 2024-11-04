package defpackage;

import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dj extends di {
    final /* synthetic */ dn a;
    public final apc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dj(dn dnVar, apc apcVar) {
        super(dnVar);
        this.a = dnVar;
        this.b = apcVar;
    }

    @Override // defpackage.di
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.di
    public final void b() {
        this.a.M();
    }
}
