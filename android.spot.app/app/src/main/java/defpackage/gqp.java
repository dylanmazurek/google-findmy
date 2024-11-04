package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqp {
    private static final joo a = joo.m("GnpSdk");
    private static volatile gqq b = null;

    public static gqq a(Context context) {
        gqq a2;
        if (b == null) {
            Object applicationContext = context.getApplicationContext();
            if (applicationContext instanceof ezv) {
                a2 = (gqq) ((ezv) applicationContext).a();
            } else {
                try {
                    a2 = (gqq) iqh.j(context, gqq.class);
                } catch (IllegalStateException e) {
                    ((jol) ((jol) a.k().i(e)).j("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 48, "Gnp.java")).r("Couldn't fetch GnpComponent entry point (relevant for Hilt/Tiktok integrations)");
                    try {
                        a2 = ((gqr) iqh.j(context, gqr.class)).a();
                    } catch (IllegalStateException e2) {
                        ((jol) ((jol) a.k().i(e2)).j("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 59, "Gnp.java")).r("Couldn't fetch GnpComponentSupplier entry point (relevant for custom integrations)");
                        throw new IllegalStateException("Unable to get GnpComponent from host app: ".concat(String.valueOf(context.getPackageName())));
                    }
                }
            }
            b = a2;
        }
        b.g().a(context);
        return b;
    }
}
