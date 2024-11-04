package defpackage;

import j$.util.DesugarCollections;
import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnt {
    public static volatile Map a;
    private static final moz b;
    private static volatile moz c;

    static {
        moz mozVar = new moz();
        b = mozVar;
        c = mozVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", nnw.a);
        linkedHashMap.put("UTC", nnw.a);
        linkedHashMap.put("GMT", nnw.a);
        d(linkedHashMap, "EST", "America/New_York");
        d(linkedHashMap, "EDT", "America/New_York");
        d(linkedHashMap, "CST", "America/Chicago");
        d(linkedHashMap, "CDT", "America/Chicago");
        d(linkedHashMap, "MST", "America/Denver");
        d(linkedHashMap, "MDT", "America/Denver");
        d(linkedHashMap, "PST", "America/Los_Angeles");
        d(linkedHashMap, "PDT", "America/Los_Angeles");
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final DateFormatSymbols b(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final nno c(nno nnoVar) {
        if (nnoVar == null) {
            return npg.O();
        }
        return nnoVar;
    }

    private static void d(Map map, String str, String str2) {
        try {
            map.put(str, nnw.i(str2));
        } catch (RuntimeException unused) {
        }
    }
}
