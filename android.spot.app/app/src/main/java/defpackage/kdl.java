package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdl {
    public static final Map a;
    public static final kgf b;
    public static final kgf c;
    public static final kgf d;
    public static final kuv e;
    private static final knb f;
    private static final Map g;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.AesSivKey");
        f = b2;
        b = new kgf((Object) kdh.class, kgl.class, (Object) new kbx(7));
        c = new kgf((Object) b2, kgl.class, (Object) new kby(8));
        e = new kuv(kde.class, kgk.class, (byte[]) null);
        d = new kgf((Object) b2, kgk.class, (Object) new kbz(7));
        HashMap hashMap = new HashMap();
        hashMap.put(kdg.c, kjr.RAW);
        hashMap.put(kdg.a, kjr.TINK);
        hashMap.put(kdg.b, kjr.CRUNCHY);
        a = DesugarCollections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(kjr.class);
        enumMap.put((EnumMap) kjr.RAW, (kjr) kdg.c);
        enumMap.put((EnumMap) kjr.TINK, (kjr) kdg.a);
        enumMap.put((EnumMap) kjr.CRUNCHY, (kjr) kdg.b);
        enumMap.put((EnumMap) kjr.LEGACY, (kjr) kdg.b);
        g = DesugarCollections.unmodifiableMap(enumMap);
    }

    public static kdg a(kjr kjrVar) {
        Map map = g;
        if (map.containsKey(kjrVar)) {
            return (kdg) map.get(kjrVar);
        }
        throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
    }
}
