package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvw extends hwa {
    public hvw(hvy hvyVar, String str, Object obj) {
        super(hvyVar, str, obj, false);
    }

    @Override // defpackage.hwa
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                byte[] decode = Base64.decode((String) obj, 3);
                lod lodVar = lod.b;
                int length = decode.length;
                lja ljaVar = lja.a;
                lkz lkzVar = lkz.a;
                ljn m = ljn.m(lodVar, decode, 0, length, lja.a);
                ljn.A(m);
                return (lod) m;
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
