package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxt implements lxs {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;
    public static final hxo d;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("CLIENT_LOGGING_PROD");
        a = hxs.e("3", false, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        b = hxs.c("45357887", 1L, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        c = hxs.f("19", new hxp(20), "EAAYAg", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        d = hxs.c("45628530", 0L, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
    }

    @Override // defpackage.lxs
    public final long a(Context context) {
        return ((Long) b.b(context)).longValue();
    }

    @Override // defpackage.lxs
    public final long b(Context context) {
        return ((Long) d.b(context)).longValue();
    }

    @Override // defpackage.lxs
    public final nfd c(Context context) {
        return (nfd) c.b(context);
    }

    @Override // defpackage.lxs
    public final boolean d(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }
}
