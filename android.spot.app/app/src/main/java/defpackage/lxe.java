package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxe implements lxd {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;
    public static final hxo d;
    public static final hxo e;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("CLIENT_LOGGING_PROD");
        a = hxs.f("45390627", new hxp(13), "CAAQAxgGIJBOLQrXIzw", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        b = hxs.f("45376983", new hxp(14), "CAEQZBj0AyDoBw", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        c = hxs.e("45625683", false, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        d = hxs.e("45404981", true, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        e = hxs.f("45371370", new hxp(15), "CJYBEMgB", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
    }

    @Override // defpackage.lxd
    public final hpr a(Context context) {
        return (hpr) a.b(context);
    }

    @Override // defpackage.lxd
    public final hqb b(Context context) {
        return (hqb) e.b(context);
    }

    @Override // defpackage.lxd
    public final hqc c(Context context) {
        return (hqc) b.b(context);
    }

    @Override // defpackage.lxd
    public final boolean d(Context context) {
        return ((Boolean) c.b(context)).booleanValue();
    }

    @Override // defpackage.lxd
    public final boolean e(Context context) {
        return ((Boolean) d.b(context)).booleanValue();
    }
}
