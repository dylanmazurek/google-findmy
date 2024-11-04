package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnr extends hni implements hnt {
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final hnl c;
    private hmq d;

    public hnr(hnl hnlVar) {
        this.c = hnlVar;
    }

    @Override // defpackage.hnt
    public final void a(Activity activity, Bundle bundle) {
        this.d = null;
    }

    @Override // defpackage.hnt
    public final void b(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.hnt
    public final void d(Activity activity) {
        this.d = null;
    }

    @Override // defpackage.hnt
    public final void f(Activity activity) {
        this.d = null;
        Context applicationContext = activity.getApplicationContext();
        if (hoa.e(applicationContext, hoa.a(applicationContext))) {
            l(hmq.b(activity.getClass()));
        } else if (!this.b.getAndSet(true)) {
            ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/foreground/ProcessImportanceForegroundSignalAdapter", "onActivityStarted", 57, "ProcessImportanceForegroundSignalAdapter.java")).r("Activity started with background importance");
        }
    }

    @Override // defpackage.hnt
    public final void g(Activity activity) {
        hmq b = hmq.b(activity.getClass());
        this.d = b;
        Context applicationContext = activity.getApplicationContext();
        if (!hoa.e(applicationContext, hoa.a(applicationContext))) {
            k(b);
        }
    }

    @Override // defpackage.hnt
    public final void h(int i) {
        hmq hmqVar;
        if (i >= 20 && (hmqVar = this.d) != null) {
            k(hmqVar);
        }
        this.d = null;
    }

    @Override // defpackage.hni
    public final void i(hmq hmqVar) {
        this.c.i(hmqVar);
    }

    @Override // defpackage.hni
    public final void j(hmq hmqVar) {
        this.c.j(hmqVar);
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.hnt
    public final /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
