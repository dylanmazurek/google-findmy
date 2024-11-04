package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfm {
    private final ConcurrentMap c = new ConcurrentHashMap();
    private final ConcurrentMap d = new ConcurrentHashMap();
    private static final Logger b = Logger.getLogger(kfm.class.getName());
    public static final kfm a = new kfm();

    private final synchronized void d(kpb kpbVar, boolean z) {
        Object obj = kpbVar.a;
        if (z && this.d.containsKey(obj) && !((Boolean) this.d.get(obj)).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type ".concat((String) obj));
        }
        kpb kpbVar2 = (kpb) this.c.get(obj);
        if (kpbVar2 != null && !kpbVar2.getClass().equals(kpbVar.getClass())) {
            b.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat((String) obj));
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", obj, kpbVar2.getClass().getName(), kpbVar.getClass().getName()));
        }
        this.c.putIfAbsent(obj, kpbVar);
        this.d.put(obj, Boolean.valueOf(z));
    }

    public final synchronized kpb a(String str) {
        if (this.c.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (kpb) this.c.get(str);
    }

    public final synchronized void b(kpb kpbVar, boolean z) {
        c(kpbVar, 1, z);
    }

    public final synchronized void c(kpb kpbVar, int i, boolean z) {
        if (iuu.y(i)) {
            d(kpbVar, z);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
