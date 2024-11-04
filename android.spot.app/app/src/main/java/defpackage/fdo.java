package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdo extends BroadcastReceiver {
    static final String a = "fdo";
    public final fcn b;
    public boolean c;
    public boolean d;

    public fdo(fcn fcnVar) {
        this.b = fcnVar;
    }

    private final fcj e() {
        return this.b.d();
    }

    private final fdn f() {
        return this.b.h();
    }

    public final Context a() {
        return this.b.a;
    }

    public final void b() {
        f();
        e();
    }

    public final void c() {
        if (!this.c) {
            return;
        }
        this.b.h().y("Unregistering connectivity change receiver");
        this.c = false;
        this.d = false;
        try {
            a().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            f().v("Failed to unregister the network broadcast receiver", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean d() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) a().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b();
        fcn fcnVar = this.b;
        String action = intent.getAction();
        fcnVar.h().z("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean d = d();
            if (this.d != d) {
                this.d = d;
                fcj e = e();
                e.z("Network connectivity status changed", Boolean.valueOf(d));
                e.h().c(new eta(e, 6, null));
                return;
            }
            return;
        }
        if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(a)) {
                fcj e2 = e();
                e2.y("Radio powered up");
                e2.H();
                Context f = e2.f();
                if (fds.a(f) && gok.v(f)) {
                    Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
                    intent2.setComponent(new ComponentName(f, "com.google.android.gms.analytics.AnalyticsService"));
                    f.startService(intent2);
                    return;
                }
                e2.c(null);
                return;
            }
            return;
        }
        this.b.h().C("NetworkBroadcastReceiver received unknown action", action);
    }
}
