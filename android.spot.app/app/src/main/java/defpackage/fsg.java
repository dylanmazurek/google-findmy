package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsg {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("mdisync_gis_backend", 1L);
        a = feature;
        Feature feature2 = new Feature("mdisync_profile_backend", 1L);
        b = feature2;
        c = new Feature[]{feature, feature2};
    }
}
