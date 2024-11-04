package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrh implements hnt {
    private final Window.OnFrameMetricsAvailableListener a;
    private final lqz b;
    private Activity c;
    private boolean d;
    private final Set e = Collections.newSetFromMap(new WeakHashMap());

    public hrh(lqz lqzVar, jzd jzdVar, Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener) {
        this.a = onFrameMetricsAvailableListener;
        this.b = lqzVar;
    }

    private final synchronized void k() {
        Activity activity = this.c;
        if (activity != null && this.e.add(activity.getWindow())) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.a, (Handler) this.b.a());
            return;
        }
        ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "attachToCurrentActivity", 91, "WindowTracker.java")).r("Activity is null or already being tracked");
    }

    private final synchronized void l(Activity activity) {
        if (activity != null) {
            if (this.e.remove(activity.getWindow())) {
                try {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.a);
                    return;
                } catch (RuntimeException e) {
                    ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 'm', "WindowTracker.java")).r("Failed to detach the frame metrics listener");
                    return;
                }
            }
        }
        ((jni) ((jni) hmz.a.c()).j("com/google/android/libraries/performance/primes/metrics/jank/WindowTracker", "detachFromActivity", 101, "WindowTracker.java")).r("Activity is null or isn't being tracked");
    }

    @Override // defpackage.hnt
    public void b(Activity activity) {
        synchronized (this) {
            l(activity);
        }
    }

    @Override // defpackage.hnt
    public void c(Activity activity) {
        synchronized (this) {
            this.c = null;
        }
    }

    @Override // defpackage.hnt
    public void d(Activity activity) {
        synchronized (this) {
            this.c = activity;
            if (this.d) {
                k();
            }
        }
    }

    public synchronized void i() {
        this.d = true;
        k();
    }

    public synchronized void j() {
        this.d = false;
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
