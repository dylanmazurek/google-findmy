package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lui implements luh {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;
    public static final hxo d;
    public static final hxo e;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("FPOP_CLIENT");
        a = hxs.e("FacsCacheLibraryFeature__dasu_logging_enabled", true, "com.google.android.libraries.personalization.footprints", jmsVar, true, false, false);
        b = hxs.c("FacsCacheLibraryFeature__dasu_logging_sampling_interval", 1000L, "com.google.android.libraries.personalization.footprints", jmsVar, true, false, false);
        c = hxs.e("FacsCacheLibraryFeature__event_logging_enabled", true, "com.google.android.libraries.personalization.footprints", jmsVar, true, false, false);
        d = hxs.c("FacsCacheLibraryFeature__event_logging_sampling_interval", 1000L, "com.google.android.libraries.personalization.footprints", jmsVar, true, false, false);
        e = hxs.e("FacsCacheLibraryFeature__use_execution_sequencer", true, "com.google.android.libraries.personalization.footprints", jmsVar, true, false, false);
    }

    @Override // defpackage.luh
    public final long a(Context context) {
        return ((Long) b.b(context)).longValue();
    }

    @Override // defpackage.luh
    public final long b(Context context) {
        return ((Long) d.b(context)).longValue();
    }

    @Override // defpackage.luh
    public final boolean c(Context context) {
        return ((Boolean) a.b(context)).booleanValue();
    }

    @Override // defpackage.luh
    public final boolean d(Context context) {
        return ((Boolean) c.b(context)).booleanValue();
    }

    @Override // defpackage.luh
    public final boolean e(Context context) {
        return ((Boolean) e.b(context)).booleanValue();
    }
}
