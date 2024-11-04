package defpackage;

import android.app.Application;
import android.app.Service;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lru implements lsc {
    private final Service a;
    private Object b;

    public lru(Service service) {
        this.a = service;
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.b == null) {
            Application application = this.a.getApplication();
            iqg.D(application instanceof lsc, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            dvw m = ((lrt) hzc.ai(application, lrt.class)).m();
            m.a = this.a;
            iqg.z(m.a, Service.class);
            this.b = new dwi(m.b);
        }
        return this.b;
    }
}
