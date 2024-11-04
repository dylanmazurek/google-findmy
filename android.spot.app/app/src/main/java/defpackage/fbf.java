package defpackage;

import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fbf {
    public static String a(Object obj) {
        return d(obj, 0);
    }

    public static String b(Map map) {
        return d(map, 1);
    }

    private static String d(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj != null) {
            if (obj instanceof String) {
                if (!TextUtils.isEmpty((String) obj)) {
                    return obj.toString();
                }
                return "";
            }
            if (obj instanceof Integer) {
                if (((Integer) obj).intValue() != 0) {
                    return obj.toString();
                }
                return "";
            }
            if (obj instanceof Long) {
                if (((Long) obj).longValue() != 0) {
                    return obj.toString();
                }
                return "";
            }
            if (obj instanceof Double) {
                if (((Double) obj).doubleValue() != 0.0d) {
                    return obj.toString();
                }
                return "";
            }
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return obj.toString();
                }
                return "";
            }
            if (obj instanceof List) {
                StringBuilder sb = new StringBuilder();
                if (i > 0) {
                    sb.append("[");
                }
                int length = sb.length();
                for (Object obj2 : (List) obj) {
                    if (sb.length() > length) {
                        sb.append(", ");
                    }
                    sb.append(d(obj2, i + 1));
                }
                if (i > 0) {
                    sb.append("]");
                }
                return sb.toString();
            }
            if (obj instanceof Map) {
                StringBuilder sb2 = new StringBuilder();
                boolean z = false;
                int i2 = 0;
                for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                    String d = d(entry.getValue(), i + 1);
                    if (!TextUtils.isEmpty(d)) {
                        if (i > 0 && !z) {
                            sb2.append("{");
                            i2 = sb2.length();
                            z = true;
                        }
                        if (sb2.length() > i2) {
                            sb2.append(", ");
                        }
                        sb2.append((String) entry.getKey());
                        sb2.append('=');
                        sb2.append(d);
                    }
                }
                if (z) {
                    sb2.append("}");
                }
                return sb2.toString();
            }
            return obj.toString();
        }
        return "";
    }

    public abstract void c(fbf fbfVar);
}
