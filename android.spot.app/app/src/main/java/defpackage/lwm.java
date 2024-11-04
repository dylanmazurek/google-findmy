package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwm implements lwl {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;
    public static final hxo d;

    static {
        jmo jmoVar = jmo.a;
        jjr p = jjr.p("ONEGOOGLE_MOBILE", "STREAMZ_CONSENTKIT_MOBILE", "IDENTITY_CONSENT_UI");
        a = hxs.e("45477821", false, "com.google.android.libraries.onegoogle", p, true, false, false);
        b = hxs.e("45383896", true, "com.google.android.libraries.onegoogle", p, true, false, false);
        c = hxs.e("45386670", true, "com.google.android.libraries.onegoogle", p, true, false, false);
        d = hxs.e("45376988", false, "com.google.android.libraries.onegoogle", p, true, false, false);
    }

    @Override // defpackage.lwl
    public final boolean a(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.lwl
    public final boolean b(Context context) {
        return ((Boolean) b.b(context)).booleanValue();
    }

    @Override // defpackage.lwl
    public final boolean c(Context context) {
        return ((Boolean) c.b(context)).booleanValue();
    }

    @Override // defpackage.lwl
    public final boolean d(Context context) {
        return ((Boolean) d.b(context)).booleanValue();
    }
}
