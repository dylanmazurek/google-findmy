package defpackage;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvx extends hwa {
    public hvx(hvy hvyVar) {
        super(hvyVar);
    }

    @Override // defpackage.hwa
    public final Object a(Object obj) {
        if (obj instanceof String) {
            try {
                byte[] decode = Base64.decode((String) obj, 3);
                lml lmlVar = lml.b;
                int length = decode.length;
                lja ljaVar = lja.a;
                lkz lkzVar = lkz.a;
                ljn m = ljn.m(lmlVar, decode, 0, length, lja.a);
                ljn.A(m);
                return (lml) m;
            } catch (IOException | IllegalArgumentException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
