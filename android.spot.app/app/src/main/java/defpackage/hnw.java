package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnw extends hnx {
    final /* synthetic */ hny a;

    public hnw(hny hnyVar) {
        this.a = hnyVar;
    }

    @Override // defpackage.hnx, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        hny hnyVar = this.a;
        int i = hnyVar.b - 1;
        hnyVar.b = i;
        if (i == 0) {
            hnyVar.h = hmq.b(activity.getClass());
            Handler handler = this.a.e;
            hwx.G(handler);
            Runnable runnable = this.a.f;
            hwx.G(runnable);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.hnx, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        hny hnyVar = this.a;
        int i = hnyVar.b + 1;
        hnyVar.b = i;
        if (i == 1) {
            if (hnyVar.c) {
                Iterator it = hnyVar.g.iterator();
                while (it.hasNext()) {
                    ((hnj) it.next()).l(hmq.b(activity.getClass()));
                }
                this.a.c = false;
                return;
            }
            Handler handler = hnyVar.e;
            hwx.G(handler);
            Runnable runnable = this.a.f;
            hwx.G(runnable);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.hnx, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        hny hnyVar = this.a;
        int i = hnyVar.a + 1;
        hnyVar.a = i;
        if (i == 1 && hnyVar.d) {
            for (hnj hnjVar : hnyVar.g) {
                hmq.b(activity.getClass());
            }
            this.a.d = false;
        }
    }

    @Override // defpackage.hnx, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        hny hnyVar = this.a;
        hnyVar.a--;
        hmq.b(activity.getClass());
        hnyVar.a();
    }
}
