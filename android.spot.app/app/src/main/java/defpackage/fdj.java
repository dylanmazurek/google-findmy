package defpackage;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.Command;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdj {
    public final Map a;
    public final List b;
    public final long c;
    public final long d;
    public final int e;
    public final boolean f;
    private final String g;

    public fdj(fck fckVar, Map map, long j, boolean z) {
        this(fckVar, map, j, z, 0L, 0, null);
    }

    private static String b(fck fckVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String obj2 = obj.toString();
        if (obj2.startsWith("&")) {
            obj2 = obj2.substring(1);
        }
        int length = obj2.length();
        if (length > 256) {
            obj2 = obj2.substring(0, 256);
            fckVar.D("Hit param name is too long and will be trimmed", Integer.valueOf(length), obj2);
        }
        if (TextUtils.isEmpty(obj2)) {
            return null;
        }
        return obj2;
    }

    private static String c(fck fckVar, Object obj) {
        String obj2;
        if (obj == null) {
            obj2 = "";
        } else {
            obj2 = obj.toString();
        }
        int length = obj2.length();
        if (length > 8192) {
            String substring = obj2.substring(0, 8192);
            fckVar.D("Hit param value is too long and will be trimmed", Integer.valueOf(length), substring);
            return substring;
        }
        return obj2;
    }

    private static boolean d(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith("&");
    }

    public final String a(String str, String str2) {
        fma.aP(str);
        fma.aG(!str.startsWith("&"), "Short param name required");
        String str3 = (String) this.a.get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ht=");
        sb.append(this.d);
        if (this.c != 0) {
            sb.append(", dbId=");
            sb.append(this.c);
        }
        if (this.e != 0) {
            sb.append(", appUID=");
            sb.append(this.e);
        }
        ArrayList arrayList = new ArrayList(this.a.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            sb.append(", ");
            sb.append(str);
            sb.append("=");
            sb.append((String) this.a.get(str));
        }
        return sb.toString();
    }

    public fdj(fck fckVar, Map map, long j, boolean z, long j2, int i, List list) {
        String str;
        String b;
        String b2;
        fma.aR(fckVar);
        fma.aR(map);
        this.d = j;
        this.f = z;
        this.c = j2;
        this.e = i;
        this.b = list != null ? list : Collections.emptyList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Command command = (Command) it.next();
                if ("appendVersion".equals(command.a)) {
                    str = command.b;
                    break;
                }
            }
        }
        str = null;
        this.g = true != TextUtils.isEmpty(str) ? str : null;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (d(entry.getKey()) && (b2 = b(fckVar, entry.getKey())) != null) {
                hashMap.put(b2, c(fckVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!d(entry2.getKey()) && (b = b(fckVar, entry2.getKey())) != null) {
                hashMap.put(b, c(fckVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.g)) {
            fma.bj(hashMap, "_v", this.g);
            if (this.g.equals("ma4.0.0") || this.g.equals("ma4.0.1")) {
                hashMap.remove("adid");
            }
        }
        this.a = DesugarCollections.unmodifiableMap(hashMap);
    }
}
