package defpackage;

import android.content.BroadcastReceiver;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class huz implements jyj {
    final /* synthetic */ long a;
    final /* synthetic */ BroadcastReceiver.PendingResult b;
    final /* synthetic */ hva c;

    public huz(hva hvaVar, long j, BroadcastReceiver.PendingResult pendingResult) {
        this.a = j;
        this.b = pendingResult;
        this.c = hvaVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        this.c.a.f(3009, SystemClock.elapsedRealtime() - this.a, 0);
        this.b.finish();
    }

    @Override // defpackage.jyj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.a.e(3009, true, SystemClock.elapsedRealtime() - this.a, 0, null, null, null);
        this.b.finish();
    }
}
