package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzj implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ mko c;
    final /* synthetic */ jer d;

    public hzj(Application application, mko mkoVar, jer jerVar) {
        this.b = application;
        this.c = mkoVar;
        this.d = jerVar;
    }

    private final jis a() {
        if (!this.a) {
            this.a = true;
            this.b.unregisterActivityLifecycleCallbacks(this);
            Set<Application.ActivityLifecycleCallbacks> set = (Set) ((lsi) this.c).b;
            jin j = jis.j(set.size());
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : set) {
                if (this.d.g()) {
                    activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((jei) this.d.c()).a(activityLifecycleCallbacks);
                }
                this.b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                j.h(activityLifecycleCallbacks);
            }
            return j.g();
        }
        int i = jis.d;
        return jmi.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        jis a = a();
        int i = ((jmi) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        hwx.U(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        hwx.U(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        jis a = a();
        int i = ((jmi) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Application.ActivityLifecycleCallbacks) a.get(i2)).onActivityPreCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        hwx.U(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        hwx.U(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        hwx.U(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        hwx.U(this.a);
    }
}
