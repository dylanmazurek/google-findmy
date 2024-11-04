package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkw {
    public static final Object a = new Object();
    public static HandlerThread b;
    private static fkw j;
    public final HashMap c;
    public final Context d;
    public volatile Handler e;
    public final flr f;
    public final long g;
    private final long h;
    private volatile Executor i;
    private final dqt k;

    public fkw() {
        throw null;
    }

    public static fkw a(Context context) {
        synchronized (a) {
            if (j == null) {
                j = new fkw(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return j;
    }

    public final boolean b(fkv fkvVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        synchronized (this.c) {
            fkx fkxVar = (fkx) this.c.get(fkvVar);
            if (fkxVar == null) {
                fkxVar = new fkx(this, fkvVar);
                fkxVar.c(serviceConnection, serviceConnection);
                fkxVar.d(str);
                this.c.put(fkvVar, fkxVar);
            } else {
                this.e.removeMessages(0, fkvVar);
                if (!fkxVar.a(serviceConnection)) {
                    fkxVar.c(serviceConnection, serviceConnection);
                    int i = fkxVar.b;
                    if (i != 1) {
                        if (i == 2) {
                            fkxVar.d(str);
                        }
                    } else {
                        serviceConnection.onServiceConnected(fkxVar.f, fkxVar.d);
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + fkvVar.toString());
                }
            }
            z = fkxVar.c;
        }
        return z;
    }

    public final void c(ComponentName componentName, ServiceConnection serviceConnection) {
        d(new fkv(componentName), serviceConnection);
    }

    protected final void d(fkv fkvVar, ServiceConnection serviceConnection) {
        synchronized (this.c) {
            fkx fkxVar = (fkx) this.c.get(fkvVar);
            if (fkxVar != null) {
                if (fkxVar.a(serviceConnection)) {
                    fkxVar.a.remove(serviceConnection);
                    if (fkxVar.b()) {
                        this.e.sendMessageDelayed(this.e.obtainMessage(0, fkvVar), this.h);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + fkvVar.toString());
                }
            } else {
                throw new IllegalStateException("Nonexistent connection status for service config: " + fkvVar.toString());
            }
        }
    }

    public final void e(String str, ServiceConnection serviceConnection, boolean z) {
        d(new fkv(str, z), serviceConnection);
    }

    public fkw(Context context, Looper looper) {
        this.c = new HashMap();
        dqt dqtVar = new dqt(this, 3);
        this.k = dqtVar;
        this.d = context.getApplicationContext();
        this.e = new fqw(looper, dqtVar);
        this.f = flr.a();
        this.h = 5000L;
        this.g = 300000L;
        this.i = null;
    }
}
