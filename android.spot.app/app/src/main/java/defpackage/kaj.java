package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kaj {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger(kaj.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(jzw.class);
        hashSet.add(jzy.class);
        hashSet.add(kak.class);
        hashSet.add(kaa.class);
        hashSet.add(jzz.class);
        hashSet.add(kaf.class);
        hashSet.add(khm.class);
        hashSet.add(kah.class);
        hashSet.add(kai.class);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    private kaj() {
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public static Class a(Class cls) {
        try {
            kuv kuvVar = (kuv) kfz.a.b.get();
            if (kuvVar.a.containsKey(cls)) {
                return ((kgj) kuvVar.a.get(cls)).a();
            }
            throw new GeneralSecurityException(der.c(cls, "No input primitive class for ", " available"));
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object b(kjh kjhVar, Class cls) {
        String str = kjhVar.a;
        lim limVar = kjhVar.b;
        kpb a2 = kfm.a.a(str);
        if (a2.c.equals(cls)) {
            return kfz.a.c(kga.a.e(kgk.a((String) a2.a, limVar, (kjg) a2.b, kjr.RAW, null)), (Class) a2.c);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(a2.getClass()) + ", which only supports: " + a2.c.toString());
    }
}
