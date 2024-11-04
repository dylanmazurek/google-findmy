package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqr implements hnt {
    private final lqz a;
    private boolean b = false;
    private Activity c;

    public hqr(lqz lqzVar, final jer jerVar, Executor executor) {
        this.a = lqzVar;
        executor.execute(new Runnable() { // from class: hqq
            @Override // java.lang.Runnable
            public final void run() {
                hqr.this.i(jerVar);
            }
        });
    }

    @Override // defpackage.hnt
    public synchronized void c(Activity activity) {
        if (this.b) {
            ((hqw) this.a.a()).a(activity);
        } else if (!activity.equals(this.c)) {
            ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).y("Activity mismatch (currentActivity=%s, activity=%s)", this.c, activity);
        }
        this.c = null;
    }

    @Override // defpackage.hnt
    public synchronized void d(Activity activity) {
        if (this.b) {
            ((hqw) this.a.a()).c(activity);
        } else {
            this.c = activity;
        }
    }

    public /* synthetic */ void i(jer jerVar) {
        if (jerVar.g() && !((Boolean) ((mko) jerVar.c()).a()).booleanValue()) {
            return;
        }
        synchronized (this) {
            this.b = true;
            Activity activity = this.c;
            if (activity != null) {
                d(activity);
            }
            this.c = null;
        }
    }

    @Override // defpackage.hnt
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void a(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.hnt
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
