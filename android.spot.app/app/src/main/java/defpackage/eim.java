package defpackage;

import com.google.android.gms.findmydevice.spot.GetFindMyDeviceSettingsResponse;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eim {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/FindMyDeviceNetworkPreferenceManager");
    public final Object b = new Object();
    public jer c = jdl.a;
    public final cfn d = new cfn(b());
    public final fop e;
    private final Executor f;
    private final fgp g;

    public eim(fop fopVar, fgp fgpVar, Executor executor) {
        this.e = fopVar;
        this.g = fgpVar;
        this.f = executor;
    }

    public final jer a() {
        jer b = b();
        if (!b.g()) {
            return jdl.a;
        }
        return ((ein) b.c()).a;
    }

    public final jer b() {
        synchronized (this.b) {
            if (!this.c.g()) {
                return jdl.a;
            }
            return jer.i(ein.a((GetFindMyDeviceSettingsResponse) this.c.c()));
        }
    }

    public final jer c() {
        synchronized (this.b) {
            if (this.c.g()) {
                return jer.i(Boolean.valueOf(((GetFindMyDeviceSettingsResponse) this.c.c()).h));
            }
            ijp.a(d(), "Failed to update FMDN status", new Object[0]);
            return jdl.a;
        }
    }

    public final jyz d() {
        return jbx.d(fzo.b(this.g.a(this.e, new fhu[0]))).f(new eji(this, 1), this.f).e(new dyv(this, 4), this.f).a(fho.class, new eil(0), this.f);
    }
}
