package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cum extends cuj {
    public final ConnectivityManager e;
    private final cul f;

    public cum(Context context, eld eldVar) {
        super(context, eldVar);
        Object systemService = this.a.getSystemService("connectivity");
        systemService.getClass();
        this.e = (ConnectivityManager) systemService;
        this.f = new cul(this);
    }

    @Override // defpackage.cuj
    public final /* bridge */ /* synthetic */ Object b() {
        return cun.a(this.e);
    }

    @Override // defpackage.cuj
    public final void d() {
        try {
            cqc.b();
            String str = cun.a;
            cwx.a(this.e, this.f);
        } catch (IllegalArgumentException e) {
            cqc.b();
            Log.e(cun.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            cqc.b();
            Log.e(cun.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.cuj
    public final void e() {
        try {
            cqc.b();
            String str = cun.a;
            cwv.b(this.e, this.f);
        } catch (IllegalArgumentException e) {
            cqc.b();
            Log.e(cun.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            cqc.b();
            Log.e(cun.a, "Received exception while unregistering network callback", e2);
        }
    }
}
