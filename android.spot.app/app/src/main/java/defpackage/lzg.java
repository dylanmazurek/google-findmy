package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzg {
    static final lzh a;

    static {
        lzh mcgVar;
        AtomicReference atomicReference = new AtomicReference();
        try {
            mcgVar = (lzh) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(lzh.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            mcgVar = new mcg();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = mcgVar;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            lzi.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
