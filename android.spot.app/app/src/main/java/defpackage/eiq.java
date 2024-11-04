package defpackage;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class eiq extends Service {
    public final Object a = new Object();
    public boolean b;
    public boolean c;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Notification a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract jis b();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c();

    @Override // android.app.Service
    public void onDestroy() {
        synchronized (this.a) {
            this.b = false;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        synchronized (this.a) {
            if (this.c) {
                stopForeground(true);
                this.c = false;
            }
        }
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        int i = 1;
        if (c()) {
            synchronized (this.a) {
                hwx.U(this.b);
                jis b = b();
                hwx.V(!b.isEmpty(), "A foreground service must specify at least one foreground service type.");
                if (!this.c) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        Notification a = a();
                        int intValue = ((Integer) Collection.EL.stream(b).reduce(0, new jgo(i))).intValue();
                        if (Build.VERSION.SDK_INT >= 34) {
                            bqo.a(this, 1, a, intValue);
                        } else if (Build.VERSION.SDK_INT >= 29) {
                            bqn.a(this, 1, a, intValue);
                        } else {
                            startForeground(1, a);
                        }
                    } else {
                        startForeground(1, a());
                    }
                    this.c = true;
                }
            }
        }
        return true;
    }
}
