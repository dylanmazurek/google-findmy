package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfw {
    public static final kfw a = new kfw();
    private final Map b = new HashMap();

    public final synchronized void a(kfv kfvVar, Class cls) {
        kfv kfvVar2 = (kfv) this.b.get(cls);
        if (kfvVar2 != null && !kfvVar2.equals(kfvVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.b.put(cls, kfvVar);
    }
}
