package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwj {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;
    public static final Feature g;
    public static final Feature h;
    public static final Feature[] i;

    static {
        Feature feature = new Feature("get_serving_version_api", 1L);
        a = feature;
        Feature feature2 = new Feature("get_experiment_tokens_api", 1L);
        b = feature2;
        Feature feature3 = new Feature("register_flag_update_listener_api", 2L);
        c = feature3;
        Feature feature4 = new Feature("sync_after_api", 1L);
        d = feature4;
        Feature feature5 = new Feature("sync_after_for_application_api", 1L);
        e = feature5;
        Feature feature6 = new Feature("set_app_wide_properties_api", 1L);
        f = feature6;
        Feature feature7 = new Feature("set_runtime_properties_api", 1L);
        g = feature7;
        Feature feature8 = new Feature("get_storage_info_api", 1L);
        h = feature8;
        i = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
