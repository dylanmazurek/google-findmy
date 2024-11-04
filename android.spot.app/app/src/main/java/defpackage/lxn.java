package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxn implements lxm {
    public static final hxo a;
    public static final hxo b;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("CLIENT_LOGGING_PROD");
        a = hxs.e("45359255", false, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
        b = hxs.e("36", true, "com.google.android.libraries.performance.primes", jmsVar, true, true, false);
    }

    @Override // defpackage.lxm
    public final boolean a(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.lxm
    public final boolean b(Context context) {
        return ((Boolean) b.b(context)).booleanValue();
    }
}
