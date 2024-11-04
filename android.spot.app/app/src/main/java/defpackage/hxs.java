package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxs {
    @Deprecated
    public static final hxo a(String str, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        return new hxo(str3, "__phenotype_server_token", "", new hww(false, set, new hxp(0), new hxq(String.class, 5)), false);
    }

    public static final hxo b(String str, double d, String str2, Set set, boolean z, boolean z2, boolean z3) {
        return new hxo("com.google.android.apps.fmd", str, Double.valueOf(d), new hww(false, set, new hxp(2), new hxq(Double.class, 0)), true);
    }

    public static final hxo c(String str, long j, String str2, Set set, boolean z, boolean z2, boolean z3) {
        return new hxo(str2, str, Long.valueOf(j), new hww(z2, set, new hxp(1), new hxq(Long.class, 1)), true);
    }

    public static final hxo d(String str, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        return new hxo(str3, str, str2, new hww(false, set, new hxp(4), new hxq(String.class, 5)), true);
    }

    public static final hxo e(String str, boolean z, String str2, Set set, boolean z2, boolean z3, boolean z4) {
        return new hxo(str2, str, Boolean.valueOf(z), new hww(z3, set, new hxp(3), new hxq(Boolean.class, 4)), true);
    }

    public static final hxo f(String str, hxr hxrVar, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        return new hxo(str3, str, new hww(z2, set, new hxq(hxrVar, 2), new hxq(hxrVar, 3)), str2);
    }
}
