package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpa extends bqx {
    public static void a(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (true) {
            int length = strArr.length;
            if (i2 < length) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            } else {
                int size = hashSet.size();
                if (size > 0) {
                    strArr2 = new String[length - size];
                } else {
                    strArr2 = strArr;
                }
                if (size > 0) {
                    if (size != length) {
                        int i3 = 0;
                        for (int i4 = 0; i4 < strArr.length; i4++) {
                            if (!hashSet.contains(Integer.valueOf(i4))) {
                                strArr2[i3] = strArr[i4];
                                i3++;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    if (activity instanceof aj) {
                    }
                    box.b(activity, strArr, i);
                    return;
                } else {
                    if (activity instanceof aj) {
                        new Handler(Looper.getMainLooper()).post(new oa(strArr2, activity, i, 4));
                        return;
                    }
                    return;
                }
            }
        }
    }
}
