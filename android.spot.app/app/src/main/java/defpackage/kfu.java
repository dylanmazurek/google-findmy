package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfu {
    private final Map c = new HashMap();
    private static final kft b = new kav();
    public static final kfu a = b();

    private static kfu b() {
        kfu kfuVar = new kfu();
        try {
            kfuVar.a(b, kfq.class);
            return kfuVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized void a(kft kftVar, Class cls) {
        kft kftVar2 = (kft) this.c.get(cls);
        if (kftVar2 != null && !kftVar2.equals(kftVar)) {
            throw new GeneralSecurityException(der.c(cls, "Different key creator for parameters class ", " already inserted"));
        }
        this.c.put(cls, kftVar);
    }
}
