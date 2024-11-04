package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxk implements lxj {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;
    public static final hxo d;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("CLIENT_LOGGING_PROD");
        a = hxs.e("45415027", true, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        b = hxs.f("8", new hxp(18), "EOgHGAQ", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        c = hxs.c("45401381", 3600000L, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        d = hxs.e("45420903", false, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
    }

    @Override // defpackage.lxj
    public final long a(Context context) {
        return ((Long) c.b(context)).longValue();
    }

    @Override // defpackage.lxj
    public final nfd b(Context context) {
        return (nfd) b.b(context);
    }

    @Override // defpackage.lxj
    public final boolean c(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.lxj
    public final boolean d(Context context) {
        return ((Boolean) d.b(context)).booleanValue();
    }
}
