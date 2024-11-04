package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdi {
    static {
        kjs kjsVar = kjs.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        kfz.a.b(kdj.a);
        kfz.a.a(kdj.b);
        if (kdd.a()) {
            return;
        }
        kgf kgfVar = kdf.a;
        if (iuu.y(1)) {
            Map map = kdl.a;
            kga kgaVar = kga.a;
            kgaVar.a(kdl.b);
            kgaVar.b(kdl.c);
            kgaVar.d(kdl.e);
            kgaVar.c(kdl.d);
            kfz.a.a(kdf.a);
            kfy kfyVar = kfy.a;
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", kdk.a);
            lyn lynVar = new lyn((char[]) null);
            lynVar.e(64);
            lynVar.b = kdg.c;
            hashMap.put("AES256_SIV_RAW", lynVar.d());
            kfyVar.b(DesugarCollections.unmodifiableMap(hashMap));
            kfw.a.a(kdf.b, kdh.class);
            kfu.a.a(kdf.c, kdh.class);
            kfm.a.b(kdf.d, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
    }
}
