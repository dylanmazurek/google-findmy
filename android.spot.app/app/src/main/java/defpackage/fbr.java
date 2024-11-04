package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbr extends fcl {
    public final fdl a;
    public final fbq b;
    private final Map d;
    private final Map e;

    public fbr(fcn fcnVar, String str) {
        super(fcnVar);
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        this.e = new HashMap();
        if (str != null) {
            hashMap.put("&tid", str);
        }
        hashMap.put("useSecure", "1");
        hashMap.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        G();
        this.a = new fdl();
        this.b = new fbq(fcnVar);
    }

    private static String d(Map.Entry entry) {
        String str = (String) entry.getKey();
        if (str.startsWith("&") && str.length() >= 2) {
            return ((String) entry.getKey()).substring(1);
        }
        return null;
    }

    private static void e(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            String d = d(entry);
            if (d != null) {
                map2.put(d, (String) entry.getValue());
            }
        }
    }

    @Override // defpackage.fcl
    protected final void a() {
        this.b.I();
        String b = p().b();
        if (b != null) {
            c("&an", b);
        }
        String c = p().c();
        if (c != null) {
            c("&av", c);
        }
    }

    public final void b(Map map) {
        boolean z;
        G();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = g().f;
        boolean z3 = g().e;
        HashMap hashMap = new HashMap();
        e(this.d, hashMap);
        e(map, hashMap);
        String str = (String) this.d.get("useSecure");
        int i = 1;
        if (str != null && !str.equalsIgnoreCase("true") && !str.equalsIgnoreCase("yes") && !str.equalsIgnoreCase("1") && (str.equalsIgnoreCase("false") || str.equalsIgnoreCase("no") || str.equalsIgnoreCase("0"))) {
            z = false;
        } else {
            z = true;
        }
        for (Map.Entry entry : this.e.entrySet()) {
            String d = d(entry);
            if (d != null && !hashMap.containsKey(d)) {
                hashMap.put(d, (String) entry.getValue());
            }
        }
        this.e.clear();
        String str2 = (String) hashMap.get("t");
        if (TextUtils.isEmpty(str2)) {
            n().c(hashMap, "Missing hit type parameter");
            return;
        }
        String str3 = (String) hashMap.get("tid");
        if (TextUtils.isEmpty(str3)) {
            n().c(hashMap, "Missing tracking id parameter");
            return;
        }
        synchronized (this) {
            if ("screenview".equalsIgnoreCase(str2) || "pageview".equalsIgnoreCase(str2) || "appview".equalsIgnoreCase(str2) || TextUtils.isEmpty(str2)) {
                String str4 = (String) this.d.get("&a");
                fma.aR(str4);
                int parseInt = Integer.parseInt(str4) + 1;
                if (parseInt < Integer.MAX_VALUE) {
                    i = parseInt;
                }
                this.d.put("&a", Integer.toString(i));
            }
        }
        h().c(new fbp(this, hashMap, str2, currentTimeMillis, z3, z, str3));
    }

    public final void c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, str2);
    }
}
