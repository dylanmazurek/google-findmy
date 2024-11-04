package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwj implements lwi {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;

    static {
        jmo jmoVar = jmo.a;
        jjr o = jjr.o("MDI_SYNC_COMPONENTS_VERBOSE", "MDI_SYNC_COMPONENTS_GAIA");
        a = hxs.e("45410057", true, "com.google.android.libraries.mdi.sync", o, true, false, false);
        b = hxs.e("45633393", false, "com.google.android.libraries.mdi.sync", o, true, false, false);
        c = hxs.e("45408267", true, "com.google.android.libraries.mdi.sync", o, true, false, false);
    }

    @Override // defpackage.lwi
    public final boolean a(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.lwi
    public final boolean b(Context context) {
        return ((Boolean) b.b(context)).booleanValue();
    }

    @Override // defpackage.lwi
    public final boolean c(Context context) {
        return ((Boolean) c.b(context)).booleanValue();
    }
}
