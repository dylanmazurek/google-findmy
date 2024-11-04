package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyf {

    @Deprecated
    public static final gok a;
    private static final fma b;

    static {
        fyc fycVar = new fyc();
        b = fycVar;
        a = new gok("UsageReporting.API", fycVar, (byte[]) null);
    }

    public static fhq a(Context context) {
        return new fhq(context, a, new fye(), fhp.a);
    }
}
