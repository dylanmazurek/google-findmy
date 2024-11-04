package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lks {
    private static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(kzy.G(lim.v((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof lim) {
            sb.append(": \"");
            sb.append(kzy.G((lim) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ljn) {
            sb.append(" {");
            b((ljn) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            int i3 = i + 2;
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb, i3, "key", entry.getKey());
            a(sb, i3, "value", entry.getValue());
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    public static void b(lkq lkqVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = lkqVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i, substring.substring(0, substring.length() - 4), ljn.r(method2, lkqVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), ljn.r(method, lkqVar, new Object[0]));
            } else if (hashSet.contains("set".concat(String.valueOf(substring))) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                if (method4 != null) {
                    Object r = ljn.r(method4, lkqVar, new Object[0]);
                    if (method5 == null) {
                        if (r instanceof Boolean) {
                            if (!((Boolean) r).booleanValue()) {
                            }
                            a(sb, i, substring, r);
                        } else if (r instanceof Integer) {
                            if (((Integer) r).intValue() == 0) {
                            }
                            a(sb, i, substring, r);
                        } else if (r instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) r).floatValue()) == 0) {
                            }
                            a(sb, i, substring, r);
                        } else if (r instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) r).doubleValue()) == 0) {
                            }
                            a(sb, i, substring, r);
                        } else {
                            if (r instanceof String) {
                                equals = r.equals("");
                            } else if (r instanceof lim) {
                                equals = r.equals(lim.b);
                            } else if (r instanceof lkq) {
                                if (r == ((lkq) r).s()) {
                                }
                                a(sb, i, substring, r);
                            } else {
                                if ((r instanceof Enum) && ((Enum) r).ordinal() == 0) {
                                }
                                a(sb, i, substring, r);
                            }
                            if (equals) {
                            }
                            a(sb, i, substring, r);
                        }
                    } else {
                        if (!((Boolean) ljn.r(method5, lkqVar, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, r);
                    }
                }
            }
            i2 = 3;
        }
        if (lkqVar instanceof ljk) {
            Iterator d = ((ljk) lkqVar).l.d();
            while (d.hasNext()) {
                Map.Entry entry2 = (Map.Entry) d.next();
                a(sb, i, "[" + ((ljm) entry2.getKey()).a + "]", entry2.getValue());
            }
        }
        llp llpVar = ((ljn) lkqVar).B;
        if (llpVar != null) {
            for (int i4 = 0; i4 < llpVar.b; i4++) {
                a(sb, i, String.valueOf(llz.a(llpVar.c[i4])), llpVar.d[i4]);
            }
        }
    }

    private static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
