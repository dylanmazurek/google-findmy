package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.time.TimeConversions;
import java.time.Duration;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byl {
    public static long a(AccessibilityNodeInfo accessibilityNodeInfo) {
        Duration minDurationBetweenContentChanges;
        minDurationBetweenContentChanges = accessibilityNodeInfo.getMinDurationBetweenContentChanges();
        return TimeConversions.convert(minDurationBetweenContentChanges).toMillis();
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        return accessibilityAction;
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence containerTitle;
        containerTitle = accessibilityNodeInfo.getContainerTitle();
        return containerTitle;
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static void e(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void f(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    public static void g(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(TimeConversions.convert(j$.time.Duration.ofMillis(j)));
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
    }

    public static boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean hasRequestInitialAccessibilityFocus;
        hasRequestInitialAccessibilityFocus = accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        return hasRequestInitialAccessibilityFocus;
    }

    public static boolean l(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean isAccessibilityDataSensitive;
        isAccessibilityDataSensitive = accessibilityNodeInfo.isAccessibilityDataSensitive();
        return isAccessibilityDataSensitive;
    }

    public static final String m(Collection collection) {
        String X;
        if (!collection.isEmpty()) {
            X = moz.X(new mrg(moz.p(mkm.ar(collection, ",\n", "\n", "\n", null, 56)), (moh) new eeo(15, (byte[]) null), 0), "\n");
            return X.concat("},");
        }
        return " }";
    }

    public static final String n(cjt cjtVar) {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(cjtVar.a);
        sb.append("',\n            |    columns = {");
        sb.append(m(mkm.af(cjtVar.b.values(), new bfr(6))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(m(cjtVar.c));
        sb.append("\n            |    indices = {");
        Set set = cjtVar.d;
        if (set != null) {
            collection = mkm.af(set, new bfr(7));
        } else {
            collection = mlx.a;
        }
        sb.append(m(collection));
        sb.append("\n            |}\n        ");
        return moz.K(sb.toString());
    }

    public static final void o(Collection collection) {
        moz.X(new mrg(moz.p(mkm.ar(collection, ",", null, null, null, 62)), (moh) new eeo(15, (byte[]) null), 0), "\n");
        moz.X(new mrg(moz.p(" }"), (moh) new eeo(15, (byte[]) null), 0), "\n");
    }

    public static final void p(Collection collection) {
        moz.X(new mrg(moz.p(mkm.ar(collection, ",", null, null, null, 62)), (moh) new eeo(15, (byte[]) null), 0), "\n");
        moz.X(new mrg(moz.p("},"), (moh) new eeo(15, (byte[]) null), 0), "\n");
    }

    public static final boolean q(String str, String str2) {
        if (amr.i(str, str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0) {
                        if (charAt != '(') {
                            break;
                        }
                        i3 = 0;
                        charAt = '(';
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    substring.getClass();
                    return amr.i(moz.k(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final boolean r(cjt cjtVar, Object obj) {
        Set set;
        if (cjtVar == obj) {
            return true;
        }
        if (!(obj instanceof cjt)) {
            return false;
        }
        cjt cjtVar2 = (cjt) obj;
        if (!amr.i(cjtVar.a, cjtVar2.a) || !amr.i(cjtVar.b, cjtVar2.b) || !amr.i(cjtVar.c, cjtVar2.c)) {
            return false;
        }
        Set set2 = cjtVar.d;
        if (set2 == null || (set = cjtVar2.d) == null) {
            return true;
        }
        return amr.i(set2, set);
    }
}
