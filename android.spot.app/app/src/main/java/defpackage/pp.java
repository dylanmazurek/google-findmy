package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pp extends pn {
    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        return iy.c(new String[]{str});
    }

    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        boolean z = false;
        if (intent != null && i == -1) {
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= intArrayExtra.length) {
                        break;
                    }
                    if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    }
                    i2++;
                }
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ bet c(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        if (bqx.b(context, str) != 0) {
            return null;
        }
        return new bet((Object) true, (byte[]) null);
    }
}
