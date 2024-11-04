package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class krz extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService e;

    public krz() {
        frx frxVar = fqv.a;
        this.e = frx.n(new fmd("Firebase-Messaging-Intent-Handle"));
        this.b = new Object();
        this.d = 0;
    }

    public final fxs c(Intent intent) {
        bym bymVar = new bym((int[]) null);
        this.e.execute(new hlt(this, intent, bymVar, 12, (char[]) null));
        return (fxs) bymVar.a;
    }

    public final void d(Intent intent) {
        if (intent != null) {
            ksw.b(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void e(Intent intent);

    protected Intent f() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new ksx(new njz(this, null));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.e.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent f = f();
        if (f == null) {
            d(intent);
            return 2;
        }
        fxs c = c(f);
        if (c.h()) {
            d(intent);
            return 2;
        }
        c.l(new pt(7), new kry(this, intent, 0));
        return 3;
    }
}
