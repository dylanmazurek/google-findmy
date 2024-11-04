package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpj {
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
        Feature feature = new Feature("mdh_read_sync_status", 1L);
        a = feature;
        Feature feature2 = new Feature("mdh_time_series_write", 1L);
        b = feature2;
        Feature feature3 = new Feature("mdh_broadcast_listeners", 1L);
        c = feature3;
        Feature feature4 = new Feature("mdd_download_right_now", 1L);
        d = feature4;
        Feature feature5 = new Feature("mdd_delayed_download", 1L);
        e = feature5;
        Feature feature6 = new Feature("mobstore_write_api", 1L);
        f = feature6;
        Feature feature7 = new Feature("mobstore_rename", 1L);
        g = feature7;
        Feature feature8 = new Feature("icing_get_document", 1L);
        h = feature8;
        i = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
