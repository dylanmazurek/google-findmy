package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvu extends hwa {
    public hvu(hvy hvyVar, String str, Boolean bool) {
        super(hvyVar, str, bool, true);
    }

    @Override // defpackage.hwa
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (fyp.c.matcher(str).matches()) {
                return true;
            }
            if (fyp.d.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
