package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fge implements ServiceConnection {
    public int a = 0;
    public final Messenger b = new Messenger(new fqw(Looper.getMainLooper(), new dqt(this, 2, null)));
    public final Queue c = new ArrayDeque();
    public final SparseArray d = new SparseArray();
    public final /* synthetic */ imr e;
    public gok f;

    public fge(imr imrVar) {
        this.e = imrVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final void a() {
        this.e.c.execute(new eta(this, 9));
    }

    public final synchronized void b() {
        if (this.a == 1) {
            g("Timed out while binding");
        }
    }

    public final synchronized void c(int i) {
        fgg fggVar = (fgg) this.d.get(i);
        if (fggVar != null) {
            Log.w("MessengerIpcClient", a.ae(i, "Timing out request: "));
            this.d.remove(i);
            fggVar.c(new fgh("Timed out waiting for response"));
            d();
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.c.isEmpty() && this.d.size() == 0) {
            this.a = 3;
            flr.a().b((Context) this.e.b, this);
        }
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    public final synchronized boolean e(fgg fggVar) {
        int i = this.a;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.c.add(fggVar);
                a();
                return true;
            }
            this.c.add(fggVar);
            return true;
        }
        this.c.add(fggVar);
        if (this.a == 0) {
            z = true;
        }
        fma.aN(z);
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!flr.a().c((Context) this.e.b, intent, this, 1)) {
                g("Unable to bind to service");
            } else {
                imr imrVar = this.e;
                imrVar.c.schedule(new eta(this, 10), 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e) {
            f("Unable to bind to service", e);
        }
        return true;
    }

    final synchronized void f(String str, Throwable th) {
        int i = this.a;
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            this.a = 4;
            flr.a().b((Context) this.e.b, this);
            fgh fghVar = new fgh(str, th);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((fgg) it.next()).c(fghVar);
            }
            this.c.clear();
            for (int i2 = 0; i2 < this.d.size(); i2++) {
                ((fgg) this.d.valueAt(i2)).c(fghVar);
            }
            this.d.clear();
            return;
        }
        throw new IllegalStateException();
    }

    public final synchronized void g(String str) {
        f(str, null);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.e.c.execute(new fbh(this, iBinder, 5, (short[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.c.execute(new eta(this, 11));
    }
}
