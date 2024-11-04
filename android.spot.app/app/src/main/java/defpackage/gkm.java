package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gkm implements gyp {
    private static final joo c = joo.m("GnpSdk");
    public goj a;
    public Map b;

    /* JADX INFO: Access modifiers changed from: protected */
    public static final gjj i() {
        gji c2 = gjj.c();
        c2.e = new IllegalStateException("chimeAccount should not be null.");
        c2.b(false);
        return c2.a();
    }

    @Override // defpackage.gyp
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // defpackage.gyp
    public final gfx b(Bundle bundle) {
        goa a;
        int i = bundle.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT");
        jer h = jer.h(frx.U(bundle));
        if (h.g()) {
            try {
                a = this.a.a((gwf) h.c());
            } catch (Exception e) {
                return gfx.a(e);
            }
        } else {
            a = null;
        }
        ljh k = lgq.c.k();
        if (!k.b.y()) {
            k.t();
        }
        lgq lgqVar = (lgq) k.b;
        lgqVar.a |= 1;
        lgqVar.b = i;
        gjj g = g(bundle, (lgq) k.q(), a);
        if (g.b() && g.d) {
            return gfx.b(g.c);
        }
        String h2 = h();
        if (!TextUtils.isEmpty(h2) && this.b.containsKey(h2)) {
            ((jol) c.k().j("com/google/android/libraries/notifications/internal/scheduled/impl/ScheduledRpcHandler", "handleTask", 72, "ScheduledRpcHandler.java")).u("Calling scheduled RPC callback. Callback key: [%s]", h2);
            gkb gkbVar = (gkb) this.b.get(h2);
            if (g.b()) {
                gkbVar.a(a, g.a, g.c);
            } else {
                gkbVar.b(a, g.a, g.b);
            }
        } else {
            ((jol) c.k().j("com/google/android/libraries/notifications/internal/scheduled/impl/ScheduledRpcHandler", "handleTask", 80, "ScheduledRpcHandler.java")).u("Scheduled RPC callback not found. Callback key: [%s]", h2);
        }
        if (g.b()) {
            return gfx.a(g.c);
        }
        return gfx.a;
    }

    @Override // defpackage.gyp
    public final /* synthetic */ boolean d() {
        return false;
    }

    public abstract gjj g(Bundle bundle, lgq lgqVar, goa goaVar);

    protected abstract String h();

    @Override // defpackage.gyp
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gyp
    public final /* synthetic */ void f() {
    }
}
