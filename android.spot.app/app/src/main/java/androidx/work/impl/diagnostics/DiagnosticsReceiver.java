package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.bpe;
import defpackage.cqc;
import defpackage.cqd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = cqc.a("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        cqc.b();
        try {
            bpe.f(context).d(new cqd(DiagnosticsWorker.class).e());
        } catch (IllegalStateException e) {
            cqc.b();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
