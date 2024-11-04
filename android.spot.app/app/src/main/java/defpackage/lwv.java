package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwv implements lwu {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("CLIENT_LOGGING_PROD");
        a = hxs.e("45352228", true, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        b = hxs.f("45352241", new hxp(10), "CAYIBAgFCAM", "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        c = hxs.e("45633315", false, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
    }

    @Override // defpackage.lwu
    public final nde a(Context context) {
        return (nde) b.b(context);
    }

    @Override // defpackage.lwu
    public final boolean b(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.lwu
    public final boolean c(Context context) {
        return ((Boolean) c.b(context)).booleanValue();
    }
}
