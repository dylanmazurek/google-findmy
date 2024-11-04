package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsm implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ hsn b;

    public hsm(hsn hsnVar, Application application) {
        this.b = hsnVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        hsj hsjVar;
        if (this.b.s.b == null) {
            hsjVar = this.b.s;
        } else {
            hsjVar = this.b.t;
        }
        hsjVar.a = activity.getClass().getSimpleName();
        hsjVar.b = hpj.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        hsj hsjVar;
        if (this.b.t.b == null) {
            hsjVar = this.b.s;
        } else {
            hsjVar = this.b.t;
        }
        if (hsjVar.d == null) {
            hsjVar.d = hpj.a();
        }
        try {
            View findViewById = activity.findViewById(R.id.content);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new hsk(this, findViewById));
            viewTreeObserver.addOnPreDrawListener(new hsl(this, findViewById));
        } catch (RuntimeException unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        hsj hsjVar;
        if (this.b.t.b == null) {
            hsjVar = this.b.s;
        } else {
            hsjVar = this.b.t;
        }
        if (hsjVar.c == null) {
            hsjVar.c = hpj.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
