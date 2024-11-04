package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.adm.app.FmdApplication;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwl extends Application implements lsc {
    private boolean a = false;
    private final lrp b = new lrp(new njz(this, null));

    @Override // android.app.Application
    public void onCreate() {
        if (!this.a) {
            this.a = true;
            FmdApplication fmdApplication = (FmdApplication) this;
            dwj dwjVar = (dwj) r();
            fmdApplication.g = new dwt((Executor) dwjVar.b.a(), (gyc) dwjVar.e.a(), (Context) dwjVar.aS.b);
            fmdApplication.a = (Application.ActivityLifecycleCallbacks) dwjVar.f.a();
            fmdApplication.h = (ebg) dwjVar.J.a();
            fmdApplication.b = new eus((Context) dwjVar.aS.b, (ksr) dwjVar.K.a(), (Executor) dwjVar.x.a());
            fmdApplication.i = (ksr) dwjVar.K.a();
            fmdApplication.c = (hms) dwjVar.L.a();
            fmdApplication.d = (hzh) dwjVar.M.a();
            fmdApplication.e = new dwn((ewc) dwjVar.h.a(), (eim) dwjVar.r.a(), (ksr) dwjVar.K.a(), (Executor) dwjVar.x.a(), (Context) dwjVar.aS.b);
            fmdApplication.f = (cqn) dwjVar.S.a();
        }
        super.onCreate();
    }

    @Override // defpackage.lsc
    public final Object r() {
        return this.b.r();
    }
}
