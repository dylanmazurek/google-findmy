package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byj {
    public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence stateDescription;
        stateDescription = accessibilityNodeInfo.getStateDescription();
        return stateDescription;
    }

    public static Object b(int i, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static final int d(ckb ckbVar, String str) {
        int b = bxz.b(ckbVar, str);
        if (b >= 0) {
            return b;
        }
        int b2 = bxz.b(ckbVar, "`" + str + '`');
        if (b2 < 0) {
            if (Build.VERSION.SDK_INT > 25 || str.length() == 0) {
                return -1;
            }
            int a = ckbVar.a();
            String str2 = "." + str;
            String str3 = "." + str + '`';
            for (int i = 0; i < a; i++) {
                String c = ckbVar.c(i);
                if (c.length() >= str.length() + 2 && (moz.u(c, str2) || (c.charAt(0) == '`' && moz.u(c, str3)))) {
                    return i;
                }
            }
            return -1;
        }
        return b2;
    }
}
