package defpackage;

import android.content.Context;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbm {
    public static volatile fbm a;
    public final Context b;
    public final List c;
    public final fbj d;
    public volatile fbs e;
    public Thread.UncaughtExceptionHandler f;

    public fbm(Context context) {
        Context applicationContext = context.getApplicationContext();
        fma.aR(applicationContext);
        this.b = applicationContext;
        this.d = new fbj(this);
        this.c = new CopyOnWriteArrayList();
        new fbc();
    }

    public static void b() {
        if (Thread.currentThread() instanceof fbl) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future a(Callable callable) {
        if (Thread.currentThread() instanceof fbl) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.d.submit(callable);
    }

    public final void c(Runnable runnable) {
        this.d.submit(runnable);
    }
}
