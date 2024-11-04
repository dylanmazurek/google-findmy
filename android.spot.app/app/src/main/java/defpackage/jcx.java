package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.exceptions.FatalException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcx extends iys {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ hlt b;

    public jcx(hlt hltVar, AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
        this.b = hltVar;
    }

    @Override // defpackage.iyt
    public final void c(Bundle bundle) {
        if (this.a.getAndSet(true)) {
            return;
        }
        int i = bundle.getInt("error.code", -100);
        int i2 = bundle.getInt("install.status", 0);
        if (i2 == 4) {
            ((jcq) this.b.b).a(jcr.COMPLETED);
            return;
        }
        if (i != 0) {
            Log.w("ARCore-InstallService", a.am(i, "requestInstall = ", ", launching fullscreen."));
            hlt hltVar = this.b;
            jcs.g((Activity) hltVar.c, (jcq) hltVar.b);
            return;
        }
        if (bundle.containsKey("resolution.intent")) {
            hlt hltVar2 = this.b;
            jcs.i((Activity) hltVar2.c, bundle, (jcq) hltVar2.b);
            return;
        }
        if (i2 != 10) {
            switch (i2) {
                case 1:
                case 2:
                case 3:
                    ((jcq) this.b.b).a(jcr.ACCEPTED);
                    return;
                case 4:
                    ((jcq) this.b.b).a(jcr.COMPLETED);
                    return;
                case 5:
                    hlt hltVar3 = this.b;
                    ((jcq) hltVar3.b).b(new FatalException("Unexpected FAILED install status without error."));
                    return;
                case 6:
                    ((jcq) this.b.b).a(jcr.CANCELLED);
                    return;
                default:
                    hlt hltVar4 = this.b;
                    ((jcq) hltVar4.b).b(new FatalException(a.ae(i2, "Unexpected install status: ")));
                    return;
            }
        }
        hlt hltVar5 = this.b;
        ((jcq) hltVar5.b).b(new FatalException("Unexpected REQUIRES_UI_INTENT install status without an intent."));
    }

    @Override // defpackage.iyt
    public final void b(Bundle bundle) {
    }
}
