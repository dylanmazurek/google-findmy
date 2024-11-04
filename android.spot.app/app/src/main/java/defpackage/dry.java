package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dry implements drt {
    static final Executor a = AsyncTask.SERIAL_EXECUTOR;
    public final Context b;
    final drc c;
    public volatile boolean d;
    public volatile boolean e;
    public final BroadcastReceiver f = new drw(this);
    private final dtk g;

    public dry(Context context, dtk dtkVar, drc drcVar) {
        this.b = context.getApplicationContext();
        this.g = dtkVar;
        this.c = drcVar;
    }

    @Override // defpackage.drt
    public final void a() {
        a.execute(new col(this, 13));
    }

    @Override // defpackage.drt
    public final boolean b() {
        a.execute(new col(this, 12));
        return true;
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.g.a()).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }
}
