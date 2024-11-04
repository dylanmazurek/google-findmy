package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class po extends pn {
    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        strArr.getClass();
        return iy.c(strArr);
    }

    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        boolean z;
        if (i != -1 || intent == null) {
            return mly.a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(Boolean.valueOf(z));
            }
            return mkm.K(mkm.ai(mkm.l(stringArrayExtra), arrayList));
        }
        return mly.a;
    }

    @Override // defpackage.pn
    public final /* bridge */ /* synthetic */ bet c(Context context, Object obj) {
        bet betVar;
        String[] strArr = (String[]) obj;
        strArr.getClass();
        if (strArr.length == 0) {
            betVar = new bet(mly.a, (byte[]) null);
        } else {
            for (String str : strArr) {
                if (bqx.b(context, str) != 0) {
                    return null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(moz.ac(mkm.H(strArr.length), 16));
            for (String str2 : strArr) {
                mkw mkwVar = new mkw(str2, true);
                linkedHashMap.put(mkwVar.a, mkwVar.b);
            }
            betVar = new bet(linkedHashMap, (byte[]) null);
        }
        return betVar;
    }
}
