package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvt extends hwa {
    public hvt(hvy hvyVar, String str, Long l) {
        super(hvyVar, str, l, true);
    }

    @Override // defpackage.hwa
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
