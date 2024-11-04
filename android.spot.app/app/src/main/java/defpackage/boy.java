package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class boy {
    static boolean a(Activity activity) {
        boolean isLaunchedFromBubble;
        isLaunchedFromBubble = activity.isLaunchedFromBubble();
        return isLaunchedFromBubble;
    }

    public static boolean b(Activity activity, String str) {
        boolean shouldShowRequestPermissionRationale;
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            shouldShowRequestPermissionRationale = activity.shouldShowRequestPermissionRationale(str);
            return shouldShowRequestPermissionRationale;
        }
    }

    public static bpg c(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, ArrayList arrayList) {
        bqm[] bqmVarArr;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bqm bqmVar = (bqm) arrayList.get(i);
                boolean z = bqmVar.a;
                arrayList3.add(bqmVar);
            }
        }
        if (!arrayList2.isEmpty()) {
        }
        if (arrayList3.isEmpty()) {
            bqmVarArr = null;
        } else {
            bqmVarArr = (bqm[]) arrayList3.toArray(new bqm[arrayList3.size()]);
        }
        return new bpg(iconCompat, charSequence, pendingIntent, bundle, bqmVarArr);
    }

    public static /* synthetic */ jyz d(mnb mnbVar, mol molVar) {
        mnbVar.getClass();
        return bei.d(new cqp(mnbVar, molVar, 1));
    }
}
