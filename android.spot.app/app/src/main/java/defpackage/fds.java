package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fds {
    public static final Object a = new Object();
    public static fxg b;
    static Boolean c;

    public static boolean a(Context context) {
        fma.aR(context);
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean bl = fma.bl(context, "com.google.android.gms.analytics.AnalyticsReceiver", false);
        c = Boolean.valueOf(bl);
        return bl;
    }
}
