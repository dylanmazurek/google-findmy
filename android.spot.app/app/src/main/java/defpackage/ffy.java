package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffy implements ffk {
    public static final Charset a = Charset.forName("UTF-8");
    public static final hvy b;
    public static final ConcurrentHashMap c;
    static Boolean d;
    static Long e;
    public final Context f;

    static {
        hvy hvyVar = new hvy(hvo.a("com.google.android.gms.clearcut.public"));
        if (!hvyVar.b) {
            hvy hvyVar2 = new hvy((Uri) hvyVar.d, "gms:playlog:service:samplingrules_", hvyVar.a, false, hvyVar.c);
            b = new hvy((Uri) hvyVar2.d, (String) hvyVar2.e, "LogSamplingRulesV2__", hvyVar2.b, hvyVar2.c);
            c = new ConcurrentHashMap();
            d = null;
            e = null;
            return;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public ffy(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f = applicationContext;
        if (applicationContext != null) {
            hwa.f(applicationContext);
        }
    }
}
