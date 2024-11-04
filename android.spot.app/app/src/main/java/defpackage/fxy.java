package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxy {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("usage_and_diagnostics_listener", 1L);
        a = feature;
        Feature feature2 = new Feature("usage_and_diagnostics_consents", 1L);
        b = feature2;
        Feature feature3 = new Feature("usage_and_diagnostics_settings_access", 1L);
        c = feature3;
        Feature feature4 = new Feature("el_capitan", 1L);
        d = feature4;
        e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
