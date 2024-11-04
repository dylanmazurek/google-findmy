package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpk {
    public static final Feature a;
    public static final Feature b;
    public static final Feature[] c;

    static {
        Feature feature = new Feature("account_health_alerts", 1L);
        a = feature;
        Feature feature2 = new Feature("account_messages", 1L);
        b = feature2;
        c = new Feature[]{feature, feature2};
    }
}
