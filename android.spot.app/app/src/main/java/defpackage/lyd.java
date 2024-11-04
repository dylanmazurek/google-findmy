package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyd implements lyc {
    public static final hxo a;
    public static final hxo b;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("CLIENT_LOGGING_PROD");
        a = hxs.e("45625440", false, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        b = hxs.f("10", new lxz(2), "EOgHGAQ", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
    }

    @Override // defpackage.lyc
    public final nfd a(Context context) {
        return (nfd) b.b(context);
    }
}
