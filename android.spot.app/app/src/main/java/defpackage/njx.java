package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njx {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = ngh.class.getPackage();
        if (r1 != null) {
            str = r1.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = ngh.class.getName();
        name.getClass();
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = nik.class.getName();
        name2.getClass();
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = ngy.class.getName();
        name3.getClass();
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = mkm.L(linkedHashMap);
    }
}
